package PJ_RPG;

import java.util.Scanner;

public class MeuPersonagem_RPG {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("ESCOLHA SEU PERSONAGEM:\n"
                + "\n"
                + "MAGO\n"
                + "FEITICEIRO\n"
                + "GUERREIRO\n"
                + "BÁRBARO\n"
                + "CLÉRIGO\n"
                + "PALADINO");

        String ClasseEscolha = sc.nextLine();
        char[] ClasseEscolhaToCharArray = ClasseEscolha.toLowerCase().toCharArray();
        String acento = "";
        for (int i = 0; i < ClasseEscolhaToCharArray.length; i++){
            char nome = ClasseEscolhaToCharArray[i];
            switch (nome){
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

        switch (acento) {
            case "mago":
                ClasseMago m = new ClasseMago();
                System.out.print("\nQual o nome do seu personagem? ");
                m.setNome(sc.nextLine());
                System.out.print("Qual seu nivel? (1 a 5)");
                m.setNivel(sc2.nextInt());
                System.out.print("Agora acrescente seus pontos de vida: ");
                m.setPontosVida(sc2.nextInt());
                System.out.print(m.detalhesMago());
                m.inventario();
                m.castarMagia();
                break;
            case "feiticeiro":
                ClasseFeiticeiro f = new ClasseFeiticeiro();
                System.out.print("\nQual o nome do seu personagem? ");
                f.setNome(sc.nextLine());
                System.out.print("Qual seu nível?(1 a 5) ");
                f.setNivel(sc2.nextInt());
                System.out.print("Agora acrescente seus pontos de vida: ");
                f.setPontosVida(sc2.nextInt());
                System.out.print(f.detalhesFeiticeiro());
                f.inventario();
                f.castarMagia();
                break;
            case "guerreiro":
                ClasseGuerreiro g = new ClasseGuerreiro();
                System.out.print("\nQual o nome do seu personagem? ");
                g.setNome(sc.nextLine());
                System.out.print("Qual seu nível?(1 a 5) ");
                g.setNivel(sc2.nextInt());
                System.out.print("Agora acrescente seus pontos de vida: ");
                g.setPontosVida(sc2.nextInt());
                System.out.print(g.detalhesGuerreiro());
                g.inventario();
                break;
            case "barbaro":
                ClasseBarbaro b = new ClasseBarbaro();
                System.out.println("\nQual o nome do seu personagem? ");
                b.setNome(sc.nextLine());
                System.out.print("Qual seu nível?(1 a 5) ");
                b.setNivel(sc2.nextInt());
                System.out.print("Agora acrescente seus pontos de vida: ");
                b.setPontosVida(sc2.nextInt());
                System.out.print(b.detalhesBarbaro());
                b.inventario();
                b.furia();
                break;
            case "clerigo":
                ClasseClerigo c = new ClasseClerigo();
                System.out.print("\nQual o nome do seu personagem? ");
                c.setNome(sc.nextLine());
                System.out.print("Qual seu nível?(1 a 5) ");
                c.setNivel(sc2.nextInt());
                c.setDominioDivino("Domínio da Tempestade");
                System.out.print("Agora acrescente seus pontos de vida: ");
                c.setPontosVida(sc2.nextInt());
                System.out.print(c.detalhesClerigo());
                c.inventario();
                c.conjurarSpell();
                break;
            case "paladino":
                ClassePaladino p = new ClassePaladino();
                System.out.println("\nQual o nome do seu personagem? ");
                p.setNome(sc.nextLine());
                System.out.print("Qual seu nível?(1 a 5) ");
                p.setNivel(sc2.nextInt());
                System.out.print("Agora acrescente seus pontos de vida: ");
                p.setPontosVida(sc2.nextInt());
                System.out.println(p.detalhesPaladino());
                p.inventario();
                p.maosConsagradas();
                break;
        }

    }
}
