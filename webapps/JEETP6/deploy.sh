#!/bin/bash

clear
../../bin/shutdown.sh
../../bin/startup.sh
javac -cp .:"$CATALINA_HOME"/lib/servlet-api.jar WEB-INF/classes/*.java
echo "http://localhost:8080/JEE/"
tree -a
