#!/bin/bash

#run file to get this baby humming
cd target 
rm springPlay-0.0.1-SNAPSHOT.jar
cd ..
mvn package && java -jar target/springPlay-0.0.1-SNAPSHOT.jar