FROM openjdk:21
EXPOSE 8080
ADD target/spring_docker_app.jar spring_docker_app.jar
ENTRYPOINT [ "java", "-jar", "/spring_docker_app.jar" ]