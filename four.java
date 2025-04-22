import java.util.Scanner;
public class four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, count = 0;
        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] mat = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (i = 0; i < rows; i++)
            for (j = 0; j < cols; j++)
                mat[i][j] = sc.nextInt();

        for (i = 0; i < rows; i++)
            for (j = 0; j < cols; j++)
                if (mat[i][j] == 0)
                    count++;

        if (count > (rows * cols) / 2)
            System.out.println("Sparse Matrix");
        else
            System.out.println("Not a Sparse Matrix");
    }
}
