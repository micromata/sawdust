#!/bin/bash
set -e

VERSION=3.5.4
ARCHIVE=apache-maven-${VERSION}-bin.zip

cd ~
wget https://archive.apache.org/dist/maven/maven-3/${VERSION}/binaries/${ARCHIVE}
unzip ${ARCHIVE}
export MAVEN_HOME=~/apache-maven-${VERSION}
export PATH=${MAVEN_HOME}/bin:$PATH
cd -
