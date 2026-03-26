import java.until.Scanner;

class Nodo {
    int dato;
    Nodo siguiente;
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
}
public class Taller21260326 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc. nextInt();
        
         Nodo cabeza = null;
         Nodo actual = null;
         
          for (int i = 0; i < n - 1; i++) {
            int valor = sc.nextInt();
            Nodo nuevo = new Nodo(valor); 
            cabeza = nuevo;
        
        
    }
}
