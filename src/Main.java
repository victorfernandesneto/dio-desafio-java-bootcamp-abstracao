import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Bootcamp b = new Bootcamp("Java", LocalDate.of(1997, 8, 29), LocalDate.now());
        System.out.println(b);
        Dev d = new Dev("Victor");
        d.inscreverBootcamp(b);
        System.out.println(b.getDevs());
        Curso c1 = new Curso("Java 1", 4);
        Curso c2 = new Curso("Java 2", 5);
        c1.adicionarBootcamp(b);
        c2.adicionarBootcamp(b);
        System.out.println(b.getCursos());
        d.finalizarCurso(c1);
        // d.finalizarCurso(c2);
        Mentoria m = new Mentoria("1 on 1", LocalDate.now());
        d.adicionarMentoria(m);
        System.out.println(d.calcularXp());
    }
}
