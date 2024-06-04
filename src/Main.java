import dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso1");
        curso1.setDescricao("Descrição Curso1");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso2");
        curso2.setDescricao("Descrição Curso2");
        curso2.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria");
        mentoria.setDescricao("Descrição Mentoria");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição do Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Dev1");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("CONTEÚDOS INSCRITOS [DEV1]: "+dev1.getConteudosInscritos());
        System.out.println("CONTEÚDOS CONCLUIDOS [DEV1]: "+dev1.getConteudosConcluidos());
        dev1.progredir();
        System.out.println("\nCONTEÚDOS INSCRITOS [DEV1]: "+dev1.getConteudosInscritos());
        System.out.println("CONTEÚDOS CONCLUIDOS [DEV1]: "+dev1.getConteudosConcluidos());
        System.out.println("XP TOTAL: "+dev1.calcularTotalXp());


        Dev dev2 = new Dev();
        dev2.setNome("Dev2");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("\nCONTEÚDOS INSCRITOS [DEV2]: "+dev2.getConteudosInscritos());
        System.out.println("CONTEÚDOS CONCLUIDOS [DEV2]: "+dev2.getConteudosConcluidos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("\nCONTEÚDOS INSCRITOS [DEV2]: "+dev2.getConteudosInscritos());
        System.out.println("CONTEÚDOS CONCLUIDOS [DEV2]: "+dev2.getConteudosConcluidos());
        System.out.println("XP TOTAL: "+dev2.calcularTotalXp());
    }
}
