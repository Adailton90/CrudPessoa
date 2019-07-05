FROM openjdk:8-jdk-alpine

EXPOSE 7070:7070
ENV JAVA_OPTS=""
COPY ./target/Pessoa-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]
