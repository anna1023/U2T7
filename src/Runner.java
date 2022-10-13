import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first string.");
        String str1 = scan.nextLine();
        int str1len = str1.length();
        System.out.println("String length: "+str1len);
        int halfIndex = str1len/2;
        String first = str1.substring(0,halfIndex);
        String second = str1.substring(halfIndex);
        System.out.println("First half: "+first);
        System.out.println("Second half: "+second);

        System.out.println("Enter second string.");
        String str2 = scan.nextLine();
        int str2len = str2.length();
        if (str1len>str2len) {
            System.out.println(str1 + " is longer");
        }
        else if (str2len>str1len){
            System.out.println(str2 + " is longer");
        }
        else {
            System.out.println("They are equal.");
        }
        if(str1.equals(str2)){
            System.out.println("Both strings have the exact same characters.");
        }
        else {
            int compare = str1.compareTo(str2);
            if (compare<0) {
                System.out.println(str1+" is first alphabetically");
            }
            else {
                System.out.println(str2+ " is first alphabetically");
            }
        }
        int indexSecond = str1.indexOf(str2);
        if (indexSecond != -1) {
            System.out.println(str2+ " is found in "+str1+" at index "+indexSecond);
        }
        else {
            System.out.println(str2+ " is not found in "+str1);
        }

    }
}
