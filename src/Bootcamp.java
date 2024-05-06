import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFinal;
    private List<Dev> devs = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();

    public Bootcamp(String nome, LocalDate dataInicio, LocalDate dataFinal) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
    }

    public void adicionarDev(Dev d) {
        this.devs.add(d);
    }

    public void adicionarCurso(Curso c){
        this.cursos.add(c);
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "nome='" + nome + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataFinal=" + dataFinal +
                '}';
    }

    public List<Dev> getDevs() {
        return devs;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
}
