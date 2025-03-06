# Automation Practice UI Tests

This project contains automated UI tests for an e-commerce website built using Selenium WebDriver with Java, TestNG, and Page Object Model design pattern.

## Project Overview

The automation framework tests the functionality of the [AskOmDch](http://askomdch.com) e-commerce website, focusing on the shopping and checkout process. The tests are organized using the Page Object Model (POM) design pattern to improve maintainability and reusability.

## Tech Stack

- Java 8
- Selenium WebDriver 4.0.0
- TestNG 7.4.0
- WebDriverManager 5.0.3
- Maven

## Project Structure

```
├── src
│   └── test
│       └── java
│           └── com
│               └── automationpractice
│                   └── tests
│                       ├── LoginTests.java
│                       └── pom
│                           ├── base
│                           │   ├── BasePage.java
│                           │   └── BaseTest.java
│                           ├── factory
│                           │   └── DriverManager.java
│                           └── pages
│                               ├── HomePage.java
│                               └── StorePage.java
├── .gitignore
└── pom.xml
```

## Key Features

- **Page Object Model**: Separates test code from page-specific code
- **Base Classes**: Provides common functionality for pages and tests
- **Driver Management**: Centralized WebDriver initialization
- **Test Cases**: End-to-end flow for product search, cart addition, and checkout process

## Test Scenarios

Currently, the project includes:

- **Login Test**: Searches for "Blue Shoes", adds item to cart, proceeds to checkout, and fills in customer information

## Getting Started

### Prerequisites

- Java JDK 8
- Maven
- Chrome browser

### Setup

1. Clone the repository:
   ```
   git clone https://github.com/yourusername/automationpractice-ui-tests.git
   ```

2. Navigate to the project directory:
   ```
   cd automationpractice-ui-tests
   ```

3. Install dependencies:
   ```
   mvn clean install
   ```

### Running Tests

Run tests using Maven:
```
mvn test
```

Or run specific test class:
```
mvn test -Dtest=LoginTests
```

## Future Improvements

- Add more test cases for different scenarios
- Implement reporting (Allure, ExtentReports)
- Add configuration for cross-browser testing
- Implement data-driven testing
- Add CI/CD integration

## Contributing

1. Fork the project
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## Author
Mohammed Lukmanudin M - [GitHub Profile](https://github.com/redJavaMan)
