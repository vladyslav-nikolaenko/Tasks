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
        isPalindrome(arr);

        //Practical task
        System.out.println("\n*******Practical lessons*******");
        System.out.println("Task 1: Avg = " + avgOfArray(arr));
        int[] arr1 = {1,2,3,4,5}, arr2 = {2,3,4,5,1};
        //Task 17
        System.out.println("Task 17: " + countOfReverses(arr1, arr2));
        //Task 18
        System.out.println("Task 18:");
        int[][] dividedArray = divideArray(arr);
        for(int i = 0; i < dividedArray.length; i++){
            for(int j = 0; j < dividedArray[i].length; j++){
                System.out.print(dividedArray[i][j] + " ");
            }
            System.out.println();
        }
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
          //  System.currentTimeMillis()
        }

    }

    //<end> - Homework

    //ProHomework lessons
    //Task 4
    public static void isPalindrome(int[] arr){

        byte i = 0, result = 0;
        for(; i < arr.length/2; i++){

           if ((arr[i]^arr[arr.length-1-i]) != 0) break;
               result += arr[i]^arr[arr.length-1-i];

        }

        if(result == 0) System.out.println("Task 4: Yes, it is! palindrome."); else
            System.out.println("Task 4: No, it isn't palindrome!");

    }

    //Practical tasks
    //Task 1
    public static float avgOfArray(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){

            sum += arr[i];

        }
        return sum/arr.length;

    }

    //Task 17
    public static int countOfReverses(int[] arr1, int[] arr2){

        int i, k, tmp1, tmp2;

        for(k = 0; k < arr1.length; k++) {

            for (i = 0; i < arr1.length; i++) {

                if (arr1[i] != arr2[i]) break;

            }

            if(i == arr1.length - 1) break;

            tmp2 = arr1[arr1.length - 1];
            for (i = 0; i < arr1.length; i++) {

                tmp1 = tmp2;
                tmp2 = arr1[i];
                arr1[i] = tmp1;

            }
            
        }

        return k;

    }

    //Task 18
    public static int[][] divideArray(int[] arr){

        byte odd = 0, even = 0, i = 0;
        int[][] oddEvenArray = new int[2][];
        for(;i < arr.length; i++){
            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        oddEvenArray[0] = new int[odd];
        oddEvenArray[1] = new int[even];
        odd = 0; even = 0;
        for(i = 0;i < arr.length; i++){
            if (arr[i] % 2 == 0) oddEvenArray[1][even++] = arr[i]; else
                oddEvenArray[0][odd++] = arr[i];
        }

        return oddEvenArray;
    }



}
