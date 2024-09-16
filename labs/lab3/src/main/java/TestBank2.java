// Title: TestBank2
// Name: Jacob Bello
// Date: 9/12/2024
// Abstract : Testing class for Bank and Account class


public class TestBank2 {
    public static void main(String[] args) {
        // new bank obj
        Bank testBank = new Bank();
        // create 3 accounts
        testBank.openAccount();
        testBank.openAccount();
        testBank.openAccount();
        // try to open 1 more
        testBank.openAccount();
        //display accounts
        testBank.printAllAccounts();
    }
}