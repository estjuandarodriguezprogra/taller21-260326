
import java.util.Scanner;
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

