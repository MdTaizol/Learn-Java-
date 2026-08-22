# Learn Java – Beginner to Advanced

A collection of small Java programs covering core language concepts, from basic syntax up through methods, arrays, and exception handling. Each file focuses on one topic — this README documents the code and explains it so you can study and practice anytime.

## 📚 Table of Contents

1. [Variables & Data Types](#1-firstjava--variables--data-types)
2. [Operators](#2-operatorsjava--operators)
3. [Type Casting](#3-castingjava--type-casting)
4. [Conditionals](#4-comparsionjava--conditionals)
5. [Switch Statement](#5-switch1java--switch-statement)
6. [Loops](#6-loopsjava--loops)
7. [Arrays](#7-arrayjava--arrays)
8. [User Input](#8-userinputjava--user-input)
9. [Math Class](#9-mathfunctionjava--math-class)
10. [Methods](#10-methodfunctionjava--methods)
11. [Exception Handling](#11-expectionhandlingjava--exception-handling)
12. [Mini Project: Lottery Guessing Game](#12-lotteryprojectjava--mini-project)
13. [Classes & Objects](#13-oopclassobjectjava--classes--objects)
14. [Constructors](#14-oopconstructorsjava--constructors)
15. [Copy Constructor](#15-oopcopyconstructorjava--copy-constructor)
16. [Abstract Classes & Inheritance](#16-oopincapsulationjava--abstract-classes--inheritance)
17. [Types of Inheritance](#17-oopinheritancejava--types-of-inheritance)
18. [Method Overloading (Polymorphism)](#18-ooppolymorphismjava--method-overloading)
19. [The `static` Keyword](#19-oopstaticsjava--the-static-keyword)
20. [Real Encapsulation](#20-oopbanklanksjava--real-encapsulation-access-modifiers)
21. [Java Records (bonus)](#21-oopstujava--java-records-bonus)

---

## 1. `first.java` – Variables & Data Types

```java
public class first{
    public static void main (String[] args){
        System.out.println("hello world");

        // primitive types
        int age = 30;
        byte age1 = 30;               // byte range: -128 to 127
        int phone = 343432;
        long phone1 = 02344234234L;   // L suffix marks a long literal
        float pi = 3.14F;             // F suffix marks a float literal
        char letter = '@';
        boolean isAdult = true;

        // non-primitive type
        String name = "apu";
        String fn = new String("Islam");
        System.out.println(fn);
        System.out.println(name.length());

        // concatenation
        System.out.println(name + " and " + fn);

        // first character of a string
        System.out.println(name.charAt(0));

        // replace() swaps characters and returns a NEW string
        String name2 = name.replace('p','d');
        System.out.println(name2);

        // substring(start, end) — end index is exclusive
        String name3 = "aman And akku";
        System.out.println(name3.substring(5,7));
    }
}
```

**Explanation**
- **Primitive types** store raw values directly: `int` (whole numbers), `byte` (small whole numbers, -128 to 127), `long` (very large whole numbers, needs an `L` suffix), `float` (decimals, needs an `F` suffix), `char` (a single character in single quotes), `boolean` (`true`/`false`).
- **Non-primitive types** like `String` are objects — they come with built-in methods.
- `name.length()` → number of characters.
- `name + " and " + fn` → string concatenation with `+`.
- `name.charAt(0)` → gets the character at index 0 (the first one).
- `name.replace('p','d')` → returns a *new* string with every `p` swapped for `d`; it doesn't change the original.
- `name3.substring(5,7)` → extracts characters from index 5 up to (not including) index 7.

**Practice idea:** change `name3` and the substring indices, predict the output before running it.

---

## 2. `operators.java` – Operators

```java
public class operators {
    public static void main (String [] args) {
        int numb = 1;

        System.err.println(++numb);   // pre-increment: add 1, THEN print
        System.err.println(numb ++);  // post-increment: print, THEN add 1
        System.err.println(numb);
        System.err.println(--numb);   // pre-decrement: subtract 1, THEN print
        System.err.println(numb--);   // post-decrement: print, THEN subtract 1
        System.err.println(numb);
    }
}
```

**Explanation**
- `++numb` (pre-increment) increases the value *before* it's used in the expression.
- `numb++` (post-increment) uses the *current* value first, then increases it afterward.
- Same logic applies to `--numb` and `numb--` for decrementing.
- Trace it step by step: starting at `numb = 1` →
  `++numb` → 2 (prints 2) → `numb++` → prints 2, numb becomes 3 → prints `numb` → 3 → `--numb` → 2 (prints 2) → `numb--` → prints 2, numb becomes 1 → prints `numb` → 1.

**Practice idea:** rewrite this using only `+` and `-` (no `++`/`--`) and confirm you get the same output.

---

## 3. `casting.java` – Type Casting

```java
public class casting {
    public static void main(String[] args){
        // implicit casting (automatic, smaller type -> bigger type)
        double price = 100.0;
        double finalPrice = price + 10;
        System.out.println(finalPrice);

        // explicit casting (manual, bigger/decimal type -> smaller type)
        int p = 100;
        int fp = p + (int)18.90;   // (int) truncates the decimal part
        System.out.println(fp);

        // constant using final
        final float pi = 3.14F;
        System.out.println(3* pi);
    }
}
```

**Explanation**
- **Implicit casting** happens automatically when there's no risk of losing data (e.g. `int` → `double`).
- **Explicit casting** — `(int)18.90` — is needed when you convert a *larger or more precise* type into a smaller/less precise one; here it just chops off `.90`, giving `18`, not rounding.
- **`final`** marks a variable as a constant — once assigned, it can never be reassigned. Attempting `pi = 3.0;` later would cause a compile error.

**Practice idea:** try `(int)18.99` vs `Math.round(18.99)` and compare the results — one truncates, the other rounds.

---

## 4. `comparsion.java` – Conditionals

```java
import java.util.Scanner;

public class comparsion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the votion year : ");
        int age = sc.nextInt();

        if(age > 18){
            System.out.println("fully eligable");
        }
        else if( age == 18 ){
            System.out.println("new voter");
        }
        else{
            System.out.println("your are not eligable.");
        }
    }
}
```

**Explanation**
- `Scanner sc = new Scanner(System.in)` creates an object that reads input typed by the user.
- `sc.nextInt()` waits for the user to type a whole number and stores it in `age`.
- `if / else if / else` checks conditions **in order**, top to bottom, and runs the first block whose condition is `true`. If none match, `else` runs.
- The file also has commented-out examples using `&&` (both conditions must be true) and `||` (at least one must be true) for combining checks — e.g. `age >= 18 || age1 >= 19`.

**Practice idea:** add a fourth branch for `age < 0` (invalid input) using another `else if`.

---

## 5. `switch1.java` – Switch Statement

```java
public class switch1 {
    public static void main(String[]args){
        int day = 1;
        switch(day){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Thusday - sunday");
        }
    }
}
```

**Explanation**
- `switch` compares one variable (`day`) against several possible fixed values (`case 1`, `case 2`, ...) — cleaner than a long `if/else if` chain when checking a single variable.
- `break` stops execution from "falling through" into the next case. Without it, once one case matches, Java keeps running every case below it too.
- `default` runs if none of the `case`s match — like a final `else`.

**Practice idea:** remove one `break` and observe what "fall-through" looks like when you run it.

---

## 6. `loops.java` – Loops

```java
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        int i = 0;
        while(true){
            if(i == 3){
                i += 1;
                continue;    // skip the rest of this iteration, jump to condition
            }
            System.out.println(i);
            i = i + 1;
            if(i > 5){
                break;       // exit the loop completely
            }
        }
    }
}
```

**Explanation**
- `while(true)` creates an infinite loop that only stops when `break` is reached — you must control the exit condition yourself.
- When `i == 3`, `continue` skips the `println` for that iteration and jumps straight back to re-check the loop condition — so `3` never gets printed.
- When `i` exceeds `5`, `break` ends the loop entirely.
- **Output:** `0 1 2 4 5`
- The file's comments also demonstrate the three loop types side by side:
  - `for` — best when you know exactly how many times to loop.
  - `while` — checks the condition *before* running the loop body.
  - `do-while` — runs the body *once first*, then checks the condition (useful for "ask at least once" prompts).

**Practice idea:** rewrite the same `0 1 2 4 5` output using a `for` loop with an `if/continue` inside it.

---

## 7. `array.java` – Arrays

```java
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        // 1D array
        int [] a = { 3, 4, 5, 6};
        System.out.println(a[2]);   // index 2 -> value 5

        // 2D array
        int [][] final_a = {{3, 4, 5, 6, 3},{4, 4, 5, 3, 8 }};
        System.out.println(final_a[0][1]);   // row 0, column 1 -> value 4
    }
}
```

**Explanation**
- Arrays store multiple values of the same type in one variable, indexed starting at `0`.
- `a[2]` retrieves the *third* element (index starts at 0), which is `5`.
- A **2D array** is an "array of arrays" — `final_a[0]` is the entire first row `{3,4,5,6,3}`, and `[1]` picks the second value in that row (`4`).
- The commented-out code also shows `Arrays.sort(marks)`, which sorts an array's elements in ascending order in place.

**Practice idea:** add a `for` loop that prints every element of `a` one by one instead of hardcoding `a[2]`.

---

## 8. `userInput.java` – User Input

```java
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter the string vlaue : ");
        String str = s2.nextLine();

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the string vlaue : ");
        String std = s1.nextLine();

        System.out.println(str + std);
    }
}
```

**Explanation**
- `nextLine()` reads an entire line of text (including spaces) as a `String`.
- The commented-out code above shows `nextInt()` and `nextFloat()` for reading numbers.
- **Common gotcha:** mixing `nextInt()`/`nextFloat()` with `nextLine()` in the same program can cause a leftover newline character to mess up the next read. Best practice: create **one** `Scanner` object and reuse it throughout the program, rather than creating a new one for every input (as this file does with `s1` and `s2`).

**Practice idea:** refactor this file to use a single `Scanner` for both inputs instead of two separate ones.

---

## 9. `mathFunction.java` – Math Class

```java
public class mathFunction {
    public static void main(String[]args){
        System.out.println(Math.min(5,6));               // smaller of the two -> 5
        System.out.println(Math.min(5,4));                // -> 4
        System.out.println((int)(Math.random()*1000));    // random int 0-999
        System.out.println((Math.sqrt(34)));               // square root of 34
    }
}
```

**Explanation**
- `Math` is a built-in Java class full of ready-made numeric functions — no import needed.
- `Math.min(a, b)` returns whichever value is smaller (there's also `Math.max`).
- `Math.random()` always returns a `double` between `0.0` (inclusive) and `1.0` (exclusive). Multiplying by `1000` and casting to `(int)` scales it into a random whole number from `0` to `999`.
- `Math.sqrt(x)` returns the square root of `x`.

**Practice idea:** use `Math.random()` to generate a random number between 1 and 100 (inclusive) — think about what to multiply by and what to add.

---

## 10. `MethodFunction.java` – Methods

```java
import java.util.Scanner;

public class MethodFunction {
    public static void printjava(){
        System.out.println("Hello java");
    }

    public static void printname(String name){
        System.out.println(name);
    }

    public static void printSum( int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        printjava();
        printjava();
        printjava();

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printname(name);
        printname("Taizol");
        printname("islam");

        printSum(5,6);
    }
}
```

**Explanation**
- A **method** is a reusable, named block of code. `printjava()` takes no input and just prints a fixed message.
- `printname(String name)` takes one **parameter** — whatever string you pass in gets printed.
- `printSum(int a, int b)` takes two parameters, adds them, and prints the result — this is how you pass data *into* a method.
- All are declared `static`, so they can be called directly from `main` without creating an object first (`printjava();` instead of needing `new MethodFunction().printjava();`).
- Calling the same method multiple times (`printjava()` three times) shows how methods avoid repeating code.

**Practice idea:** write a new method `printProduct(int a, int b)` that prints `a * b`, and call it with a few different number pairs.

---

## 11. `ExpectionHandling.java` – Exception Handling

```java
public class ExpectionHandling{
    public static void main(String[] args) {
        int marks [] = {98,96,95};
        try{
            System.out.println(marks[5]);
        }catch(Exception exception){
            // do something after catching.
        }
        System.out.println("This is aman");
    }
}
```

**Explanation**
- The array `marks` only has 3 elements (valid indices `0`, `1`, `2`), so `marks[5]` doesn't exist — this normally throws an `ArrayIndexOutOfBoundsException` and crashes the program.
- Wrapping the risky line in `try { ... }` lets Java attempt it safely.
- If an error occurs, execution jumps into `catch(Exception exception) { ... }` instead of crashing — here the catch block is empty, but you'd normally log the error or print a friendly message.
- Because the exception was *caught*, `"This is aman"` still prints afterward — the program keeps running instead of stopping.

**Practice idea:** inside the `catch` block, print `"Index does not exist, please try a valid index"` so the user sees a helpful message instead of nothing.

---

## 12. `lotteryProject.java` – Mini Project

```java
import java.util.Scanner;

public class lotteryProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;

        do{
            System.out.println("Guess my number (1 - 100 ): ");
            userNumber = sc.nextInt();

            if(myNumber == userNumber){
                System.out.println("Woohoo .. correct number! ");
                break;
            }
            else if( userNumber >= myNumber){
                System.out.println("Your number to large ");
            }
            else {
                System.out.println("Your number is too small");
            }
        } while(userNumber >= 0);

        System.out.println("My number Was : ");
        System.out.println(myNumber);
    }
}
```

**Explanation** — this program ties every earlier topic together:
- `Math.random()` (topic 9) generates the secret number.
- `do-while` (topic 6) guarantees the guess prompt runs at least once, and loops until a correct guess or a negative number is entered.
- `if / else if / else` (topic 4) compares the guess to the secret number and gives feedback.
- `break` (topic 6) exits the loop the moment the user guesses correctly.
- `Scanner` (topic 8) reads each guess.

**Practice idea:** add a guess counter that tells the player how many attempts it took them to win.

---

---

## 13. `oop/Classobject.java` – Classes & Objects

```java
class pen{
    String color;
    String type;

    public static void writes(){
        System.out.println("understand the class & object");
    }

    public void peninfo(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

class student{
    String name;
    int age ;
    double cgpa;

    public void stu(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.cgpa);
    }
}

public class Classobject{
    public static void main(String[] args) {
         pen.writes();               // static method — called on the class itself
         pen pen1 = new pen();       // create an object ("instance") of pen
         pen1.color = "green";
         pen1.type = "ballpoint";
         pen1.peninfo();

         pen pen2 = new pen();       // a completely separate object
         pen2.color = "black";
         pen2.type = "gel";
         pen2.peninfo();

         student stu1 = new student();
         stu1.name = "taizol";
         stu1.age = 23;
         stu1.cgpa = 3.70;
         stu1.stu();
    }
}
```

**Explanation:** a **class** is a blueprint (`pen`, `student`); an **object** is a real instance built from it with `new`. `pen1` and `pen2` are two independent objects — changing `pen1.color` never affects `pen2.color`. `this.color` inside a method refers to "whichever object called this method." `writes()` is `static`, so it belongs to the class itself, not to any one object — that's why it's called as `pen.writes()` instead of through an instance.

**Practice idea:** create a third `pen3` object with your own values and call `peninfo()` on it.

---

## 14. `oop/constructors.java` – Constructors

```java
class Student{
    String name;
    int age ;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() {}   // no-argument ("default") constructor

    Student(Student s2){    // constructor that copies from another Student
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class constructors {
    public static void main(String[] args) {
       Student stu = new Student();
       stu.name = "Taizol";
       stu.age = 23;

       Student s2 = new Student(stu);   // builds s2 using stu's values
       s2.printinfo();
    }
}
```

**Explanation:** a **constructor** is special code that runs automatically when an object is created with `new`. It has the same name as the class and no return type. Here there are two versions (**constructor overloading**): an empty one, and one that takes another `Student` and copies its fields — this second pattern is technically a "copy constructor" (topic 15 shows the same idea, cleaner).

**Practice idea:** uncomment the commented-out `Student(String name, int age)` constructor and use it to build a student directly, in one line, instead of setting fields after `new`.

---

## 15. `oop/copyConstructor.java` – Copy Constructor

```java
class Pen{
    String color;
    String type;

    public void printinfo(){
       System.out.println(this.color);
       System.out.println(this.type);
    }

    Pen(){}

    Pen(Pen s2){                  // copy constructor
        this.color = s2.color;
        this.type = s2.type;
    }
}

public class copyConstructor {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "green";
        p1.type = "ballpoint";

        Pen s2 = new Pen(p1);     // s2 is a fresh, independent copy of p1
        s2.printinfo();
    }
}
```

**Explanation:** a copy constructor builds a **new, separate object** with the same field values as an existing one. `s2` is not the same object as `p1` — changing `s2.color` afterward won't affect `p1.color`. This is a very common Java pattern for duplicating objects safely.

**Practice idea:** after creating `s2`, change `s2.color = "red"` and print both `p1.color` and `s2.color` to prove they're independent.

---

## 16. `oop/incapsulation.java` – Abstract Classes & Inheritance
*(Note: despite the filename, this file actually demonstrates **abstraction**, not encapsulation — real encapsulation is in `oop/bank/lanks.java`, topic 20 below.)*

```java
abstract class Animal{
  abstract public void walk();      // no body — subclasses MUST implement this
  Animal(){
    System.out.println("you are draw animal");
  }
  public void eat(){
    System.out.println("Animal eats");
  }
}

class Horse extends Animal{
    Horse(){
        System.out.println("dram the horse");
    }
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}
class chicken extends Animal{
    public void walk(){
        System.out.println("walk on 2 leg");
    }
}

public class incapsulation {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
        chicken chic = new chicken();
        chic.walk();
        Animal animal = new Horse();   // upcasting — Animal reference, Horse object
        animal.walk();                 // still runs Horse's walk() — polymorphism!
    }
}
```

**Explanation:** an **abstract class** (`Animal`) can't be instantiated directly (`new Animal()` would fail) — it exists only to be extended. `abstract public void walk();` has no body; every subclass (`Horse`, `chicken`) is *forced* to provide its own version. `eat()` is a normal, shared method both subclasses inherit for free. The last line — `Animal animal = new Horse();` — shows **runtime polymorphism**: even though the variable's type is `Animal`, Java calls `Horse`'s `walk()` because that's the actual object underneath.

**Practice idea:** add a `Duck` class extending `Animal` with its own `walk()`, and add an abstract `sound()` method that every animal must implement.

---

## 17. `oop/inheritance.java` – Types of Inheritance

```java
import java.util.Scanner;

class Shape{
    String color;
    public void area(){
        System.out.println("display area");
    }
}

// single-level inheritance
class triangle extends Shape{
    public void areas(int l, int h){
        System.out.println(1/2 * l * h);   // ⚠️ bug: 1/2 = 0 in integer math!
    }

    // hierarchical inheritance
    class circle extends Shape{
        public void area(int r){
            System.out.println(3.14*r*r);
        }
    }

    // hybrid inheritance
    class retance extends circle{
        public void square(int m , int n){
            System.out.println( m* n);
        }
    }
}

public class inheritance {
    public static void main(String [] args){
       triangle s1 = new triangle();
       s1.color = "green";

       Scanner sc = new Scanner(System.in);
       int l = sc.nextInt();
       int h = sc.nextInt();
       s1.area();
       s1.areas(l, h);
    }
}
```

**Explanation:** `triangle extends Shape` is **single-level inheritance** — one child, one parent. `circle extends Shape` (nested inside `triangle` here) represents **hierarchical inheritance** — multiple classes sharing the same parent. `retance extends circle` chains inheritance further (**hybrid**).

⚠️ **Bug to notice:** `1/2 * l * h` always prints `0`, because in Java, `1/2` with two `int`s performs **integer division** and truncates to `0` before multiplying anything. The fix is `(1.0/2) * l * h` or `(l * h) / 2`.

**Practice idea:** fix the triangle-area bug, then run it and confirm you get a real (non-zero) area.

---

## 18. `oop/polymorphism.java` – Method Overloading

```java
class Student{
    String name;
    int age ;

    public void printinfo(String name){
        System.out.println(this.name);
    }
    public void printinfo(int age){
        System.out.println(this.age);
    }
}

public class polymorphism {
    public static void main(String args []){
        Student s1 = new Student();
        s1.name = "Taizol";
        s1.age = 24;
        s1.printinfo(s1.age);   // calls the int version
    }
}
```

**Explanation:** this is **method overloading** — a form of **compile-time polymorphism**. Two methods share the same name (`printinfo`) but differ by **parameter type** (`String` vs `int`). Java decides which one to run based on what type of argument you pass in. This is different from the runtime polymorphism seen in topic 16 (overriding).

**Practice idea:** uncomment the third `printinfo(String name, int age)` overload and call it with both values.

---

## 19. `oop/statics.java` – The `static` Keyword

```java
class Student{
    String name;
    static String school ;   // shared by ALL Student objects

    public void info(){
        System.out.println(this.name);
    }
    public static void changeschool(){
        school = "scholars";
    }
}

public class statics {
    public static void main(String[] args) {
        Student.school = "ius";
        Student stu = new Student();
        stu.name = "tony";
        stu.info();

        System.out.println(Student.school);
    }
}
```

**Explanation:** `static` fields belong to the **class**, not to any individual object — there's only one `school` value shared across every `Student` you ever create. Instance fields like `name` are different per object, but `school` is the same everywhere. That's why it's accessed as `Student.school` rather than through an object.

**Practice idea:** create two `Student` objects with different names, then change `Student.school` once and print it through both objects — notice they both show the new value.

---

## 20. `oop/bank/lanks.java` – Real Encapsulation (Access Modifiers)

```java
package bank;

class Account{
     public String name;
     protected String email;
     private String password;   // hidden from outside classes

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){
        this.password = pass;
    }
}

public class lanks{
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = " Taizol";
        account1.email = "taizol@gamil.com";
        account1.setPassword("abcd");         // can't set password directly — must go through the method
        System.out.println(account1.getPassword());
    }
}
```

**Explanation:** this is what **encapsulation** actually means — restricting direct access to sensitive fields. `password` is `private`, so no code outside the `Account` class can touch it directly (`account1.password = "x"` would fail to compile). Instead, you're forced to go through the public **getter** (`getPassword()`) and **setter** (`setPassword()`) methods, which could validate or transform the value before storing it. `public` fields (`name`) are open to everyone; `protected` (`email`) is open to the same package and subclasses only.

**Practice idea:** add a check inside `setPassword` that rejects passwords shorter than 4 characters, printing an error instead of saving them.

---

## 21. `oop/stu.java` – Java Records (bonus)

```java
public record stu() {
}
```

**Explanation:** this file is just a stub, but it hints at a modern Java feature — a **record** is a compact way to create an immutable data-holding class in one line (normally you'd write a full class with fields, a constructor, getters, `equals()`, `hashCode()`, and `toString()` by hand). `record stu()` here has no fields yet, so it doesn't do much — but a real example would look like `public record Student(String name, int age) {}`, which automatically generates all of the above for you.

**Practice idea:** rewrite `Student` (from topic 14) as a record instead of a regular class, and compare how much shorter it is.

---

## 🚀 Getting Started

### Prerequisites
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) installed (JDK 8+)
- A text editor or IDE (VS Code, IntelliJ IDEA, Eclipse, etc.)

### Running a file
```bash
javac first.java
java first
```
Replace `first` with any other filename (without `.java`) to run that example.

## 🗂️ Repository Structure

```
Learn-Java-/
├── oop/
│   ├── Classobject.java       # Classes & objects
│   ├── constructors.java      # Constructors
│   ├── copyConstructor.java   # Copy constructor
│   ├── incapsulation.java     # Abstract classes & inheritance
│   ├── inheritance.java       # Types of inheritance
│   ├── polymorphism.java      # Method overloading
│   ├── statics.java           # static keyword
│   ├── stu.java               # Java record (stub)
│   └── bank/
│       ├── lanks.java         # Real encapsulation (access modifiers)
│       └── polymorphism.java  # Overloading inside a package
├── first.java                # Variables & data types
├── operators.java            # Arithmetic & increment/decrement operators
├── casting.java               # Type casting & constants
├── comparsion.java            # If/else conditionals
├── switch1.java               # Switch statements
├── loops.java                 # For, while, do-while loops
├── array.java                 # 1D & 2D arrays
├── userInput.java             # Scanner-based input
├── mathFunction.java          # Math class methods
├── MethodFunction.java        # Custom methods/functions
├── ExpectionHandling.java     # Try/catch exception handling
├── lotteryProject.java        # Mini project: number guessing game
└── README.md
```

## 🎯 Suggested Learning Order

**Core Java:**
1. `first.java` → 2. `operators.java` → 3. `casting.java` → 4. `comparsion.java` → 5. `switch1.java` → 6. `loops.java` → 7. `array.java` → 8. `userInput.java` → 9. `mathFunction.java` → 10. `MethodFunction.java` → 11. `ExpectionHandling.java` → 12. `lotteryProject.java`

**Object-Oriented Programming:**
13. `oop/Classobject.java` → 14. `oop/constructors.java` → 15. `oop/copyConstructor.java` → 16. `oop/incapsulation.java` → 17. `oop/inheritance.java` → 18. `oop/polymorphism.java` → 19. `oop/statics.java` → 20. `oop/bank/lanks.java` → 21. `oop/stu.java`

## 🤝 Contributing

This is a personal learning repository, but suggestions and corrections are welcome — feel free to open an issue or pull request.

## 📄 License

This project is open for educational use. Feel free to reference or adapt these examples for your own learning.
