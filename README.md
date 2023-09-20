# Desafio Controle de Fluxo DIO

Bem-vindo!

## Implementações

- Foi criada a classe `ParametrosInvalidos`. Nessa classe, chamamos o método `super()` passando uma mensagem diretamente para a exceção `Exception`.
- Além das validações, foi criado um método que realiza uma recursão para verificar se o valor digitado no terminal é um número.

```java
static Integer validationNumber(Scanner terminal) {
    if (terminal.hasNextInt()) {
        return terminal.nextInt();
    }
    System.out.println("Entrada Inválida: Digite um número válido");
    terminal.next();
    return validationNumber(terminal);
}