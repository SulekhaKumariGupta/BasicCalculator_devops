FROM openjdk:8
EXPOSE 8000
COPY target/JunitDemo-1.0-SNAPSHOT.jar JunitDemo-1.0-SNAPSHOT.jar
CMD ["java","-jar","/JunitDemo-1.0-SNAPSHOT.jar"]

