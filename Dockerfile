# Step 1: Use a lightweight JDK 17 image
FROM eclipse-temurin:17-jdk-alpine

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Copy the JAR file from your target folder to the container
# Note: Make sure the name matches your JAR in the target folder
COPY target/mobilenumber-0.0.1-SNAPSHOT.jar app.jar

# Step 4: Expose the port (Render uses 10000 by default, but Spring uses 8080)
EXPOSE 8080

# Step 5: Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]