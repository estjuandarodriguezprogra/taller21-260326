import java.util.Scanner;

class Nodo {
    int dato;
    Nodo siguiente;
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
class ListaEnlazada {
    Nodo cabeza;

    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
    }
   public boolean buscar(int valor) {
    Nodo temp = cabeza;

    while (temp != null) {
        if (temp.dato == valor) {
            return true;
        }
        temp = temp.siguiente;
    }

    return false;
}
public class Taller21260326 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc. nextInt();
        ListaEnlazada lista = new ListaEnlazada();
        for (int i = 0; i < n - 1; i++) {
            lista.insertar(sc.nextInt());
        }
}

        
        
    }
}

