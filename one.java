import java.util.Scanner;

public class one{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int size=sc.nextInt();

        int[] numbers= new int[size];

        System.out.println("Enter "+size+ "numbers: ");
        for(int i=0; i<size; i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("Length of the array is: "+numbers.length);
    }
}