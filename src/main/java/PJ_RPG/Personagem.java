package PJ_RPG;

import java.util.Random;

/**
 *
 * @author Sara
 */

public abstract class Personagem {

    private String nome;
    protected int nivel;
    protected String caracteristicaNivel;
    private int classeArmadura;
    protected int pontosVida;
    protected String spellSlot;

    public int gerarPo() {
        Random gerador = new Random();
        int numRandom = gerador.nextInt(8) + 11;
        System.out.print("\nVocê tem " + numRandom + "PO (Peças de Ouro)");
        return numRandom;
    }

    
    //getters
    public String getNome() {
        return nome;
    } 

    /*
    public int getnivel() {
        return nivel;
    }
     
    public String getCaracteristicaNivel() {
        return caracteristicaNivel;
    }

    public int getClasseArmadura() {
        return classeArmadura;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public String getSpellSlot() {
        return spellSlot;
    }
     */
    //setters
    public void setNome(String n) {
        this.nome = n;
    }

    public void setNivel(int nv) {
        this.nivel = nv;
    }

    public void setCaracteristicaNivel(String cni) {
        this.caracteristicaNivel = cni;
    }

    public void setClasseArmadura(int ca) {
        this.classeArmadura = ca;
    }

    public void setPontosVida(int pvs) {
        this.pontosVida = pvs;
    }

    public void setSpellSlot(String sp) {
        this.spellSlot = sp;
    }

    public String detalhesPersonagem() {
        return "\nOk, Agora temos o básico da sua Ficha de Personagem. Vamos para as informações: " + "\n\nNome do Aventureiro: " + nome + "\nNível atual: " + nivel
                + "\nSua Classe de Armadura (CA): " + classeArmadura;
    }
}
