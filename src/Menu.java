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
            case 'a':
                System.out.println("METODO SELECCIONADO: charAt()");
                opcionA();
                opcionA(Principal.sc);
                break;
            case 'B':
            case 'b':
                System.out.println("METODO SELECCIONADO: compareTo()");
                opcionB();
                opcionB(Principal.sc);
                break;
            case 'C':
            case 'c':
                System.out.println("METODO SELECCIONADO: equals()");
                opcionC();
                opcionC(Principal.sc);
                break;
            case 'D':
            case 'd':
                System.out.println("METODO SELECCIONADO: indexOf()");
                opcionD();
                opcionD(Principal.sc);
                break;
            case 'E':
            case 'e':
                System.out.println("METODO SELECCIONADO: isEmpty()");
                opcionE();
                opcionE(Principal.sc);
                break;
            case 'F':
            case 'f':
                System.out.println("METODO SELECCIONADO: length()");
                opcionF();
                opcionF(Principal.sc);
                break;
            case 'G':
            case 'g':
                System.out.println("METODO SELECCIONADO: substring()");
                opcionG();
                opcionG(Principal.sc);
                break;
            case 'H':
            case 'h':
                System.out.println("METODO SELECCIONADO: toUpperCase()");
                opcionH();
                opcionH(Principal.sc);
                break;
            case 'I':
            case 'i':
                System.out.println("METODO SELECCIONADO: toLowerCase()");
                opcionI();
                opcionI(Principal.sc);
                break;
            case 'J':
            case 'j':
                System.out.println("METODO SELECCIONADO: valueOf()");
                opcionJ();
                break;
            case 'X':
            case 'x':
                System.out.println("Espero que haya disfrutado de nuestra aplicacion, hasta la proxima!");
                break;
            default:
                System.out.println("Opcion desconocida, por favor, intentelo de nuevo");
                break;
        }
    }

    private static void opcionA() {
        System.out.println("Empecemos con un ejemplo:" +
                "\nusaremos la palabra Mazorca como String y 2 como indice");
        Utilidad.letraEn("Mazorca", 2);
    }

    private static void opcionA(Scanner scanner) {
        System.out.println("Ahora es tu turno:" +
                "\nIntroduce un String y un numero, en este mismo orden");
        //String s = scanner.nextLine();
        //int i = scanner.nextInt();
        Utilidad.letraEn(scanner.nextLine(), scanner.nextInt());
    }

    private static void opcionB() {
        System.out.println("Empecemos con un ejemplo:" +
                "\nusaremos dos Strings: Mazorca y Abanico");
        Utilidad.compararCadenas("Mazorca", "Abanico");
    }

    private static void opcionB(Scanner scanner) {
        System.out.println("Ahora es tu turno:" +
                "\nIntroduce dos Strings en LINEAS SEPARADAS");
        //String s1 = scanner.nextLine();
        //String s2 = scanner.nextLine();
        Utilidad.compararCadenas(scanner.nextLine(), scanner.nextLine());
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
        //String s1 = scanner.nextLine();
        //String s2 = scanner.nextLine();
        Utilidad.sonEquivalentes(scanner.nextLine(), scanner.nextLine());
    }

    private static void opcionD() {
        System.out.println("Empecemos con un ejemplo:" +
                "\nusaremos un String: Mazorca el caracter Z");
        Utilidad.indiceDe("Mazorca", 'z');
        System.out.println("Ahora buscaremos un caracter que no este en Mazorca");
        Utilidad.indiceDe("Mazorca", 'q');
    }

    private static void opcionD(Scanner scanner) {
        System.out.println("Ahora es tu turno:" +
                "\nIntroduce dos Strings en LINEAS SEPARADAS");
        //String s1 = scanner.nextLine();
        //String s2 = scanner.nextLine();
        Utilidad.indiceDe(scanner.nextLine(), scanner.nextLine().charAt(0));
    }

    private static void opcionE() {
        System.out.println("Empecemos con un ejemplo:" +
                "\nusaremos un String: Mazorca ");
        Utilidad.estaVacio("Mazorca");
        System.out.println("Ahora usaremos un String vacio.(\"\")");
        Utilidad.estaVacio("");
    }

    private static void opcionE(Scanner scanner) {
        System.out.println("Ahora es tu turno:" +
                "\nIntroduce un String, en este caso te permitimos uno vacio.");
        Utilidad.estaVacio(scanner.nextLine());
    }

    private static void opcionF() {
        System.out.println("Empecemos con un ejemplo:" +
                "\nusaremos un String: Mazorca ");
        Utilidad.longitud("Mazorca");
    }

    private static void opcionF(Scanner scanner) {
        System.out.println("Ahora es tu turno:" +
                "\nIntroduce un String.");
        Utilidad.longitud(scanner.nextLine());
    }

    private static void opcionG() {
        System.out.println("Empecemos con un ejemplo:" +
                "\nusaremos un String: Mazorca, sacaremos las subcadenas usando 2 y 5.");
        Utilidad.subcadena("Mazorca",2, 5);
    }

    private static void opcionG(Scanner scanner) {
        System.out.println("Ahora es tu turno:" +
                "\nIntroduce un String, y dos numeros siempre menores a este.");
        Utilidad.subcadena(scanner.nextLine(), scanner.nextInt(), scanner.nextInt());
    }


    private static void opcionH() {
        System.out.println("Empecemos con un ejemplo:" +
                "\nusaremos un String: Mazorca y pasaremos todos sus caracteres a mayusculas");
        Utilidad.pasaMayusculas("Mazorca");
    }

    private static void opcionH(Scanner scanner) {
        System.out.println("Ahora es tu turno:" +
                "\nIntroduce un String.");
        Utilidad.pasaMayusculas(scanner.nextLine());
    }

    private static void opcionI() {
        System.out.println("Empecemos con un ejemplo:" +
                "\nusaremos un String: MAzoRCA y pasaremos todos sus caracteres a minusculas.");
        Utilidad.pasaMinusculas("MAzoRCA");
    }

    private static void opcionI(Scanner scanner) {
        System.out.println("Ahora es tu turno:" +
                "\nIntroduce un String.");
        Utilidad.pasaMinusculas(scanner.nextLine());
    }

    private static void opcionJ() {
        System.out.println("Esta opcion es la unica que SOLO incluye ejemplo:" +
                "\nusaremos un dato de tipo int (Integer), concretamente el 10 ");
        Utilidad.valorEnString(10);
    }

}
