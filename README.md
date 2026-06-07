# 📈 Stock Trading Platform

## 📌 Project Overview

The **Stock Trading Platform** is a Java-based console application that simulates a basic stock market environment. The application allows users to view market data, buy and sell stocks, manage investment portfolios, track transaction history, and save portfolio information for future reference.

This project was developed using **Object-Oriented Programming (OOP)** principles and demonstrates core Java concepts such as classes, objects, collections, file handling, and user interaction through a menu-driven interface.

---

## 🎯 Objectives

* Simulate a stock trading environment.
* Display real-time market data.
* Enable stock buy and sell operations.
* Track portfolio performance.
* Maintain transaction history.
* Store portfolio data using file handling.
* Apply Object-Oriented Programming concepts effectively.

---

## 🚀 Features

### 📊 Market Data Display

* View available stocks and their current prices.
* Simulated market environment with predefined stocks.

### 💰 Buy Stocks

* Purchase stocks using available account balance.
* Automatically update portfolio holdings.

### 📉 Sell Stocks

* Sell owned stocks.
* Update account balance and portfolio accordingly.

### 📁 Portfolio Management

* View current holdings.
* Track available balance.
* Monitor overall investment portfolio.

### 📝 Transaction History

* Record all buy and sell transactions.
* Display transaction details including:

  * Transaction Type
  * Stock Symbol
  * Quantity
  * Transaction Amount

### 📂 Data Persistence

* Save portfolio details to a text file (`portfolio.txt`).
* Demonstrates Java File I/O operations.

### 🔄 Market Price Simulation

* Dynamically update stock prices.
* Simulates real-world market fluctuations.

---

## 🛠️ Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Java Collections Framework

  * HashMap
  * ArrayList
* File Handling (FileWriter, BufferedWriter)
* VS Code
* JDK 24

---

## 📂 Project Structure

```text
StockTradingPlatform/
│
├── Main.java
├── Stock.java
├── User.java
├── Portfolio.java
├── Transaction.java
├── Market.java
├── FileManager.java
├── portfolio.txt
└── README.md
```

---

## 🏗️ Class Responsibilities

### Stock.java

Represents individual stocks and maintains stock information such as symbol and price.

### User.java

Manages user information, account balance, portfolio, and transaction records.

### Portfolio.java

Handles stock holdings and portfolio operations.

### Transaction.java

Stores transaction details for buy and sell activities.

### Market.java

Maintains available stocks and market price updates.

### FileManager.java

Responsible for saving portfolio information to a file.

### Main.java

Provides the menu-driven interface and coordinates application functionality.

---

## 📸 Sample Workflow

### 1. View Market Data

```text
===== MARKET DATA =====

GOOGL : ₹140.00
AAPL  : ₹180.00
TSLA  : ₹250.00
AMZN  : ₹170.00
```

### 2. Buy Stock

```text
Enter Choice: 2

Enter Symbol: AAPL
Quantity: 10

Stock Purchased Successfully!
```

### 3. View Portfolio

```text
===== PORTFOLIO =====

AAPL -> 10 Shares

Balance : ₹98200.00
```

### 4. View Transactions

```text
===== TRANSACTIONS =====

BUY | Stock: AAPL | Qty: 10 | Amount: ₹1800.00
```

---

## ▶️ How to Run

### Step 1: Open Terminal

Navigate to the project folder:

```bash
cd StockTradingPlatform
```

### Step 2: Compile the Project

```bash
javac *.java
```

### Step 3: Run the Application

```bash
java Main
```

---

## 📈 Learning Outcomes

Through this project, I gained practical experience in:

* Object-Oriented Programming (OOP)
* Java Collections Framework
* File Handling and Data Persistence
* Portfolio Management Logic
* Transaction Processing
* Console-Based Application Development
* Software Design and Modular Programming

---

## 🔮 Future Enhancements

* Database Integration (MySQL/SQLite)
* User Authentication System
* Graphical User Interface (JavaFX/Swing)
* Real-Time Stock API Integration
* Portfolio Profit/Loss Analysis
* Multi-User Support
* Advanced Reporting Dashboard

---





*(Replace with your actual GitHub repository link before submission.)*
