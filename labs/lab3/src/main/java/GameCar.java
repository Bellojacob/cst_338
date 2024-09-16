// Title: TestBank2
// Name: Jacob Bello
// Date: 9/12/2024
// Abstract : A class which takes in data about cars and allows them to race

import java.util.Scanner;

public class GameCar {
    private String name;
    private String color;
    private int position;


    // constructor

    public GameCar(String name, String color, int position) {
        this.name = name;
        this.color = color;
        this.position = position;
    }

    public GameCar(){
        this.name = "MyBuddy";
        this.color = "White";
        this.position = 0;
    }

    void setCar(String name, String color, int position){
        setName(name);
        setColor(color);
        setPosition(position);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Car Information: " + getName() + " ("+getColor()+")" + ", Current Position: " + getPosition();
    }
    /* This method reads a game car's name, color,
    and current position from a user. */

    void getCarInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the car name: ");
        String carName = scanner.nextLine();
        System.out.print("Enter the color: ");
        String carColor = scanner.nextLine();
        System.out.print("Enter the starting position: ");
        int carPosition = scanner.nextInt();

        setCar(carName, carColor, carPosition);
    }


    /* This method makes the car move forward by
    adding the distance to the current position. */

    void moveForward(int distance) {
        int newPosition = getPosition() + distance;
        setPosition(newPosition);
    }


    /* This method makes the car move backward
    by subtracting the distance from the current position. */

    void moveBackward(int distance) {
        int newPosition = getPosition() - distance;
        if (newPosition < 0) {
            newPosition = 0;
        }
        setPosition(newPosition);
    }


    /* This method compares the position of the
    car with another car's position and prints the winner. */

    void race(GameCar anotherCar){
        if (this.getPosition() > anotherCar.getPosition()){
            System.out.println(this.getName() + " Win: "+this.getName() + "("+this.getPosition()+") vs " + anotherCar.getName() + " ("+anotherCar.getPosition()+")" );
        } else if (this.getPosition() < anotherCar.getPosition()) {
            System.out.println(anotherCar.getName() + " Win: "+anotherCar.getName() + "("+anotherCar.getPosition()+") vs " + this.getName() + " ("+this.getPosition()+")" );
        } else if (this.getPosition() == anotherCar.getPosition()) {
            System.out.println("Tie: " + this.getName() + " ("+this.getPosition()+") vs. " + anotherCar.getName() + "("+anotherCar.getPosition()+")");

        } else {
            System.out.println("Error");
    }
    }

    boolean equals(GameCar anotherCar) {
        return (getPosition() == anotherCar.getPosition()) && getName().equals(anotherCar.getName()) && getColor().equals(anotherCar.getColor());
    }
}

