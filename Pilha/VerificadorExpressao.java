package Pilha;
import java.util.Stack;
public class VerificadorExpressao {
    // Função para verificar se uma expressão está com a parametrização correta
    public static boolean VerificarExpressao(String expressao) {
        // Cria uma pilha dinâmica
        Stack<Character> pilha = new Stack<>();

        // Percorre cada caractere da expressão
        for (int i = 0; i < expressao.length(); i++) {
            char sabe = expressao.charAt(i);

            // Se for um caractere de abertura, empilha
            if (sabe == '(' || sabe == '{' || sabe == '[') {
                pilha.push(sabe);
            }
            // Se for um caractere de fechamento, verifica correspondência
            else if (sabe == ')' || sabe == '}' || sabe == ']') {
                // Se a pilha estiver vazia, a expressão está incorreta
                if (pilha.isEmpty()) {
                    return false;
                }

                char topo = pilha.pop();
                
                // Verifica se o caractere de fechamento corresponde ao de abertura
                if ((sabe == ')' && topo != '(') || 
                    (sabe == '}' && topo != '{') || 
                    (sabe == ']' && topo != '[')) {
                    return false;
                }
            }
        }

        // No final, se a pilha não estiver vazia, a expressão está incorreta
        return pilha.isEmpty();
    }
}