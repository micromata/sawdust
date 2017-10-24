#!/bin/bash
set -e

VERSION=4.3-rc-3
ARCHIVE=gradle-${VERSION}-bin.zip

cd ~
wget https://services.gradle.org/distributions/${ARCHIVE}
unzip -d ~/gradle ${ARCHIVE}
export GRADLE_HOME=~/gradle
export PATH=${GRADLE_HOME}/bin:$PATH
cd -