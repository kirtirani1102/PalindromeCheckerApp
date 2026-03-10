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
├── UseCase7PalindromeCheckerApp.java
├── UseCase8PalindromeCheckerApp.java
├── UseCase9PalindromeCheckerApp.java
├── UseCase10PalindromeCheckerApp.java
├── UseCase11PalindromeCheckerApp.java
├── UseCase12PalindromeCheckerApp.java
├── UseCase13PalindromeCheckerApp.java
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

## 🚀 Use Case 7: Deque-Based Optimized Palindrome Checker

### 🎯 Goal

Use a Deque to compare front and rear elements directly for palindrome validation.

### 👤 Actor

User

---

### 🔄 Application Flow

1. Program starts.
2. Insert each character into the Deque.
3. Remove the first and last characters simultaneously.
4. Compare them — if they differ, it's not a palindrome.
5. Repeat until the Deque is empty or has one element.
6. Print the result.
7. Program exits.

---

### 🧠 Key Concepts Used

#### 1️⃣ Deque (Double Ended Queue)
A data structure that allows insertion and deletion from **both front and rear ends**, making it ideal for symmetric comparisons.

#### 2️⃣ Front and Rear Access
Enables direct comparison of the first and last characters without any extra reversal structure.

#### 3️⃣ Optimized Data Handling
Eliminates the need for separate reversal data structures (no extra Stack or reversed String required).

#### 4️⃣ Data Structure: `Deque<Character>`

---

### 💡 Hint

```java
// Define the input string.
String input = "refer";

// Create a Deque to store characters.
Deque<Character> deque = new ArrayDeque<>();

// Add each character to the deque.
for (char c : input.toCharArray()) { ... }

// Flag to track palindrome result.
boolean isPalindrome = true;

// Continue comparison while more than one element exists.
while (deque.size() > 1) { ... }
```

---

### 🖥️ Expected Console Output

```
Input : refer
Is Palindrome? : true
```

---

### ⚙️ How to Compile and Run

**Step 1: Compile**

```bash
javac UseCase7PalindromeCheckerApp.java
```

**Step 2: Run**

```bash
java UseCase7PalindromeCheckerApp
```

---

## 🚀 Use Case 8: Linked List Based Palindrome Checker

### 🎯 Goal

Check whether a string is a palindrome using a singly linked list.

### 👤 Actor

User

---

### 🔄 Application Flow

1. Program starts.
2. Convert the string into a linked list of characters.
3. Find the middle using the fast and slow pointer technique.
4. Reverse the second half of the linked list in-place.
5. Compare the first half and the reversed second half node by node.
6. Print the result.
7. Program exits.

---

### 🧠 Key Concepts Used

#### 1️⃣ Singly Linked List
A dynamic data structure where elements (nodes) are connected using `next` references, allowing sequential traversal.

#### 2️⃣ Node Traversal
Sequential access to elements using `next` references from the head node to the tail.

#### 3️⃣ Fast and Slow Pointer Technique
- **Slow pointer** moves one step at a time.
- **Fast pointer** moves two steps at a time.
- When fast reaches the end, slow is at the **middle** of the list.

#### 4️⃣ In-Place Reversal
Reverses the second half of the linked list without allocating extra memory, achieving **O(1) space complexity**.

#### 5️⃣ Data Structure: Singly Linked List (`LinkedList<Character>`)

---

### 💡 Hint

```java
// Define the input string.
String input = "level";

// Create a LinkedList to store characters.
LinkedList<Character> list = new LinkedList<>();

// Add each character to the linked list.
for (char c : input.toCharArray()) { ... }

// Flag to track palindrome state.
boolean isPalindrome = true;

// Compare until only one or zero elements remain.
while (list.size() > 1) { ... }
```

---

### 🖥️ Expected Console Output

```
Input : level
Is Palindrome? : true
```

---

### ⚙️ How to Compile and Run

**Step 1: Compile**

```bash
javac UseCase8PalindromeCheckerApp.java
```

**Step 2: Run**

```bash
java UseCase8PalindromeCheckerApp
```

---

## 🚀 Use Case 9: Recursive Palindrome Checker

### 🎯 Goal

Use recursion to check whether a string is a palindrome — without using any loops.

### 👤 Actor

User

---

### 🔄 Application Flow

1. Program starts.
2. Call the recursive `check()` method with the full string, `start = 0`, and `end = length - 1`.
3. Compare characters at the `start` and `end` indices.
4. If they match, recurse inward on the inner substring.
5. Base case reached when `start >= end` → palindrome confirmed.
6. Print the result.
7. Program exits.

