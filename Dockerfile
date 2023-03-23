FROM amazoncorretto:17-alpine-jdk
MAINTAINER marcosTravaglini
COPY target/portfolio-0.0.1-SNAPSHOT.jar blackpachamame-app.jar
ENTRYPOINT ["java","-jar","/blackpachamame-app.jar"]