import java.util.Scanner;

public class Bill {
    int hours;
    int minutes;
    double rate;
    double total;
    double totalMinutes;
    double discount;

    public void inputTimeWorked(){
        System.out.println("Enter number of full hours worked"
                + "\n" + "followed by number of minutes: ");

        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();
        minutes = scanner.nextInt();

        System.out.println("Time worked: \n" + hours + " hours and " + minutes + " minutes");

        System.out.println("Enter your rate: ");
        rate = scanner.nextDouble();





    }

    public void updateFee(){
        System.out.printf("Rate: $%.2f per quarter hour." , rate);

        if (minutes <= 15){
            totalMinutes = 1;
        } else if (minutes <= 30) {
            totalMinutes = 2;
        } else if (minutes <= 45){
            totalMinutes = 3;
        } else if (minutes <= 60) {
            totalMinutes = 4;
        } else {
            System.out.println("IDK Dude");
        }

        total = (hours * (rate * 4)) + (totalMinutes * rate);


    }

    public void outputBill(){
        System.out.println("\nEnter a coupon number: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        if (userInput == 1234){
            System.out.println("Your coupon is valid. (10% discount)");
            total = total * .90;
        } else {
            System.out.println("Invalid coupon");
        }


        System.out.printf("Amount due: $%.2f", total);
    }
}
