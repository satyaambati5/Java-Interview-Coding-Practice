package Java.coding.questions;

public class PrimeCheck {
    public static void main(String[] args) {
        int number = 1;
//        boolean isPrime = isPrime (number);
        if (isPrime(number)) {
            System.out.println("Given number is PRIME " + number);

        } else {
            System.out.println("Give number is Not PRIME " + number);
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int i=2;
        while (i >Math.sqrt(num)) {
            if (num % i ==0){
                return false;
            }
            i++;
        }
        return true;
    }
}