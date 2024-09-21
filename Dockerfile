FROM amazoncorretto:17-alpine

WORKDIR /app

COPY target/GithubCICD-1.0.0.jar github-cicd-docker.jar

ENTRYPOINT ["java","-jar", "github-cicd-docker.jar"]