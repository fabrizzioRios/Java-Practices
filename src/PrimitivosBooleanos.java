public class PrimitivosBooleanos {
    public static void main(String[] args) {
        boolean datoLogico = true;
        System.out.println("Dato Logico: " + datoLogico);

        double d = 98765.43e-3; //98.76543
        System.out.println("d = " + d);
        float f = 12345e2f; //123.45
        System.out.println("f = " + f);

        datoLogico = (f > d);

        System.out.println(datoLogico);
        boolean esIgual = 4-3 == 1;
        System.out.println("Es igual = " + esIgual);
    }
}
