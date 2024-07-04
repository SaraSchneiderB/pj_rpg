package PJ_RPG;

import java.util.Random;

/**
 *
 * @author Sara
 */

public class ClasseClerigo extends Personagem {

    public void conjurarSpell() {
        System.out.println("\nToque seu alvo e conjure Inflingir ferimentos rolando 3d10 de dano e o veja se contorcer em dor");
    }

    public void inventario() {
        System.out.print("\nInventário:"
                + "\nMaça"
                + "\nCota de Malha"
                + "\nEspada curta"
                + "\nPacote de Sacerdote"
                + "\nEscudo"
                + "\nSimbolo Mágico\n");
    }

    /**
     *
     * @param nivelc puxa o valor atribuído no nível do personagem (int) - e o converte (string) quando necessário - para que possa ser utilizado nos comandos de pontos de vida, spellslots e
     * características de nível
     */
    @Override
    public void setNivel(int nivelc) {
        super.setNivel(nivelc);
        setSpellSlot(Integer.toString(nivelc));
        setCaracteristicaNivel(Integer.toString(nivelc));
        setPontosVida(nivelc);
    }

    /**
     *
     * @param nivels recebe a informação do nível do personagem e a partir dele estipula os pontos de vida
     */
    @Override
    public void setPontosVida(int nivels) {

        switch (nivels) {
            case 1 ->
                pontosVida = 5;
            case 2 ->
                pontosVida = 10 + 2;
            case 3 ->
                pontosVida = 15 + 3;
            case 4 ->
                pontosVida = 20 + 4;
            case 5 ->
                pontosVida = 25 + 5;
            default ->
                pontosVida = 0;
        }
    }

    /**
     * recebe a informação do nível do personagem e a partir dele estipula os espaços de magia
     *
     * @param spell
     */
    @Override
    public void setSpellSlot(String spell) {
        int spellS = Integer.parseInt(spell);

        switch (spellS) {
            case 1 ->
                spellSlot = "|2 (n.1)|";
            case 2 ->
                spellSlot = "|3 (n.1)|";
            case 3 ->
                spellSlot = "|4 (n.1)| |2 (n.2)|";
            case 4 ->
                spellSlot = "|4 (n.1)| |3 (n.2)|";
            case 5 ->
                spellSlot = "|4 (n.1)| |3 (n.2)| |2 (n.3)|";
            default ->
                spellSlot = "Escolha Inválida";
        }
    }

    /**
     *
     * @param carNivelc puxa o nível do personagem para identificar quais são suas características de classe por nível
     */
    @Override
    public void setCaracteristicaNivel(String carNivelc) {
        int nivelcl = Integer.parseInt(carNivelc);

        switch (nivelcl) {
            case 1 ->
                caracteristicaNivel = "\n|Conjuração, Domínio Divino(n.1)|";
            case 2 ->
                caracteristicaNivel = "\n|Conjuração, Domínio Divino(n.1)|,\n|Canalizar Divindade-1/descanso, Característica de Domínio Divino(n.2)|";
            case 3 ->
                caracteristicaNivel = "\n|Conjuração, Domínio Divino(n.1)|,\n|Canalizar Divindade-1/descanso, Característica de Domínio Divino(n.2)|\n|-(n.3)|";
            case 4 ->
                caracteristicaNivel = "\n|Conjuração, Domínio Divino(n.1)|\n|Canalizar Divindade-1/descanso, Característica de Domínio Divino(n.2)|"
                        + " \n|-(n.3)|\n|Incremento no Valor de Habilidade(n.4)|";
            case 5 ->
                caracteristicaNivel = "\n|Conjuração, Domínio Divino(n.1)|\n|Canalizar Divindade-1/descanso, Característica de Domínio Divino(n.2)|"
                        + " \n|-(n.3)|\n|Incremento no Valor de Habilidade(n.4)|\n|Destruir Mortos_Vivos-ND.1/2(n.5)|";
        }
    }

    public String detalhesClerigo() {
        return detalhesPersonagem() + "\n\nDessa vez, vamos seguir com os dados específicos da sua classe de Clérigo: \n> Você tem " + spellSlot + "SpellSlots" + "\n> Suas características de personagem de acordo com o nível atual são as seguintes:\n" + caracteristicaNivel + "\n> Seus pontos de vida atuais (PV) são: " + pontosVida;
    }
}
