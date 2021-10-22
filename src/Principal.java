import java.util.Scanner;

public class Principal {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char opcion;

        do {
            Menu.imprimirMenu();
            opcion = sc.next().charAt(0);
            Menu.ejecutarOpcion(opcion);
        } while (opcion != 'x' && opcion != 'X');
    }
}
