public class PrimitivosFloat {
    public static void main (String[] args){
        float realFloat = 1.5e-10f;//2120f;
        System.out.println("realFloat = " + realFloat);

        System.out.println("float corresponde en byte a = " + Float.BYTES);
        System.out.println("float corresponde en byte a = " + Float.SIZE);
        System.out.println("maximo valor para float = " + Float.MAX_VALUE);
        System.out.println("minimo valor para float = " + Float.MIN_VALUE);

        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a = " + Double.BYTES);
        System.out.println("double corresponde en byte a = " + Double.SIZE);
        System.out.println("maximo valor para double = " + Double.MAX_VALUE);
        System.out.println("minimo valor para doublke = " + Double.MIN_VALUE);

        float varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);

    }
}
