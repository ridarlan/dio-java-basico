import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá, seja bem-vindo ao terminal do banco.");
        
        System.out.println("Digite o número da sua conta: ");
        int conta = entrada.nextInt();
        
        System.out.println("Digite o número da sua agência: ");
        String agencia = entrada.next();

        System.out.println("Digite o seu nome: ");
        String nome = entrada.next();
        
        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = entrada.next();

        double saldo = 237.48;

        System.out.printf("Olá %s %s, obrigado por criar uma conta em nosso banco,sua agência é %s,sua conta é a  %d e seu saldo é de R$ %.2f e já está disponível para saque."
        ,nome,sobrenome,agencia,conta,saldo);
    
        entrada.close();
    
    }

}
