#!/bin/bash
set -e

ANT_VERSION=1.10.4
ANT_ARCHIVE=apache-ant-${ANT_VERSION}-bin.tar.gz

cd ~
wget http://www.us.apache.org/dist/ant/binaries/${ANT_ARCHIVE}
tar -xzf ${ANT_ARCHIVE}
export ANT_HOME=~/apache-ant-${ANT_VERSION}
export PATH=${ANT_HOME}/bin:$PATH
cd -
