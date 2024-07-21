FROM openjdk:19-jdk-alpine
WORKDIR /app
COPY build/libs/user-ws-0.0.1-SNAPSHOT.jar user-ws-0.0.1.jar
COPY build/resources/main/application.properties ./config/
CMD java -Dspring.config.location=/app/config/application.properties -jar user-ws-0.0.1.jar