// Title: TestBank2
// Name: Jacob Bello
// Date: 9/12/2024
// Abstract : Checking Account class which can handle deposits and withdrawals

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckingAccount {
    private String name;
    private int accountNumber;
    private double balance;
    private boolean validNum = false;

    void deposit(){
        validNum = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a deposit amount: ");
        while(!validNum){
            try {
                double amount = scanner.nextDouble();
                if (amount > 0){
                    balance += amount;
                    validNum = true;

                } else {
                    System.out.println("Please enter a positive deposit amount: ");
                }
            } catch (InputMismatchException e){
                System.out.println("Please enter a positive deposit amount: ");
                scanner.nextLine();
            }
        }
    }

    void withdrawal(){
        System.out.println("Please enter an amount to withdrawal: ");
        Scanner scanner = new Scanner(System.in);
        double withdrawalAmount = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                withdrawalAmount = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid amount: ");
                scanner.nextLine(); // Clear
            }
        }
        if (withdrawalAmount <= balance) {
            balance -= withdrawalAmount;
            validInput = true;
        } else {
            while (withdrawalAmount > balance) {
                System.out.println("Insufficient Funds, Please try again");
                withdrawalAmount = scanner.nextDouble();
            }
        }

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}