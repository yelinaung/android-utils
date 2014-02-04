/*
 * Copyright (c) 2014. Ye Lin Aung
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.yelinaung.android.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.yelinaung.android.utils.LogUtils.LOGE;
import static com.yelinaung.android.utils.LogUtils.makeLogTag;

/**
 * Created by Ye Lin Aung on 14/01/20.
 */
public class NetUtils {

    static String TAG = makeLogTag(NetUtils.class);

    // Check the device is connected to the internet
    public static boolean isOnlineOrNot(Context mContext) {
        NetworkInfo netInfo = null;
        try {
            ConnectivityManager cm = (ConnectivityManager) mContext
                    .getSystemService(Context.CONNECTIVITY_SERVICE);
            netInfo = cm.getActiveNetworkInfo();
        } catch (SecurityException e) {
            e.printStackTrace();
            LOGE(TAG, mContext.getString(R.string.missing_internet));
        }
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }


    public static void getStatus(String weburl, String ways)
    {
        try{
            List<String> httpWays= new ArrayList<String>();
            httpWays.add(ways.toUpperCase());
            httpWays.add(weburl);
            new checkWebStatus().execute(httpWays);
        }catch (NullPointerException ne){
            ne.printStackTrace();
        }

    }

    //Check the website http response code no
   private static class checkWebStatus extends AsyncTask<List<String>,Void,String>
    {

        @Override
        protected String doInBackground(List<String >...weburl) {
            Integer httpResponse = 0;
            HttpClient client = new DefaultHttpClient();
            HttpResponse response = null;

            try {
                if(weburl[0].get(0).toString().equals("POST")){
                HttpPost httptype = new HttpPost(weburl[0].get(1).toString());
                try {
                    response = client.execute(httptype);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(weburl[0].get(0).toString().equals("GET")){
                HttpGet httptype = new HttpGet(weburl[0].get(1).toString());
                try {
                    response = client.execute(httptype);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(weburl[0].get(0).toString().equals("PUT")){
                HttpPut httptype = new HttpPut(weburl[0].get(1).toString());
                try {
                    response = client.execute(httptype);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else {
                HttpDelete httptype = new HttpDelete(weburl[0].get(1).toString());
                try {
                    response = client.execute(httptype);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
                httpResponse = response.getStatusLine().getStatusCode();
            }catch (SecurityException se){
                se.printStackTrace();
            }
            return httpResponse.toString();
        }
    }
}
