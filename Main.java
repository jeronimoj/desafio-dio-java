package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);
        //System.out.println(curso1);

        Conteudo conteudo = new Curso();

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);
        //System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("desrição mentoria java");
        mentoria.setData(LocalDate.now());
        //ystem.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        System.out.println("Conteudos inscritos" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos" + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluido" + devCamila.getConteudosConcluidos());
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("----------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Jõao");
        System.out.println("Conteudos inscritos" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devJoao.getConteudosConcluidos());
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }
}
