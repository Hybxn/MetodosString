import java.util.Scanner;

public class Menu {

    private Menu() {
    }

    public static void imprimirMenu() {
        System.out.println("____________________________________________________________________________________________" +
                "\nBienvenido al menu principal donde descubrirar diferente funciones de la clase String de Java" +
                "\n| A- Metodo charAt()" +
                "\n| B- Metodo compareTo()" +
                "\n| C- Metodo equals()" +
                "\n| D- Metodo indexOf()" +
                "\n| E- Metodo isEmpty()" +
                "\n| F- Metodo length()" +
                "\n| G- Metodo substring()" +
                "\n| H- Metodo toUpperCase()" +
                "\n| I- Metodo toLowerCase()" +
                "\n| J- Metodo estatico valueOf()" +
                "\n| X- Cerrar la aplicacion." +
                "Introduzca el caracter correspondiente a la parte que desee acceder :)");
    }

    public static void ejecutarOpcion(char c) {
        switch (c) {
            case 'A':
                System.out.println("METODO SELECCIONADO: charAt()");
                opcionA();
                opcionA(Principal.sc);
            case 'B':
                System.out.println("METODO SELECCIONADO: compareTo()");
                opcionB();
                opcionB(Principal.sc);
            case 'C':
                System.out.println("METODO SELECCIONADO: equals()");
                opcionC();
                opcionC(Principal.sc);
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'X':
                System.out.println("Espero que haya disfrutado de nuestra aplicacion, hasta la proxima!");
            default:
                System.out.println("Opcion desconocida, por favor, intentelo de nuevo");
        }
    }

    private static void opcionA() {
        System.out.println("Empecemos con un ejemplo:" +
                "\nusaremos la palabra Ukelele como String y 2 como indice");
        Utilidad.letraEn("Ukelele", 2);
    }

    private static void opcionA(Scanner scanner) {
        System.out.println("Ahora es tu turno:" +
                "\nIntroduce un String y un numero, en este mismo orden");
        String s = scanner.nextLine();
        int i = scanner.nextInt();
        Utilidad.letraEn(s, i);
    }

    private static void opcionB() {
        System.out.println("Empecemos con un ejemplo:" +
                "\nusaremos dos Strings: Mazorca y Abanico");
        Utilidad.compararCadenas("Mazorca", "Abanico");
    }

    private static void opcionB(Scanner scanner) {
        System.out.println("Ahora es tu turno:" +
                "\nIntroduce dos Strings en LINEAS SEPARADAS");
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        Utilidad.compararCadenas(s1, s2);
    }

    private static void opcionC() {
        System.out.println("Empecemos con un ejemplo:" +
                "\nusaremos dos Strings: Mazorca y Abanico");
        Utilidad.sonEquivalentes("Mazorca", "Abanico");
        System.out.println("Ahora introduciremos dos Strings iguales: Mazorca y Mazorca");
        Utilidad.sonEquivalentes("Mazorca", "Mazorca");
    }

    private static void opcionC(Scanner scanner) {
        System.out.println("Ahora es tu turno:" +
                "\nIntroduce dos Strings en LINEAS SEPARADAS");
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        Utilidad.sonEquivalentes(s1, s2);
    }

}
