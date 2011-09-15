# Android App in Scala with IntelliJ Idea project template

[giter8](http://github.com/n8han/giter8) template for create android sbt project with Idea project files

## How to use

To use this template, run *install.sh* script:

    curl https://raw.github.com/mbektimirov/android-app-idea.g8/master/install.sh | sh

or install g8 manually: http://github.com/n8han/giter8#readme

After g8 installation has finished, just enter this commands in the shell:

    ~/bin/g8 mbektimirov/android-app-idea
    cd <name-of-app>
    sbt update
    sbt start-device # or sbt start-emulator

## What you get

Your android IntelliJ Idea sbt project contains 2 subprojects:

* MainProject
    * generated AndroidManifest.xml
    * MainActivity.scala (the "hello world" activity)
* TestProject

## Supported commands for sbt android plugin:

    start-emulator - Starts the app on an emulator, if one is running.
    reinstall-emulator - Reinstalls the app on an emulator, if running.
    reinstall-device - Reinstalls the app on an attached Android device.
    start-device - Starts the app’s default activity on an attached Android device.
    sign-release  - Builds a signed APK that is suitable for publishing to the market.
