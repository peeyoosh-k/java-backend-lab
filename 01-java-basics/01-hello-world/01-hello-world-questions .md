# 01 - Hello World: Practice Questions

**Folder:** `01-java-basics/01-hello-world/`

| Level | Questions |
|-------|-----------|
| Easy (E) | Q01 - Q09 |
| Medium (M) | Q10 - Q19 |
| Hard (H) | Q20 - Q25 |

**Conventions:** one program per file, class name = file name, no `package` statement.

---

## Easy

### Q01 (E) - Hello, World
**File:** `Q01_Hello.java`

Print `Hello, World!` on the first line and your name on the second line.

### Q02 (E) - About Me
**File:** `Q02_AboutMe.java`

Print four lines: your name, college, course and career goal.

### Q03 (E) - print vs println
**File:** `Q03_PrintVsPrintln.java`

1. Print `Java is fun` on one line using three `print` calls (one word each).
2. Print the same words on three separate lines using `println`.

### Q04 (E) - Printing Different Values
**File:** `Q04_Values.java`

Print these four values, one per line, without quotes around them in the code:
the integer `10`, the decimal `3.14`, the boolean `true` and the character `'A'`.

### Q05 (E) - Arithmetic in println
**File:** `Q05_MathPrint.java`

1. Print the results of `10 + 5`, `10 - 5`, `10 * 5` and `10 / 5` on four lines.
2. Print `10 + 5 = 15`, where `15` is calculated by Java and not typed.

### Q06 (E) - Comments
**File:** `Q06_Comments.java`

Use a single-line comment, a multi-line comment and a javadoc comment in one program.
The only output must be:

```
Comments are ignored
```

### Q07 (E) - Empty Lines
**File:** `Q07_EmptyLines.java`

Print an address in three lines (name, street, city), then one empty line, then `Thank you`.

### Q08 (E) - Tab-Separated Table
**File:** `Q08_TabTable.java`

Print the following table using `\t`:

```
Name	Age	City
Aman	20	Dehradun
Riya	21	Delhi
Karan	19	Haridwar
```

### Q09 (E) - Greetings
**File:** `Q09_Greetings.java`

Print a greeting in three languages, one per line:

```
English: Hello
Hindi: Namaste
Spanish: Hola
```

---

## Medium

### Q10 (M) - Escape Characters
**File:** `Q10_EscapeChars.java`

Print exactly this output using escape characters:

```
Name:	Peeyoosh
"Java" is my favourite language
Path: W:\java-backend-lab
```

### Q11 (M) - Star Box
**File:** `Q11_StarBox.java`

Print a box with your name inside:

```
*****************
*   Peeyoosh    *
*****************
```

### Q12 (M) - printf Basics
**File:** `Q12_Printf.java`

Using `printf` (not string concatenation) and variables, print:

```
Name: Peeyoosh | Age: 20 | CGPA: 8.50
```

### Q13 (M) - Star Triangle
**File:** `Q13_Triangle.java`

Print the following pattern using only `println` calls (no loops):

```
*
**
***
****
*****
```

### Q14 (M) - Initial in Stars
**File:** `Q14_InitialArt.java`

Print the first letter of your name as large block letters made of `*`, at least five lines tall.

### Q15 (M) - String Concatenation
**File:** `Q15_Concat.java`

Predict the output of each line on paper, then run the program and compare.
Add a comment above each line explaining the result.

```java
System.out.println("Java " + 21);
System.out.println(1 + 2 + "3");
System.out.println("1" + 2 + 3);
System.out.println("Sum: " + 4 + 5);
System.out.println("Sum: " + (4 + 5));
```

### Q16 (M) - Custom Method
**File:** `Q16_Greet.java`

Create a method `static void greet()` that prints `Welcome to Java!`.
Call it three times from `main`.

### Q17 (M) - Table of 5
**File:** `Q17_TableOf5.java`

Print the table of 5 from `5 x 1 = 5` to `5 x 10 = 50`. Each result must be calculated by Java. Do not use loops.

### Q18 (M) - Text Block
**File:** `Q18_TextBlock.java`

Print a four-line message using a Java text block (`"""`).
Add a comment stating which Java version introduced text blocks.

### Q19 (M) - Aligned Output with printf
**File:** `Q19_Aligned.java`

Use `printf` with width specifiers to print names left-aligned and marks right-aligned:

```
Name        Marks
Aman           85
Riya           92
Karan          78
```

---

## Hard

### Q20 (H) - Fix the Broken Program
**File:** `Q20_FixIt.java`

The program below has four mistakes. Fix all of them so that it prints
`Learning Java is fun!` on line 1 and `Day 1 done` on line 2.
Add a comment above each fix explaining what was wrong.

```java
public class Q20_Fixit {
    public static void Main(String[] args) {
        System.out.println("Learning Java is fun!)
        system.out.println("Day 1 done");
    }
}
```

### Q21 (H) - Compile and Run from the Terminal
**File:** `Q21_CompileRun.java`

Write any small program and run it using `javac` followed by `java` (not the single-file shortcut).
In a comment at the top, list the exact commands used and the file that `javac` created.
Explain why this generated file is not pushed to GitHub.

### Q22 (H) - Command-Line Arguments
**File:** `Q22_Args.java`

Print `Hello, <name>!`, where the name is passed on the command line:

```
java 01-java-basics\01-hello-world\Q22_Args.java Peeyoosh
```

- If no name is passed, print `Hello, stranger!` without crashing.
- Also print the number of arguments received.

### Q23 (H) - Predict the Output
**File:** `Q23_Predict.java`

Write the exact output of the code below on paper, then run it and compare.
Explain any difference in comments.

```java
System.out.print("A");
System.out.println("B");
System.out.print("C\n");
System.out.println();
System.out.print("D\tE");
System.out.println('F' + 'G');
```

### Q24 (H) - Multiple Classes in One File
**File:** `Q24_TwoClasses.java`

Create two classes in one file:

- `public class Q24_TwoClasses` containing `main`
- a non-public class `Q24_Helper` with a method `sayHi()`

Call `sayHi()` from `main`. In a comment, explain why only one class per file can be `public`.

### Q25 (H) - ID Card Program
**File:** `Q25_IdCard.java`

Print a formatted ID card containing a star border, name, college, course, GitHub username and a goal line.

Requirements:
- use `printf` for aligned labels
- use a method `printLine()` for the border
- use at least one text block or escape character
- store all values in variables
