FROM openjdk:15-jdk-alpine

ARG JAR_FILE=target/*.jar
# Rename our compiled java file to app.jar
COPY ${JAR_FILE} app.jar 
ENTRYPOINT ["java","-jar","/app.jar"]