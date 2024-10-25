package Game.ClassCharacters;

import java.util.Arrays;

public class Guerreiro extends Personagens {
    String Classe;
    private int porcentagemXpGanho;
    private String[] habilidades;

    public Guerreiro(String nome, int vida, int mana, int ataque, int defesa,int regenVida, int regenMana,int velocidade, int porcentagemXpGanho,
                     int ataqueHabilidadeEspecial, String[] habilidades) {
        super(nome, vida, mana, ataque, defesa, regenVida,regenMana, velocidade, ataqueHabilidadeEspecial);
        this.Classe = "Guerreiro";
        this.porcentagemXpGanho = porcentagemXpGanho;
        this.habilidades = habilidades;
    }

    @Override
        public String toString() {
            return super.toString() + "\n" +  // Chama o toString da classe mãe (Personagens)
                    "Classe: " + Classe + "\n" +
                    "Porcentagem de XP ganho: " + porcentagemXpGanho + "\n" +
                    "Habilidades: " + Arrays.toString(habilidades);

        }

    public int getPorcentagemXpGanho() {
        return porcentagemXpGanho;
    }

    public String[] getHabilidades() {
        return habilidades;
    }
}
