# The Shapes Project

This project is designed to work with various geometric figures, such as square, triangle, circle, and trapezoid. Each figure can be displayed, its area and color can be obtained, and it also offers unique methods, such as returning the radius, hypotenuse length, side length, etc.

## Getting Started

To use this project, you need to have Java and Apache Maven installed on your system.

### Prerequisites

- Java (version 17 or higher)
- Apache Maven

### Build and Run

Follow the steps below to build and run the project:

1. Clone the repository to your local machine.
2. Open a terminal or command prompt and navigate to the project directory.

#### Compile the project

Use the following Maven command to compile the project:

```bash
mvn compile
```

#### Run the program

Use the following Maven command to execute the program:

```bash
mvn exec:java
```

#### Running Unit Tests

To run the unit tests for the program, use the following Maven command:

```bash
mvn test
```

## Usage

The project generates a random set of geometric figures, and the number of objects in the set is also unknown in advance. After generating the array of figures, the program will display the complete list of objects available, for example:

```
Фігура: квадрат, площа: 25 кв. од., довжина сторони: 5 од., колір: синій.
Фігура: трикутник, площа: 12,5 кв.од., гіпотенуза: 7.1 од., колір: жовтий.
```
