# Stage 1: Build
FROM maven:3.8.7-eclipse-temurin-8-alpine AS build
COPY --chown=maven:maven . /home/maven/src
WORKDIR /home/maven/src
RUN mvn clean package -DskipTests

# Stage 2: Run
FROM eclipse-temurin:8-jre-alpine
COPY --from=build /home/maven/src/target/*.jar /app/app-with-metrics.jar
WORKDIR /app
EXPOSE 8080
CMD ["java", "-jar", "app-with-metrics.jar"]
