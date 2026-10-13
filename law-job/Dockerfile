# Build from the repo root so the parent POM and law-core are available:
#   docker build -f law-job/Dockerfile -t law-job .
FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /app

COPY pom.xml .
COPY law-core/pom.xml law-core/
COPY law-api/pom.xml law-api/
COPY law-job/pom.xml law-job/
# law-core is built in this reactor, not downloaded, so leave our own group out of go-offline
RUN mvn -B -pl law-job -am dependency:go-offline -DexcludeGroupIds=com.votingbooth

COPY law-core/src law-core/src
COPY law-job/src law-job/src
RUN mvn -B -pl law-job -am package -DskipTests

FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /app/law-job/target/law-job-*.jar app.jar
CMD ["java", "-jar", "app.jar"]
