import java.util.Scanner;

public class eight {
    int front = -1, rear = -1;
    int[] queue = new int[5];

    void enqueue(int val) {
        if (rear == 4)
            System.out.println("Queue Overflow");
        else {
            if (front == -1) front = 0;
            queue[++rear] = val;
        }
    }

    void dequeue() {
        if (front == -1 || front > rear)
            System.out.println("Queue Underflow");
        else
            System.out.println("Deleted: " + queue[front++]);
    }

    void display() {
        if (front == -1 || front > rear)
            System.out.println("Queue is Empty");
        else {
            System.out.print("Queue Elements: ");
            for (int i = front; i <= rear; i++)
                System.out.print(queue[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        eight q = new eight();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Enqueue 2.Dequeue 3.Display 4.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    q.enqueue(sc.nextInt());
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
            }
        } while (choice != 4);
    }
}
