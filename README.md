A Project by : Vaibhav Kedar

# Library Management System

A Spring Boot web application for managing a library's book collection. This application allows users to view, add, edit, and manage books in a library database.

## Features

- **View Books**: Browse all books in the library database
- **Add Books**: Add new books to the collection with details like title, author, ISBN, etc.
- **Edit Books**: Update existing book information
- **Delete Books**: Remove books from the collection
- **Search & Filter**: Find books by various criteria
- **Responsive UI**: Clean and user-friendly interface built with Thymeleaf and CSS

## Technology Stack

- **Backend Framework**: Spring Boot 4.0.1
- **Java Version**: Java 21
- **Database**: MySQL
- **ORM**: JPA (Java Persistence API) with Hibernate
- **Template Engine**: Thymeleaf
- **Build Tool**: Maven
- **Frontend**: HTML5, CSS3, Thymeleaf

## Project Structure

```
Library/
├── src/
│   ├── main/
│   │   ├── java/com/library/
│   │   │   ├── LibraryApplication.java          # Main Spring Boot application
│   │   │   ├── controller/
│   │   │   │   └── BookController.java          # REST controller for book endpoints
│   │   │   ├── model/
│   │   │   │   └── Book.java                    # Book entity model
│   │   │   ├── repository/
│   │   │   │   └── BookRepository.java          # Data access layer
│   │   │   └── service/
│   │   │       └── BookService.java             # Business logic layer
│   │   └── resources/
│   │       ├── application.properties           # Application configuration
│   │       ├── static/css/style.css             # Stylesheet
│   │       └── templates/
│   │           ├── index.html                   # Home page
│   │           ├── add-book.html                # Add book form
│   │           └── edit-book.html               # Edit book form
│   └── test/
│       └── java/com/library/
│           └── LibraryApplicationTests.java    # Unit tests
├── pom.xml                                      # Maven configuration
├── mvnw & mvnw.cmd                             # Maven wrapper
└── HELP.md                                      # Additional help documentation
```

## Prerequisites

- **Java 21 or higher**
- **Maven 3.8.9 or higher**
- **MySQL 8.0 or higher**
- **Git** (optional, for cloning the repository)

## Installation & Setup

### 1. Clone or Download the Project
```bash
git clone <repository-url>
cd Library
```

### 2. Configure Database

Update `src/main/resources/application.properties` with your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/library_db
spring.datasource.username=root
spring.datasource.password=your_password
```

**Note**: Create the MySQL database first:
```sql
CREATE DATABASE library_db;
```

### 3. Build the Project

Using Maven wrapper:
```bash
./mvnw clean install
```

Or with Maven (if installed):
```bash
mvn clean install
```

### 4. Run the Application

```bash
./mvnw spring-boot:run
```

Or:
```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## API Endpoints

### Get All Books
- **URL**: `GET /books`
- **Description**: Retrieve all books from the library

### Get Book by ID
- **URL**: `GET /books/{id}`
- **Description**: Retrieve a specific book by its ID

### Add New Book
- **URL**: `POST /books`
- **Description**: Add a new book to the library
- **Form Parameters**: title, author, ISBN, publication year, etc.

### Edit Book
- **URL**: `PUT /books/{id}`
- **Description**: Update book information

### Delete Book
- **URL**: `DELETE /books/{id}`
- **Description**: Remove a book from the library

## Usage

1. **Home Page**: Navigate to `http://localhost:8080` to view all books
2. **Add Book**: Click the "Add Book" button to add a new book to the collection
3. **Edit Book**: Click the edit icon next to any book to modify its details
4. **Delete Book**: Click the delete icon to remove a book

## Database Schema

The application uses Hibernate to automatically create/update the database schema. Key entities:

- **Book Table**: Stores book information
  - id (Primary Key)
  - title
  - author
  - isbn
  - publicationYear
  - Other metadata

## Configuration

### Application Properties

Key configurations in `application.properties`:

```properties
spring.application.name=Library              # Application name
spring.datasource.url=...                    # Database URL
spring.datasource.username=...               # Database username
spring.datasource.password=...               # Database password
spring.jpa.hibernate.ddl-auto=update         # Auto-create/update schema
spring.jpa.show-sql=true                     # Log SQL queries
spring.thymeleaf.cache=false                 # Disable template caching
```

## Development

### Running Tests
```bash
./mvnw test
```

### Building for Production
```bash
./mvnw clean package -DskipTests
./mvnw spring-boot:run -Dspring-boot.run.arguments="--server.port=8080"
```

## Troubleshooting

### Database Connection Issues
- Ensure MySQL is running on your machine
- Verify database credentials in `application.properties`
- Check that the `library_db` database exists

### Port Already in Use
- Change the port in `application.properties`:
  ```properties
  server.port=8081
  ```

### Build Failures
- Clear Maven cache: `./mvnw clean`
- Ensure Java 21 is installed: `java -version`
- Check internet connection for dependency downloads

## Future Enhancements

- User authentication and authorization
- Book categories and genres
- Book reviews and ratings
- Loan/checkout system
- Advanced search and filtering
- Export book list to PDF/Excel
- Mobile app integration

## License

This project is provided as-is for educational purposes.

## Support

For issues or questions, please refer to the HELP.md file or contact the development team.

---

**Last Updated**: January 15, 2026
