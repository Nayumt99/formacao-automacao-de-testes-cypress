def validar_dados(nome, idade, email):
    if idade < 0 or idade > 120:
        return "Dados Invalidos: Idade fora do intervalo permitido!"
    elif '@' not in email or '.' not in email:
        return "Dados Invalidos: E-mail no formato incorreto!"
    else:
        return "Dados Validados com Sucesso!"

if __name__ == "__main__":
    nome = input()
    idade = int(input())
    email = input()

    resultado = validar_dados(nome, idade, email)
    print(resultado)
