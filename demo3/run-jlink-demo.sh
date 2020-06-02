#!/bin/bash

echo "------------------------------------------------------------------"
echo " "
echo "..> 
jlink --module-path $JAVA_HOME/jmods --verbose --add-modules java.base,java.logging,java.xml,jdk.unsupported,java.sql,java.naming,java.desktop,java.management,java.security.jgss,java.instrument --compress 2 --no-header-files --output jdk-14-minimal --no-man-pages"
echo " "
echo "------------------------------------------------------------------"
echo " "

jlink --module-path $JAVA_HOME/jmods --verbose --add-modules java.base,java.logging,java.xml,jdk.unsupported,java.sql,java.naming,java.desktop,java.management,java.security.jgss,java.instrument --compress 2 --no-header-files --output jdk-14-minimal --no-man-pages