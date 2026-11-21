
# Java Selenium Automation Testing Framework

## Project Overview
This project is a web automation testing framework developed using Java, Selenium WebDriver, TestNG and Maven.

It automates important functionalities of the SauceDemo e-commerce website and verifies the expected results.

## Technologies Used
- Java 25
- Selenium WebDriver 4.39.0
- TestNG 7.11.0
- Maven 3.9.9
- Chrome Browser
- Git and GitHub
- GitHub Actions

## Features
- Automated login and logout testing
- Invalid login validation
- Inventory product verification
- Add to cart functionality
- Remove from cart functionality
- Checkout process validation
- Reusable browser setup and teardown
- Automated test execution using GitHub Actions

## Test Cases
1. Google Search Test
2. Selenium Title Test
3. Login and Logout Test
4. Invalid Login Test
5. Inventory Test
6. Add to Cart Test
7. Remove From Cart Test
8. Checkout Test

## Project Structure
```text
selenium-project/
├── .github/
│   └── workflows/
│       └── maven.yml
├── src/
│   ├── main/java/com/sarayu/
│   └── test/java/tests/
├── pom.xml
├── .gitignore
└── README.md
```

## How to Run
1. Install Java JDK and Maven.
2. Clone this repository.
3. Open the project folder.
4. Run the following command:

```bash
mvn clean test
```

## GitHub Actions
GitHub Actions automatically executes the Selenium test suite when code is pushed to the main branch or a pull request is created.

## Application Under Test
https://www.saucedemo.com/

## Author
Sarayu E
