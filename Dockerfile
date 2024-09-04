FROM openjdk:17-jdk-slim-buster
EXPOSE 8080
COPY ./target/springboot-cicd-test-images-new.jar springboot-cicd-test-images-new.jar
ENTRYPOINT ["java", "-jar", "springboot-cicd-test-images-new.jar"]