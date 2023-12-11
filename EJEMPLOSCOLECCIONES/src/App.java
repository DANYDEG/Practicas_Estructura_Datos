import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Implementar una pila utilizando ArrayList
        ArrayList<String> pila = new ArrayList<String>();

        // Push (añadir elementos a la pila)
        pila.add("dano");
        pila.add("luis");
        pila.add("liz");

        // Mostrar la pila
        System.out.println("Pila: " + pila);

        // Pop (eliminar el elemento superior de la pila)
        String elementoEliminado = pila.remove(pila.size() - 1);
        System.out.println("Elemento eliminado de la pila: " + elementoEliminado);

        // Mostrar la pila después de hacer pop
        System.out.println("Pila después de pop: " + pila);
        System.out.println();




        // Implementar una cola utilizando ArrayList
        ArrayList<String> cola = new ArrayList<String>();

        // Enqueue (añadir elementos a la cola)
        cola.add("shaggy");
        cola.add("Transito");
        cola.add("pou");

        // Mostrar la cola
        System.out.println("Cola: " + cola);

        // Dequeue (eliminar el elemento frontal de la cola)
        String elementoFrente = cola.remove(0);
        System.out.println("Elemento en el frente de la cola: " + elementoFrente);

        // Mostrar la cola después de hacer dequeue
        System.out.println("Cola después de dequeue: " + cola);


        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println();

        //Ejemplo de ArrayList
        ArrayList<String> arreglo1 = new ArrayList<String>();
        // String[] arreglo1 = new String[10];

        arreglo1.add("nigga"); //arreglo1[0] = "nigga"
        arreglo1.add("pou");
        arreglo1.add("diego gei");
        arreglo1.add("shaggy");
        arreglo1.add("Transito");
        arreglo1.add("pou");
        arreglo1.add("Teofilo");

        System.out.println(arreglo1);
        // index -> regresa el indice en el que esta un valor 
        System.out.println("¿En que casilla esta diego gei?: "+ arreglo1.indexOf("diego gei"));
        // get -> regresa el dato que se encuentra  en un indice especifico
        System.out.println("¿Que elemento esta en la casilla 2?: "+arreglo1.get(2));
        // ultima ocurrencia de pou
        System.out.println("Ultima aparicion donde esta pou: "+arreglo1.lastIndexOf("pou"));
        //remove por valor
        arreglo1.remove("pou");
        System.out.println("Arreglo: "+arreglo1);
        // remove por indice
        arreglo1.remove(0);
        System.out.println("Arreglo: "+arreglo1);


        //Editar a un elemento del arreglo
        System.out.println("Tamño del arreglo: "+arreglo1.size());
        arreglo1.set(0,"Rogaciano");

        System.out.println(arreglo1);
        System.out.println("Tamño del arreglo: "+arreglo1.size());
    }
}
