import javax.swing.*;

public class Queue {

    private LinkedList lista;

    public static void main (String[] args) {
        public Queue(){
            lista = new LinkedList();
        }
        public peek(){
            return lista.get(0);
        }

        public dequeue(){
            data = peek();
            lista.remove(0);
            return data;
        }

    }


}
