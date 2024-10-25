package Game.ClassCharacters;

import java.util.Arrays;

public class Mago extends Personagens {
    String Classe;
    private int porcentagemXpGanho;
    private String[] magias; // Lista de magias do mago

    public Mago(String nome, int vida, int mana, int ataque, int defesa, int regenVida, int regenMana , int velocidade, int porcentagemXpGanho,
               int ataqueHabilidadeEspecial, String[] magias) {
        super(nome, vida, mana, ataque, defesa, regenVida,regenMana, velocidade, ataqueHabilidadeEspecial); // Chama o construtor da classe mãe
        this.Classe = "Mago";
        this.porcentagemXpGanho = porcentagemXpGanho;
        this.magias = magias;
    }

    @Override
        public String toString() {
            return super.toString() + "\n" +  // Chama o toString da classe mãe (Personagens)
                    "Classe: " + Classe + "\n" +
                    "Porcentagem de XP ganho: " + porcentagemXpGanho + "\n" +
                    "Habilidades: " + Arrays.toString(magias);

        }

    // Getters e setters para os atributos específicos do Mago
    public int getPorcentagemXpGanho() {
        return porcentagemXpGanho;
    }

    public String[] getMagias() {
        return magias;
    }
}
