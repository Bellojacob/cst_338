// Title: TestBank2
// Name: Jacob Bello
// Date: 9/12/2024
// Abstract : Sample bank account which can handle opening new accounts and closing accounts

import java.util.Scanner;

public class Bank {
    private String bankName;
    private CheckingAccount[] accounts = new CheckingAccount[3];
    private int numberOfAccounts = 0;

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    boolean openAccount(){
        if (numberOfAccounts >= accounts.length){
            return false;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Account holder's name: ");
        String accountHolder = scanner.nextLine();
        System.out.println("Enter account number: ");
        int accountNumber = scanner.nextInt();
        System.out.println("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        for (int i = 0; i < numberOfAccounts; i++){
            if (accountNumber == accounts[i].getAccountNumber()){
                return false;
            }
        }

        // open new account section
        CheckingAccount c1 = new CheckingAccount();
        c1.setAccountNumber(accountNumber);
        c1.setName(accountHolder);
        c1.setBalance(initialBalance);
        accounts[numberOfAccounts] = c1;
        numberOfAccounts++;


        return true;
    }

    boolean closeAccount(){
        System.out.println("Enter your account number: ");
        Scanner scanner = new Scanner(System.in);
        int enteredAccountNum = scanner.nextInt();

        for (int i = 0; i < accounts.length; i++) {
            if (enteredAccountNum == accounts[i].getAccountNumber()){
                accounts[i] = (null);
                numberOfAccounts--;
                return true;
            }
        }
        return false;
    }

    void printAllAccounts() {
        for (int i = 0; i < numberOfAccounts; i++) {
            System.out.println("Account Name: " + accounts[i].getName());
            System.out.println("Account Number: " + accounts[i].getAccountNumber());
            System.out.println("Balance: " + accounts[i].getBalance());
        }
    }
}
