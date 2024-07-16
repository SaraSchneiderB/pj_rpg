package PJ_RPG;

import java.util.Random;

/**
 *
 * @author Sara
 */
public abstract class Personagem {

    protected String nome;
    protected int nivel;
    protected String caracteristicaNivel;
    private int classeArmadura = 10;
    protected int pontosVida;
    protected String spellSlot;
    private String forca;
    private String destreza;
    private String constituicao;
    private String inteligencia;
    private String sabedoria;
    private String carisma;

    /**
     *
     * @return msg recebe o valor de força estipulado pelo usuário e retorna seu
     * modificador de acordo
     */
    public String gerarModF() {
        getForca();
        String msg = "";
        switch (forca) {
            case "8", "9" ->
                msg = "\nModificador -1";
            case "10", "11" ->
                msg = "\nModificador +0";
            case "12", "13" ->
                msg = "\nModificador +1";
            case "14", "15" ->
                msg = "\nModificador +2";
            case "16", "17" ->
                msg = "\nModificador +3";
            case "18", "19" ->
                msg = "\nModificador +4";
            case "20", "21" ->
                msg = "\nModificador +5";
        }
        return msg;
    }

    /**
     *
     * @return msg recebe o valor de destreza estipulado pelo usuário e retorna
     * seu modificador de acordo
     */
    public String gerarModD() {
        getDestreza();
        String msg = "";
        switch (destreza) {
            case "8", "9" ->
                msg = "\nModificador -1";
            case "10", "11" ->
                msg = "\nModificador +0";
            case "12", "13" ->
                msg = "\nModificador +1";
            case "14", "15" ->
                msg = "\nModificador +2";
            case "16", "17" ->
                msg = "\nModificador +3";
            case "18", "19" ->
                msg = "\nModificador +4";
            case "20", "21" ->
                msg = "\nModificador +5";
        }
        return msg;
    }

    /**
     *
     * @return msg recebe o valor de constituição estipulado pelo usuário e
     * retorna seu modificador de acordo
     */
    public String gerarModC() {
        getConstituicao();
        String msg = "";
        switch (constituicao) {
            case "8", "9" ->
                msg = "\nModificador -1";
            case "10", "11" ->
                msg = "\nModificador +0";
            case "12", "13" ->
                msg = "\nModificador +1";
            case "14", "15" ->
                msg = "\nModificador +2";
            case "16", "17" ->
                msg = "\nModificador +3";
            case "18", "19" ->
                msg = "\nModificador +4";
            case "20", "21" ->
                msg = "\nModificador +5";
        }
        return msg;
    }

    /**
     *
     * @return msg recebe o valor de inteligência estipulado pelo usuário e
     * retorna seu modificador de acordo
     */
    public String gerarModI() {
        getInteligencia();
        String msg = "";
        switch (inteligencia) {
            case "8", "9" ->
                msg = "\nModificador -1";
            case "10", "11" ->
                msg = "\nModificador +0";
            case "12", "13" ->
                msg = "\nModificador +1";
            case "14", "15" ->
                msg = "\nModificador +2";
            case "16", "17" ->
                msg = "\nModificador +3";
            case "18", "19" ->
                msg = "\nModificador +4";
            case "20", "21" ->
                msg = "\nModificador +5";
        }
        return msg;
    }

    /**
     *
     * @return msg recebe o valor de sabedoria estipulado pelo usuário e retorna
     * seu modificador de acordo
     */
    public String gerarModS() {
        getSabedoria();
        String msg = "";
        switch (sabedoria) {
            case "8", "9" ->
                msg = "\nModificador -1";
            case "10", "11" ->
                msg = "\nModificador +0";
            case "12", "13" ->
                msg = "\nModificador +1";
            case "14", "15" ->
                msg = "\nModificador +2";
            case "16", "17" ->
                msg = "\nModificador +3";
            case "18", "19" ->
                msg = "\nModificador +4";
            case "20", "21" ->
                msg = "\nModificador +5";
        }
        return msg;
    }

    /**
     *
     * @return msg recebe o valor de carisma estipulado pelo usuário e retorna
     * seu modificador de acordo
     */
    public String gerarModCa() {
        getCarisma();
        String msg = "";
        switch (carisma) {
            case "8", "9" ->
                msg = "\nModificador -1";
            case "10", "11" ->
                msg = "\nModificador +0";
            case "12", "13" ->
                msg = "\nModificador +1";
            case "14", "15" ->
                msg = "\nModificador +2";
            case "16", "17" ->
                msg = "\nModificador +3";
            case "18", "19" ->
                msg = "\nModificador +4";
            case "20", "21" ->
                msg = "\nModificador +5";
        }
        return msg;
    }

    /**
     *
     * @return numRandom gera um valor aleatório de peças de ouro
     */
    public int gerarPo() {
        Random gerador = new Random();
        int numRandom = gerador.nextInt(8) + 11;
        System.out.println("\nVocê tem " + numRandom + "PO (Peças de Ouro)");
        return numRandom;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public String getForca() {
        return forca;
    }

    public String getDestreza() {
        return destreza;
    }

    public String getConstituicao() {
        return constituicao;
    }

    public String getInteligencia() {
        return inteligencia;
    }

    public String getSabedoria() {
        return sabedoria;
    }

    public String getCarisma() {
        return carisma;
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

    public void setForca(String forca) {
        this.forca = forca;
    }

    public void setDestreza(String destreza) {
        this.destreza = destreza;
    }

    public void setConstituicao(String constituicao) {
        this.constituicao = constituicao;
    }

    public void setInteligencia(String inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void setSabedoria(String sabedoria) {
        this.sabedoria = sabedoria;
    }

    public void setCarisma(String carisma) {
        this.carisma = carisma;
    }

    public String detalhesPersonagem() {
        return "\nOk, Agora temos o básico da sua Ficha de Personagem. Vamos para as informações: " + "\n\nNome do Aventureiro: " + nome + "\nNível atual: " + nivel
                + "\nSua Classe de Armadura (CA): " + classeArmadura + "\n\nVejamos seus atributos: \nForça: " + forca + " " + gerarModF() + "\nDestreza: " + destreza + " " + gerarModD() + "\nConstituicao: "
                + constituicao + " " + gerarModC() + "\nInteligencia: " + inteligencia + " " + gerarModI() + "\nSabedoria: " + sabedoria + " " + gerarModS() + "\nCarisma: " + carisma + " " + gerarModCa();
    }
}
