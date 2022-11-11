/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcioness;

import javax.swing.JOptionPane;

public class Excepcion {

    public static void main(String[] args) {
        A();
    }

    public static void A() {
        try {
            //Define the divisor, dividend and an aux for the division
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el divisor"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el dividendo:"));
            int aux;
            //mAKE if that the dividend does not exceed 10
            if (num1 >= 10) {
                aux = num1 / num2;
                JOptionPane.showMessageDialog(null, aux);
            } else {
                //The else we call our new exception that we created in the other class
                throw new Newexcepcion("Solo numeros menores a 10");
            }
        } catch (NumberFormatException ex) {
            //Exception to warn the user that he cannot enter text
            JOptionPane.showMessageDialog(null, "Es una cadena de texto, tiene que ser un numero");
        } catch (ArithmeticException a) {
            //Exception that you cannot introduce the dividend at 0
            JOptionPane.showMessageDialog(null, "No se puede dividir entre 0");
        } catch (Exception e) {
            //Exception Connect with our new exception
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}
