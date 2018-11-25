package Lesson_5;

public class Lesson_5 {

    public static void main(String[] args){

        int[] arr = {0,1,2,3,4,5,15,6,7,8,9};
        System.out.println("Task 1: " + findValue(arr));
        System.out.println("Task 2 (for): " + findValueWithLogFor(arr));
        System.out.println("Task 2 (while): " + findValueWithLogWhile(arr));
        outputArr(arr);
        System.out.println("Task 4 (Max):" + maxElemOfArr(arr));
        simpleOutput(arr);
        inverseOutput(arr);
        System.out.println("\n*******Practical lessons*******");
        palindromeVerification(arr);

    }

    //<begin> - Homework
    //Task 1
    public static int findValue(int[] arr){

        for(int i = 0; i < arr.length; i++)
            if (arr[i] == 15) return i;
        return -1;

    }

    //Task 2 (For)
    public static String findValueWithLogFor(int[] arr){

        for(int i = 0; i < arr.length; i++)
            if (arr[i] == 17) return  i + "";
            return "Matches hasn't been found.";

    }

    //Task 2 (While)
    public static String findValueWithLogWhile(int[] arr){

        int i = 0;
        while (i < arr.length) {

            if (arr[i] == 17) return i + "";
            i++;

        }

        return "Matches hasn't been found.";

    }

    //Task 3
    public static void outputArr(int[] arr){

        System.out.print("Task 3: ");
        for(int i = 0; i < arr.length; i++)
        if (i % 2 == 0) System.out.print(arr[i] + " ");
        System.out.println();

    }

    //Task 4
    public static int maxElemOfArr(int[] arr){

        int max;

        if (arr.length == 0) return -1; else
            {
                max = arr[0];
                for(int i = 0; i < arr.length; i++)
                    if (arr[i] > max)
                        max = arr[i];
            }

        return max;
    }

    //Task 5
    public static void simpleOutput(int[] arr){

        System.out.print("Task 5: ");
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    //Task 6
    public static void inverseOutput(int[] arr){

        System.out.print("Task 6(inverse output): ");
        for(int i = arr.length-1; i >=0 ; i--){
            System.out.print(arr[i] + " ");
        }

    }

    //<end> - Homework

    //Practical lessons
    //Task 4
    public static void palindromeVerification(int[] arr){

        byte i = 0, result = 0;
        for(; i < arr.length/2; i++){

            result += arr[i]^arr[arr.length-1-i];

        }

        if(result == 0) System.out.println("Task 4: Yes, it is! palindrome."); else
            System.out.println("Task 4: No, it isn't palindrome!");

    }
}
