package Game.ClassCharacters;

import java.util.ArrayList;

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
    private int experienciaProximoNivel;
    private ArrayList<Habilidade> habilidades;  // Lista de habilidades desbloqueadas
    protected ArrayList<Item> itensEquipados;

    public Personagens(String nome, int vida, int mana, int ataque, int defesa, int regenVida,
                       int regenMana, int velocidade, int ataqueHabilidadeEspecial) {
        super(nome, regenVida, ataque, defesa, ataqueHabilidadeEspecial);
        this.mana = mana;
        this.regenVida = regenVida;
        this.regenMana = regenMana;
        this.velocidade = velocidade;
        this.nivel = 1;
        this.experiencia = 0;
        this.experienciaProximoNivel = 100;  //100 XP para o próximo nível
        this.habilidades = new ArrayList<Habilidade>();
        this.itensEquipados = new ArrayList<Item>();
    }

    public void ganharExperiencia(int xp) {
        experiencia += xp;
        while (experiencia >= experienciaProximoNivel) {
            subirNivel();  // Sobe de nível enquanto tiver XP suficiente
        }
    }

    public void subirNivel() {
        nivel++;
        experiencia = experiencia - experienciaProximoNivel;
        experienciaProximoNivel += 10;  // cada nível exige mais 50 XP
        //aumentarAtributos();  // Aumenta os atributos do personagem  adicionar isso ainda
        System.out.println(getNome() + " subiu para o nível " + nivel + "!\n");
        System.out.println("Experiência atual: " + experiencia + "\n");
        System.out.println("Experiência necessária para o próximo nível: " + experienciaProximoNivel + "\n");

// Verificar se há uma habilidade específica para desbloquear no nível atual
    Habilidade novaHabilidade = HabilidadesEspecificas.getHabilidadePorClasseENivel(this.getClass().getSimpleName(), nivel);
        if (novaHabilidade != null) {
            habilidades.add(novaHabilidade);
            System.out.println(getNome() + " desbloqueou a habilidade: " + novaHabilidade.getNome());
        }
    }

    public void desbloquearNovaHabilidade() {
        // Exemplo de habilidade nova
        Habilidade novaHabilidade = new Habilidade("Golpe Poderoso", "Causa um dano massivo", 50, 20, 3);
        habilidades.add(novaHabilidade);
        System.out.println(getNome() + " desbloqueou a habilidade: " + novaHabilidade.getNome() + "\n");
    }

    public void usarHabilidade(int indiceHabilidade) {
        if (indiceHabilidade < habilidades.size()) {
            Habilidade habilidade = habilidades.get(indiceHabilidade);
            if (mana >= habilidade.getCustoMana()) {
                habilidade.usarHabilidade();
                mana -= habilidade.getCustoMana();
            } else {
                System.out.println("Mana insuficiente para usar " + habilidade.getNome() + "\n");
            }
        } else {
            System.out.println("Habilidade inválida.\n");
        }
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

    public void equiparItem(Item item) {
        itensEquipados.add(item);
        super.ataque += item.getAumentoAtaque() + item.getDebuf();
        super.defesa += item.getAumentoDefesa() + item.getDebuf();
        super.vida += item.getAumentoVida() + item.getDebuf();
        this.mana += item.getAumentoMana() + item.getDebuf();
        this.velocidade += item.getAumentoVelocidade() + item.getDebuf();
        System.out.println("\n" + item.getNome() + " equipado!\n");
    }

    public void desequiparItem(Item item) {
        if (itensEquipados.contains(item)) {
            super.ataque -= (item.getAumentoAtaque() + item.getDebuf());
            this.defesa -= (item.getAumentoDefesa() + item.getDebuf());
            this.vida -= (item.getAumentoVida() + item.getDebuf());
            this.mana -= (item.getAumentoMana() + item.getDebuf());
            this.velocidade -= (item.getAumentoVelocidade() + item.getDebuf());
            itensEquipados.remove(item);
            System.out.println("\n" + item.getNome() + " desequipado!\n");
        } else {
            System.out.println("\nO item " + item.getNome() + " não está equipado.\n");
        }
    }

    public void mostrarItensEquipados() {
        if (itensEquipados.isEmpty()) {
            System.out.println("\n" + getNome() + " não tem itens equipados.\n");
        } else {
            System.out.println("\n" + getNome() + " possui os seguintes itens equipados:\n");
            for (Item item : itensEquipados) {
                System.out.println(item.toString());
            }
        }
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
                    "Nível: " + nivel + "\n" +
                    "Experiência: " + experiencia + "/" + experienciaProximoNivel + "\n";          
        }
}
