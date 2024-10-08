package Game.Monters;

public class Monstro {
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;
    private String habilidadeEspecial;

    public Monstro(String nome, int vida, int ataque, int defesa, String habilidadeEspecial) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.habilidadeEspecial = habilidadeEspecial;
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

    public String getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    @Override
    public String toString() {
        return "Monstro: " + nome + "\n" +
               "Vida: " + vida + "\n" +
               "Ataque: " + ataque + "\n" +
               "Defesa: " + defesa + "\n" +
               "Habilidade Especial: " + habilidadeEspecial + "\n";
    }
}
