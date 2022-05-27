FROM amazoncorretto:11-alpine-jdk
COPY ./transaction-microservice/target/transaction-microservice-0.1.0.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
