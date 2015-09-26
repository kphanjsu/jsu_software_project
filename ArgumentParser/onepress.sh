#!/usr/bin/env bash
../../gradle-2.1-rc-2/bin/gradle clean build jacocoTestReport
./runacceptance.sh

#convert to shell