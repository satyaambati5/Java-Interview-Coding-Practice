package Java.coding.questions;

public class ReverseNumber {
    public static void main(String[] args) {
        long number= 12345;
        long reversenumber =0;

        while (number !=0){
            //extract lastnumber by modulues operator
            long digit = number %10;

            reversenumber = reversenumber * 10 + digit;
            number /=10;
        }
        System.out.println(reversenumber);
    }
}
