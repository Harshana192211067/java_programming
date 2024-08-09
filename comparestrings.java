import java.util.Arrays;
import java.util.Scanner;

public class comparestrings {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  // Create a Scanner object to read user input

        // Read the length of the array
        System.out.print("Enter the number of elements: ");
        int len = input.nextInt();
        input.nextLine();  // Consume the leftover newline

        String arr[] = new String[len];

        // Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < len; i++) {
            arr[i] = input.nextLine();
        }

        // Read the sort order ('A' for ascending, 'D' for descending)
        System.out.print("Enter 'A' for ascending or 'D' for descending order: ");
        char order = input.next().toUpperCase().charAt(0);

        if (order == 'A') {  // If the user input is 'A', sort in ascending order
            for (int i = 0; i < len; i++) {  // Outer loop for each element
                for (int j = i + 1; j < len; j++) {  // Inner loop for comparison with the next elements
                    if (arr[i].compareTo(arr[j]) > 0) {  // Compare strings lexicographically
                        // Swap if arr[i] is greater than arr[j]
                        String temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println("Sorted array in ascending order: " + Arrays.toString(arr));  // Print the sorted array

        } else if (order == 'D') {  // If the user input is 'D', sort in descending order
            for (int i = 0; i < len; i++) {  // Outer loop for each element
                for (int j = i + 1; j < len; j++) {  // Inner loop for comparison with the next elements
                    if (arr[i].compareTo(arr[j]) < 0) {  // Compare strings lexicographically
                        // Swap if arr[i] is less than arr[j]
                        String temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println("Sorted array in descending order: " + Arrays.toString(arr));  // Print the sorted array
        } else {
            System.out.println("Invalid order! Please enter 'A' for ascending or 'D' for descending.");
        }
    }
}
