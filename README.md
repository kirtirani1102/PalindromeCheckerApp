# 🔤 Palindrome Checker Management System

> A console-based Java application that validates whether a given string is a palindrome under different conditions, while strengthening core programming fundamentals and data structure concepts.

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
├── UseCase2PalindromeCheckerApp.java
└── README.md
```

---

---

## 🚀 Use Case 2: Print a Hardcoded Palindrome Result

### 🎯 Goal

Display whether a hardcoded string is a palindrome.

### 👤 Actor

User

---

### 🔄 Application Flow

1. Program starts.
2. Hardcoded string is checked.
3. Result is printed to the console.
4. Program exits.

---

### 🧠 Key Concepts Used

#### 1️⃣ Class
In Java, even the simplest program must be written inside a class, as a class acts as a container to hold program logic.

```java
public class UseCase2PalindromeCheckerApp
```

#### 2️⃣ Main Method (Entry Point)

```java
public static void main(String[] args)
```

#### 3️⃣ Static Keyword
Allows the JVM to invoke the `main()` method without creating an object of the class.

#### 4️⃣ String
A built-in Java class used to store and manipulate textual data. Here, it stores the word to be checked for a palindrome.

#### 5️⃣ String Literal
Text enclosed within double quotes (`"madam"`), stored in the String constant pool.

#### 6️⃣ Conditional Statement (if-else)
Used to evaluate whether the given string satisfies the palindrome condition.

#### 7️⃣ Console Output
`System.out.println()` is used to display the result on the console.

#### 8️⃣ Data Structure: String

---

### 💡 Hint

Loop only till half the string length and compare characters from both ends:

```java
for (int i = 0; i < input.length() / 2; i++) {
    // compare input.charAt(i) with input.charAt(input.length() - 1 - i)
}
```

---

### 🖥️ Expected Console Output

```
Input text: madam
Is it a Palindrome? : true
```

---

### ⚙️ How to Compile and Run

**Step 1: Compile**

```bash
javac UseCase2PalindromeCheckerApp.java
```

**Step 2: Run**

```bash
java UseCase2PalindromeCheckerApp
```

---

## 📈 Future Enhancements

- [x] Implement palindrome checking logic (UC2).
- [ ] Add case-insensitive comparison.
- [ ] Ignore special characters and spaces.
- [ ] Provide user input support.
- [ ] Add menu-driven options.
- [ ] Implement multiple palindrome validation strategies.

---

## 👨‍💻 Author

Developer

## 🏷️ Version

2.0
