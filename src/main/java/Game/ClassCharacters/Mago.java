package Game.ClassCharacters;

import java.util.Arrays;

public class Mago extends Personagens {
    public String Classe;
    private String[] magias; // Lista de magias do mago

    public Mago(String nome, int vida, int mana, int ataque, int defesa, int regenVida, int regenMana , int velocidade, int porcentagemXpGanho,
               int ataqueHabilidadeEspecial, String[] magias, String classe) {
        super(nome, vida, mana, ataque, defesa, regenVida,regenMana, velocidade, ataqueHabilidadeEspecial, classe); // Chama o construtor da classe mãe
        this.Classe = "Mago";
        this.magias = magias;
    }

    @Override
        public String toString() {
            return super.toString() + "\n" +  // Chama o toString da classe mãe (Personagens)
                    "Classe: " + Classe + "\n" +
                    "Habilidades: " + Arrays.toString(magias);

        }

    public String[] getMagias() {
        return magias;
    }
}
