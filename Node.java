
public class Node {
    public Object data;
    public Node next;
    public Node prev;


    public Node(Object data) {
        this.next = null;
        this.data = data;
        this.prev = null;

    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public Node getNeNo(){
        return this.next;
    }



}
