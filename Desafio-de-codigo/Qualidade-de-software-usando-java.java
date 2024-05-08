import java.util.Scanner;

public class Main {
    public static String validarDados(String nome, int idade, String email) {
        if (idade < 0 || idade > 120) {
            return "Dados Invalidos: Idade fora do intervalo permitido!";
        } else if (!email.contains("@") || !email.contains(".")) {
            return "Dados Invalidos: E-mail no formato incorreto!";
        } else {
            return "Dados Validados com Sucesso!";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        int idade = scanner.nextInt();
        String email = scanner.next();

        String resultado = validarDados(nome, idade, email);
        System.out.println(resultado);
    }
}
