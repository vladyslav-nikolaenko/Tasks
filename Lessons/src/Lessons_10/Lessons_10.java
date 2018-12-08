package Lessons_10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lessons_10 {

    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");
        System.out.println("Input: abc");
        System.out.println("Output: " + isPalindrome("abc"));

        //Task 2
        System.out.println("Task 2");
        System.out.println("Input: 'Hello' 'olelH'");
        System.out.println("Output: " + isAnnograme("Hello","olelH"));

        //Task 3
        System.out.println("Task 3");
        System.out.println("Input: Java is the best programming language.");
        System.out.println("Output: " + outputCountOfWords("Java is the best programming language."));

        //Task 4
        System.out.println("Task 4");
        System.out.println("Input: My serial number is xz12387.");
        System.out.println("Output: " + deleteDigits("My serial number is xz12387."));

        //Task 5
        System.out.println("Task 5");
        System.out.println("Input: '  My serial number is xz12387. '");
        System.out.println("Output: " + deleteAllSpaces("'  My serial number is xz12387. '"));

        //Task 6
        System.out.println("Task 6");
        System.out.println("Input: 'Mamamia'");
        System.out.println("Output: " + codeWord("Mamamia"));

        //Task 7
        System.out.println("Task 7");
        System.out.println("Input: +380965337821");
        System.out.println("Output: " + verifyPhoneNumber("+380965337821"));


    }

    //String, StringBuilder
    //Task 1
    public static boolean isPalindrome(String str){

        byte i;
        for( i = 0; i < str.length()/2; i++){

            if (str.charAt(i) != str.charAt(str.length() - i - 1)) return false;

        }

        return true;

    }

    //Task 2
    public static boolean isAnnograme(String str1, String str2){

        if (str1.length() != str2.length()) return false;

        for(int i = 0; i < str1.length(); i++){

            if (str2.indexOf(str1.charAt(i)) == -1) return false;

        }

        return true;

    }

    //Task 3
    public static int outputCountOfWords(String str) {

        return str.split(" ").length;

    }

    //Task 4
    public static String deleteDigits(String str) {

        StringBuilder sb = new StringBuilder(str);

       for(int i = 0; i < sb.length();){


           if (Character.isDigit(sb.codePointAt(i))) sb.deleteCharAt(i);
//          or  if ((sb.codePointAt(i) >= 48) && (sb.codePointAt(i) <= 57)) sb.deleteCharAt(i);
           else i++;

       }


        return sb.toString();

    }

    //Task 5
    public static String deleteAllSpaces(String str) {

        return str.replaceAll(" ","");

    }

    //Task 6
    public static String codeWord(String str) {

        int counter;

        StringBuilder sb = new StringBuilder(str);

        for(int i = 0; i < sb.length(); i++){

            counter = 1;

            for(int j = i + 1; j < sb.length();){

                if (Character.toLowerCase(sb.charAt(i)) == Character.toLowerCase(sb.charAt(j))) {
                    counter++;
                    sb.deleteCharAt(j);
                }
                else j++;

            }

            sb.insert(i + 1,counter);
            i++;

        }

        return sb.toString();

    }

    //Task 7
    public static boolean verifyPhoneNumber(String str) {

        if ((str.length() != 13) || (!str.startsWith("+380"))) return false;

        for(int i = 4; i < str.length(); i++){

            if (!Character.isDigit(str.charAt(i))) return false;

        }

        return true;

    }

}
