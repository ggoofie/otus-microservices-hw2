FROM bellsoft/liberica-openjdk-alpine-musl:21
COPY target/DockerHomework-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8000
ENTRYPOINT ["java","-jar","/app.jar"]