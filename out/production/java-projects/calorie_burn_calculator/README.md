# 🏃‍♀️ Calories Burned Calculator (Java)

## Overview

This Java program estimates the **average number of calories burned** by a person during exercise based on a scientifically-backed formula. The calculation uses a person's **age**, **weight**, **heart rate**, and **duration of exercise**.

> **Formula:**
> ```
> Calories = ( (Age × 0.2757) + (Weight × 0.03295) + (Heart Rate × 1.0781) − 75.4991 ) × Time / 8.368
> ```

This formula is derived from a scientific journal article.

---

## 📥 Input

The program accepts **four inputs** in the following order:

1. Age (in years)
2. Weight (in pounds)
3. Heart Rate (in beats per minute)
4. Time (in minutes)

All inputs are integers and can be entered on a single line separated by spaces.

---

## 📤 Output

The output is the **calculated calories burned**, displayed with **two decimal places**.

### Example:

**Input:**

49 155 148 60

**Output:**

Calories: 736.21 calories
