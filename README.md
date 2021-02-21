# poc-spring-stream-kafka

Small proof of concept of _Spring Cloud Stream_ using Kafka binding. A producer generates random user accounts and sends them to a topic.

The project is based on _Spring Cloud Hoxton.SR10_ so this approach its currently deprecated in newer versions with reactive approaches.

## Requirements

- Java 11
- Docker

## How to run it

1. Run `docker-compose up` to setup an instance of Kafka
2. Run `./mvnw spring-boot:run` to start the producer
3. http://localhost:9000 to acccess to Kafdrop UI