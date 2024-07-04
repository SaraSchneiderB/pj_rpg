/*
Projeto consiste em criar uma ficha de personagem de RPG - D&D -
utilizando herança, setter e scanner - entre outros comandos - 
 */
package PJ_RPG;

import java.util.Scanner;

/**
 *
 * @author Sara
 */

public class MeuPersonagem_RPG {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        Scanner sc2 = new Scanner(System.in, "UTF-8");

        System.out.println("Olá, seja bem vinde. Vamos começar a sua ficha de personagem \n"
                + "escolhendo com qual classe pretende jogar. \n"
                + "\nAs opções diponíveis são as seguintes: \n"
                + "MAGO\n"
                + "FEITICEIRO\n"
                + "GUERREIRO\n"
                + "BÁRBARO\n"
                + "CLÉRIGO\n"
                + "PALADINO");

        //comandos para ignorar acentuação
        String ClasseEscolha = sc.nextLine();
        char[] ClasseEscolhaToCharArray = ClasseEscolha.toLowerCase().toCharArray();
        String acento = "";
        for (int i = 0; i < ClasseEscolhaToCharArray.length; i++) {
            char nome = ClasseEscolhaToCharArray[i];
            switch (nome) {
                case 'á', 'à', 'ã' -> {
                    nome = 'a';
                }
                case 'é', 'ê' -> {
                    nome = 'e';
                }
                case 'ó', 'ô' -> {
                    nome = 'o';
                }
                case 'í' -> {
                    nome = 'i';
                }
                case 'ú' -> {
                    nome = 'u';
                }
            }
            acento += nome;
        }

        /*
        ao ser executado, o programa deve pedir ao usiário alguns dados
        (nome do personagem; classe do mesmo; pontos de vida; nível)
        e a partir dessas informa estipular quais serão suas informações básicas
        (inventário; spellslots por nível; características de nível)
         */
        switch (acento) {
            case "mago":
                ClasseMago m = new ClasseMago();
                System.out.print("Certo. Agora que temos sua Classe definida, vamos para algumas perguntas importantes" + "\nQual o nome do seu personagem? ");
                m.setNome(sc.nextLine());
                System.out.print("Agora, por gentileza, nos informe o nível atual de " + m.getNome() + ". Considere entre 1 e 5: ");
                m.setNivel(sc2.nextInt());
                System.out.print("Estamos quase lá." + "\nDessa vez precisamos que nos informe qual é sua Classe de Armadura, " + m.getNome() + "\nNão esqueça de acrescentar os modificadores de acordo com a armadura que está usando." + "\nCaso não esteja utilizando nenhuma, considere 10 + seu modificador de destreza:  ");
                m.setClasseArmadura(sc2.nextInt());
                System.out.println(m.detalhesMago());
                m.inventario();
                m.gerarPo();
                m.castarMagia();
                break;
            case "feiticeiro":
                ClasseFeiticeiro f = new ClasseFeiticeiro();
                System.out.print("Certo. Agora que temos sua Classe definida, vamos para algumas perguntas importantes" + "\nQual o nome do seu personagem? ");
                f.setNome(sc.nextLine());
                System.out.print("Agora, por gentileza, nos informe o nível atual de " + f.getNome() + ". Considere entre 1 e 5: ");
                f.setNivel(sc2.nextInt());
                System.out.print("Estamos quase lá." + "\nDessa vez precisamos que nos informe qual é sua Classe de Armadura, " + f.getNome() + "\nNão esqueça de acrescentar os modificadores de acordo com a armadura que está usando." + "\nCaso não esteja utilizando nenhuma, considere 10 + seu modificador de destreza:  ");
                f.setClasseArmadura(sc2.nextInt());
                System.out.println(f.detalhesFeiticeiro());
                f.inventario();
                f.gerarPo();
                f.castarMagia();
                break;
            case "guerreiro":
                ClasseGuerreiro g = new ClasseGuerreiro();
                System.out.print("Certo. Agora que temos sua Classe definida, vamos para algumas perguntas importantes" + "\nQual o nome do seu personagem? ");
                g.setNome(sc.nextLine());
                System.out.print("Agora, por gentileza, nos informe o nível atual de " + g.getNome() + ". Considere entre 1 e 5: ");
                g.setNivel(sc2.nextInt());
                System.out.print("Estamos quase lá." + "\nDessa vez precisamos que nos informe qual é sua Classe de Armadura, " + g.getNome() + "\nNão esqueça de acrescentar os modificadores de acordo com a armadura que está usando." + "\nCaso não esteja utilizando nenhuma, considere 10 + seu modificador de destreza:  ");
                g.setClasseArmadura(sc2.nextInt());
                System.out.println(g.detalhesGuerreiro());
                g.inventario();
                g.gerarPo();
                break;
            case "barbaro":
                ClasseBarbaro b = new ClasseBarbaro();
                System.out.print("Certo. Agora que temos sua Classe definida, vamos para algumas perguntas importantes" + "\nQual o nome do seu personagem? ");
                b.setNome(sc.nextLine());
                System.out.print("Agora, por gentileza, nos informe o nível atual de " + b.getNome() + ". Considere entre 1 e 5: ");
                b.setNivel(sc2.nextInt());
                System.out.print("Estamos quase lá." + "\nDessa vez precisamos que nos informe qual é sua Classe de Armadura, " + b.getNome() + "\nNão esqueça de acrescentar os modificadores de acordo com a armadura que está usando." + "\nCaso não esteja utilizando nenhuma, considere 10 + seu modificador de destreza:  ");
                b.setClasseArmadura(sc2.nextInt());
                System.out.println(b.detalhesBarbaro());
                b.inventario();
                b.gerarPo();
                b.furia();
                break;
            case "clerigo":
                ClasseClerigo c = new ClasseClerigo();
                System.out.print("Certo. Agora que temos sua Classe definida, vamos para algumas perguntas importantes" + "\nQual o nome do seu personagem? ");
                c.setNome(sc.nextLine());
                System.out.print("Agora, por gentileza, nos informe o nível atual de " + c.getNome() + ". Considere entre 1 e 5: ");
                c.setNivel(sc2.nextInt());
                System.out.print("Estamos quase lá." + "\nDessa vez precisamos que nos informe qual é sua Classe de Armadura, " + c.getNome() + "\nNão esqueça de acrescentar os modificadores de acordo com a armadura que está usando." + "\nCaso não esteja utilizando nenhuma, considere 10 + seu modificador de destreza:  ");
                c.setClasseArmadura(sc2.nextInt());
                System.out.println(c.detalhesClerigo());
                c.inventario();
                c.gerarPo();
                c.conjurarSpell();
                break;
            case "paladino":
                ClassePaladino p = new ClassePaladino();
                System.out.print("Certo. Agora que temos sua Classe definida, vamos para algumas perguntas importantes" + "\nQual o nome do seu personagem? ");
                p.setNome(sc.nextLine());
                System.out.print("Agora, por gentileza, nos informe o nível atual de " + p.getNome() + ". Considere entre 1 e 5: ");
                p.setNivel(sc2.nextInt());
                System.out.print("Estamos quase lá." + "\nDessa vez precisamos que nos informe qual é sua Classe de Armadura, " + p.getNome() + "\nNão esqueça de acrescentar os modificadores de acordo com a armadura que está usando." + "\nCaso não esteja utilizando nenhuma, considere 10 + seu modificador de destreza:  ");
                p.setClasseArmadura(sc2.nextInt());
                System.out.println(p.detalhesPaladino());
                p.inventario();
                p.gerarPo();
                p.maosConsagradas();
                break;
        }
    }
}
