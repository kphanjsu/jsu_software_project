#!/usr/bin/env bash
cd acceptance
javac -cp .:../build/classes/main ArgumentParserKeywords.java
java -cp .:../build/classes/main:/Users/burdettec/robotframework-2.9.jar org.robotframework.RobotFramework ArgumentParserTest.txt
cd ..