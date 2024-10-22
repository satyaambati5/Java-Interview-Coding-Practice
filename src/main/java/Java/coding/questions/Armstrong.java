package Java.coding.questions;

public class Armstrong {
    public static void main(String[] args) {
        int number = 1537;
        if(isArmstrong(number)){
            System.out.println("Given Number " +number + " is Armstrong ");
        }else {
            System.out.println("Given Number " +number + " is NOT Armstrong ");
        }
    }
    public static boolean isArmstrong(int num){
        int originalNumber = num;
        int sum=0;
        int totalnumberofdigits = String.valueOf(num).length();
        while (num !=0){
            //get the last digit
            int digit = num % 10;
            //update sum
            sum += (int) Math.pow(digit,totalnumberofdigits);
            num /=10;
        }
        return originalNumber==sum;
    }
}
