import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
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
            System.out.println("[Digite 0 para sair do programa]: ");
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
            entrada.nextLine();
            while (true) {
                dataEHoraConclusao();
                System.out.println("-------------------------------------------------------");
                System.out.print("Digite 's' para sair: ");
                String sair = entrada.nextLine();
                if (sair.equalsIgnoreCase("s")) {
                    break;
                }
                  
            }

          

        }       

    }

    public static void dataEHoraConclusao() {
        DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter horario = DateTimeFormatter.ofPattern("HH:mm");
        LocalDate dataAgora = LocalDate.now();
        LocalTime horarioAgora = LocalTime.now();
        String dataFormatada = data.format(dataAgora);
        String horarioFormado = horario.format(horarioAgora);
        System.out.println("Data de conclusão da tarefa: " + dataFormatada);
        System.out.println("Horário de conclusão da tarefa: " + horarioFormado);
    }
    
}