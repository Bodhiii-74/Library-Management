# University Library Management System

A Java application demonstrating specific design patterns and SOLID principles for a library management system.

## Design Patterns Implemented

- **Creational Pattern (Factory Method)**: Used in `LibraryItemFactory` to create `Book` and `Journal` objects based on input types.
- **Structural Pattern (Adapter)**: Implemented in `EBookAdapter` to allow the legacy `OldEBookSystem` to work seamlessly with the standard `LibraryItem` interface.
- **Behavioral Pattern (Chain of Responsibility)**: Used in the `Approver` hierarchy (`SelfCheckout` -> `Librarian`) to handle borrowing requests based on item value.

## OO Concepts & Principles

- **Open/Closed Principle**: The approval chain can be extended (e.g., adding a Manager) without modifying existing approval logic.
- **Encapsulation**: Private fields with controlled access.
- **Polymorphism**: Treating different item types (`Book`, `Journal`, `EBookAdapter`) uniformly through the `LibraryItem` parent class.
- **Inheritance**: Sharing common properties like `title` and `id` in the `LibraryItem` hierarchy.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Maven

## How to Run

### Using Command Line (Maven)
1. Navigate to the project directory:
   ```bash
   cd "Library Management"
   ```
2. Compile and package the application:
   ```bash
   mvn clean package
   ```
3. Run the application:
   ```bash
   java -cp target/library-1.0-SNAPSHOT.jar com.bodhi.library.LibraryApp
   ```

### Using NetBeans
1. Open NetBeans IDE.
2. Select **File > Open Project**.
3. Navigate to the project folder (`Library Management`) and open it.
4. Right-click the project in the Projects view and select **Run**.

## Project Structure

- `src/main/java/com/bodhi/library`: Contains all source code.
- `pom.xml`: Maven configuration file.

## Author
[UWU/ICT/21/081 - Sanduni Bodhika]