---

### 🧠 Key Concepts Used

#### 1️⃣ Recursion
A method that calls itself with a smaller input until a base case is reached — no loops required.

#### 2️⃣ Base Case
When `start >= end`, the string is confirmed as a palindrome (single character or empty centre).

#### 3️⃣ Recursive Case
Compare characters at `start` and `end` indices; if they match, recurse inward by incrementing `start` and decrementing `end`.

#### 4️⃣ Call Stack
Each recursive call is pushed onto the call stack and resolved on the way back up, unwinding naturally.

#### 5️⃣ Method Parameters
`start` and `end` indices are passed as parameters to control the recursive comparison window.

#### 6️⃣ Data Structure: String (recursive index traversal)

---

### 💡 Hint

```java
/**
 * Application entry point for UC9.
 *
 * @param args Command-line arguments
 */
public static void main(String[] args) { ... }

/**
 * Recursively checks whether a string is palindrome.
 *
 * @param s     Input string
 * @param start Starting index
 * @param end   Ending index
 * @return true if palindrome, otherwise false
 */
private static boolean check(String s, int start, int end) { ... }
```

---

### 🖥️ Expected Console Output

```
Input : madam
Is Palindrome? : true
```

---

### ⚙️ How to Compile and Run

**Step 1: Compile**

```bash
javac UseCase9PalindromeCheckerApp.java
```

**Step 2: Run**

```bash
java UseCase9PalindromeCheckerApp
```

---

## 🚀 Use Case 10: Case-Insensitive & Space-Ignored Palindrome

### 🎯 Goal

Ignore spaces and case differences while checking whether a string is a palindrome.

### 👤 Actor

User

---

### 🔄 Application Flow

1. Program starts.
2. Normalize the string — convert to lowercase and remove all spaces/special characters.
3. Apply palindrome checking logic on the normalized string.
4. Print the result.
5. Program exits.

---

### 🧠 Key Concepts Used

#### 1️⃣ String Preprocessing
Transforming the input string before validation:
- `.toLowerCase()` — removes case differences.
- `.replaceAll()` — strips spaces and non-alphanumeric characters.

#### 2️⃣ Regular Expressions
Used with `replaceAll()` to filter out unwanted characters in a single operation:

```java
String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");
```

#### 3️⃣ Data Structure: String / Array

---

### 💡 Hint

```java
// Compare characters from both ends.
for (int i = 0; i < normalized.length() / 2; i++) {

    // Compare symmetric characters.
    if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) { ... }
}
```

---

### 🖥️ Expected Console Output

```
Input : A man a plan a canal Panama
Is Palindrome? : true
```

---

### ⚙️ How to Compile and Run

**Step 1: Compile**

```bash
javac UseCase10PalindromeCheckerApp.java
```

**Step 2: Run**

```bash
java UseCase10PalindromeCheckerApp
```

---

## 🚀 Use Case 11: Object-Oriented Palindrome Service

### 🎯 Goal

Encapsulate palindrome logic inside a dedicated class following Object-Oriented principles.

### 👤 Actor

User

---

### 🔄 Application Flow

1. Program starts.
2. Create an instance of the `PalindromeChecker` class.
3. Call the `checkPalindrome()` method with the input string.
4. Method uses two-pointer logic internally to validate.
5. Print the result.
6. Program exits.

---

### 🧠 Key Concepts Used (OOPS)

#### 1️⃣ Encapsulation
Palindrome logic is wrapped inside a `PalindromeChecker` class, hiding internal implementation details from the caller.

#### 2️⃣ Single Responsibility Principle
The `PalindromeChecker` class has one clearly defined responsibility — checking whether a string is a palindrome.

#### 3️⃣ Data Structure: Internal (Stack / Array)

---

### 💡 Hint

```java
/**
 * @param input Input string
 * @return true if palindrome, false otherwise
 */
public boolean checkPalindrome(String input) {

    // Initialize pointers.
    int start = 0;
    int end = input.length() - 1;

    // Compare characters moving inward.
    while (start < end) { ... }
}
```

---

### 🖥️ Expected Console Output

```
Input : racecar
Is Palindrome? : true
```

---

### ⚙️ How to Compile and Run

**Step 1: Compile**

```bash
javac UseCase11PalindromeCheckerApp.java
```

**Step 2: Run**

```bash
java UseCase11PalindromeCheckerApp
```

---

## 🚀 Use Case 12: Strategy Pattern for Palindrome Algorithms (Advanced)

