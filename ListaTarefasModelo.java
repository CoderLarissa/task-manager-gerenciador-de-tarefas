import java.time.LocalDate;
import java.time.LocalTime;
public class ListaTarefasModelo {

    private String tarefa;
    private int num_tarefa;
    private boolean finalizada;
    private LocalDate data_finalizacao;
    private LocalTime horario_finalizacao;
    private String check_finalizacao;
    private static int cont;


    public ListaTarefasModelo(String tar) {
        tarefa = tar;
        num_tarefa = ++cont;
        finalizada = false;
        check_finalizacao = "[ ]";
    }
    public ListaTarefasModelo() {
        num_tarefa = ++cont;
        check_finalizacao = "[ ]";
    }

    public void setTarefa(String tar) {
        this.tarefa = tar;
    }

    public String getTarefa() {
        return this.tarefa;
    }

    public void setNum_Tarefa(int num) {
        this.num_tarefa = num;
    }

    public int getNum_Tarefa() {
        return this.num_tarefa;
    }

    public void setFinalizada(boolean fin) {
        this.finalizada = fin;
    }

    public boolean getFinalizada() {
        return this.finalizada;
    }

    public void SetData_Finalizacao(LocalDate date) {
        data_finalizacao = date;
    }

    public LocalDate getData_Finalizacao() {
        return this.data_finalizacao;
    }
    public void SetHorario_Finalizacao(LocalTime hor) {
        horario_finalizacao = hor;
    }

    public LocalTime getHorario_Finalizacao() {
        return this.horario_finalizacao;
    }

    public void setCheck_Finalizacao(String c) {
        check_finalizacao = c;
    }

    public String getCheck_Finalizacao() {
        return this.check_finalizacao;
    }

    

    
}
