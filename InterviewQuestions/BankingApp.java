package com.InterviewQuestions;

import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            displayBalance();
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            displayBalance();
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

public class BankingApp {

    public static void main(String[] args) {
        // Example usage
        BankAccount myAccount = new BankAccount("123456789",
                                                  "John Doe", 1000.0);

        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    myAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    myAccount.withdraw(withdrawalAmount);
                    break;
                case 3:
                    myAccount.displayBalance();
                    break;
                case 4:
                    System.out.println("Exiting the program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}

    /*BankAccount Class:

        This class represents a bank account and contains three private fields: accountNumber, accountHolder, and balance.
        The constructor initializes the account with an account number, account holder's name, and an initial balance.
        Methods:
        deposit(double amount): Adds the specified amount to the account balance if the amount is positive.
        withdraw(double amount): Subtracts the specified amount from the account balance if the amount is positive and does not exceed the current balance.
        displayBalance(): Prints the current balance of the account.
        BankingApp Class:

        This class contains the main method, serving as the entry point of the program.

        It creates an instance of the BankAccount class named myAccount with initial values.

        A Scanner is used to take user input for different banking operations.

        The program presents a menu to the user with the following options:

        1. Deposit: Prompts the user to enter a deposit amount and calls the deposit method.
        2. Withdraw: Prompts the user to enter a withdrawal amount and calls the withdraw method.
        3. Display Balance: Calls the displayBalance method to show the current account balance.
        4. Exit: Exits the program.
        A do-while loop is used to repeatedly display the menu until the user chooses to exit (choice == 4).

        The user's choice is processed using a switch statement, and appropriate actions are taken based on the selected option.

        If an invalid choice is entered, a default message is displayed, and the loop continues.

        The loop continues until the user chooses to exit.

        Overall, this program provides a basic interactive interface for a bank account, allowing the user to deposit, withdraw, check the balance, and exit the application.
*/