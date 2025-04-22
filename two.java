import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take size of array
        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();

        // Step 2: Create array and take input
        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Find second largest
        int first = Integer.MIN_VALUE;

        int second = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        // Step 4: Output
        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest number (all elements may be same).");
        } else {

            System.out.println("Second largest number: " + second);
        }
    }
}
