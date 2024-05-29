package PJ_RPG;

public class ClasseMago extends Personagem {

    public void castarMagia() {
        System.out.println("\nAo identificar o alvo:\nAtaque com Misseis mágicos rolando 3d4+1 e sangre seu adversário");
    }

    public void inventario() {
        System.out.print("\n\nInventário:"
                + "\nGrimório"
                + "\nBolsa de componentes"
                + "\nPacote de estudioso\n");
    }

    @Override
    public void setNivel(int nivel2) {
        super.setNivel(nivel2);
        setSpellSlot(Integer.toString(nivel2));
        setCaracteristicaNivel(Integer.toString(nivel2));
    }

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

    @Override
    public void setCaracteristicaNivel(String carNivel) {
        int nivel = Integer.parseInt(carNivel);

        switch (nivel) {
            case 1 ->
                caracteristicaNivel = "\n|Conjuração, Recuperação Arcana|";
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
        return detalhesPersonagem() + "\n\nDados sobre a Classe Mago \nSpellSlot: " + spellSlot + "\nCaracterísticas de Nível: " + caracteristicaNivel;
    }

}
