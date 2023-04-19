/*
Write a program to implement linked list using collection class
 */
// public class Practical33{
    
// }
import java.util.LinkedList;

public class Practical33 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Krish");
        list.add("Shreya");
        System.out.println("Linked List: " + list);
        list.addFirst("Herin");
        System.out.println("Linked List after adding an element to the beginning: " + list);
        list.addLast("Diya");
        System.out.println("Linked List after adding an element to the end: " + list);
        list.remove("Herin");
        System.out.println("Linked List after removing an element: " + list);
        int size = list.size();
        System.out.println("Size of the linked list: " + size);
        String element = list.get(2);
        System.out.println("Element at index 2: " + element);
    }
}
/*
OUTPUT:
Linked List: [Krish, Shreya]
Linked List after adding an element to the beginning: [Herin, Krish, Shreya]
Linked List after adding an element to the end: [Herin, Krish, Shreya, Diya]
Linked List after removing an element: [Krish, Shreya, Diya]
Size of the linked list: 3
Element at index 2: Diya
 */