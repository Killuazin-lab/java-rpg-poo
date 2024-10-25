package Game.ClassCharacters;

import java.util.Arrays;

public class Samurai extends Personagens {
    String Classe;
    private int porcentagemXpGanho; // porcentagem de xp ganho por inimigo morto
    private String[] habilidades; // lista de habilidades do samurai

    public Samurai(String nome, int vida, int mana, int ataque, int defesa,int regenVida, int regenMana,int velocidade, int porcentagemXpGanho,
                   int ataqueHabilidadeEspecial, String[] habilidades) {
        super(nome, vida, mana, ataque, defesa, regenVida,regenMana, velocidade, ataqueHabilidadeEspecial); // Chama o construtor da classe mãe
        this.Classe = "Samurai";
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

    // Getters e setters para os atributos específicos do Samurai
    public int getPorcentagemXpGanho() {
        return porcentagemXpGanho;
    }

    public String[] getHabilidades() {
        return habilidades;
    }
}
