# Low Level Design (LLD) Patterns & Java Interview Questions
## For Staff Engineer Role

---

## 📚 Important Blogs & Resources Summary

### 1. [Mastering SOLID Principles for Java Interviews - DEV Community](https://dev.to/arshisaxena26/mastering-solid-principles-for-java-interviews-1gh7)
**Summary:** Comprehensive guide on SOLID principles (Single Responsibility, Open-Closed, Liskov Substitution, Interface Segregation, Dependency Inversion) with practical Java examples. Essential for designing maintainable and extensible systems.

### 2. [18 Java Design Pattern Questions - javarevisited](https://javarevisited.substack.com/p/18-java-design-pattern-questions)
**Summary:** Top 18 design pattern interview questions covering both OOP and GOF patterns. Includes Singleton, Factory, Builder, Observer, Strategy patterns with detailed explanations.

### 3. [Design Patterns Interview Questions - InterviewBit](https://www.interviewbit.com/design-patterns-interview-questions/)
**Summary:** Covers creational, structural, and behavioral design patterns with Java implementation details using `java.util.Observable` and `java.util.Observer` interfaces.

### 4. [SOLID Principles Interview Questions - JavaTechOnline](https://javatechonline.com/solid-principles-interview-questions-and-answers/)
**Summary:** Scenario-based SOLID principle questions with detailed explanations of violations and correct implementations.

### 5. [Design Principles | Hello Interview](https://www.hellointerview.com/learn/low-level-design/in-a-hurry/design-principles)
**Summary:** Focuses on OOD principles for LLD interviews, emphasizing interface design and avoiding fat interfaces that force classes to implement irrelevant methods.

### 6. [Java Design Patterns - DigitalOcean](https://www.digitalocean.com/community/tutorials/java-design-patterns-example-tutorial)
**Summary:** Complete guide covering creational, structural, and behavioral patterns with practical Java code examples. Highlights Singleton as the most used pattern.

### 7. [Design Patterns for the Modern Java Engineer - DEV Community](https://dev.to/ankitdevcode/design-patterns-for-the-modern-java-engineer-4l69)
**Summary:** Modern approach to design patterns focusing on flexibility, reusability, and clean code practices for contemporary Java development.

### 8. [Java Design Patterns: A Complete Guide - Medium](https://medium.com/@khouloud.haddad/java-design-patterns-a-complete-guide-to-writing-better-code-8af592d44457)
**Summary:** General reusable solutions to common software design challenges, emphasizing maintainable and scalable code.

### 9. [Java Design Patterns Tutorial - GeeksforGeeks](https://www.geeksforgeeks.org/system-design/java-design-patterns/)
**Summary:** Comprehensive tutorial covering all 23 GOF design patterns with implementation details and use cases.

### 10. [Your Thorough Guide to Java Design Patterns - Devōt](https://devot.team/blog/design-patterns-in-java)
**Summary:** Best practices for combining design patterns: Keep it simple, Ensure compatibility, Consider layered design.

---

## 🎯 Top 10 Important LLD Interview Questions for Staff Engineers

### Question 1: Singleton Pattern Implementation
**Q:** Implement a thread-safe Singleton pattern in Java. What are the potential pitfalls?

**Answer:**
```java
public class Singleton {
    private static volatile Singleton instance;
    
    private Singleton() {}
    
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
```
**Key Points:** Double-checked locking, volatile keyword, private constructor, reflection attacks, serialization issues.

---

### Question 2: Factory vs Builder Pattern
**Q:** When would you choose the Factory pattern over the Builder pattern? Provide a real-world scenario.

**Answer:**
- **Factory Pattern:** Use when you need to create objects without specifying the exact class. Best for families of related objects.
- **Builder Pattern:** Use when constructing complex objects with multiple optional parameters.

**Real-world Example:** Use Factory for creating different PaymentProcessor types (CreditCard, PayPal, Crypto). Use Builder for constructing a complex User object with optional fields like address, preferences, settings.

---

### Question 3: Observer Pattern Implementation
**Q:** Implement the Observer pattern for a stock price notification system.

**Answer:**
```java
public interface Observer {
    void update(double price);
}

public class Stock {
    private List<Observer> observers = new ArrayList<>();
    private double price;
    
    public void addObserver(Observer o) { observers.add(o); }
    
    public void setPrice(double price) {
        this.price = price;
        notifyAllObservers();
    }
    
    private void notifyAllObservers() {
        for (Observer o : observers) {
            o.update(price);
        }
    }
}
```

---

### Question 4: SOLID - Single Responsibility Principle
**Q:** A `UserManager` class handles user authentication, profile updates, and email notifications. Identify the violation and refactor.

