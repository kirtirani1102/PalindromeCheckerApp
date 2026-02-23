# 🔤 Palindrome Checker Management System

> A Java console application that serves as the entry point for a Palindrome Checker system.

---

## 🚀 Use Case 1: Application Entry & Welcome Message

### 🎯 Goal

Display a welcome message and application details when the program starts.

### 👤 Actor

User

---

## 🔄 Application Flow

1. Program starts.
2. JVM invokes the `main()` method.
3. Application name is displayed.
4. Application version is displayed.
5. Program continues to the next use case or exits.

---

## 🧠 Key Concepts Used

### 1️⃣ Class
Acts as a container for the Palindrome Checker application logic.

```java
public class UseCase1PalindromeCheckerApp
```

### 2️⃣ Main Method (Entry Point)

```java
public static void main(String[] args)
```

- First method executed by the JVM.
- Required signature for every Java application.
- `String[] args` allows command-line arguments.

### 3️⃣ Static Keyword

- Allows the JVM to call the `main()` method without creating an object.
- Belongs to the class rather than an instance.

### 4️⃣ Console Output

Uses:

```java
System.out.println();
```

To display:
- Welcome message
- Application version
- System status

### 5️⃣ Application Flow Control

Defines the startup behavior before palindrome processing begins.

---

## 🖥️ Expected Console Output

```
Welcome to the Palindrome Checker Management System
Version : 1.0
System initialized successfully.
```

---

## ⚙️ How to Compile and Run

### Step 1: Compile

```bash
javac UseCase1PalindromeCheckerApp.java
```

### Step 2: Run

```bash
java UseCase1PalindromeCheckerApp
```

---

## 🏗️ Project Structure

```
PalindromeCheckerApp/
│
├── UseCase1PalindromeCheckerApp.java
└── README.md
```

---

## 📈 Future Enhancements

- [ ] Implement palindrome checking logic.
- [ ] Add case-insensitive comparison.
- [ ] Ignore special characters and spaces.
- [ ] Provide user input support.
- [ ] Add menu-driven options.
- [ ] Implement multiple palindrome validation strategies.

---

## 👨‍💻 Author

Kirti Rani

## 🏷️ Version

1.0
