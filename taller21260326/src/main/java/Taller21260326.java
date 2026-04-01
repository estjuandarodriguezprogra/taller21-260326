
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
    java.util.Scanner sc = new java.util.Scanner(System.in);

    System.out.println("BUSCAR NUMERO FALTANTE");

    System.out.print("Ingrese el valor de n: ");
    int n = sc.nextInt();

    ListaEnlazada lista = new ListaEnlazada();

    System.out.println("Ingrese " + (n - 1) + " numeros entre 1 y " + n + ":");

    for (int i = 0; i < n - 1; i++) {
        System.out.print("Numero " + (i + 1) + ": ");
        lista.insertar(sc.nextInt());
    }

    int faltante = 0;

    for (int i = 1; i <= n; i++) {
        if (!lista.buscar(i)) {
            faltante = i;
            break;
        }
    }

    System.out.println("\nEl numero faltante es: " + faltante);
}
}
}
