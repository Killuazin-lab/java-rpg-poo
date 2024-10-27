package Game.ClassCharacters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Game.Items.Item;
import Game.Skills.Habilidade;
import Game.Skills.HabilidadesEspecificas;

public class Personagens extends Criatura{
    protected int mana;
    protected int regenVida;
    protected int regenMana;
    protected int velocidade; // variavel que decide a ordem de ataque
    private int dinheiro;  // Atributo para o dinheiro do personagem
    private int nivel;
    private int experiencia;  // XP atual
    private ArrayList<Habilidade> habilidades;  // Lista de habilidades desbloqueadas
    protected ArrayList<Item> itensColetados;
    private Item itemEquipado;
    protected String classe;
    public boolean morreu;

    public Personagens(String nome, int vida, int mana, int ataque, int defesa, int regenVida,
                       int regenMana, int velocidade, int ataqueHabilidadeEspecial, String classe) {
        super(nome, regenVida, ataque, defesa, ataqueHabilidadeEspecial);
        this.mana = mana;
        this.regenVida = regenVida;
        this.regenMana = regenMana;
        this.velocidade = velocidade;
        this.nivel = 1;
        this.experiencia = 0;
        this.habilidades = new ArrayList<Habilidade>();
        this.itensColetados = new ArrayList<Item>();
        this.itemEquipado = null;
        this.classe = classe;
        this.morreu = false;
    }

    public void ganharExperiencia(int experiencia){
        this.experiencia += experiencia;
        subirNivel();
    }

    public void subirNivel(){
        this.nivel = this.experiencia/100;
        if(this.nivel >= 50){
            this.nivel = 50;
        } 
        System.out.println("Parabéns! Subiu para o nível " + this.nivel);
        desbloquearHabilidade();
    }

    public void desbloquearHabilidade(){
        Map<Integer, Habilidade> habilidadesClasseDesbloqueadas = HabilidadesEspecificas.getHabilidadePorClasse(this.classe);
        for(Integer nivelHabilidade : habilidadesClasseDesbloqueadas.keySet()){
            if(this.nivel >= nivelHabilidade){
                this.habilidades.add(habilidadesClasseDesbloqueadas.get(nivelHabilidade));
            }
        }
    }

    public int usarHabilidade(int indiceHabilidade) {
        if (indiceHabilidade < this.habilidades.size()) {
            Habilidade habilidade = this.habilidades.get(indiceHabilidade);
            if (mana >= habilidade.getCustoMana()) {
                int danoTotal = this.ataque + habilidade.getDano();
                System.out.println(this.nome + " usou " + habilidade.getNome() + " e causou " + danoTotal + " de dano!");
                mana -= habilidade.getCustoMana();
                return danoTotal;
            } else {
                System.out.println("Mana insuficiente para usar " + habilidade.getNome() + "\n");
            }
        } else {
            System.out.println("Habilidade inválida.\n");
        }
        return 0;
    }

    public void passarTurno() {
        for (Habilidade habilidade : habilidades) {
            habilidade.reduzirRecarga();
        }
    }

    public void mostrarHabilidades() {
        if (habilidades.isEmpty()) {
            System.out.println(getNome() + " ainda não tem habilidades desbloqueadas.\n");
        } else {
            System.out.println(getNome() + " possui as seguintes habilidades:\n");
            for (Habilidade habilidade : habilidades) {
                System.out.println(habilidade.toString() + "\n");
            }
        }
    }

    public void coletarItens(Item item){
        this.itensColetados.add(item);
        System.out.println("\n" + item.getNome() + " coletado!\n");
    }

    public void equiparItem(Item item) {
        super.ataque += item.getAumentoAtaque() + item.getDebuf();
        super.defesa += item.getAumentoDefesa() + item.getDebuf();
        super.vida += item.getAumentoVida() + item.getDebuf();
        this.mana += item.getAumentoMana() + item.getDebuf();
        this.velocidade += item.getAumentoVelocidade() + item.getDebuf();
        System.out.println("\n" + item.getNome() + " equipado!\n");
    }

    public void desequiparItem(Item item) {
        super.ataque -= (item.getAumentoAtaque() + item.getDebuf());
        this.defesa -= (item.getAumentoDefesa() + item.getDebuf());
        this.vida -= (item.getAumentoVida() + item.getDebuf());
        this.mana -= (item.getAumentoMana() + item.getDebuf());
        this.velocidade -= (item.getAumentoVelocidade() + item.getDebuf());
        this.itemEquipado = null;
        System.out.println("\n" + item.getNome() + " desequipado!\n");
    }

    // Métodos de manipulação de dinheiro
    public void ganharDinheiro(int quantidade) {
        this.dinheiro += quantidade;
        System.out.println(getNome() + " ganhou " + quantidade + " moedas.");
    }

    public boolean gastarDinheiro(int quantidade) {
        if (this.dinheiro >= quantidade) {
            this.dinheiro -= quantidade;
            System.out.println(getNome() + " gastou " + quantidade + " moedas.");
            return true;
        } else {
            System.out.println(getNome() + " não tem dinheiro suficiente!");
            return false;
        }
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(int dinheiro){
        this.dinheiro = dinheiro;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getRegenVida() {
        return regenVida;
    }
    
    public int getRegenMana() {
        return regenMana;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public ArrayList<Item> getItensColetados() {
      return itensColetados;
    }

    public Item getItemEquipado() {
      return itemEquipado;
    }

    public void setItemEquipado(Item itemEquipado) {
      this.itemEquipado = itemEquipado;
    }

    public String getClasse(){
        return this.classe;
    }

    public ArrayList<Habilidade> getHabilidade(){
        return this.habilidades;
    }

     @Override
        public String toString() {
            return "Nome: " + getNome() + "\n" +
                    "Vida: " + getVida() + "\n" +
                    "Mana: " + mana + "\n" +
                    "Ataque: " + getAtaque() + "\n" +
                    "Defesa: " + getDefesa() + "\n" +
                    "Regeneração de Vida: " + regenVida + "\n" +
                    "Regeneração de Mana: " + regenMana + "\n" +
                    "Velocidade: " + velocidade +
                    "Nível: " + nivel + "\n";          
        }
}
