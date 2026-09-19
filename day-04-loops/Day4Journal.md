## Day 4 — Loops + fixing the balance bug

**Built:** Upgraded the ATM so it keeps running after each action instead of exiting once. The menu shows again after every choice, and only stops when the user picks 4 (Exit).

**Struggled with:** Making the balance actually change between actions. I was creating new variables (`Addedamount`, `withdrawAmount`) instead of updating the real balance, so it always reset to 500. Also didn't know how to update a variable in place — had to figure out `+=` and `-=`.

**Learned:**
- A `while` loop repeats code as long as a condition is true. Used `while (option != 4)` so the ATM keeps going until Exit.
- The counter/state variable (`option`) must be declared **outside** the loop and updated **inside** it.
- To update a variable in place, use `+=` and `-=` (e.g. `startBalance += amount`). This is the same idea as `i++` from the `for` loop.
- State that needs to persist across loop iterations (like the balance) must live outside the loop and be reassigned inside it — not recreated as a new variable.
- Validate before changing state: check the withdrawal amount *before* subtracting from the balance
