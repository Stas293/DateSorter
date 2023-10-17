# DateSorter application

## Description

This is a simple application that sorts dates in a list. The dates are sorted in the following order:
Dates with an 'r' in the month, sorted ascending (first to last), then dates without an 'r' in the month, sorted
descending (last to first).
The result is a collection of dates sorted as per the spec.

## Getting Started

### Dependencies

* Java 21
* Maven 3.8.1
* JUnit 5.10.0

### Installing

* Clone the repository
* Run `mvn clean install` to build the project
* Run `mvn test` to run the tests

### Executing program

* Run `mvn exec:java` to run the application
* Enter number of dates to sort
* Enter the dates in the format `YYYY-MM-DD`
* The sorted dates will be displayed
