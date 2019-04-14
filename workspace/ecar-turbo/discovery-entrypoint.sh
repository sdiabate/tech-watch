#!/bin/sh
while ! nc -z config 8081; do
    echo "Waiting for upcoming Config Server"
    sleep 2
done
java -jar /discovery.jar