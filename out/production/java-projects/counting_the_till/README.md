# 💰 Coin Counter - Java Program

## 📜 Description

This Java program calculates the **total dollar amount** based on a set of U.S. coins: **quarters**, **dimes**, **nickels**, and **pennies**.  
It takes four integers as input (the count of each coin type) and prints the total in **dollars and cents**, formatted to two decimal places.

---

## 🔧 How It Works

1. **Input**: Four integers representing:
    - Number of **quarters**
    - Number of **dimes**
    - Number of **nickels**
    - Number of **pennies**
2. **Calculation**: Computes total value using:
    - Quarter = `$0.25`
    - Dime = `$0.10`
    - Nickel = `$0.05`
    - Penny = `$0.01`
3. **Output**: Prints result using:
   ```java
   System.out.printf("Amount: $%.2f\n", dollars);

4. **Example**:

Input:

    4 3 2 1

Output:

    Amount: $1.41

