package Lesson_5;

public class Lesson_5 {

    public static void main(String[] args){

        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        outputArr(arr);
        System.out.println("Task 4 (Max):" + maxElemOfArr(arr));
        inverseOutput(arr);
    }

    public static void outputArr(int[] arr){

        System.out.print("Task 3: ");
        for(int i = 0; i < arr.length; i++)
        if (i % 2 == 0) System.out.print(arr[i] + " ");
        System.out.println();

    }

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

    public static void inverseOutput(int[] arr){

        System.out.print("Task 6(inverse output): ");
        for(int i = arr.length-1; i >=0 ; i--){
            System.out.print(arr[i] + " ");
        }

    }
}
