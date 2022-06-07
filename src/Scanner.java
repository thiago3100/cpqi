import java.util.Scanner;

public class Scanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String nome = s.nextLine();
        System.out.println("Bem vindo" + nome);
    }
}
