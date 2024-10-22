package Java.coding.questions;

public class DigitOccurrenceCounter {
    public static void main(String[] args) {

        int number = 630040006;
        int  tocount =1;
        int count=0;
        String numberstr= Integer.toString(number);
        for(int i=0; i<numberstr.length(); i++){
            char digitchar= numberstr.charAt(i);
//            System.out.print(" "+digitchar);

            int digit =Character.getNumericValue(digitchar);

            if (digit == tocount){
                count ++;
            }

        }
        System.out.println(tocount+ " Occurrance are : "+count);

    }
}
