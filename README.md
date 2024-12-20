# Spring Boot Application

This repository contains the implementation of a Spring Boot application. The project covers fundamental concepts of Spring Boot, such as dependency injection, REST API creation, DTO pattern, Service layer, Spring data validation, spring testing, test isolation with Mockito and application configuration.

## Features
- Built with Spring Boot.
- REST API implementation.
- Modular and scalable application structure.

## Getting Started
### Prerequisites
- Java 17 or higher
- Maven 3.8+ or Gradle
- Docker
- PostgreSQL
- DBeaver
- Postman

### Running the Application
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/Spring_Boot.git
   cd Spring_Boot

2. Set up application.yml:

- The application.yml file contains sensitive configuration, such as database credentials, and is not included in the repository for security reasons.

- You will need to create your own application.yml file in the src/main/resources/ directory.

- Create the application.yml file by copying from the template (if you include one) or create it manually:
  cp src/main/resources/application.yml.template src/main/resources/application.yml

- Edit application.yml with your local settings:
spring:
datasource:
url: jdbc:postgresql://localhost:5432/your_database
username: your_username
password: your_password

3. Build and run the application:

- Using Maven:

  ./mvnw spring-boot:run

- Or using Gradle

  ./gradlew bootRun


4. Access the application at http://localhost:8080.
