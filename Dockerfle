FROM openjdk:8-jdk-alpine

EXPOSE 7070:7070
ENV JAVA_OPTS=""

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]
