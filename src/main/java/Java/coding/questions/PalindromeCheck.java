package Java.coding.questions;

public class PalindromeCheck {
    public static void main(String[] args) {
        int number = 121;
        if(isPalindrome(number)){
            System.out.println("Number is Palindrome");
        }else {
            System.out.println( "number is  not Palindrome");
        }
    }
    public static boolean isPalindrome(int num){
       int originalNumber =num;
        int reversednumber=0;
        while (num !=0) {
            int digit = num % 10;
            reversednumber = reversednumber * 10 + digit;
            num = num/10;
        }
        return originalNumber == reversednumber;
    }
}
