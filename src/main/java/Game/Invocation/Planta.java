package Game.Invocation;

public class Planta {
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;
    private int duracao; // A quantidade de turnos ou tempo que a invocação ficará ativa

    public Planta(String nome, int vida, int ataque, int defesa, int duracao) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getDuracao() {
        return duracao;
    }

    public void reduzirDuracao() {
        if (duracao > 0) {
            duracao--;
        }
    }

    @Override
    public String toString() {
        return "Planta: " + nome + ", Vida: " + vida + ", Ataque: " + ataque + ", Defesa: " + defesa + ", Duração: " + duracao;
    }
}
