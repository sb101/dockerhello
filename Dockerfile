FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
COPY target/dockerhello-0.0.1-SNAPSHOT.jar dockerhello.jar
ENTRYPOINT ["java","-jar","dockerhello.jar"]
