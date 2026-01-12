package com.csplusplus;

public class Unit6 {

    // 1. Implement a method that takes an array of integers and returns the sum of all elements.
    // Instructions: Use a for-each loop to iterate through the array and calculate the sum.
    public static int sumArray(int[] array) {
        // TODO: Implement this method
        int sum = 0;
        for (int num : array ){
            sum += num;
     
        }
        return sum;  // Return the calculated sum.
    }

    // 2. Implement a method that finds the maximum element in an array of integers.
    // Instructions: Iterate through the array and track the largest number found.
    public static int maxElement(int[] array) {
        // TODO: Implement this method
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if(num > max ) {
                max = num; 
            }
        }
        return max;  // Placeholder return value, replace with the correct maximum element.
    }

    // 3. Implement a method that takes an array and returns a new array with the elements in reverse order.
    // Instructions: Create a new array of the same size, and fill it with elements from the original array in reverse order.
    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length;i++){
            reversed[i] = array [array.length - 1 - i];
        }
        // TODO: Implement this method
        return reversed;  // Placeholder return value, replace with the reversed array.
    }

    // 4. Implement a method that checks whether the given array is sorted in ascending order.
    // Instructions: Iterate through the array and check if each element is greater than or equal to the previous element.
    public static boolean isSorted(int[] array) {
        for (int i = 0 ; i < array.length -1 ; i++){
            if (array[i] > array[i + 1]){
                return false;
            }
        }
        return true;
    }
    // Instructions: Use a for-each loop to iterate through the array and count the occurrences of the given number.
    public static int countOccurrences(int[] array, int number) {
        int count = 0;
        for (int num : array){
            if (num == number){
                count++;
            }
        }
        // TODO: Implement this method
        return count;  // Placeholder return value, replace with the correct count.
    }
}
