# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="sdiabagate@gmail.com"

# Add a volume
VOLUME D:/projects/turbo-settings

# Make port 8080 available to the world outside this container
EXPOSE 8081

# The application's jar file
ARG JAR_FILE=target/config-1.0.0-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} config.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","/config.jar"]