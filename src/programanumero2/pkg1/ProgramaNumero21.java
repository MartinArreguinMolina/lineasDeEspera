package programanumero2.pkg1;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class ProgramaNumero21 {

    static  ProgramaNumero21 A = new ProgramaNumero21();
    private ArrayList<String> nombres = new ArrayList<>();
    private Stack<Metodos> pila = new Stack<>();
    
    public static void main(String[] args) {
        
        A.agregarNombres();
        
        for(int i = 0; i < 4; i++){
            A.crearObjeto(A.llenaCola());
        }
        
        for(int i = 0; i < 4; i++){
            System.out.println("Caja " + (i+1));
            System.out.println(A.pila.get(i).toString());
        }
        

    }

    void agregarNombres() {
        nombres.add("Oscar");
        nombres.add("Carlos");
        nombres.add("Manuel");
        nombres.add("Diana");
        nombres.add("Arely");
        nombres.add("Ana");
        nombres.add("Angel");
        nombres.add("Noe");
        nombres.add("Ulises");
        nombres.add("Andrea");
        nombres.add("Jairo");
        nombres.add("Salome");
        nombres.add("Martin");
        nombres.add("Sofia");
        nombres.add("Ruby");
        nombres.add("Juana");
        nombres.add("Agustin");
        nombres.add("Gaytan");
        nombres.add("Pablo");
        nombres.add("James");
        nombres.add("Jimena");
        nombres.add("Jesus");
        nombres.add("Maria");
        nombres.add("Messi");
        nombres.add("Cristiano");
        nombres.add("Santiago");
        nombres.add("Jaime");
        nombres.add("Issac");
        nombres.add("Valentin");
        nombres.add("Karen");
    }

    int numeroRamdom() {
        return (int) (Math.random() * (30 - 1) + 1);
    }

    Queue llenaCola() {
        Queue<String> cola = new LinkedList<>();
        
        int x = A.numeroRamdom();
                
        for (int i = 0; i < x; i++) {
            cola.offer(A.nombre());
        }
        return cola;
    }

    String nombre() {
        int ramdom = (int) (Math.random() * (30 - 1) + 1);
        return nombres.get(ramdom);
    }
    
    void crearObjeto(Queue<String> cola){
        pila.push(new Metodos(cola));
    }

}
