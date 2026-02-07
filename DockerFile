# ---------- Stage 1 : Build ----------
FROM maven:3.9.9-eclipse-temurin-21 AS builder

WORKDIR /app

# Cache dependencies first (faster rebuilds)
COPY pom.xml .
RUN mvn -q -e -B -DskipTests dependency:go-offline

# Copy source
COPY src ./src

# Build jar
RUN mvn clean package -DskipTests


# ---------- Stage 2 : Run ----------
FROM eclipse-temurin:21-jre-jammy

WORKDIR /app

# Copy jar from build stage
COPY --from=builder /app/target/*.jar app.jar

# Render uses dynamic port
EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]
