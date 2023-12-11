public class Nodo<T>{
    private T dato;
    private Nodo<T> apuntador;

    public Nodo(T valor){
        //Constructor
        this.dato = valor;
        this.apuntador = null;
    }

    public T getDato() {
        // Regresa el dato contenido en el nodo
        return dato;
    }

    public void setDato(T dato) {
        //Modificar el dato contenido en el nodo
        this.dato = dato;
    }

    public Nodo<T> getApuntador() {
        // Regresar a que nodo esta apuntando
        return apuntador;
    }

    public void setApuntador(Nodo<T> otroNodo) {
        // Modificar a donde apunta este nodo
        this.apuntador = otroNodo;
    }
    
}
