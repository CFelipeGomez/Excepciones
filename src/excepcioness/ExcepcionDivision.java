package excepcioness;

public class ExcepcionDivision {

    public static void main(String[] args) {
        aritmetico();
    }

    public static void aritmetico() {
        int numero = 5, resultado;
        try {
            //Divide 0 the number 5
            resultado = numero / 0;
            //Catch acts by the ArithmeticException to see don´t have error in the operation
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0 " + "\n " + e.getMessage());
        }

    }

}
