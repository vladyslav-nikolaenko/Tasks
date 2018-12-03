package Lesson_5;

import java.util.Arrays;

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


        //Practical task
        System.out.println("\n*******Practical lessons*******");
        //Task 1
        System.out.println("Task 1: Avg = " + avgOfArray(arr));
        //Task 2
        int[] arrayWithoutElement = deleteElementOfArray(arr, 5);
        System.out.print("Task 2: ");
        for (int i = 0; i < arrayWithoutElement.length; i++){

            System.out.print(arrayWithoutElement[i] + " ");

        }
        System.out.println();
        //Task 3
        int[] arr1 = {1,2,3,4,5}, arr2 = {2,3,4,5,1};
        int[][] copiedArrays = copyElementArrays(arr1,arr2);
        System.out.println("Task 3:");
        System.out.println("arr1 = " + Arrays.toString(copiedArrays[0]));
        System.out.println("arr2 = " + Arrays.toString(copiedArrays[1]));

        //Task 4
        System.out.print("Task 4: ");
        int[] changedArray = insertElementOfArray(arr1,10);
        for(int i = 0; i < changedArray.length; i++){

            System.out.print(changedArray[i] + " ");

        }
        System.out.println();
        //Task 6
        int[] arrWithRepeatedElements = {4,4,3,2,2,2,7,8,5,5,5,3,4};
        System.out.println("Task 6: ");
        System.out.println("Input: " + Arrays.toString(arrWithRepeatedElements));
        System.out.println("Output: " + Arrays.toString(findRepeatedElemets(arrWithRepeatedElements)));

        //Task 7
        int[] left = {-1,1,1,2,2,4,5,6,7,7,7,9}, right = {2,2,1,1,5,7,7,7,4,8};
        System.out.println("Task 7: ");
        System.out.println("Input: left = " + Arrays.toString(left) + " right = " + Arrays.toString(right));
        System.out.println("Output: " + Arrays.toString(findCommonElements(left, right)));

        //Task 8
        System.out.println("Task 8: ");
        System.out.println("Input: " + Arrays.toString(left));
        System.out.println("Output: " + Arrays.toString(deleteDublicates(left)));

        //Task 9
        System.out.println("Task 9: ");
        System.out.println("Input: " + "arr1 = " + Arrays.toString(arr1) + " arr2 = " + Arrays.toString(arr2));
        System.out.println("Output: " + Arrays.toString(sumTwoArrays(arr1,arr2)));

        //Task 10
        System.out.println("Task 10: ");
        System.out.println("Input: " + Arrays.toString(left));
        int[][] newArray = findPairsOfNumbers(left,3);
        System.out.print("Output: ");
        for(int i = 0; i < newArray[0].length; i++)
            System.out.print("[" + newArray[0][i] + ", " + newArray[1][i] + "] ");
        System.out.println();

        //Task 11
        System.out.println("Task 11: ");
        System.out.println("Input: " + "arr1 = " + Arrays.toString(arr1) + " arr2 = " + Arrays.toString(arr2));
        System.out.println("Output: " + compareTwoArrays(arr1,arr2));

        //Task 12
        int[] arrWithZeros = {0,2,3,1,0,0,0,17,43,3,0,2,4,0};
        System.out.println("Task 12: ");
        System.out.println("Input: " + Arrays.toString(arrWithZeros));
        System.out.println("Output: " + Arrays.toString(transferZeros(arrWithZeros)));

        //Task 13
        System.out.println("Task 13: ");
        System.out.println("Input: " + Arrays.toString(arr1));
        int[] result = new int[2];
        result = findEvenOddNumbers(arr1);
        System.out.println("Output: Even = " + result[0] + ", Odd = " + result[1]);

        //Task 14
        System.out.println("Task 14: ");
        System.out.println("Input: " + Arrays.toString(right));
        System.out.println("Output: " + findMaxLengthOfSequence(right));

        //Task 15
        int[][] arr2dimension = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Task 15: ");
        System.out.println("Input:");

        for(int i = 0; i < arr2dimension.length; i++){

            for(int j = 0; j < arr2dimension[0].length; j++){

                System.out.print(arr2dimension[i][j] + "  ");

            }

            System.out.println();

        }
        System.out.println("Output:");
        outputDiagonalOfMatrix(arr2dimension);

        //Task 16
        System.out.println("Task 16: ");
        System.out.println("Input: " + Arrays.toString(arr1));
        System.out.println("Output: " + Arrays.toString(rotateArray(arr1,2)));

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

        //ProHomework
        System.out.println("\n*******ProHomework*******");
        isPalindrome(arr);
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

    //Task 2
    public static int[] deleteElementOfArray(int[] arr, int ind){

        int[] arrayWithoutElement = new int[arr.length - 1];

        for(int i = 0; i < arrayWithoutElement.length; i++){

            if (ind == i) continue;
            arrayWithoutElement[i] = arr[i];

        }

        return arrayWithoutElement;

    }
    //Task 3
    public static int[][] copyElementArrays(int[] arr1, int[] arr2){

        for(int i = 0; i < arr1.length; i++){

            arr2[i] = arr1[i];

        }

        int[][] copiedArrays = new int[2][];
        copiedArrays[0] = arr1;
        copiedArrays[1] = arr2;

        return copiedArrays;

    }

    //Task 4
    public static int[] insertElementOfArray(int[] arr, int el){

        int[] newArray = new int[arr.length + 1];
        int i;
        for(i = 0; i < newArray.length - 1; i++){

            newArray[i] = arr[i];

        }
        newArray[i] = el;

        return newArray;

    }

    //Task 5 have already done in Homework - Task 6

    //Task 6
    public static int[] findRepeatedElemets(int[] arr){

        int i, j, k = -1, counter = 0 ,tmp;
        int[] newArray;


        for(i = 0; i < arr.length - 1; i++) {

            for (j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    for (k = j + 1; k < arr.length; k++) {
                        if (arr[j] == arr[k]) break;
                    }
                    if (k != arr.length) break;
                    counter++;
                }

            }

        }

        newArray = new int[counter];
        counter = 0;

        for(i = 0; i < arr.length - 1; i++) {

            for (j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    for (k = j + 1; k < arr.length; k++) {
                        if (arr[j] == arr[k]) break;
                    }
                    if (k != arr.length) break;
                    newArray[counter++] = arr[i];
                }

            }

        }

        return newArray;

    }

    //Task 7
    public static int[] findCommonElements(int[] left, int[] right) {

        int i, j, k, z, counter = 0;
        int[] newArray;

        for(i = 0; i < left.length; i++){
            for(j = 0; j < right.length; j++){

                if (left[i] == right[j]) {

                    for (k = j + 1; k < right.length; k++) {
                        if (right[j] == right[k]) break;
                    }
                    if (k != right.length) continue;

                    for (z = i + 1; z < left.length; z++) {
                        if (left[i] == left[z]) break;
                    }
                    if (z != left.length) break;

                    counter++;


                }

            }

        }


        newArray = new int[counter];
        counter = 0;

        for(i = 0; i < left.length; i++){
            for(j = 0; j < right.length; j++){

                if (left[i] == right[j]) {

                    for (k = j + 1; k < right.length; k++) {
                        if (right[j] == right[k]) break;
                    }
                    if (k != right.length) continue;

                    for (z = i + 1; z < left.length; z++) {
                        if (left[i] == left[z]) break;
                    }
                    if (z != left.length) break;

                    newArray[counter++] = left[i];

                }

            }

        }

        return newArray;

    }

    //Task 8
    public static int[] deleteDublicates(int[] arr) {

        int i, j, counter = 0;
        int[] newArray;

        for (i = 0; i < arr.length; i++){
            for(j = i + 1; j < arr.length; j++){

                if (arr[i] == arr[j]) break;

            }
            if (j == arr.length) {
                counter++;}
        }

        newArray = new int[counter];
        counter = 0;

        for (i = 0; i < arr.length; i++){
            for(j = i + 1; j < arr.length; j++){

                if (arr[i] == arr[j]) break;

            }
            if (j == arr.length) newArray[counter++] = arr[i];
        }

        return newArray;

    }

    //Task 9
    public static int[] sumTwoArrays(int[] arr1, int[] arr2) {

        int length = (arr1.length < arr2.length) ? arr1.length : arr2.length;
        int[] newArray = new int[length];

        for(int i = 0; i < length; i++){

            newArray[i] = arr1[i] + arr2[i];

        }

        return newArray;

    }

    //Task 10
    public static int[][] findPairsOfNumbers(int[] arr, int number) {

        int i, j, counter = 0;
        int[][] newArray = new int[2][];
        arr = deleteDublicates(arr);
        for( i = 0; i < arr.length; i++){
            for( j = i + 1; j < arr.length; j++){

                if (arr[i] + arr[j] == number) counter++;

            }
        }


        newArray[0] = new int[counter];
        newArray[1] = new int[counter];

        counter = 0;
        for( i = 0; i < arr.length; i++){
            for( j = i + 1; j < arr.length; j++){

                if (arr[i] + arr[j] == number) {

                    newArray[0][counter] = arr[i];
                    newArray[1][counter] = arr[j];
                    counter++;

                }

            }
        }

        return newArray;

    }

    //Task 11
    public static boolean compareTwoArrays(int[] arr1, int[] arr2) {

        int i;

        if (arr1.length != arr2.length) return false;

        for(i = 0; i < arr1.length; i++){

            if (arr1[i] != arr2[i]) break;

        }

        if (i == arr1.length) return true;
        else
            return false;

    }

    //Task 12
    public static int[] transferZeros(int[] arr){

        int i, j = 0, counter = 0;
        int[] newArray = new int[arr.length];

        for(i = 0; i < arr.length; i++){

            if (arr[i] != 0) counter++;

        }

        for(i = 0; i < arr.length; i++){

            if ((arr[i] != 0) && (j <= counter)) newArray[j++] = arr[i];
            else
                arr[i] = 0;

        }

        return newArray;

    }

    //Task 13
    public static int[] findEvenOddNumbers(int[] arr){

        int i, odd = 0, even = 0;
        int[] newArray = new int[2];

        for(i = 0; i < arr.length; i++){

            if (arr[i] % 2 == 0) even++;
            else
                odd++;

        }

        newArray[0] = even;
        newArray[1] = odd;

        return newArray;
    }

    //Task 14
    public static int findMaxLengthOfSequence(int[] arr){

        int i, j, counter, max;
        int[][] newArray = new int[2][deleteDublicates(arr).length];
        newArray[0] = deleteDublicates(arr);

        for(i = 0; i < newArray[0].length; i++){
            counter = 0;

            for(j = 0; j < arr.length; j++){

                if (newArray[0][i] == arr[j]) counter++;

            }

            newArray[1][i] = counter;

        }

        return maxElemOfArr(newArray[1]);
    }

    //Task 15
    public static void outputDiagonalOfMatrix(int[][] arr){

        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < arr[0].length; j++){

                if (i == j) System.out.print(arr[i][j] + "  ");
                else
                    System.out.print("   ");

            }

            System.out.println();

        }

    }

    //Task 16
    public static int[] rotateArray(int[] arr, int a){

        int[] newArray = new int[arr.length];

        for(int i = 0; i < arr.length; i++){

            newArray[i] = arr[(i + a < arr.length)? i + a : i + a - arr.length];

        }

        return newArray;

    }

    //Task 17
    public static int countOfReverses(int[] arr1, int[] arr2){

        int i, k, tmp1, tmp2;

        for(k = 0; k < arr1.length; k++) {

            for (i = 0; i < arr1.length; i++) {

                if (arr1[i] != arr2[i]) break;

            }

            if (i == arr1.length) break;

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
