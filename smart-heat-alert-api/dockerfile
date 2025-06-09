# ================ Build Stage ================ #
FROM maven:3.9.6-eclipse-temurin-17-alpine AS builder

WORKDIR /app

# Cache de dependências
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copia código fonte
COPY src ./src

# Compila o projeto
RUN mvn clean package -DskipTests

# ================ Runtime Stage ================ #
FROM eclipse-temurin:17-jre-alpine

# Configurações básicas
ENV TZ=America/Sao_Paulo
RUN apk add --no-cache tzdata curl

# Usuário não-root
RUN addgroup -S spring && adduser -S spring -G spring
USER spring

WORKDIR /app

# Copia o JAR
COPY --from=builder --chown=spring:spring /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar app.jar"]