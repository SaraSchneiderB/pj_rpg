package PJ_RPG;

import java.util.Random;

/**
 *
 * @author Sara
 */

public class ClassePaladino extends Personagem {

    public void maosConsagradas() {
        System.out.println("\nCure um companheiro com o valor do seu nível x 5 e siga com seu machado de batalha"
                + " contra o inimigo causando 1d8+mod.força e destrua seu alvo.");
    }

    public void inventario() {
        System.out.print("\nInventário:"
                + "\nMachado de batalha"
                + "\nMachadinha"
                + "\nPacote de explorador"
                + "\nCota de Malha"
                + "\nSímbolo mágico\n");
    }

    /**
     *
     * @param nivelp puxa o valor atribuído no nível do personagem (int) - e o converte (string) quando necessário - para que possa ser utilizado nos comandos de pontos de vida, spellslots e
     * características de nível
     */
    @Override
    public void setNivel(int nivelp) {
        super.setNivel(nivelp);
        setSpellSlot(Integer.toString(nivelp));
        setCaracteristicaNivel(Integer.toString(nivelp));
        setPontosVida(nivelp);
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
     * @param spellp recebe a informação do nível do personagem e a partir dele estipula os espaços de magia
     */
    @Override
    public void setSpellSlot(String spellp) {
        int spellpa = Integer.parseInt(spellp);
        switch (spellpa) {
            case 1 ->
                spellSlot = "|0 (n.1)|";
            case 2 ->
                spellSlot = "|2 (n.1)|";
            case 3 ->
                spellSlot = "|3 (n.1)|";
            case 4 ->
                spellSlot = "|3 (n.1)|";
            case 5 ->
                spellSlot = "|4 (n.1)| |2 (n.2)|";
            default ->
                spellSlot = "Escolha Inválida";
        }
    }

    /**
     *
     * @param carNivelp puxa o nível do personagem para identificar quais são suas características de classe por nível
     */
    @Override
    public void setCaracteristicaNivel(String carNivelp) {
        int nivelpa = Integer.parseInt(carNivelp);

        switch (nivelpa) {
            case 1 ->
                caracteristicaNivel = "\n|Sentido Divino, Cura pelas Mãos(n.1)|";
            case 2 ->
                caracteristicaNivel = "\n|Sentido Divino, Cura pelas Mãos(n.1)|\n|Estilo de Luta, Conjuração, Destruíção Divina(n.2)|";
            case 3 ->
                caracteristicaNivel = "\n|Sentido Divino, Cura pelas Mãos(n.1)|\n|Estilo de Luta, Conjuração, Destruição Divina(n.2)|\n|Saúde Divina, Juramento Sagrado(n.3)|";
            case 4 ->
                caracteristicaNivel = "\n|Sentido Divino, Cura pelas Mãos(n.1)|\n|Estilo de Luta, Conjuração, Destruição Divina(n.2)|"
                        + " \n|Saúde Divina, Juramento Sagrado(n.3)|\n|Incremento no Valor de Habilidade(n.4)|";
            case 5 ->
                caracteristicaNivel = "\n|Sentido Divino, Cura pelas Mãos(n.1)|\n|Estilo de Luta, Conjuração, Destruição Divina(n.2)|"
                        + " \n|Saúde Divina(n.3)|\n|Incremento no Valor de Habilidade(n.4)|\n|Ataque Extra(n.5)|";
        }
    }

    public String detalhesPaladino() {
        return detalhesPersonagem() + "\n\nDessa vez, vamos seguir com os dados específicos da sua classe de Paladino: \n> Você tem " + spellSlot + "SpellSlots" + "\n> Suas características de personagem de acordo com o nível atual são as seguintes:\n" + caracteristicaNivel + "\n> Seus pontos de vida atuais (PV) são: " + pontosVida;
    }
}
