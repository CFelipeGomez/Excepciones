package excepcioness;

/**
 *
 * @author fepip
 */
public class Excepciones {

    public static void main(String[] args) {
        int numero;
        String cadena = "a";
        //Does the process,if the number is integer
        try {
            numero = Integer.parseInt(cadena);
            //Catch for the exception, if the number isn't integer
        } catch (NumberFormatException ex) {
            System.out.println("No es un numero, es una cadena de texto" + ex.getMessage());
        }

    }

}
