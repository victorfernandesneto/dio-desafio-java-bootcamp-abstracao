public class Curso extends Atividade {
    private int horas;

    public Curso(String titulo, int horas) {
        super(titulo);
        this.horas = horas;
    }

    @Override
    public int calcularXp() {
        return horas * 10;
    }

    public void adicionarBootcamp(Bootcamp b){
        b.adicionarCurso(this);
    }

    @Override
    public String toString() {
        return "Curso{" + this.getTitulo() +
                ", horas=" + horas +
                '}';
    }
}
