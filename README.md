# Storage System

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)

## Description
This is a simple storage system created entirely by me, without using AI for the back-end, only my own knowledge and skills. 
I plan to continue developing the system by adding features such as user login and messaging services with RabbitMQ. I hope you find my work interesting.

Follow the steps below to run the program correctly. Enjoy! ;D

## Installation instructions

### Prerequisite:
- Java 17+ (Java 21 Recommended)
- Spring Boot 4.0.x (Spring Boot 4.0.5 recommended)
- PgAdmin 4 (PostgreSQL 17+)
- Lombok enabled in your IDE

### 1st Step:


Open Git Bash and run the following command to clone the repository:

```bash
# Git Bash
git clone https://github.com/Lucasksasa/Storage-System.git
```

### 2nd Step:

- Open PgAdmin and create a database named storage_db.
  (You may use another name if you prefer, but remember to update it in application.properties as well.)

### 3rd Step:

- Open application.properties and copy the following command to configure Postgres Database: <br>

Path:
```
  Storage-System/src/main/resources/application.properties
```

#### application.properties
```Properties
spring.application.name=Storage-System

spring.datasource.url=jdbc:postgresql://localhost:5432/storage_db  
spring.datasource.username= your_username  
spring.datasource.password= your_password
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.database=postgresql
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

## instructions for use

- Run the application. Everything will start automatically and port 8080 will be enabled by default (unless another application is already using this port).
- Open your browser and access:
```bash
http://localhost:8080/index.html
```
- Enter the product name and price, then click the "Salvar" button.
- To edit, click in the buttom "Editar" and repeat the process.
- To delete a product, click the "Excluir" button. A confirmation message will appear.

## Final Considerations

This project was created for learning purposes and to improve my skills with Java, Spring Boot, PostgreSQL and front-end integration.

I intend to keep improving this system by adding new features such as:

- User authentication and authorization
- RabbitMQ integration
- Better front-end design
- Product categories and stock control
- Deployment and cloud hosting

If you have any suggestions or feedback, feel free to contact me or contribute to the project.

Thank you for taking the time to check out my project! 🚀
  







