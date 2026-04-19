# --- Stage 1: Build Stage ---
# Use a Maven image with JDK 17 to build the project
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app

# Copy the pom.xml and source code
COPY pom.xml .
COPY src ./src

# Build the application and create the JAR file
# -DskipTests speeds up the build by skipping unit tests
RUN mvn clean package -DskipTests

# --- Stage 2: Run Stage ---
# Use a lightweight JRE image for the final production container
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Copy the JAR from the 'build' stage to this 'run' stage
# Note: We use a wildcard *.jar to avoid name versioning issues
COPY --from=build /app/target/*.jar app.jar

# Render usually uses port 10000; Spring uses 8080 by default
EXPOSE 8080

# Run the application
# TieredStopAtLevel=1 speeds up startup time in container environments
ENTRYPOINT ["java", "-XX:TieredStopAtLevel=1", "-jar", "app.jar"]