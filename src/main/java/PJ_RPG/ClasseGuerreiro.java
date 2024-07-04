package PJ_RPG;

import java.util.Random;

/**
 *
 * @author Sara
 */

public class ClasseGuerreiro extends Personagem {

    public void ataque() {
        System.out.println("\nAtaque com sua espada longa e corte seu adversário");
    }

    public void inventario() {
        System.out.print("\n\nInventário:"
                + "\nCota de Malha"
                + "\nClava grande"
                + "\nPacote de explorador"
                + "\nBesta Leve\n");
    }

    /**
     *
     * @param nivelg puxa o valor atribuído no nível do personagem (int) - e o converte (string) quando necessário - para que possa ser utilizado nos comandos de pontos de vida, spellslots e
     * características de nível
     */
    @Override
    public void setNivel(int nivelg) {
        super.setNivel(nivelg);
        setCaracteristicaNivel(Integer.toString(nivelg));
        setPontosVida(nivelg);
    }

    /**
     *
     * @param nivels recebe a informação do nível do personagem e a partir dele estipula os pontos de vida
     */
    @Override
    public void setPontosVida(int nivels) {

        switch (nivels) {
            case 1 ->
                pontosVida = 6;
            case 2 ->
                pontosVida = 12 + 2;
            case 3 ->
                pontosVida = 18 + 3;
            case 4 ->
                pontosVida = 24 + 4;
            case 5 ->
                pontosVida = 30 + 5;
            default ->
                pontosVida = 0;
        }
    }

    /**
     *
     * @param carNivelg puxa o nível do personagem para identificar quais são suas características de classe por nível
     */
    @Override
    public void setCaracteristicaNivel(String carNivelg) {
        int nivelg = Integer.parseInt(carNivelg);

        switch (nivelg) {
            case 1 ->
                caracteristicaNivel = "\n|Estilo de Luta, Retomar o Fôlego(n.1)|";
            case 2 ->
                caracteristicaNivel = "\n|Estilo de Luta, Retomar o Fôlego(n.1)|,\n|Surto de Ação - um uso(n.2)|";
            case 3 ->
                caracteristicaNivel = "\n|Estilo de Luta, Retomar o Fôlego(n.1)|\n|Surto de Ação - um uso(n.2)|\n|Arquétipo Marcial(n.3)|";
            case 4 ->
                caracteristicaNivel = "\n|Estilo de Luta, Retomar o Fôlego(n.1)|\n|Surto de Ação - um uso(n.2)|"
                        + " \n|Arquétipo Marcial(n.3)|\n|Incremento no Valor de Habilidade(n.4)|";
            case 5 ->
                caracteristicaNivel = "\n|Estilo de Luta, Retomar o Fôlego(n.1)|\n|Surto de Ação - um uso(n.2)|"
                        + " \n|Arquétipo Marcial(n.3)|\n|Incremento no Valor de Habilidade(n.4)|\n|Ataque Extra(n.5)|";
        }
    }

    public String detalhesGuerreiro() {
        return detalhesPersonagem() + "\n\nDessa vez, vamos seguir com os dados específicos da sua classe de Guerreiro: \n> Suas características de personagem de acordo com o nível atual são as seguintes:\n" + caracteristicaNivel + "\n> Seus pontos de vida atuais (PV) são: " + pontosVida;
    }
}
