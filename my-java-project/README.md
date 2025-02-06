# my-java-project/README.md

# My Java Project

## Overview
This project contains a simple Java application that demonstrates the functionality of a `BankAccount` class. The `BankAccount` class allows users to deposit and withdraw funds, as well as check their account balance.

## Project Structure
```
my-java-project
├── src
│   ├── Main.java
│   └── BankAccount.java
└── README.md
```

## Files

### src/BankAccount.java
This file defines the `BankAccount` class, which includes:
- A private variable `balance` to store the account balance.
- A public method `deposit(double amount)` to add funds to the balance.
- A protected method `withdraw(double amount)` to deduct funds from the balance.
- A default-access method `checkBalance()` to display the current balance.

### src/Main.java
This file contains the `main` method where an instance of the `BankAccount` class is created. It demonstrates the accessibility of the `deposit`, `withdraw`, and `checkBalance` methods from both inside and outside the class.

## How to Compile and Run
1. Navigate to the project directory.
2. Compile the Java files:
   ```
   javac src/*.java
   ```
3. Run the application:
   ```
   java src.Main
   ```

## Functionality
- **Deposit**: Users can add funds to their account using the `deposit` method.
- **Withdraw**: Users can withdraw funds using the `withdraw` method, which is protected and can be accessed by subclasses or within the same package.
- **Check Balance**: Users can view their current balance using the `checkBalance` method, which is accessible within the same package. 

This project serves as a basic example of encapsulation and access modifiers in Java.