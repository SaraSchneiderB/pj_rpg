package PJ_RPG;

import java.util.Random;

/**
 *
 * @author Sara
 */
public class ClasseMago extends Personagem {

    public void castarMagia() {
        System.out.println("\nAo identificar o alvo:\nAtaque com Misseis mágicos rolando 3d4+1 e sangre seu adversário");
    }

    public void inventario() {

        System.out.print("\nInventário:"
                + "\nGrimório"
                + "\nBolsa de componentes"
                + "\nPacote de estudioso\n");
    }

    /**
     *
     * @param nivel2 puxa o valor atribuído no nível do personagem (int) - e o
     * converte (string) quando necessário - para que possa ser utilizado nos
     * comandos de pontos de vida, spellslots e características de nível
     */
    @Override
    public void setNivel(int nivel2) {
        super.setNivel(nivel2);
        setSpellSlot(Integer.toString(nivel2));
        setCaracteristicaNivel(Integer.toString(nivel2));
        setPontosVida(nivel2);
    }

    /**
     *
     * @param nivels recebe a informação do nível do personagem e a partir dele
     * estipula os pontos de vida
     */
    @Override
    public void setPontosVida(int nivels) {

        switch (nivels) {
            case 1 ->
                pontosVida = 4;
            case 2 ->
                pontosVida = 8 + 2;
            case 3 ->
                pontosVida = 12 + 3;
            case 4 ->
                pontosVida = 16 + 4;
            case 5 ->
                pontosVida = 20 + 5;
            default ->
                pontosVida = 0;
        }
    }

    /**
     *
     * @param spellm recebe a informação do nível do personagem e a partir dele
     * estipula os espaços de magia
     */
    @Override
    public void setSpellSlot(String spellm) {
        int spellmg = Integer.parseInt(spellm);

        switch (spellmg) {
            case 1 ->
                spellSlot = "|2 (n.1)|";
            case 2 ->
                spellSlot = "|3 (n.1)|";
            case 3 ->
                spellSlot = "|4 (n.1)| |2 (n.2)|";
            case 4 ->
                spellSlot = "|4 (n.1)| |3 (n.2)|";
            case 5 ->
                spellSlot = "|4 (n.1)| |3 (n.2)| |2(n.3)|";
            default ->
                spellSlot = "Escolha inválida";
        }
    }

    /**
     *
     * @param carNivel puxa o nível do personagem para identificar quais são
     * suas características de classe por nível
     */
    @Override
    public void setCaracteristicaNivel(String carNivel) {
        int nivel = Integer.parseInt(carNivel);

        switch (nivel) {
            case 1 ->
                caracteristicaNivel = "\n|Conjuração, Recuperação Arcana(n.1)|";
            case 2 ->
                caracteristicaNivel = "\n|Conjuração, Recuperação Arcana(n.1)|,\n|Tradição Arcana(n.2)|";
            case 3 ->
                caracteristicaNivel = "\n|Conjuração, Recuperação Arcana(n.1)|\n|Tradição Arcana(n.2)|\n|-(n,3)|";
            case 4 ->
                caracteristicaNivel = "\n|Conjuração, Recuperação Arcana(n.1)|\n|Tradição Arcana(n.2)|"
                        + " \n|-(n.3)|\n|Incremento no Valor de Habilidade(n.4)|";
            case 5 ->
                caracteristicaNivel = "\n|Conjuração, Recuperação Arcana(n.1)|\n|Tradição Arcana(n.2)|"
                        + " \n|-(n.3)|\n|Incremento no Valor de Habilidade(n.4)|\n|-(n.5)|";
            default ->
                caracteristicaNivel = "Resultado inválido";
        }
    }

    public String detalhesMago() {
        return detalhesPersonagem() + "\n\nDessa vez, vamos seguir com os dados específicos da sua classe de Mago: \n> Você tem " + spellSlot + "SpellSlots" + "\n\n> Suas características de personagem de acordo com o nível atual são as seguintes:" + caracteristicaNivel + "\n\n> Você tem " + pontosVida + " pontos de vida atuais (PV)";
    }
}
