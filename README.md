# Topera's Hello World #025
## Gradle subprojects 
This hello world shows how to have a
gradle root project using a gradle project using another gradle project:

projectA (depends on) -> projectB (depends on) -> projectC  

The main point here is:
1. Put all project names in the settings.gradle (which is in the root project)
2. Use ":projectB:projectC" notation for reference *projecB/projectC* folder
3. Project B can depends on project C using a configuration done on project A, not on project B

## How to use this source code
* Use the `Clone or download` button above the get the url of this repository
* In IntelliJ IDEA: File → New → Project From Version Control → Git → put the url of this repository

## How to test
* Install Java, open a terminal and run
    * $ ./gradlew

## Tech Stack
* Intellij IDEA 2019.3.1
* Gradle 6.0.1
* Java 8

To take a look in other projects, please see https://github.com/topera/index

