# 🔤 SSD Interactive Lab: Java Interfaces & Decoupled Architecture
**Software Systems Development (CRN 12391) · Level 5**  
**The British College (Leeds Beckett University) · Sudan Pudasaini**

```
Progress: [██████░░░░░░░░░░░░] Step 1 of 3 (In Progress)
```

---,,,

## 🎯 Welcome to Your Week 2 Interactive Lab!

Welcome! In this hands-on lab, you will design and implement a **decoupled sentence analysis system** based on the official Leeds Beckett University syllabus.

You will master two essential software engineering skills:
1. **Java Interfaces & Polymorphism:** Defining abstract method contracts, decoupling caller from callee, and dynamic dispatch via interface types (`Counter wp = new WordProcessor()`).
2. **Professional Git Branching:** Learning why software engineers never commit directly to `main`, and mastering feature branches (`git checkout -b`, `git branch`, `git merge`).

Just like GitHub Skills exercises:
1. You work on your dedicated feature branch.
2. Verify your code with JUnit 5 tests locally in your IDE or terminal.
3. Merge your branch into `main` and push to GitHub.
4. GitHub Actions automatically tests your code.
5. When your tests pass, **this README automatically updates to reveal Step 2!**

---

## 🌿 The Git Branching Rule for Week 2

> [!IMPORTANT]
> ### 📢 In-Lab Policy: No Direct Commits to `main`!
> In production engineering teams, `main` represents deployable, stable code. Developers create **feature branches** to isolate work in progress, test safely, and merge cleanly.

### 🧭 Git Branching Quick Reference
Before writing code for Step 1, open your terminal inside this repository and create your feature branch:

```bash
# 1. Ensure your local main is up to date
git checkout main
git pull origin main

# 2. Create and switch to your Step 1 feature branch
git checkout -b feature/step1-counter

# 3. Confirm you are on your new branch (look for the * asterisk)
git branch
```

```
  main
* feature/step1-counter
```

---

## 📝 Step 1: Define the `Counter` Interface Contract

Open [`src/main/java/counter/Counter.java`](src/main/java/counter/Counter.java) in your IDE.

An interface is a **pure contract**. It specifies *what* operations must be provided, without providing the implementation code. In Java:
- All methods declared in an interface are implicitly `public` and `abstract` (no curly braces `{}` or method body).
- An interface cannot be directly instantiated with `new Counter()`, but it can be used as a polymorphic reference type.

### Your Tasks:
1. Open [`src/main/java/counter/Counter.java`](src/main/java/counter/Counter.java).
2. Declare the three required sentence analysis methods:
   * **`countWords`:** Accepts a `String sentence` and returns an `int` representing the word count.
     ```java
     int countWords(String sentence);
     ```
   * **`countLetters`:** Accepts a `String sentence` and returns an `int` representing the total alphabetic letter count.
     ```java
     int countLetters(String sentence);
     ```
   * **`getLength`:** Accepts a `String sentence` and returns an `int` representing the total character length (including spaces).
     ```java
     int getLength(String sentence);
     ```
3. Add professional **Javadoc documentation** above each method declaration describing:
   * What the method does.
   * `@param sentence` — the input string to analyze.
   * `@return` — the integer result.

---

## 🧪 How to Verify Step 1 Locally

Before pushing, verify your implementation with the provided unit test suite:

```bash
mvn test -Dtest=Step1CounterTest
```
*(Or right-click `Step1CounterTest.java` in IntelliJ / Eclipse / VS Code and select **Run**).*

You should see **5 passing tests**:
* ✅ `testCounterIsInterface` — Verifies `Counter` is declared as an interface, not a class.
* ✅ `testCountWordsDeclaration` — Verifies `countWords(String)` exists, is public, and returns `int`.
* ✅ `testCountLettersDeclaration` — Verifies `countLetters(String)` exists, is public, and returns `int`.
* ✅ `testGetLengthDeclaration` — Verifies `getLength(String)` exists, is public, and returns `int`.
* ✅ `testPolymorphicContract` — Verifies `Counter` can be used as a polymorphic contract type.

---

## 🚀 How to Advance to Step 2

Once all 5 tests are green, commit your work to your feature branch, merge it into `main`, and push:

```bash
# 1. Stage and commit on your feature branch
git add src/main/java/counter/Counter.java
git commit -m "Step 1: Declared Counter interface contract with Javadoc"

# 2. Switch back to main and merge your feature branch
git checkout main
git merge feature/step1-counter

# 3. Push main to trigger the autograder!
git push origin main
```

> [!TIP]
> After pushing, wait ~15 seconds and refresh this page on GitHub (or run `git pull` locally).  
> GitHub Actions will verify your solution and update this `README.md` to unlock **Step 2: Implement WordProcessor.java**!


ranish 