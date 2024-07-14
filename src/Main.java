import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso PHP");
        curso2.setDescricao("Descrição do curso de PHP");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição da mentoria Java");
        mentoria1.setData(LocalDate.now());

        /*
        System.out.println(mentoria1);
        System.out.println(curso1);
        System.out.println(curso2);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devPablo = new Dev();
        devPablo.setNome("Pablo");
        devPablo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devPablo.getConteudosInscritos());
        devPablo.progredir();
        devPablo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + devPablo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devPablo.getConteudosConcluidos());
        System.out.println("XP: " + devPablo.calcularTotalXp());
        System.out.println("---------------");

        Dev devMona = new Dev();
        devMona.setNome("Monalisa");
        devMona.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devMona.getConteudosInscritos());
        devMona.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + devMona.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devMona.getConteudosConcluidos());
        System.out.println("XP: " + devMona.calcularTotalXp());

    }
}
