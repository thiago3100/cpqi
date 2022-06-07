import javax.swing.JOptionPane;
public class JOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        String nome = JOptionPane.showInputDialog("Qual seu nome?");
        JOptionPane.showMessageDialog(null,"Bem vindo "+ nome);
    }
}