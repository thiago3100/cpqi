public class tiposPrimitivos {

    public static void main(String[] args) throws Exception {

        int idade = 31;
        double preco = 12.45;
        char sexo = 'M';
        boolean casado = true;

        byte b = 127;
        short s = 32767;
        int i = 2_000_000_000;
        long l = 9_000_000_000_000_000L;
        double d = 1.7976931348623157E+308;
        float f = 123F;

        i = s;

        System.out.println(idade);
        System.out.println(preco);
        System.out.println(sexo);
        System.out.println(casado);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(d);
        System.out.println(f);
    }
}
