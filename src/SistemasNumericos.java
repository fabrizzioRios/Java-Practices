import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {


        int numeroDecimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero entero:"));
        System.out.println("Numero binario = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        System.out.println("Numero octal = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        System.out.println("Numero hexadecimal = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        int numeroBinario = 0b111110100;
        System.out.println("Numero bin = " + numeroBinario);

        int numeroOctal = 0764;
        System.out.println("Numero oct = " + numeroOctal);

        int numeroHexadecimal = 0x1f4;
        System.out.println("Numero hexa = " + numeroHexadecimal);
        String message = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        message += "numero octal" + numeroDecimal + " = " +  Integer.toOctalString(numeroDecimal);
        message += "numero hexagonal" + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        JOptionPane.showMessageDialog(null, message);
    }
}
