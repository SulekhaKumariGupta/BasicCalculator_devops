FROM openjdk:8
EXPOSE 8000
LABEL maintainer = "sulekhakumarigupta@gmail.com"

ADD target/JunitDemo-1.0-SNAPSHOT.jar JunitDemo-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/JunitDemo-1.0-SNAPSHOT.jar"]

