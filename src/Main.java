import br.edu.bootcamp.dominio.Bootcamp;
import br.edu.bootcamp.dominio.Conteudo;
import br.edu.bootcamp.dominio.Curso;
import br.edu.bootcamp.dominio.Dev;

public class Main {
    public static void main(String[] args) {

        Curso fundamentos = new Curso("Fundamentos Java", "Descrição Fundamentos Java", 2);
        Curso collections = new Curso("Collections Java", "Descrição Collections Java", 4);


        Bootcamp bootcampSantander = new Bootcamp("Bootcamp Santander Java",
                "Bootcamp de teste para relação das classes do domínio");

        bootcampSantander.getConteudos().add(fundamentos);
        bootcampSantander.getConteudos().add(collections);

        Dev dev1 = new Dev("William");
        Dev dev2 = new Dev("Carlos");
        Dev dev3 = new Dev("Marcos");

        dev1.inscreverBootcamp(bootcampSantander);
        dev2.inscreverBootcamp(bootcampSantander);
        dev3.inscreverBootcamp(bootcampSantander);

        for (Conteudo conteudo : dev1.getConteudosInscritos()) System.out.println(conteudo.getTitulo() + " - " +
                conteudo.getDescricao() + " - " + conteudo.getCargaHoraria() + "h");

        dev1.progredir();
        for (Conteudo conteudo : dev1.getConteudosConcluidos()) System.out.println(conteudo.getTitulo() + " - " +
                conteudo.getDescricao() + " - " + conteudo.getCargaHoraria() + "h");

        dev1.progredir();

    System.out.println(dev1.calcularTotalXp());

    }
}