import java.util.Scanner;

public class LeituraDadosTeclado {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       /* String primeiroNome = scan.next();
        System.out.println("Digite seu primeiro nome: " +primeiroNome);

        String nomeCompleto = scan.nextLine();
        System.out.println("Digite seu nome completo: " +nomeCompleto);

        int idade = scan.nextInt();
        System.out.println("Digite sua idade: " +idade);


        float altura = scan.nextFloat();
        System.out.println("Digite sua altura: " +altura);*/

        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem animal de estimacao ");
        String nome =  scan.next();
        int idades = scan.nextInt();
        int qtdFilhos = scan.nextInt();
        double alturas = scan.nextDouble();
        boolean temPet = scan.nextBoolean();

        System.out.println("Seu pprimeiro nome é: " +nome );
        System.out.println("Sua idade é: " +idades );
        System.out.println("Qtd de fiho: " +qtdFilhos );
        System.out.println("Sua altura: " +alturas );
        System.out.println("Tem pet: " +temPet );

    }
}
