import java.util.Scanner;

public class ListaTarefas {


    public static void main(String[] args) {
        tarefas();
    }


    public static void tarefas() {
        Scanner entrada = new Scanner(System.in);
        String[] concluido = {"[ ]", "[ ]", "[ ]"};
        String[] tarefas = {"Ler um livro", "Estudar matemática", "Beber água"};
        String[] numero = {"1.", "2.", "3."};
        while (true) {
            System.out.println(" ----- LISTA DE TAREFAS ----- ");
            for (int i = 0; i < tarefas.length; i++) {
                System.out.println(numero[i] + " " + concluido[i] + " " + tarefas[i]);
            }
            System.out.println("-------------------------------------------------------");
            System.out.println("Digite o número da tarefa finalizada por você");
            System.out.println("[Digite 0 para sair do probrama]: ");
            System.out.println();
            System.out.print("Opção: ");
            int num = entrada.nextInt();
            if (num < 0 || num > concluido.length) {
                System.out.println("Entrada inválida!\nDigite um dos números da lista");
                continue;
            }
            System.out.println("-------------------------------------------------------");
            if (num == 0) {
                System.out.println("Encerrando programa...\nVolte sempre :)");
                break;
            }
            concluido[num - 1] = "[X]";

        }       

    }
    
}