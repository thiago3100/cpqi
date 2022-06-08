public class operadoresEspeciais {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o raio");
        double raio = s.nextDouble();
        
        //Diâmetro
        double diametro = 2 * raio;
        System.out.println("Diametro = "+ diametro);
        
        //circunferencia
        double pi = Math.PI;
        double circunferencia = 2 * pi * raio;
        System.out.println("Circuferencia = "+circunferencia);
        
        //area
        double area = pi * (raio * raio);
        System.out.println("Àrea = "+ area);
        
        
        //operador ternário 
        int idade = 10; 
        String x = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(x);
 }

}