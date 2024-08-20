# Virgosol Bootcamp Cura and Amazon Test Automation

This project automates test scenarios for the Cura and Amazon websites using JUnit5 and Selenium WebDriver with Java. The structure includes various packages for utilities, pages, and tests to ensure modular and maintainable code.


## Project Structure

### Packages

- **utilities**: Contains utility classes for browser management, configuration reading, and logging.
  - **BrowserUtils**: Helper methods for browser interactions.
  - **ConfigurationReader**: Reads configuration properties.
  - **Driver**: Manages WebDriver instance.
  - **logger**: Contains classes for logging test results.
    - **log.java**: Manages logging of test actions.
    - **TestResult.java**: Handles test result logging.
- **pages**: Contains page object classes representing web pages.
  - **CuraPage**: Elements and methods for the Cura website.
  - **AmazonPage**: Elements and methods for the Amazon website.
- **tests**: Contains test classes for various scenarios.
  - **BaseTest**: Base class for common test setup and teardown methods.
  - **CuraTest**: Test cases for the Cura website.
  - **AmazonTest**: Test cases for the Amazon website.

## Test Scenarios

### CuraTest

- **loginSuccessTest**:
  - Navigates to the Cura website.
  - Attempts a successful login using valid credentials.
  - Asserts that the user is redirected to the appointment page.
  
- **loginFailedWithoutPassword**:
  - Navigates to the Cura website.
  - Attempts login without a password.
  - Asserts that the login button is still displayed, indicating a failed login.

- **loginFailedWithoutUserName**:
  - Navigates to the Cura website.
  - Attempts login without a username.
  - Asserts that the login button is still displayed, indicating a failed login.

### AmazonTest

- **task**:
  - Navigates to the Amazon Turkey website.
  - Accepts cookies on the homepage.
  - Searches for "Bilgisayar".
  - Selects the first product from the results.
  - Adds the product to the cart.
  - Navigates to the cart and removes the item.
  - Asserts that the cart is empty by checking for the "Amazon sepetiniz boş." message.

## How to Run

1. Ensure that the WebDriver is configured correctly.
2. Set up your configuration properties in the `ConfigurationReader`.
3. Execute the tests using JUnit5 in your preferred IDE or through the command line.

## Additional Information

- The project uses `ConfigurationReader` to manage environment-specific details like URLs and credentials.
- Utility classes under the `utilities` package help manage browser actions, logging, and test results effectively.
- The `BaseTest` class contains setup and teardown methods to initialize and close the browser.
- Java Selenium is used for automating web interactions.
