import java.util.Scanner;

public class Principal {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char opcion;

        do {
            Menu.imprimirMenu();
            opcion = sc.nextLine().charAt(0);
            Menu.ejecutarOpcion(opcion);
        } while (opcion != 'x' && opcion != 'X');
        sc.close();
    }
}
