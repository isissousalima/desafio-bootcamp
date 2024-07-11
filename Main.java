import DesafioBootcamp.Bootcamp;
import DesafioBootcamp.Curso;
import DesafioBootcamp.Dev;
import DesafioBootcamp.Mentoria;

import java.sql.SQLOutput;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("java");
        curso1.setDescricao("descrição curso1 java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("java");
        curso2.setDescricao("descrição curso1 java");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria de java");
        mentoria1.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);


        Dev devIsis = new Dev();
        devIsis.setNome("Isis");
        devIsis.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Isis" + devIsis.getConteudosInscritos);
        devIsis.progredir();
        System.out.println("Conteúdos Inscritos Isis" + devIsis.getConteudosInscritos);
        System.out.println("Conteúdos Concluídos Isis" + devIsis.getConteudosConcluidos);
        System.out.println("XP: " + devIsis.calcularTotalXp());


        Dev devCamila = new Dev();
        devCamila.setNome("Isis");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos);
        devCamila.progredir();
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos);
        System.out.println("Conteúdos Concluídos Camila" + devCamila.getConteudosConcluidos);
        System.out.println("XP: " + devCamila.calcularTotalXp());





    }
}



