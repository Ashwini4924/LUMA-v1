# LUMA Signup & Login Automation Framework

This project automates the **User Account Creation** and **Sign In** flows on the [Magento Demo Website](https://magento.softwaretestingboard.com/) using:

- **Selenium WebDriver**
- **Cucumber BDD**
- **TestNG**
- **Page Object Model (POM)**
- **Maven**
- **HTML Reporting**

---

## 📁 Project Structure

```
magento-bdd-automation/
├── src/
│   ├── test/
│   │   └── java/
│   │       ├── pageObjectes/      # Page classes (LoginPage, RegisterPage)
│   │       ├── testCases/         # Step Definitions (RegisterTest, LoginTest)
│   │       ├── runners/           # TestNG Runner class
│   │       └── testBase/          # BaseClass for setup & teardown
│   └── resources/
│       └── features/              # Cucumber Feature files
├── target/                        # Compiled classes and generated reports
├── test-case.xlsx                 # Excel test case documentation
├── screenRecording                # Screen recording and Console output screenshot of test execution
├── pom.xml                        # Maven build file
└── README.md                      # Project description
```

---

## 🚀 How to Run the Tests

1. **Clone the repository**
   ```bash
   git clone https://github.com/Ashwini4924/LUMA-v1.git
   cd magento-bdd-automation
   ```

2. **Build and Execute Tests**
   ```bash
   mvn clean test
   ```

3. **View the HTML Report**
   - Open: `target/cucumber-reports.html`  
 

---

## ✨ Features Automated

### ✅ Create Account
- Navigate to Create Account page
- Fill out and submit the registration form
- Validate successful account creation

### ✅ Sign In
- Navigate to Login page
- Login with the newly registered credentials
- Verify successful login

---

## 🛠 Tech Stack

| Tool             | Purpose                          |
|------------------|----------------------------------|
| Selenium         | Browser automation               |
| Cucumber         | BDD framework with Gherkin       |
| TestNG           | Test orchestration               |
| Maven            | Build & dependency management    |
| Java             | Programming language             |

---

## 📎 Resources Included

- ✅ Automation scripts (`.java`)
- ✅ Feature files (`.feature`)
- ✅ Test runner and hooks
- ✅ Excel sheet documenting positive/negative test cases
- ✅ Screen recording of test execution

---
