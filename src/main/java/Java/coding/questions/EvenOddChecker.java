package Java.coding.questions;

public class EvenOddChecker {
    public static void main(String[] args) {
        int number = 10;
        checkEvenorOdd(number);
    }
    public static void checkEvenorOdd(int num){
        if(num % 2 == 0) {
            System.out.println("Number " + num + " is Even!!");
        } else {
            System.out.println("Number " + num + " is Odd!!");
        }
    }

}
