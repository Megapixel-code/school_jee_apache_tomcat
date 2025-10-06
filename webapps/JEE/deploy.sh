#!/bin/bash

# javac -d ./WEB-INF/classes/ ./WEB-INF/classes/*.java

javac -cp .:"$CATALINA_HOME"/lib/servlet-api.jar WEB-INF/classes/*.java

