Android Utils
=============

Some abstract and reusable small utils that can help you in your Android Projects.
Please take a look and send some pull requests or issues to me.

Usage
-----

For the moment, you have to apply manually to your current project but it's quite easy.
Copy the directory `util` to your project `lib` folder.
If you don't have that directory, create one.

Apply the plugin in your `build.gradle`:

```groovy
    compile project(':libs:utils')
```

In your top level `settings.gradle` :

```groovy
    include 'libs:utils'
```

To Do
-----

 * Need a good doc about the usage
 * Make it available as a gradle plugin ?

License
--------

    Copyright 2014 Ye Lin Aung

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