### 🎯 Goal

Choose a palindrome algorithm dynamically at runtime using the Strategy design pattern.

### 👤 Actor

User

---

### 🔄 Application Flow

1. Program starts.
2. Define the `PalindromeStrategy` interface with a `check()` method.
3. Implement concrete strategies — `StackStrategy`, `DequeStrategy`, etc.
4. Inject the desired strategy at runtime into the context class.
5. Call `check()` through the injected strategy.
6. Print the result.
7. Program exits.

---

### 🧠 Key Concepts Used

#### 1️⃣ Interface
`PalindromeStrategy` defines a contract that all algorithm implementations must follow.

```java
interface PalindromeStrategy {
    boolean check(String input);
}
```

#### 2️⃣ Polymorphism
Different strategy classes (`StackStrategy`, `DequeStrategy`) implement the same interface, allowing them to be swapped interchangeably at runtime.

#### 3️⃣ Strategy Pattern
A behavioural design pattern that defines a family of algorithms, encapsulates each one, and makes them interchangeable — without changing the client code.

#### 4️⃣ Data Structure: Varies per strategy

---

### 💡 Hint

```java
/**
 * This class provides a Stack-based implementation
 * of the PalindromeStrategy interface.
 *
 * It uses LIFO behaviour to reverse characters
 * and compare them with the original sequence.
 */
class StackStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using Stack.
     *
     * @param input String to validate
     * @return true if palindrome, false otherwise
     */
    public boolean check(String input) {

        // Create a stack to store characters.
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push each character of the input string onto the stack.
        for (char c : input.toCharArray()) { ... }

        // Compare characters by popping from the stack.
        for (char c : input.toCharArray()) { ... }
    }
}
```

---

### 🖥️ Expected Console Output

```
Input : level
Is Palindrome? : true
```

---

### ⚙️ How to Compile and Run

**Step 1: Compile**

```bash
javac UseCase12PalindromeCheckerApp.java
```

**Step 2: Run**

```bash
java UseCase12PalindromeCheckerApp
```

---

## 🚀 Use Case 13: Performance Comparison

### 🎯 Goal

Compare the performance of different palindrome approaches by measuring their execution time.

### 👤 Actor

User

---

### 🔄 Application Flow

1. Program starts.
2. Run multiple palindrome algorithms on the same input.
3. Capture execution time for each using `System.nanoTime()`.
4. Display the palindrome result alongside execution time.
5. Program exits.

---

### 🧠 Key Concepts Used

#### 1️⃣ `System.nanoTime()`
Captures the current time in nanoseconds before and after an algorithm runs. The difference gives the precise execution time:

```java
long start = System.nanoTime();
// ... algorithm logic ...
long end = System.nanoTime();
long duration = end - start; // in nanoseconds
```

#### 2️⃣ Algorithm Comparison
Running multiple palindrome strategies (two-pointer, stack, deque, recursive, etc.) on the same input and comparing their execution times to evaluate efficiency.

---

### 💡 Hint

```java
/**
 * @version 13.0
 */
public class UseCase13PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) { ... }
}
```

---

### 🖥️ Expected Console Output

```
Input : level
Is Palindrome? : true
Execution Time : 852600 ns
```

---

### ⚙️ How to Compile and Run

**Step 1: Compile**

```bash
javac UseCase13PalindromeCheckerApp.java
```

**Step 2: Run**

```bash
java UseCase13PalindromeCheckerApp
```

---

## 📈 Future Enhancements

- [x] Implement palindrome checking logic (UC2).
- [x] Implement palindrome check using string reverse (UC3).
- [x] Add two-pointer character array approach (UC4).
- [x] Implement stack-based palindrome checker (UC5).
- [x] Implement Queue + Stack based palindrome checker (UC6).
- [x] Implement Deque-based optimized palindrome checker (UC7).
- [x] Implement linked list based palindrome checker (UC8).
- [x] Implement recursive palindrome checker (UC9).
- [x] Add case-insensitive & space-ignored palindrome checker (UC10).
- [x] Encapsulate logic in Object-Oriented Palindrome Service (UC11).
- [x] Implement Strategy Pattern for dynamic algorithm selection (UC12).
- [x] Add performance comparison with execution time tracking (UC13).
- [ ] Add menu-driven options.
- [ ] Ignore special characters and spaces.
- [ ] Provide user input support.
- [ ] Add menu-driven options.
- [ ] Implement multiple palindrome validation strategies.

---

## 👨‍💻 Author

Kirti

## 🏷️ Version

13.0
