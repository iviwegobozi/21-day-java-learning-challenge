# 21-day-java-learning-challenge
My daily Java practice, projects and learning reflections.

## Day 1 — Variables + first program

**Built:** A program that stores a student's name and three marks, calculates the average, and prints it.

**Struggled with:** Understanding how to structure a program from scratch. Also hit integer division — `sum / 3` gave a whole number even when the answer should have been a decimal.

**Learned:**
- Every Java program needs `public class Main` and `public static void main(String[] args)`.
- The 4 core types: `int`, `double`, `String`, `boolean`.
- `final int SET = 3` creates a constant (can't be changed).
- Integer division: `int / int` throws away the remainder. Fix by making one side a `double` or casting with `(double)`.



---

## Day 2 — Scanner + conditionals

**Built:** A student mark registration program that reads input (name, ID, 3 marks), calculates an average, and prints a result based on thresholds.

**Struggled with:** My second `if` was being ignored. Turned out the condition order was wrong — I checked `>= 50` first, so `>= 75` never ran.

**Learned:**
- `Scanner` reads user input: `nextLine()` for text, `nextInt()` for whole numbers, `nextDouble()` for decimals.
- `import java.util.Scanner;` goes above the class.
- In an `if / else if / else` chain, the first true condition wins and the rest are skipped.
- Order conditions from strictest to loosest (check `>= 75` before `>= 50`).
- `=` assigns, `==` compares.


---

## Day 3 — Problem-solving (ATM program)

**Built:** A menu-driven ATM with 4 options: check balance, deposit, withdraw, exit. Includes a nested `if` for the insufficient-funds check.

**Struggled with:** Structuring the `if / else if / else` chain for 4 different options. Didn't know how to lay out multiple branches at first.

**Learned:**
- A menu is just `System.out.println` lines printed *before* the branching — not inside it.
- A nested `if` goes inside a branch (used it to check if the withdrawal exceeds the balance).
- Validate before acting — don't change state until you've checked it's safe.
- Don't mix `int` and `double` for the same concept (money). Pick one and stick to it.
- Update a variable directly (`balance = balance + amount`) instead of creating a new one each time.

**Still unclear:** Whether to model money as `int` or `double`.

---
