using System;

class Program {
    static string ValidarDados(string nome, int idade, string email) {
        if (idade < 0 || idade > 120) {
            return "Dados Invalidos: Idade fora do intervalo permitido!";
        } else if (!email.Contains("@") || !email.Contains(".")) {
            return "Dados Invalidos: E-mail no formato incorreto!";
        } else {
            return "Dados Validados com Sucesso!";
        }
    }

    static void Main(string[] args) {
        string nome = Console.ReadLine();
        int idade = Convert.ToInt32(Console.ReadLine());
        string email = Console.ReadLine();

        string resultado = ValidarDados(nome, idade, email);
        Console.WriteLine(resultado);
    }
}
