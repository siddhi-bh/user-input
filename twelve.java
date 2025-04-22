import java.util.Scanner;

class CollegeNode {
    String collegeName;
    CollegeNode next;

    CollegeNode(String name) {
        this.collegeName = name;
        this.next = null;
    }
}

public class twelve {
    CollegeNode head = null, tail = null;

    // Insert at the last position (circular linked list)
    void insert(String name) {
        CollegeNode newNode = new CollegeNode(name);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;  // Create circular link
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;  // Maintain circular link
        }
    }

    // Display the circular linked list
    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        CollegeNode temp = head;
        do {
            System.out.println("College: " + temp.collegeName);
            temp = temp.next;
        } while (temp != head);  // Loop until we return to the head
    }

    public static void main(String[] args) {
        twelve list = new twelve();
        Scanner sc = new Scanner(System.in);
        char ch;
        
        // Accept user input for insertion
        do {
            System.out.print("Enter college name: ");
            String name = sc.next();
            list.insert(name);

            System.out.print("Add more? (y/n): ");
            ch = sc.next().charAt(0);
        } while (ch == 'y');

        // Display the circular linked list
        System.out.println("Circular Linked List:");
        list.display();
    }
}
