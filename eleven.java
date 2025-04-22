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

public class eleven {
    StudentNode head = null;

    void insert(String name, int roll) {
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

    void deleteLast() {
        if (head == null)
            System.out.println("List is empty");
        else if (head.next == null)
            head = null;
        else {
            StudentNode temp = head;
            while (temp.next != null && temp.next.next != null)
                temp = temp.next;
            temp.next = null;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        StudentNode temp = head;
        while (temp != null) {
            System.out.println("Name: " + temp.name + ", Roll: " + temp.roll);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        eleven list = new eleven();
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();
            list.insert(name, roll);

            System.out.print("Add more? (y/n): ");
            ch = sc.next().charAt(0);
        } while (ch == 'y');

        System.out.println("Before Deletion:");
        list.display();

        list.deleteLast();

        System.out.println("After Deletion:");
        list.display();
    }
}
