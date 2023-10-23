# Orange Go TV App Testing with Appium Java Client

This project contains sample automation tests for the Orange TV Go application using Appium and the Appium Java Client. The tests cover various scenarios and allow you to verify the correct functioning of the application.

## Test Descriptions

### Test 1: App Launch

This test verifies whether the Orange TV Go application can be launched successfully.

### Test 2: Component Verification

This test verifies whether all application components have loaded correctly.

### Test 3: Counting VOD Banners

This test calculates and logs to the console how many different rotating VOD banners are displayed in the top row of the application under the "Start" banner.

### Test 4: Navigate to "Recommended for You" Movie

This test goes to the main screen and navigates to the fourth movie from the left in the "Recommended for You" section.

### Test 5: Listing Actors in Alphabetical Order

This test lists the order of actors in alphabetical order by their last names.

## Running the Tests

To run the tests, follow these steps:

1. Clone this project to your computer.

2. Make sure you have Docker and Docker Compose installed on your system.

3. Open a terminal and navigate to the project directory.

4. Run the tests using Docker Compose:
```docker-compose up```
After following these steps, the tests will be executed in a container with Appium and Java. Test results will be visible in the console.

## Requirements

- Docker
- Docker Compose
