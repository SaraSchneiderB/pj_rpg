package PJ_RPG;

import java.util.Random;

/**
 *
 * @author Sara
 */

public class ClasseBarbaro extends Personagem {

    private String resistencia = "Força e Constituição\n";

    public void furia() {
        System.out.println("\nEntre em fúria e arranque as cabeças inimigas com as próprias mãos!");
    }

    public void inventario() {
        System.out.print("\nInventário:"
                + "\nMachado grande"
                + "\nEspada curta"
                + "\nPacote de explorador"
                + "\n4 azagaias\n");
    }

    /**
     *
     * @param nivelb puxa o valor atribuído no nível do personagem (int) - e o converte (string) quando necessário - para que possa ser utilizado nos comandos de pontos de vida, spellslots e
     * características de nível
     */
    @Override
    public void setNivel(int nivelb) {
        super.setNivel(nivelb);
        setCaracteristicaNivel(Integer.toString(nivelb));
        setPontosVida(nivelb);
    }

    /**
     *
     * @param nivels recebe a informação do nível do personagem e a partir dele estipula os pontos de vida
     */
    @Override
    public void setPontosVida(int nivels) {

        switch (nivels) {
            case 1 ->
                pontosVida = 7;
            case 2 ->
                pontosVida = 14 + 2;
            case 3 ->
                pontosVida = 21 + 3;
            case 4 ->
                pontosVida = 28 + 4;
            case 5 ->
                pontosVida = 35 + 5;
            default ->
                pontosVida = 0;
        }
    }

    /**
     *
     * @param carNivelb puxa o nível do personagem para identificar quais são suas características de classe por nível
     */
    @Override
    public void setCaracteristicaNivel(String carNivelb) {
        int nivelb = Integer.parseInt(carNivelb);

        switch (nivelb) {
            case 1 ->
                caracteristicaNivel = "\n|Fúria, Defesa sem Armadura(n.1)|";
            case 2 ->
                caracteristicaNivel = "\n|Fúria, Defesa sem Armadura(n.1)|,\n|Ataque Descuidado, Sentido de Perigo(n.2)|";
            case 3 ->
                caracteristicaNivel = "\n|Fúria, Defesa sem Armadura(n.1)|\n|Ataque Descuidado, Sentido de Perigo(n.2)|\n|Caminho Primitivo(n.3)|";
            case 4 ->
                caracteristicaNivel = "\n|Fúria, Defesa sem Armadura(n.1)|\n|Ataque Descuidado(n.2)|"
                        + " \n|Caminho Primitivo(n.3)|\n|Incremento no Valor de Habilidade(n.4)|";
            case 5 ->
                caracteristicaNivel = "\n|Fúria, Defesa sem Armadura(n.1)|\n|Ataque Descuidado, Sentido de Perigo(n.2)|"
                        + " \n|Caminho Primitivo(n.3)|\n|Incremento no Valor de Habilidade(n.4)|\n|Ataque Extra, Movimento Rápido(n.5)|";
        }
    }

    public String getResistencia() {
        return resistencia;
    }
    /*
    public void setResistencia(String re) {
        this.resistencia = re;
    }
    */
    public String detalhesBarbaro() {
        return detalhesPersonagem() + "\n\nDessa vez, vamos seguir com os dados específicos da sua classe de Bárbaro:" + "\n>Sua resistência consiste em: " + resistencia + "\n> Suas características de personagem de acordo com o nível atual são as seguintes:\n" + caracteristicaNivel + "\n> Seus pontos de vida atuais (PV) são: " + pontosVida;
    }
}
