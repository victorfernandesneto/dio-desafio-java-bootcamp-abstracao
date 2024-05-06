import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dev {
    private String nome;
    private List<Mentoria> mentorias = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();
    private Bootcamp bootcamp;

    public Dev(String nome) {
        this.nome = nome;
    }

    public void inscreverBootcamp(Bootcamp b){
        this.bootcamp = b;
        b.adicionarDev(this);
    }

    public void finalizarCurso(Curso c){
        cursos.add(c);
    };

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public void adicionarMentoria(Mentoria m){
        mentorias.add(m);
    }

    public int calcularXp(){
        int cursosXp = cursos.stream().mapToInt(c -> c.calcularXp()).sum();
        int mentoriasXp = mentorias.stream().mapToInt(m -> m.calcularXp()).sum();
        return cursosXp + mentoriasXp;
    }

    public String getNome() {
        return nome;
    }

    public List<Mentoria> getMentorias() {
        return mentorias;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public Bootcamp getBootcamp() {
        return bootcamp;
    }
}
