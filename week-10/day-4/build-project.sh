#!/usr/bin/bash

cd gradify-sb-angular
npm run build
rm ../gradify-sb/src/main/resources/static/*
mv dist/gradify-sb-angular/* ../gradify-sb/src/main/resources/static/

cd ../gradify-sb
mvn package
scp ./target/gradify-sb-0.0.1-SNAPSHOT.jar abc:/home/ec2-user/