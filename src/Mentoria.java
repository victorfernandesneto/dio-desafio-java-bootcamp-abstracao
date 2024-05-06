import java.time.LocalDate;

public class Mentoria extends Atividade{
    private LocalDate data;

    public Mentoria(String titulo, LocalDate data) {
        super(titulo);
        this.data = data;
    }

    @Override
    public int calcularXp() {
        return 3;
    }
}
