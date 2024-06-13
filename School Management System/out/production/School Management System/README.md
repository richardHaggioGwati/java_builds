# School Management System README

## Overview

This School Management System is designed to manage students, teachers, and school funds efficiently. The system
provides functionalities for adding, updating, and viewing information related to students and teachers, as well as
managing the school's financial transactions.

## Features

- **Student Management**: Add, update, delete, and view student details.
- **Teacher Management**: Add, update, delete, and view teacher details.
- **Funds Management**: Track and manage school income and expenses.

## Prerequisites

To run this system, you will need the following:

- Java Development Kit (JDK) version 8 or higher
- MySQL or any other relational database
- A Java IDE such as IntelliJ IDEA or Eclipse (optional, but recommended)
- Maven (for building the project)

## Installation

### Step 1: Clone the Repository

Clone the repository to your local machine using the following command:

```sh
git clone https://github.com/richardHaggioGwati/java_projects/tree/main/School%20Management%20System
```

### Step 2: Set Up the Database

1. Create a new database in your MySQL server:

    ```sql
    CREATE DATABASE school_management;
    ```

2. Run the SQL scripts provided in the `db/` directory to create the necessary tables.

### Step 3: Configure the Application

1. Open the project in your IDE or navigate to the project directory in your terminal.
2. Edit the `src/main/resources/application.properties` file to configure the database connection:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/school_management
    spring.datasource.username=your_db_username
    spring.datasource.password=your_db_password
    spring.jpa.hibernate.ddl-auto=update
    ```

### Step 4: Build the Project

Use Maven to build the project:

```sh
mvn clean install
```

### Step 5: Run the Application

Run the application using your IDE or by executing the following command in the terminal:

```sh
mvn spring-boot:run
```

## Usage

### Accessing the Application

Once the application is running, you can access it via a web browser at:

```
http://localhost:8080
```

### Student Management

- **Add Student**: Navigate to the "Students" section and click on "Add Student". Fill in the required details and
  submit.
- **Update Student**: Click on a student's name from the list to view and update their details.
- **Delete Student**: Click on the delete icon next to a student's name in the list.
- **View Students**: Navigate to the "Students" section to view a list of all students.

### Teacher Management

- **Add Teacher**: Navigate to the "Teachers" section and click on "Add Teacher". Fill in the required details and
  submit.
- **Update Teacher**: Click on a teacher's name from the list to view and update their details.
- **Delete Teacher**: Click on the delete icon next to a teacher's name in the list.
- **View Teachers**: Navigate to the "Teachers" section to view a list of all teachers.

### Funds Management

- **Add Transaction**: Navigate to the "Funds" section and click on "Add Transaction". Fill in the required details (
  income or expense) and submit.
- **View Transactions**: Navigate to the "Funds" section to view a list of all financial transactions.
- **Generate Reports**: Click on "Generate Report" to view financial summaries and reports.

## Contributing

We welcome contributions from the community. To contribute:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Commit your changes and push the branch to your fork.
4. Create a pull request with a description of your changes.

Please ensure your code follows our coding standards and includes appropriate tests.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.

## Support

If you encounter any issues or have questions, please open an issue on GitHub or contact me.

## Additional Resources

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Hibernate Documentation](https://hibernate.org/orm/documentation/)
- [MySQL Documentation](https://dev.mysql.com/doc/)

---

This README provides an overview of the School Management System, including installation, configuration, and usage
instructions. For more detailed information, please refer to the documentation within the project. This README is
subjected to change as the project progresses

**HAPPY CODING** 🚀