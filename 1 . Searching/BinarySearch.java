import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Element found, return its index
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Element not found, return -1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the sorted array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];

        System.out.println("Enter the sorted elements of the array:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int target = sc.nextInt();

        // Binary search requires a sorted array, so we'll sort it first.
        Arrays.sort(arr);

        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}
/*  Import Statements:

The code begins with import statements for java.util.Arrays and java.util.Scanner, which are necessary for sorting an array and taking input from the user, respectively.
binarySearch Method:

This method performs the binary search algorithm. It takes two parameters: an integer array arr (sorted in ascending order) and an integer target that you want to find in the array.
It initializes two pointers, left and right, to the start and end of the array, respectively.
Inside a while loop, it calculates the middle index, mid, of the current range.

It then compares the element at index mid with the target:
If they are equal, it returns mid as the index where the target was found.
If the element at mid is less than the target, it narrows the search to the right half of the array by updating left to mid + 1.
If the element at mid is greater than the target, it narrows the search to the left half of the array by updating right to mid - 1.

The loop continues until left is less than or equal to right. If the target is not found during this process, the method returns -1.
main Method:

The main method is the entry point of the program.
It creates a Scanner object, sc, to read user input from the console.

It prompts the user to enter the length of a sorted array and reads this value into the len variable.
It creates an integer array, arr, with a length of len.
It prompts the user to enter the sorted elements of the array one by one and populates the arr array.

It asks the user to input the element they want to search for and stores it in the target variable.
Before performing the binary search, the code sorts the arr array using Arrays.sort(arr).

It then calls the binarySearch method to find the target in the sorted array.
Depending on the result of the search, it either prints the index where the element was found or informs the user that the element was not found.
Finally, the program closes the Scanner object to release resources. */