**Answer:**
**Violation:** SRP violation - class has multiple reasons to change.

**Refactored:**
```java
public class AuthenticationService { /* auth logic */ }
public class ProfileService { /* profile updates */ }
public class NotificationService { /* email notifications */ }
```

---

### Question 5: Strategy Pattern for Payment Processing
**Q:** Design a payment system using Strategy pattern that supports multiple payment types.

**Answer:**
```java
public interface PaymentStrategy {
    void pay(double amount);
}

public class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) { /* implementation */ }
}

public class PayPalPayment implements PaymentStrategy {
    public void pay(double amount) { /* implementation */ }
}

public class PaymentContext {
    private PaymentStrategy strategy;
    
    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void executePayment(double amount) {
        strategy.pay(amount);
    }
}
```

---

### Question 6: Open-Closed Principle Violation
**Q:** Identify OCP violation in this code and refactor:
```java
public class DiscountCalculator {
    public double calculate(String type, double amount) {
        if (type.equals("SEASONAL")) return amount * 0.1;
        if (type.equals("CLEARANCE")) return amount * 0.2;
        return 0;
    }
}
```

**Answer:**
**Refactored:**
```java
public interface DiscountStrategy {
    double calculate(double amount);
}

public class SeasonalDiscount implements DiscountStrategy {
    public double calculate(double amount) { return amount * 0.1; }
}

public class ClearanceDiscount implements DiscountStrategy {
    public double calculate(double amount) { return amount * 0.2; }
}
```

---

### Question 7: Dependency Inversion Principle
**Q:** Why is Dependency Inversion crucial for scalable systems? Provide an example.

**Answer:**
DIP states that high-level modules should depend on abstractions, not concrete implementations.

**Example:**
```java
// Bad: Direct dependency
public class NotificationManager {
    private EmailSender sender = new EmailSender();
}

// Good: Depend on abstraction
public class NotificationManager {
    private MessageSender sender;
    
    public NotificationManager(MessageSender sender) {
        this.sender = sender;
    }
}
```

---

### Question 8: Decorator Pattern for Coffee Shop
**Q:** Design a coffee shop ordering system using Decorator pattern.

**Answer:**
```java
public interface Coffee {
    String getDescription();
    double getCost();
}

public class SimpleCoffee implements Coffee {
    public String getDescription() { return "Simple Coffee"; }
    public double getCost() { return 5.0; }
}

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;
    public CoffeeDecorator(Coffee c) { this.decoratedCoffee = c; }
}

public class MilkDecorator extends CoffeeDecorator {
    public String getDescription() { return decoratedCoffee.getDescription() + ", Milk"; }
    public double getCost() { return decoratedCoffee.getCost() + 1.0; }
}
```

---

### Question 9: Interface Segregation Principle
**Q:** A `Worker` interface has methods `work()`, `eat()`, `sleep()`. A `Robot` class implements it. Identify the problem and fix it.

**Answer:**
**Problem:** Robot is forced to implement `eat()` and `sleep()` which it doesn't need.

**Refactored:**
```java
public interface Workable { void work(); }
public interface Feedable { void eat(); }
public interface Restable { void sleep(); }

public class HumanWorker implements Workable, Feedable, Restable { /* all methods */ }
public class Robot implements Workable { /* only work() */ }
```

---

### Question 10: Adapter Pattern for Third-Party Integration
**Q:** Design an adapter to integrate a legacy payment gateway with a new payment interface.

**Answer:**
```java
public interface PaymentProcessor {
    void processPayment(double amount);
}

public class LegacyPaymentGateway {
    public void makePayment(String amount) { /* legacy implementation */ }
}

public class PaymentAdapter implements PaymentProcessor {
    private LegacyPaymentGateway legacy;
    
    public PaymentAdapter(LegacyPaymentGateway legacy) {
        this.legacy = legacy;
    }
    
    public void processPayment(double amount) {
        legacy.makePayment(String.valueOf(amount));
    }
}
```

---

## 📖 Key Takeaways for Staff Engineers

1. **Design for Change:** Use patterns that allow extension without modification (OCP)
2. **Favor Composition over Inheritance:** More flexible and maintainable
3. **Program to Interfaces:** Enables polymorphism and easy testing
4. **Keep Interfaces Small:** Follow ISP to avoid bloated interfaces
5. **Dependency Injection:** Use DI frameworks (Spring) to manage dependencies
6. **Thread Safety:** Always consider concurrency in Singleton and shared resources
7. **Pattern Combination:** Know when to combine patterns (Factory + Strategy, Decorator + Composite)
