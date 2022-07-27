import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Curso: Java");
        curso1.setDescricao("Descrição: Curso de Java");
        curso1.setCargaHoraria(450);

        curso2.setTitulo("Curso: PHP");
        curso2.setDescricao("Descrição: Curso de PHP");
        curso2.setCargaHoraria(350);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria: Python");
        mentoria.setDescricao("Descrição: Mentoria de Python");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição: Bootcamp de Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEmanuelle = new Dev();
        devEmanuelle.setNome("Emanuelle");
        devEmanuelle.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Emanuelle: " + devEmanuelle.getConteudosInscritos());

        devEmanuelle.progredir();
        devEmanuelle.progredir();
        devEmanuelle.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Emanuelle: " + devEmanuelle.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de Emanuelle: " + devEmanuelle.getConteudosConcluidos());
        System.out.println("Xp:" + devEmanuelle.calcularTotalXp());

        System.out.println("------------------");

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Gabriel: " + devGabriel.getConteudosInscritos());

        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Gabriel: " + devGabriel.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de Gabriel: " + devGabriel.getConteudosConcluidos());
        System.out.println("Xp:" + devGabriel.calcularTotalXp());






    }
}
