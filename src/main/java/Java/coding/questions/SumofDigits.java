package Java.coding.questions;

public class SumofDigits {
    public static void main(String[] args) {
        int number= 12;
        int sum=0;
        while (number !=0){
            //extract last digit using modulus operator
            int digit = number  %10;
            System.out.println(digit);
            sum +=digit;
            //remove the last digit from the number using floor division operator
            number /=10;
        }
        System.out.println("Sumof Digits is : "+sum);
    }
}
