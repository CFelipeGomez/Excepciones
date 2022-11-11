package excepcioness;

/**
 *
 * @author fepip
 */
public class Excepcionvector {

    public static void main(String[] args) {
        desborde();
    }

    public static void desborde() {
        //Define a vector of 3 positions
        int v[] = new int[3];
        try {
            //Traverse the vector to position 6
            for (int i = 0; i < 6; i++) {
                v[i] = i;
            }
            //vector haven't position 6 then the "catch" use the exception to get  message
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }

}
