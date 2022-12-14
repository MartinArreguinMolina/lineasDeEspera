package programanumero2.pkg1;

import java.util.Queue;
import java.util.LinkedList;

public class Metodos {

    Queue<String> cola = new LinkedList<>();

    public Metodos(Queue<String> cola) {
        this.cola = cola;
    }

    public Queue getCola() {
        return cola;
    }
    

    public void setCola(Queue<String> cola) {
        this.cola = cola;
    }

    public String primero() {
        return cola.peek();
    }

    public String ultimo() {
        String[] ultimo = new String[cola.size()];

        ultimo = cola.toArray(ultimo);

        return ultimo[cola.size() - 1];
    }

    public String toString() {
        System.out.println("------------------------");
        int i = 1;
        for(String cliente : cola){
            System.out.println(i++ + " : " + cliente);
        }
        System.out.println("");
        System.out.println("------------------------");
        System.out.println("Primero : " + primero());
        System.out.println("------------------------");
        System.out.println("Ultimo : " + ultimo());
        System.out.println("------------------------");
        

        return "";
    }

}
