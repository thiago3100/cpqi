import javax.swing.JOptionPane;

public class desafioIMC {
    public static void main(String args[]) {
        
        System.out.println("Índice de Massa corporal");
        
        String peso = JOptionPane.showInputDialog("Digite seu peso :");
        String altura = JOptionPane.showInputDialog("Digite sua altura :");
        
        double pesoKg = Double.parseDouble(peso);
        double alturaMt = Double.parseDouble(altura);
        
        double IMC = pesoKg / (alturaMt * 2);
        
        String results = (IMC < 20) ? "Abaixo do peso" : ((IMC >= 20)&&(IMC <= 25)) ? "Peso ideal" :
                ((IMC >= 25)&&(IMC <= 30)) ? "Sobrepeso" : ((IMC >= 30)&&(IMC <= 35)) ? "Obesidade Moderada" :
                ((IMC >= 35)&&(IMC <= 40)) ? "Obesidade severa" : ((IMC >= 40)&&(IMC <= 50)) ? "Obesidade mórbida" :
                (IMC > 50)? "Super Obesidade" : "error";
        
        String msg = "Seu IMC é "+ IMC + " e sua situação é "+ results;
        
        JOptionPane.showMessageDialog(null, msg);
        
    }
}