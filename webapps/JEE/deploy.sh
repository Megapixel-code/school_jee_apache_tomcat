#!/bin/bash

clear
../../bin/shutdown.sh
../../bin/startup.sh
javac -cp .:"$CATALINA_HOME"/lib/servlet-api.jar WEB-INF/classes/*.java
tree -a
