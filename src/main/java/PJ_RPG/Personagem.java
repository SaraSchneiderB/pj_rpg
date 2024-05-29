
package PJ_RPG;

public abstract class Personagem {
    private String nome;
    private int nivel;
    protected String caracteristicaNivel;
    private int classeArmadura;
    private int pontosVida;
    protected String spellSlot;

    //getters
    public String getNome() {
        return nome;
    }
    public int getnivel(){
        return nivel;
    }
    public String getCaracteristicaNivel(){
        return caracteristicaNivel;
    }
    public int getClasseArmadura(){
        return classeArmadura;
    }
    public int getPontosVida(){
        return pontosVida;
    }
    public String getSpellSlot(){
        return spellSlot;
    }
    
    //setters
    public void setNome(String n) {
        this.nome = n;
    }

    public void setNivel(int nv){
        this.nivel = nv;
    }
    public void setCaracteristicaNivel(String cni){
        this.caracteristicaNivel = cni;
}
        public void setClasseArmadura(int ca){
        this.classeArmadura = ca;
}
    public void setPontosVida(int pv){
        this.pontosVida = pv;
    }
    public void setSpellSlot(String sp){
        this.spellSlot = sp;
    }
   
    public String detalhesPersonagem() {
        return "\nInfo geral do seu personagem: " + "\nNome: " + nome + "\nNível do personagem: " + nivel 
                + "\nCA: " + classeArmadura + "\nPV: " + pontosVida;
    }

    
}