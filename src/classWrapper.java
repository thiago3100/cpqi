public class classWrapper {
    public static void main(String[] args) {

        // integer //byte //short //long
        // character //void //float
        // double //booleam

        Double preco = new Double("12.45");
        double d = preco.doubleValue();
        int i = preco.intValue();
        byte b = preco.byteValue();

        // Conversão Estática

        double d1 = Double.parseDouble("123.45");
        int i1 = Integer.parseInt("123");
        float f1 = Float.parseFloat("3.14F");

        int i2 = Integer.valueOf("101011", 2);

        System.out.println(d);
        System.out.println(f1);

    }
}
