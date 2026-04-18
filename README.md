# Storage System

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)

## Description:
This is a simple storage system created entirely by me, without using AI on back-end, only my own knowledge and skills. 
I plan to continue developing the system by adding features such as user login and messaging services with RabbitMQ. I hope you find my work interesting.

Follow the steps below to run the program correctly. Enjoy! ;D

## installation instructions:

### prerequisite:
- Java 17+ (Java 21 Recommended)
- Spring Boot 4.0.x (Spring Boot 4.0.5 recommended)
- PostgreSQL 17+
- Activate Lombok

### 1° Step:




```bash
# Application.properties

spring.application.name=Storage-System

spring.datasource.url=jdbc:postgresql://localhost:5432/storage_db
spring.datasource.username= your_username (Defalut: "postgres")
spring.datasource.password= your_password
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.database=postgresql
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```


