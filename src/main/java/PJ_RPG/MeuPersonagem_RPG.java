/*
Projeto consiste em criar uma ficha de personagem de RPG - D&D -
utilizando herança, setter e scanner - entre outros comandos - 
 */
package PJ_RPG;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sara
 */

public class MeuPersonagem_RPG {

    public static void main(String[] args) {
        Locale.setDefault(Locale.getDefault());
        Scanner sc = new Scanner(System.in, "UTF-8");
        Scanner sc2 = new Scanner(System.in, "UTF-8");

        System.out.print("Olá, seja bem vinde. Vamos começar a sua ficha de personagem \n"
                + "escolhendo com qual classe pretende jogar. \n"
                + "\nAs opções diponíveis são as seguintes: \n"
                + "MAGO\n"
                + "FEITICEIRO\n"
                + "GUERREIRO\n"
                + "BÁRBARO\n"
                + "CLÉRIGO\n"
                + "PALADINO\n"
                + "\n Digite a classe escolhida: ");

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
                System.out.print("\nCerto. Agora que temos sua Classe definida, vamos para algumas perguntas importantes" + "\nQual o nome do seu personagem? ");
                m.setNome(sc.nextLine());
                System.out.print("\nAgora, por gentileza, nos informe o nível atual de " + m.getNome() + ". Considere entre 1 e 5: ");
                m.setNivel(sc2.nextInt());
                System.out.print("\nVamos nos ater, nesse momento em seus atributos, por gentileza nos informe cada valor corretamente(Dados válidos do 8 ao 21)\nForça: ");
                m.setForca(sc.nextLine());
                System.out.print("Destreza: ");
                m.setDestreza(sc.nextLine());
                System.out.print("Constituição: ");
                m.setConstituicao(sc.nextLine());
                System.out.print("Inteligencia: ");
                m.setInteligencia(sc.nextLine());
                System.out.print("Sabedoria: ");
                m.setSabedoria(sc.nextLine());
                System.out.print("Carisma: ");
                m.setCarisma(sc.nextLine());
                System.out.print("\nEstamos quase lá.\n" + "\nDessa vez precisamos que nos informe qual é sua Classe de Armadura, " + m.getNome() + "\nNão esqueça de acrescentar os modificadores de acordo com a armadura que está usando." + "\nCaso não esteja utilizando nenhuma, considere 10 + seu modificador de destreza:  ");
                m.setClasseArmadura(sc2.nextInt());
                System.out.println(m.detalhesMago());
                m.inventario();
                m.gerarPo();
                m.castarMagia();
                break;
            case "feiticeiro":
                ClasseFeiticeiro f = new ClasseFeiticeiro();
                System.out.print("\nCerto. Agora que temos sua Classe definida, vamos para algumas perguntas importantes" + "\nQual o nome do seu personagem? ");
                f.setNome(sc.nextLine());
                System.out.print("Agora, por gentileza, nos informe o nível atual de " + f.getNome() + ". Considere entre 1 e 5: ");
                f.setNivel(sc2.nextInt());
                System.out.print("Vamos nos ater, nesse momento em seus atributos, por gentileza nos informe cada valor corretamente (Dados válidos do 8 ao 21)\nForça: ");
                f.setForca(sc.nextLine());
                System.out.print("Destreza: ");
                f.setDestreza(sc.nextLine());
                System.out.print("Constituição: ");
                f.setConstituicao(sc.nextLine());
                System.out.print("Inteligencia: ");
                f.setInteligencia(sc.nextLine());
                System.out.print("Sabedoria: ");
                f.setSabedoria(sc.nextLine());
                System.out.print("Carisma: ");
                f.setCarisma(sc.nextLine());
                System.out.print("\nEstamos quase lá." + "\nDessa vez precisamos que nos informe qual é sua Classe de Armadura, " + f.getNome() + "\nNão esqueça de acrescentar os modificadores de acordo com a armadura que está usando." + "\nCaso não esteja utilizando nenhuma, considere 10 + seu modificador de destreza:  ");
                f.setClasseArmadura(sc2.nextInt());
                System.out.println(f.detalhesFeiticeiro());
                f.inventario();
                f.gerarPo();
                f.castarMagia();
                break;
            case "guerreiro":
                ClasseGuerreiro g = new ClasseGuerreiro();
                System.out.print("\nCerto. Agora que temos sua Classe definida, vamos para algumas perguntas importantes" + "\nQual o nome do seu personagem? ");
                g.setNome(sc.nextLine());
                System.out.print("Agora, por gentileza, nos informe o nível atual de " + g.getNome() + ". Considere entre 1 e 5: ");
                g.setNivel(sc2.nextInt());
                System.out.print("Vamos nos ater, nesse momento em seus atributos, por gentileza nos informe cada valor corretamente (Dados válidos do 8 ao 21)\nForça: ");
                g.setForca(sc.nextLine());
                System.out.print("Destreza: ");
                g.setDestreza(sc.nextLine());
                System.out.print("Constituição: ");
                g.setConstituicao(sc.nextLine());
                System.out.print("Inteligencia: ");
                g.setInteligencia(sc.nextLine());
                System.out.print("Sabedoria: ");
                g.setSabedoria(sc.nextLine());
                System.out.print("Carisma: ");
                g.setCarisma(sc.nextLine());
                System.out.print("\nEstamos quase lá." + "\nDessa vez precisamos que nos informe qual é sua Classe de Armadura, " + g.getNome() + "\nNão esqueça de acrescentar os modificadores de acordo com a armadura que está usando." + "\nCaso não esteja utilizando nenhuma, considere 10 + seu modificador de destreza:  ");
                g.setClasseArmadura(sc2.nextInt());
                System.out.println(g.detalhesGuerreiro());
                g.inventario();
                g.gerarPo();
                break;
            case "barbaro":
                ClasseBarbaro b = new ClasseBarbaro();
                System.out.print("\nCerto. Agora que temos sua Classe definida, vamos para algumas perguntas importantes" + "\nQual o nome do seu personagem? ");
                b.setNome(sc.nextLine());
                System.out.print("Agora, por gentileza, nos informe o nível atual de " + b.getNome() + ". Considere entre 1 e 5: ");
                b.setNivel(sc2.nextInt());
                System.out.print("Vamos nos ater, nesse momento em seus atributos, por gentileza nos informe cada valor corretamente (Dados válidos do 8 ao 21)\nForça: ");
                b.setForca(sc.nextLine());
                System.out.print("Destreza: ");
                b.setDestreza(sc.nextLine());
                System.out.print("Constituição: ");
                b.setConstituicao(sc.nextLine());
                System.out.print("Inteligencia: ");
                b.setInteligencia(sc.nextLine());
                System.out.print("Sabedoria: ");
                b.setSabedoria(sc.nextLine());
                System.out.print("Carisma: ");
                b.setCarisma(sc.nextLine());
                System.out.print("\nEstamos quase lá." + "\nDessa vez precisamos que nos informe qual é sua Classe de Armadura, " + b.getNome() + "\nNão esqueça de acrescentar os modificadores de acordo com a armadura que está usando." + "\nCaso não esteja utilizando nenhuma, considere 10 + seu modificador de destreza:  ");
                b.setClasseArmadura(sc2.nextInt());
                System.out.println(b.detalhesBarbaro());
                b.inventario();
                b.gerarPo();
                b.furia();
                break;
            case "clerigo":
                ClasseClerigo c = new ClasseClerigo();
                System.out.print("\nCerto. Agora que temos sua Classe definida, vamos para algumas perguntas importantes" + "\nQual o nome do seu personagem? ");
                c.setNome(sc.nextLine());
                System.out.print("Agora, por gentileza, nos informe o nível atual de " + c.getNome() + ". Considere entre 1 e 5: ");
                c.setNivel(sc2.nextInt());
                System.out.print("Vamos nos ater, nesse momento em seus atributos, por gentileza nos informe cada valor corretamente (Dados válidos do 8 ao 21)\nForça:  ");
                c.setForca(sc.nextLine());
                System.out.print("Destreza: ");
                c.setDestreza(sc.nextLine());
                System.out.print("Constituição: ");
                c.setConstituicao(sc.nextLine());
                System.out.print("Inteligencia: ");
                c.setInteligencia(sc.nextLine());
                System.out.print("Sabedoria: ");
                c.setSabedoria(sc.nextLine());
                System.out.print("Carisma: ");
                c.setCarisma(sc.nextLine());
                System.out.print("\nEstamos quase lá." + "\nDessa vez precisamos que nos informe qual é sua Classe de Armadura, " + c.getNome() + "\nNão esqueça de acrescentar os modificadores de acordo com a armadura que está usando." + "\nCaso não esteja utilizando nenhuma, considere 10 + seu modificador de destreza: ");
                c.setClasseArmadura(sc2.nextInt());
                System.out.println(c.detalhesClerigo());
                c.inventario();
                c.gerarPo();
                c.conjurarSpell();
                break;
            case "paladino":
                ClassePaladino p = new ClassePaladino();
                System.out.print("\nCerto. Agora que temos sua Classe definida, vamos para algumas perguntas importantes" + "\nQual o nome do seu personagem? ");
                p.setNome(sc.nextLine());
                System.out.print("Agora, por gentileza, nos informe o nível atual de " + p.getNome() + ". Considere entre 1 e 5: ");
                p.setNivel(sc2.nextInt());
                System.out.print("Vamos nos ater, nesse momento em seus atributos, por gentileza nos informe cada valor corretamente (Dados válidos do 8 ao 21)\nForça: ");
                p.setForca(sc.nextLine());
                System.out.print("Destreza: ");
                p.setDestreza(sc.nextLine());
                System.out.print("Constituição: ");
                p.setConstituicao(sc.nextLine());
                System.out.print("Inteligencia: ");
                p.setInteligencia(sc.nextLine());
                System.out.print("Sabedoria: ");
                p.setSabedoria(sc.nextLine());
                System.out.print("Carisma: ");
                p.setCarisma(sc.nextLine());
                System.out.print("\nEstamos quase lá." + "\nDessa vez precisamos que nos informe qual é sua Classe de Armadura, " + p.getNome() + "\nNão esqueça de acrescentar os modificadores de acordo com a armadura que está usando." + "\nCaso não esteja utilizando nenhuma, considere 10 + seu modificador de destreza:  ");
                p.setClasseArmadura(sc2.nextInt());
                System.out.println(p.detalhesPaladino());
                p.inventario();
                p.gerarPo();
                p.maosConsagradas();
                break;
        }
    }
}
