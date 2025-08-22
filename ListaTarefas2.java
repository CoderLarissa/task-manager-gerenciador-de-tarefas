import java.util.ArrayList;
import java.util.Scanner;

public class ListaTarefas2 {

    public static void main(String[] args) {
        tarefas();
    }
    public static void tarefas() {
            ArrayList <ListaTarefasModelo> listaTarefas = new ArrayList<>();
            Scanner teclado = new Scanner(System.in);
            System.out.println(" ------------------------- AGENDA -------------------- ");
            while (listaTarefas.isEmpty()) {
                System.out.println("Insira 1 para criar sua primeira tarefa ou digite 0 para sair: ");
                System.out.print("> ");
                String entrada = teclado.nextLine();
                if (entrada.equals("0")) {
                    break;
                }
                  
                else if (entrada.equals("1")) {
                    System.out.println("Tarefa: ");
                    System.out.print("> ");
                    entrada = teclado.nextLine();
                    ListaTarefasModelo listaTarefasModelo = new ListaTarefasModelo();
                    listaTarefasModelo.setTarefa(entrada);
                    listaTarefas.add(listaTarefasModelo);
                }
          
            }
           
            while (true) {
                    System.out.println("---------------- DIGITE O NÚMERO RELATIVO À OPÇÃO DESEJADA POR VOCÊ ------------------------");
                    System.out.println("0. Sair");
                    System.out.println("1. Adicionar Tarefa");
                    System.out.println("2. Tarefas adicionadas");
                    System.out.print("> ");
                    String opc = teclado.nextLine();
                    System.out.println("--------------------------------------------------------------------------------------------");

            
                    switch (opc) {
                        case "0":
                            System.out.println("Encerrando programa...");
                            break;
                            
                        case "1":
                            System.out.println("Tarefa: ");
                            System.out.print("> ");
                            opc = teclado.nextLine();
                            ListaTarefasModelo listaTarefasModelo = new ListaTarefasModelo();
                            listaTarefasModelo.setTarefa(opc);
                            listaTarefas.add(listaTarefasModelo);
                            break;
        
                        case "2":
                            while (true) {
                                for (ListaTarefasModelo itens : listaTarefas) {
                                    System.out.printf("%d. %s %s%n", itens.getNum_Tarefa(), itens.getCheck_Finalizacao(), itens.getTarefa());
                                }
                                System.out.println("Digite a letra s para sair: ");
                                System.out.print("> ");
                                opc = teclado.nextLine();
                                if (opc.equalsIgnoreCase("s")) {
                                    break;
                                }
                            }
                            break;

                        default:
                            System.out.println("Opção inválida!");
                            break;

                    }
                    if (opc.equals("0")) {
                        System.out.println("Volte sempre!");
                        break;

                    }
            }
    }
    
}
