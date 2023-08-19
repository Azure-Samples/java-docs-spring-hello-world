FROM docker.io/maven:3.9.3-eclipse-temurin-11-alpine

COPY target/*.jar app.jar

CMD ["java", "-jar", "app.jar"]