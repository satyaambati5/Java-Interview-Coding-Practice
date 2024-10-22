package Java.coding.questions;

public class LeapYearChek {
    public static void main(String[] args) {
        int year= 2100;
        boolean isleapYear=false;
        if (year % 4==0){
            if (year %100 !=0 || year % 400==0){
                isleapYear =true;
            }
        }
        if(isleapYear){
            System.out.println(year +" Year is Leap Year ");
        }
        else {
            System.out.println(year + " Year is Not Leap Year");
        }
    }
}
