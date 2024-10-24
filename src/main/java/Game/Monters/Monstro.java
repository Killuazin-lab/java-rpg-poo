package Game.Monters;

import Game.ClassCharacters.Criatura;

public class Monstro extends Criatura{
    private String habilidadeEspecial;

    public Monstro(String nome, int vida, int ataque, int defesa,
                   String habilidadeEspecial, int ataqueHabilidadeEspecial) {
        super(nome, vida, ataque, defesa, ataqueHabilidadeEspecial);
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public String getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    @Override
    public String toString() {
        return "Monstro: " + getNome() + "\n" +
               "Vida: " + getVida() + "\n" +
               "Ataque: " + getAtaque() + "\n" +
               "Defesa: " + getDefesa() + "\n" +
               "Habilidade Especial: " + habilidadeEspecial + "\n";
    }
}
