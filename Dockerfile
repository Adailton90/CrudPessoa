FROM openjdk:8-jdk-alpine

EXPOSE 7070:7070
ENV JAVA_OPTS=""
ADD target/Pessoa-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["/usr/bin/java","-Dspring.profiles.active=local","-jar","/app.jar"]
