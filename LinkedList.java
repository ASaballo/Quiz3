import javax.swing.*;
import java.awt.*;

public class LinkedList {
    private Node head;
    private int size;
    private Node back;

    public LinkedList() {
        this.head = null;
        this.size = 0;
        this.back = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int size() {
        return this.size;
    }

    public void insertFirst(Object data) {
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
        this.size++;
    }

    public Node deleteFirst() {
        if (this.head != null) {
            Node temp = this.head;
            this.head = this.head.next;
            this.size--;
            return temp;
        } else {
            return null;
        }
    }


    public static void main(String[] args) {
        // Create an empty linked list
        LinkedList linked_list = new LinkedList();
        // Insert some elements in the list
        linked_list.insertFirst(5);
        linked_list.insertFirst(8);
        linked_list.insertFirst(3);
        linked_list.insertFirst(12);
        linked_list.insertFirst(0);
        linked_list.insertFirst(89);
        linked_list.insertFirst(77);

        // Get and print the size of the list.
        // It should match the number of elements we inserted
        int size = linked_list.size();
        System.out.println(size);
        System.out.println();

        Queue queue = new Queue();
    }

    public Node getHead() {
        return this.head;
    }
}
//***********************************************************************************
//Resultados del programa
//Se espera que el programa realice el encolado de los datos escritos en el enunciado
//sin embargo, el programa no funciona debido a errores en el codigo, los resultados
//no son los esperados