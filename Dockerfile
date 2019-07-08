FROM openjdk:8-jdk-alpine

EXPOSE 7070:7070
ENV JAVA_OPTS=""
ADD target/Pessoa-0.0.1-SNAPSHOT.jar target/app.jar
ENTRYPOINT ["/usr/bin/java","-Djava.security.egd=file:/dev/./urandom","-jar","target/app.jar"]
