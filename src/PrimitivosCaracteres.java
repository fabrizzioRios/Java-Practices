public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("Caracter = " + caracter);
        System.out.println("Decimal = " + decimal);
        System.out.println("Decimal = Caracter " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("Simbolo = " + simbolo);
        System.out.println("Simbolo = caracter " + (simbolo == caracter));

        char espacio = ' ';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("Character corresponde en byte:"+ espacio + Character.BYTES);
        System.out.println("Character corresponde en byte:"+ retroceso + Character.BYTES);
        System.out.println("Character corresponde en byte:"+ tabulador + Character.BYTES);
        System.out.println("Character corresponde en \tbyte:"+ Character.BYTES);
        System.out.println("Character corresponde en byte:"+ nuevaLinea + Character.BYTES);
        System.out.println("Character corresponde en byte:"+ retornoCarro + Character.BYTES);

        System.out.println("Character corresponde en byte:"+ System.getProperty("line.separator") + Character.BYTES);
        System.out.println("Character corresponde en byte:"+ System.lineSeparator() + Character.BYTES);

        System.out.println("Character corresponde en byte:"+ espacio + retroceso + tabulador + Character.BYTES);
        System.out.println("Character corresponde en bites = " + Character.SIZE);
        System.out.println("Character MIN VALUE = " + Character.MIN_VALUE);
        System.out.println("Character MAX VALUE = " + Character.MAX_VALUE);

    }
}
