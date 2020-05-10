FROM openjdk:8
EXPOSE 8080
COPY  target/JunitDemo-1.0-SNAPSHOT.jar /usr/local/lib/JunitDemo-1.0-SNAPSHOT.jar

CMD ["java","-jar","/usr/local/lib/JunitDemo-1.0-SNAPSHOT.jar"]

