public class Utilidad {

    private Utilidad() {
    }

    public static void letraEn(String s, int i) {
        //Comprobacion de parametros.
        assert s != null : "Error, no puede introducir valores nulos.";
        assert !s.isEmpty() || !s.isBlank() : "Error, la cadena no puede estar vacia o ser espacion en blanco.";
        assert i >= 0 : "Error, el indice no puede ser un numero negativo";
        //Breve explicacion del metodo charAt().
        System.out.println("El metodo charAt(int i) devuelve el char ubicado en dicho indice(i).");
        //Demostracion.
        if (i < s.length()) {
            System.out.printf("La letra en el indice nª%d de la cadena: \"%s\" es: %c\n", i, s, s.charAt(i));
        } else
            System.err.println("Error el indice introducido no debe ser mayor que la longitud de la cadena.");
    }

    public static void compararCadenas(String s1, String s2) {
        //Comprobacion de parametros.
        assert s1 != null || s2 != null : "Error, no puede introducir valores nulos.";
        assert !s1.isEmpty() || !s1.isBlank()
                || !s2.isEmpty() || !s2.isBlank() : "Error, las cadenas no puede estar vacia o ser espacion en blanco.";
        //Breve explicacion del metodo compareTo().
        System.out.println("El metodo compareTo(String otraCadena) compara ambas cadenas " +
                "para indicar cual estaria ubicada antes en orden segun sus valores en UNICODE.");
        //Demostracion.
        if (s1.compareTo(s2) > 0)
            System.out.printf("La cadena %s es mayor que la cadena %s.\n", s1, s2);
        else if (s1.compareTo(s2) < 0)
            System.out.printf("La cadena %s es menor que la cadena %s.\n", s1, s2);
        else
            System.out.printf("Las cadenas %s y %s son iguales.\n", s1, s2);
    }

    public static void sonEquivalentes(String s1, String s2) {
        //Comprobacion de parametros.
        assert s1 != null || s2 != null : "Error, no puede introducir valores nulos.";
        assert !s1.isEmpty() || !s1.isBlank()
                || !s2.isEmpty() || !s2.isBlank() : "Error, las cadenas no puede estar vacia o ser espacion en blanco.";
        //Breve explicacion del metodo equals.
        System.out.println("El metodo equals(String otraCadena) comprueba si dos cadenas son iguales o no.");
        //Demostracion.
        if (s1.equals(s2))
            System.out.println("Las cadenas son iguales.");
        else
            System.out.println("Las cadenas no son iguales.");
    }

    public static void indiceDe(String s, char c) {
        //Comprobacion de parametros.
        assert s != null : "Error, no puede introducir valores nulos.";
        assert !s.isEmpty() || !s.isBlank() : "Error, la cadena no puede estar vacia o ser espacion en blanco.";
        //Breve explicacion del metodo.
        System.out.println("El metodo indexOf(char caracter) sirve para saber la posicion del caracter introducido" +
                "en la cadena.\nOJO, si el caracter esta repetido en la cadena, solo nos devolverá el indice de su" +
                "primera aparicion.");
        //Demostracion.
        if (s.indexOf(c) >= 0)
            System.out.printf("El primer indice de la letra %c en la cadena %s es: %d\n", c, s, s.indexOf(c));
        else
            System.out.printf("El caracter introducido %c no se encuentra en la cadena %s\n", c, s);
    }

    public static void estaVacio(String s) {
        //Combrobacion de parametros.
        assert s != null : "Error, no puede introducir valores nulos.";
        assert !s.isBlank() : "Error, la cadena no puede estar vacia o ser espacion en blanco.";
        //Breve explicacion del metodo.
        System.out.println("El metodo isEmpty() nos indica si una cadena esta vacia o no.");
        //Demostracion
        if (s.isEmpty())
            System.out.printf("La cadena %s es una cadena sin ningun caracter en ella.\n", s);
        else
            System.out.printf("La cadena %s no es una cadena vacia, es decir, contiene algun caracter.\n", s);
    }

    public static void longitud(String s) {
        //Comprobacion de parametros.
        assert s != null : "Error, no puede introducir valores nulos.";
        assert !s.isEmpty() || !s.isBlank() : "Error, la cadena no puede estar vacia o ser espacion en blanco.";
        //Breve explicacion del metodo.
        System.out.println("El metodo length() nos indica el numero de caracteres .");
        //Demostracion.
        System.out.printf("La longitud de la cadena %s es: %d \n", s, s.length());
    }

    public static void subcadena(String s, int i, int j) {
        //Comprobacion de parametros.
        assert s != null : "Error, no puede introducir valores nulos.";
        assert !s.isEmpty() || !s.isBlank() : "Error, la cadena no puede estar vacia o ser espacion en blanco.";
        assert i >= 0 && j >= 0 : "No se pueden introducir numeros negativos";
        assert i <= s.length() && j <= s.length() : "Los numeros no pueden ser superiores a la longitud de la cadena.";
        //Breve explicacion del metodo.
        System.out.println("El metodo substring() se puede usar de dos maneras:\n" +
                "1- Pasando solo un indice como parametro de entrada, devuelve el fragmento desde es indice hasta el final.\n" +
                "2- Pasando dos indices devuelve el fragmento comprendido entre ambos indices.");
        //Demostracion.
        System.out.println("Opcion 1, solo un parametro de entrada.");
        System.out.printf("Cadena -> %s, subcande -> %s\n", s, s.substring(i));
        System.out.println();
        if (i > j)
            System.out.printf("Cadena -> %s, subcandena -> %s\n", s, s.substring(j, i));
        else
            System.out.printf("Cadena -> %s, subcandena -> %s\n", s, s.substring(i, j));
    }

    public static void pasaMayusculas(String s) {
        //Comprobacion de parametros.
        assert s != null : "Error, no puede introducir valores nulos.";
        assert !s.isEmpty() || !s.isBlank() : "Error, la cadena no puede estar vacia o ser espacion en blanco.";
        //Breve explicacion del metodo.
        System.out.println("El metodo toUpperCase() transforma los caracteres de una cadena a su version en mayuscula.");
        //Demostracion.
        System.out.printf("La cadena %s a mayusculas es -> %s\n", s, s.toUpperCase());
    }

    public static void pasaMinusculas(String s) {
        //Comprobacion de parametros.
        assert s != null : "Error, no puede introducir valores nulos.";
        assert !s.isEmpty() || !s.isBlank() : "Error, la cadena no puede estar vacia o ser espacion en blanco.";
        //Breve explicacion del metodo.
        System.out.println("El metodo toLowerCase() transforma los caracteres de una cadena a su version en minuscula.");
        //Demostracion.
        System.out.printf("La cadena %s a mayusculas es -> %s\n", s, s.toLowerCase());
    }

    public static void valorEnString(int i) {
        //Breve explicacion del metodo.
        System.out.println("El metodo valueOf() transforma cualquier variable a un objeto String.");
        //Demostracion.
        System.out.printf("Utilizaremos de ejemplo un entero (%d)\n", i);
        System.out.printf("%d (%s)... TRANSFORMACION ... %s %s\n", i, Integer.valueOf(i).getClass(), String.valueOf(i), String.valueOf(i).getClass());
    }
}