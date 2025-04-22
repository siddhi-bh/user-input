import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size and elements for first array
        System.out.print("Enter number of elements in first array: ");
        int size1 = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        String[] arr1 = new String[size1];
        System.out.println("Enter " + size1 + " strings for first array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextLine();
        }

        // Input size and elements for second array
        System.out.print("Enter number of elements in second array: ");
        int size2 = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        String[] arr2 = new String[size2];
        System.out.println("Enter " + size2 + " strings for second array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextLine();
        }

        // Finding common strings
        System.out.println("Common strings:");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (arr1[i].equals(arr2[j])) {
                    System.out.println(arr1[i]);
                    break; // To avoid duplicates if arr2 has repeating items
                }
            }
        }
    }
}
