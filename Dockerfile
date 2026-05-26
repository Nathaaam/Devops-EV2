FROM maven:3.9.2-eclipse-temurin-17 AS builder
WORKDIR /app


COPY pom.xml .
COPY src ./src
COPY test ./test


RUN mvn clean compile


FROM eclipse-temurin:17-jre
WORKDIR /app


COPY --from=builder /app/target/classes ./classes


CMD ["java", "-cp", "classes", "main.Main"]