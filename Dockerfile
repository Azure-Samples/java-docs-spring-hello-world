FROM docker.io/3.9.3-eclipse-temurin-11-alpine

RUN mvn -B package --file pom.xml
COPY target/*.jar app.jar

CMD ["java", "-jar", "app.jar"]