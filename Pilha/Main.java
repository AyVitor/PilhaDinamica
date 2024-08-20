package Pilha;

public class Main { 
    public static void main(String[] args) {
        // Teste de múltiplas expressões
        String[] expressoes = {
            "((7*5)*4-(8/3))",  // Correta
            "(({})*4-()",    // Incorreta
            "{[()]}",            // Correta
            "{[(])}",            // Incorreta
            "(a+b)*(c-d)",        // Correta
            "((a+b)*(c-d)",      // Incorreta
            "{[()()]}",          // Correta
            "{[()()]}}",
            "((({}}}[[]])))"     // Incorreta
        };

        // Verifica cada expressão e imprime o resultado
        for (String expressao : expressoes) {
            if (VerificadorExpressao.VerificarExpressao(expressao)) { // Acessa o método através da classe
                System.out.println("Expressão correta: " + expressao);
            } else {
                System.out.println("Expressão incorreta: " + expressao);
            }
        }
    }

}