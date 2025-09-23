# Toll Bridge Program

This Java program calculates the toll fee for crossing a bridge based on the time of day. The user is prompted to enter the current time (on a 24-hour clock), and the program will determine the toll amount based on the given time.

## Features

- Prompts the user to input the current time (in hours).
- Calculates the toll fee based on the time:
  - Before 6:00 AM: $1.55
  - From 6:00 AM to 9:59 AM: $4.65
  - From 10:00 AM to 5:59 PM: $2.35
  - After 6:00 PM: $1.55
- Displays the entered time and the calculated toll fee with two decimal precision.

## Usage

1. Compile the program using a Java compiler:
    ```bash
    javac toll_bridge.java
    ```

2. Run the program:
    ```bash
    java toll_bridge
    ```

3. Enter the time of day when prompted (in 24-hour format):
    ```
    To best determine your toll, please provide the time by the nearest hour.
    ```

4. The program will display the calculated toll based on the time you input.

Example output:

To best determine your toll, please provide the time by the nearest hour.
8
Based on the time you entered: 8, your toll amount is $4.65.


## Code Explanation

The program works as follows:

1. The user is prompted to enter the current time (by the nearest hour).
2. The input is stored in an integer variable `time`.
3. A series of conditional statements (`if`/`else if`/`else`) is used to determine the toll fee based on the time entered.
4. The toll fee is then displayed along with the entered time, formatted to two decimal places for clarity.

## Example Time and Toll Rates

| Time (24-hour format) | Toll Amount |
|-----------------------|-------------|
| Before 6:00 AM        | $1.55       |
| 6:00 AM - 9:59 AM     | $4.65       |
| 10:00 AM - 5:59 PM    | $2.35       |
| After 6:00 PM         | $1.55       |

## Requirements

- Java 8 or higher
- A terminal or command line interface for compiling and running the Java program