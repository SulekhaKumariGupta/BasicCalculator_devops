FROM openjdk:8
EXPOSE 8080
COPY  target/JunitDemo-1.0-SNAPSHOT.jar JunitDemo-1.0-SNAPSHOT.jar
ENTRYPOINT["java","-jar","/JunitDemo-1.0-SNAPSHOT.jar"]

