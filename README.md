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
├── UseCase3PalindromeCheckerApp.java
├── UseCase4PalindromeCheckerApp.java
├── UseCase5PalindromeCheckerApp.java
├── UseCase6PalindromeCheckerApp.java
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

## 🚀 Use Case 3: Palindrome Check Using String Reverse

### 🎯 Goal

Check whether a string is a palindrome by reversing it.

### 👤 Actor

User

---

### 🔄 Application Flow

1. Program starts.
2. Reverse the string using a loop.
3. Compare the original and reversed strings.
4. Display the result.
5. Program exits.

---

### 🧠 Key Concepts Used

#### 1️⃣ Loop (for loop)
Used to iterate through the characters of the string in reverse order.

#### 2️⃣ String Immutability
In Java, `String` objects are immutable — every modification creates a new `String` object.

#### 3️⃣ String Concatenation (`+`)
Used to build the reversed string character by character (introduced here to later discuss its performance drawbacks).

#### 4️⃣ `equals()` Method
Used to compare the actual **content** of two `String` objects instead of their memory references.

#### 5️⃣ Data Structure: String

---

### 💡 Hint

Iterate from the last character to the first:

```java
// Iterate from the last character to the first.
for (int i = input.length() - 1; i >= 0; i--) {
    // append input.charAt(i) to build the reversed string
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
javac UseCase3PalindromeCheckerApp.java
```

**Step 2: Run**

```bash
java UseCase3PalindromeCheckerApp
```

---

## 🚀 Use Case 4: Character Array Based Palindrome Check

### 🎯 Goal

Convert a string to a character array and compare characters using the two-pointer technique.

### 👤 Actor

User

---

### 🔄 Application Flow

1. Program starts.
2. Convert the string to a `char[]` array.
3. Use two-pointer approach (start & end).
4. Compare characters at both pointers, moving inward.
5. Display the result.
6. Program exits.

---

### 🧠 Key Concepts Used

#### 1️⃣ Character Array (`char[]`)
A primitive array used to store individual characters of a string for index-based access.

#### 2️⃣ Array Indexing
Accessing elements using index positions starting from `0`.

#### 3️⃣ Two-Pointer Technique
One pointer starts from the beginning and the other from the end, reducing unnecessary comparisons by meeting in the middle.

#### 4️⃣ Time Complexity Awareness
Demonstrates efficient comparison without creating extra objects — runs in **O(n/2)** comparisons.

#### 5️⃣ Data Structure: `char[]`

---

### 💡 Hint

```java
// Declare and initialize the input string.
String input = "radar";

// Convert the string into a character array.
char[] chars = input.toCharArray();

// Initialize pointer at the beginning.
int start = 0;

// Initialize pointer at the end.
int end = chars.length - 1;

// Assume palindrome initially.
boolean isPalindrome = true;

// Continue comparison until pointers cross.
while (start < end) { ... }
```

---

### 🖥️ Expected Console Output

```
Input : radar
Is Palindrome? : true
```

---

### ⚙️ How to Compile and Run

**Step 1: Compile**

```bash
javac UseCase4PalindromeCheckerApp.java
```

**Step 2: Run**

```bash
java UseCase4PalindromeCheckerApp
```

---

## 🚀 Use Case 5: Stack-Based Palindrome Checker

### 🎯 Goal

Use a stack to reverse characters and validate whether a string is a palindrome.

### 👤 Actor

User

---

### 🔄 Application Flow

1. Program starts.
2. Push each character of the string into a stack.
3. Pop characters from the stack (reverse order) and compare with the original.
4. Print the result.
5. Program exits.

---

### 🧠 Key Concepts Used

#### 1️⃣ Stack
A linear data structure that follows the **Last In First Out (LIFO)** principle.

#### 2️⃣ Push Operation
Used to insert characters into the stack one by one.

#### 3️⃣ Pop Operation
Used to remove characters from the stack in reverse order for comparison.

#### 4️⃣ Reversal Logic
A stack naturally reverses the order of elements, making it ideal for palindrome validation without manually reversing the string.

#### 5️⃣ Data Structure: `Stack<Character>`

---

### 💡 Hint

```java
// Declare and initialize the input string.
String input = "noon";

// Create a Stack to store characters.
Stack<Character> stack = new Stack<>();

// Push each character of the string into the stack.
for (char c : input.toCharArray()) { ... }

// Assume palindrome initially.
boolean isPalindrome = true;

// Iterate again through original string.
for (char c : input.toCharArray()) { ... }
```

---

### 🖥️ Expected Console Output

```
Input : noon
Is Palindrome? : true
```

---

### ⚙️ How to Compile and Run

**Step 1: Compile**

```bash
javac UseCase5PalindromeCheckerApp.java
```

**Step 2: Run**

```bash
java UseCase5PalindromeCheckerApp
```

---

## 🚀 Use Case 6: Queue + Stack Based Palindrome Check

### 🎯 Goal

Demonstrate the difference between FIFO and LIFO by using both a Queue and a Stack to validate a palindrome.

### 👤 Actor

User

---

### 🔄 Application Flow

1. Program starts.
2. Enqueue each character into a Queue (FIFO).
3. Push each character into a Stack (LIFO).
4. Compare dequeued characters (Queue) with popped characters (Stack).
5. Print the result.
6. Program exits.

---

### 🧠 Key Concepts Used

#### 1️⃣ Queue
A linear data structure that follows the **First In First Out (FIFO)** principle — characters come out in the same order they were inserted.

#### 2️⃣ Enqueue & Dequeue Operations
- **Enqueue** — inserts characters into the queue one by one.
- **Dequeue** — removes characters from the front of the queue in original order.

#### 3️⃣ Stack vs Queue
Demonstrates the behavioral difference between **LIFO** (Stack) and **FIFO** (Queue):
- Stack pops characters in **reverse** order.
- Queue dequeues characters in **original** order.
- If they match at every step → the string is a palindrome.

#### 4️⃣ Logical Comparison
Matching `dequeue` (Queue) output with `pop` (Stack) output to validate palindrome logic.

#### 5️⃣ Data Structures: `Queue<Character>`, `Stack<Character>`

---

### 💡 Hint

```java
// Define the input string to validate.
String input = "civic";

// Create a Queue to store characters in FIFO order.
Queue<Character> queue = new LinkedList<>();

// Create a Stack to store characters in LIFO order.
Stack<Character> stack = new Stack<>();

// Insert each character into both queue and stack.
for (char c : input.toCharArray()) { ... }

// Flag to track palindrome status.
boolean isPalindrome = true;

// Compare characters until the queue becomes empty.
while (!queue.isEmpty()) { ... }
```

---

### 🖥️ Expected Console Output

```
Input : civic
Is Palindrome? : true
```

---

### ⚙️ How to Compile and Run

**Step 1: Compile**

```bash
javac UseCase6PalindromeCheckerApp.java
```

**Step 2: Run**

```bash
java UseCase6PalindromeCheckerApp
```

---

## 📈 Future Enhancements

- [x] Implement palindrome checking logic (UC2).
- [x] Implement palindrome check using string reverse (UC3).
- [x] Add two-pointer character array approach (UC4).
- [x] Implement stack-based palindrome checker (UC5).
- [x] Implement Queue + Stack based palindrome checker (UC6).
- [ ] Add case-insensitive comparison.
- [ ] Ignore special characters and spaces.
- [ ] Provide user input support.
- [ ] Add menu-driven options.
- [ ] Implement multiple palindrome validation strategies.

---

## 👨‍💻 Author

Kirti Rani

## 🏷️ Version

6.0
