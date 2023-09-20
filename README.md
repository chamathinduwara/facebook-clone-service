# Facebook Clone Backend
## Overview
This is the backend of the Facebook clone application. It is built using Spring Boot and serves as the API for saving and retrieving posts. This backend is designed to work in conjunction with the front-end application.

## Prerequisites
- Java Development Kit (JDK) installed (Java 8 or higher).
- [Spring Boot](https://spring.io/projects/spring-boot) installed.
- [PostgreSQL](https://www.postgresql.org/) database setup and running.

## Configuration

1. Clone this repository:

   ```bash
   git clone https://github.com/yourusername/facebook-clone-service.git
   ```
2. Change directory:
   ```bash
   cd facebook-clone-service
   ```
3. Open the `application.yml` file and configure your PostgreSQL database connection:
   ```bash
   npm install
   ```
4. Create a `.env.local` file in the project root and configure your GitHub OAuth credentials. You can obtain these by creating a GitHub OAuth App.
   ```bash
    spring:
      datasource:
        url: jdbc:postgresql://localhost:5432/database-name
        username: username
        password: password
        driver-class-name: org.postgresql.Driver
      jpa:
        hibernate:
          ddl-auto: update
        show-sql: true
        properties:
          hibernate:
            format_sql: true
          database: database-name
          database-platform: org.hibernate.dialect.PostgreSQLDialect
      servlet:
        multipart:
          enabled: true
          file-size-threshold: 2KB
          max-file-size: 200MB
          max-request-size: 215MB
   ```
5. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```
   `http://localhost:3000`.
   
## API Endpoints
POST `/api/post`: Create a new post.

Request body should contain the post data in JSON format.
GET `/api/post`: Get all posts.
Returns a list of posts in JSON format.

## Contributing
Welcome contributions! To enhance the Energy Market Frontend, follow these steps:
1. Fork the repository.
2. Create a feature branch: `git checkout -b feature-name`
3. Implement your changes and commit: `git commit -m 'Add feature'`
4. Push to your branch: `git push origin feature-name`
5. Create a pull request.

## License
This project is open source and available under the MIT License.

## Contact
- For inquiries or support, feel free to contact us at csschamathinduwara@gmail.com
- Connect with us on GitHub: chamathinduwara
