public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            
            
            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

/* BubbleSort Class:

This class contains two methods: sortArray and main.
sortArray Method:

The sortArray method takes an integer array array as input and sorts it in ascending order using the Bubble Sort algorithm.
It uses two nested for loops. The outer loop iterates from i = 0 to i = array.length - 2. This loop is responsible for controlling the number of passes required to sort the array.

The inner loop iterates from j = 0 to j = array.length - i - 2. The -i part is because after each pass, the largest element is bubbled up to the end of the array, so there is no need to compare and swap it again.
Inside the inner loop, it compares array[j] and array[j+1]. If array[j] is greater than array[j+1], it swaps them to ensure that the larger element "bubbles up" to the correct position.
This process continues for each pass until the entire array is sorted.
main Method:

The main method is the entry point of the program.
It initializes an integer array array with unsorted values from 8 down to 0.
It then calls the sortArray method to sort the array in ascending order.
After sorting, it iterates through the sorted array and prints each element on the same line with a space between them.
Overall Functionality:

The program demonstrates the Bubble Sort algorithm by sorting an array of integers in ascending order.
After sorting, it prints the sorted array.*/
