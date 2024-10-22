package Java.coding.questions;

public class FibonacciSeries {
    public static void main(String[] args) {
        int number =5;
        int a=0, b=1;
        System.out.print(a +" "+b);
        int i=2;
        while (i<number){
            int next= a+b;
            System.out.print(" "+ next);
            a= b;
            b=next;
            i++;
        }


    }

}
