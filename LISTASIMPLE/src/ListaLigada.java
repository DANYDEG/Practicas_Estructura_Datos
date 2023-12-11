public class ListaLigada<T> {
    private Nodo<T> head;
    private Nodo<T> tail;
    private int length;

    public ListaLigada() {
        // Constructor
        head = null;
        tail = null;
        length = 0;
    }

    public boolean isEmpty() {
        // Regresa true si la lista esta vacia
        return this.length == 0;
    }

    public int getLength() {
        return this.length;
    }

    public void add(T valor) {
        Nodo<T> nodo = new Nodo<T>(valor);
        if (isEmpty()) {
            // La lista esta vacia
            // nodo es el primer nodo de la lista
            head = nodo;
            tail = nodo;
            this.length++;
        } else {
            // Ya hay nodo en la lista
            // Y se agrega el nuevo nodo al final
            Nodo<T> actual = tail;
            tail = nodo;
            actual.setApuntador(nodo);
            this.length++;
        }
    }

    public void insertarEnPosicion(T valor, int posicion) {
        if (posicion < 0 || posicion > length) {
            System.out.println("Posición fuera de rango");
            return;
        }

        Nodo<T> nuevoNodo = new Nodo<T>(valor);

        if (posicion == 0) {
            nuevoNodo.setApuntador(head);
            head = nuevoNodo;
            if (isEmpty()) {
                tail = nuevoNodo;
            }
        } else {
            Nodo<T> actual = head;
            for (int i = 0; i < posicion - 1; i++) {
                actual = actual.getApuntador();
            }

            nuevoNodo.setApuntador(actual.getApuntador());
            actual.setApuntador(nuevoNodo);

            if (posicion == length) {
                tail = nuevoNodo;
            }
        }

        length++;
    }

    public void printList() {
        Nodo<T> actual = head;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getApuntador();
        }
    }


    public void eliminarEnPosicion(int posicion) {
        if (posicion < 0 || posicion >= length) {
            System.out.println("Posición fuera de rango");
            return;
        }

        if (posicion == 0) {
            head = head.getApuntador();
            if (isEmpty()) {
                tail = null;
            }
        } else {
            Nodo<T> actual = head;
            for (int i = 0; i < posicion - 1; i++) {
                actual = actual.getApuntador();
            }

            actual.setApuntador(actual.getApuntador().getApuntador());

            if (posicion == length - 1) {
                tail = actual;
            }
        }

        length--;
    }

    public int contarNodos() {
        return length;
    }
}
