import java.util.Scanner;

class StudentNode {
    String name;
    int roll;
    StudentNode next;

    StudentNode(String name, int roll) {
        this.name = name;
        this.roll = roll;
        this.next = null;
    }
}

public class ten {
    StudentNode head = null;

    void insertLast(String name, int roll) {
        StudentNode newNode = new StudentNode(name, roll);
        if (head == null) {
            head = newNode;
        } else {
            StudentNode temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
    }

    void display() {
        StudentNode temp = head;
        System.out.println("Linked List:");
        while (temp != null) {
            System.out.println("Name: " + temp.name + ", Roll: " + temp.roll);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        ten list = new ten();
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();
            list.insertLast(name, roll);
            System.out.print("Add more? (y/n): ");
            ch = sc.next().charAt(0);
        } while (ch == 'y');
        list.display();
    }
}
