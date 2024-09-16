public class MyDemo {
    public static void main(String[] args) {
        GameCar car1 = new GameCar("MyBuddy", "Red", 19);
        car1.moveForward(5);
        System.out.println(car1.getPosition());
        car1.moveBackward(2);
        System.out.println(car1.getPosition());
        System.out.println(car1);
    }
}