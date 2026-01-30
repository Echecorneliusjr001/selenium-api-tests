# Selenium & Integration Testing Assignment

This repository contains the complete solution for the assignment covering **automated UI testing with Selenium WebDriver** and **API integration testing**, including a **GitHub Actions CI pipeline**.

The project is implemented in **Java**, built with **Maven**, and developed using **IntelliJ IDEA / Eclipse**.

---

## 🧩 Assignment Overview

The assignment is divided into two main parts:

### **Part 2 – Login Function (Selenium WebDriver)**
Automated UI tests were created for the login functionality at:  
https://www.saucedemo.com/

### **Part 3 – Integration Tests (FakeStore API)**
Integration tests were implemented against the public REST API:  
https://fakestoreapi.com/

All tests are automatically executed using **GitHub Actions** on every push to the repository.

---

## 🧪 Part 2 – Selenium Login Tests

### Implemented Test Cases

**Basic test (G):**
- Verified that a user can successfully log in using valid credentials.
- Confirmed that the user is redirected to the inventory/start page after login.

**Extended tests (VG):**
- Verified that an error message is displayed when an incorrect username is entered.
- Verified that an error message is displayed when an incorrect password is entered.

### Tools & Technologies
- Selenium WebDriver
- JUnit 5
- Chrome (Headless mode for CI)

---

## 🔗 Part 3 – Integration Tests (FakeStore API)

### Implemented Test Cases

**Basic test (G):**
- Tested that a GET request to `/products` returns HTTP status code `200`.

**Extended tests (VG):**
- Verified that `/products` returns the expected number of products.
- Verified that a product contains the fields: `title`, `price`, and `category`.
- Verified that `GET /products/1` returns correct and valid product data.

### Tools & Technologies
- REST Assured
- JUnit 5
- Maven

---

## ⚙️ GitHub Actions – CI Pipeline

A GitHub Actions workflow is configured to:
- Set up JDK 17
- Build the project using Maven
- Run all Selenium and integration tests automatically

The pipeline is triggered on:
- Every push to the `main` branch
- Every pull request to `main`

A green status indicates that all tests passed successfully.

---

## 🛠️ Project Structure
selenium-api-tests
├── src
│ └── test
│ └── java
│ ├── selenium
│ │ └── LoginTest.java
│ └── api
│ └── FakeStoreTest.java
├── .github
│ └── workflows
│ └── ci.yml
├── pom.xml
└── README.md

---

## ▶️ How to Run the Tests Locally

### Requirements
- Java JDK 17
- Maven
- Google Chrome
- IntelliJ IDEA or Eclipse

### Run tests using Maven:
```bash
mvn clean test
📌 Notes

The repository is public as required.

Selenium tests use headless Chrome to ensure compatibility with CI environments.

The code was verified to run correctly on multiple environments.

👤 Author

Cornelius
Software Testing & Automation
Java | Selenium | REST API Testing

Collaborator
läraren - William Gross
