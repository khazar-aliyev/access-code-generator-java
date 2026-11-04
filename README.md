# Access Code Generator & Encryptor (Java)

This is a console-based Java application developed as part of a programming lab assignment (`Lab04_Q2`). It systematically searches for, validates, and transforms unique 4-digit access codes based on user-defined mathematical constraints and applies a custom substitution cipher for encryption.

## Features

- **Input Validation:** Prompts the user for a target digit sum (between 10 and 30) and a single-digit divisor (between 2 and 9), ensuring valid inputs using `while` loops.
- **Constraint Matching:** Iterates through 4-digit combinations to find codes meeting strict mathematical rules:
  - All digits must be unique (`a != b != c != d`).
  - Digits are grouped in ascending order within specific pairs (`a < b` and `c < d`).
  - The sum of all four digits must equal the user's target sum.
  - The generated code must be divisible by the chosen divisor.
- **String Reversal:** Reverses the digits of the validated access code.
- **Custom Substitution Encryption:** Converts numeric digits into alphabetical characters (e.g., `1 -> A`, `2 -> B`, ..., `9 -> I`).

## How It Works

1. The program asks the user for a **target digit sum** (10–30) and a **divisor** (2–9).
2. It loops through all possible 4-digit combinations (`1111` to `9999`) using nested loops.
3. If a combination satisfies all conditions, the code is:
   - Formatted as a string.
   - Reversed.
   - Encrypted into letters.
4. The final encrypted codes are printed to the console.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) installed on your machine.

### Running the Program

1. Clone the repository:
   ```bash
   git clone [https://github.com/KULLANICI_ADINIZ/access-code-generator-java.git](https://github.com/KULLANICI_ADINIZ/access-code-generator-java.git)
