// Title: TestBank1
// Name: Jacob Bello
// Date: 9/12/2024
// Abstract : Testing class for Bank and Account class

public class TestBank1 {
    public static void main(String[] args) {
        // new bank obj
        Bank testBank = new Bank();
        // set bank name
        testBank.setBankName("Jacob's Bank");
        // open new account
        testBank.openAccount();
        // open new account
        testBank.openAccount();
        // close account
        testBank.closeAccount();
        // display all accounts
        testBank.printAllAccounts();
    }


}
