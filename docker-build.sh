#! /bin/sh
echo "Building Docker Containers"
docker build --build-arg JAR_FILE=build/libs/\*jar -t springio-hello-world/hello-world .

echo "Running docker container on port 8080"
docker run -p 8080:8080 springio-hello-world/hello-world
