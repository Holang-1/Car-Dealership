# Car Dealership Management System

## Overview

This project is a Greenfield Java application developed for managing a car dealership's inventory.

The system demonstrates:

- Object-Oriented Programming (OOP)
- Encapsulation
- Inheritance
- Polymorphism
- Unit Testing with JUnit
- UML Design Documentation
- Version Control Best Practices
- Java Syntax and Coding Standards

---

## Project Structure

```text
Car-Dealership/
│
├── README.md
│
├── TheoryAnswers.txt
│
├── UML/
│   └── CarDealership_UML.drawio
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── dealership/
│   │           ├── Vehicle.java
│   │           ├── Car.java
│   │           └── Dealership.java
│   │
│   └── test/
│       └── java/
│           └── dealership/
│               ├── VehicleTest.java
│               ├── CarTest.java
│               └── DealershipTest.java
│
└── pom.xml
```

---

# Requirements

## Vehicle Class

| Attribute | Type | Description |
|------------|------|-------------|
| brand | String | Vehicle manufacturer |
| model | String | Vehicle model |
| price | double | Vehicle selling price |

### Methods

| Method | Return Type | Description |
|----------|------------|-------------|
| Vehicle() | Constructor | Creates Vehicle object |
| getBrand() | String | Returns brand |
| setBrand() | void | Updates brand |
| getModel() | String | Returns model |
| setModel() | void | Updates model |
| getPrice() | double | Returns price |
| setPrice() | void | Updates price |
| getVehicleInfo() | String | Returns vehicle information |

---

## Car Class

### Inheritance

```text
Car extends Vehicle
```

### Additional Attributes

| Attribute | Type | Description |
|------------|------|-------------|
| doors | int | Number of vehicle doors |

### Methods

| Method | Return Type | Description |
|----------|------------|-------------|
| Car() | Constructor | Creates Car object |
| getDoors() | int | Returns number of doors |
| setDoors() | void | Updates doors |
| getVehicleInfo() | String | Overrides Vehicle method |

---

## Dealership Class

### Attributes

| Attribute | Type | Description |
|------------|------|-------------|
| vehicles | ArrayList<Vehicle> | Stores inventory |

### Methods

| Method | Return Type | Description |
|----------|------------|-------------|
| addVehicle() | void | Adds vehicle to inventory |
| getInventoryCount() | int | Returns total vehicles |
| getTotalInventoryValue() | double | Calculates inventory value |
| findMostExpensiveVehicle() | Vehicle | Returns most expensive vehicle |

---

# UML Diagram

The UML diagram is located in:

```text
UML/CarDealership_UML.drawio
```

---

# Unit Testing

Each class contains its own dedicated test file.

## Vehicle Tests

| Test Method | Purpose |
|------------|---------|
| testVehicleConstructor() | Verify constructor |
| testPriceSetter() | Verify setter |

---

## Car Tests

| Test Method | Purpose |
|------------|---------|
| testCarInheritance() | Verify inheritance |
| testGetVehicleInfo() | Verify overriding |

---

## Dealership Tests

| Test Method | Purpose |
|------------|---------|
| testAddVehicle() | Verify inventory count |
| testTotalInventoryValue() | Verify calculations |
| testFindMostExpensiveVehicle() | Verify search functionality |

---

# Theory Questions

All theory answers are provided in:

```text
TheoryAnswers.txt
```

Topics covered:

1. Encapsulation
2. Inheritance
3. Polymorphism
4. Abstraction
5. Version Control
6. Git Branching
7. Merge vs Rebase
8. Build Tools
9. Maven
10. Gradle
11. Low-Level Languages
12. High-Level Languages
13. Java Syntax
14. Object-Oriented Programming Principles

---

# Technologies Used

| Technology | Purpose |
|------------|---------|
| Java | Application Development |
| JUnit 5 | Unit Testing |
| Maven | Dependency Management |
| Draw.io | UML Design |
| Git | Version Control |
| GitHub | Remote Repository |

---

# Learning Outcomes Demonstrated

✅ Greenfield Development

✅ UML Documentation

✅ Encapsulation

✅ Inheritance

✅ Polymorphism

✅ Unit Testing

✅ Version Control

✅ Build Tools

✅ Java Syntax

✅ Object-Oriented Programming Principles

---

# Author/s

Holang & Liyanda