# Valet Parking Management System

A Java-based console application that simulates the workflow of a valet parking service. The project allows vehicles to be parked, assigned valet tickets, retrieved later, and monitored through simple alert notifications.

The goal of the project was to practice object-oriented design and model a real-world parking workflow using Java.

## Features

- Create valet tickets for cars and bikes
- Simulate vehicle parking and retrieval
- Track vehicles using ticket numbers
- Generate valet-style parking and retrieval alerts
- Separate handling logic for different vehicle types
- Console-based interaction flow

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Git & GitHub

## Project Structure

```text
ValetParkingSystem/
│
├── src/
│   └── props/
│       ├── Automobiles.java
│       ├── Bikes.java
│       ├── Cars.java
│       ├── Main.java
│       ├── ValetBot.java
│       ├── ValetNotifier.java
│       ├── ValetSystem.java
│       └── ValetTicket.java
│
└── README.md
````

## How to Run

1. Clone the repository
2. Open the project in Eclipse, IntelliJ, or VS Code
3. Make sure JDK 17+ is installed
4. Run `Main.java`

## Sample Output

```text
--- Welcome to the Valet Parking System ---

Your ticket for Toyota has been created.
It is parked at spot #38.

[ALERT]: Your Toyota has been parked.

Retrieving vehicle with ticket: 1000

The car is unlocked.
The car was turned on via the ignition key.

Brand: Toyota | Year: 2023 | Fuel: 80.0%
```

## Concepts Practiced

* Object-oriented programming
* Inheritance and encapsulation
* Class design and modular structure
* Console-based application flow
* Basic simulation of real-world systems

## Possible Improvements

* Add database integration for persistent parking records
* Build a web interface using Spring Boot or React
* Add authentication and admin controls
* Send real notifications using email or SMS APIs

## Author

Yeshwanth Madineni
