import java.util.Scanner;
public class five {
    int top = -1;
    int[] stack = new int[5];

    void push(int val) {
        if (top == 4)
            System.out.println("Stack Overflow");
        else
            stack[++top] = val;
    }

    void pop() {
        if (top == -1)
            System.out.println("Stack Underflow");
        else
            System.out.println("Popped: " + stack[top--]);
    }

    void display() {
        if (top == -1)
            System.out.println("Stack is Empty");
        else {
            System.out.println("Stack Elements:");
            for (int i = top; i >= 0; i--)
                System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        five s = new five();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Push 2.Pop 3.Display 4.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    s.push(sc.nextInt());
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
            }
        } while (choice != 4);
    }
}
