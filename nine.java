import java.util.Scanner;
public class nine {
    int front = -1, rear = -1;
    int size = 5;
    int[] queue = new int[size];

    void enqueue(int val) {
        if ((rear + 1) % size == front)
            System.out.println("Queue Overflow");
        else {
            if (front == -1) front = 0;
            rear = (rear + 1) % size;
            queue[rear] = val;
        }
    }

    void dequeue() {
        if (front == -1)
            System.out.println("Queue Underflow");
        else {
            System.out.println("Deleted: " + queue[front]);
            if (front == rear)
                front = rear = -1;
            else
                front = (front + 1) % size;
        }
    }

    void display() {
        if (front == -1)
            System.out.println("Queue is Empty");
        else {
            System.out.print("Queue Elements: ");
            int i = front;
            while (true) {
                System.out.print(queue[i] + " ");
                if (i == rear) break;
                i = (i + 1) % size;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        nine q = new nine();
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
