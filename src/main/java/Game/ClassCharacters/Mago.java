package Game.ClassCharacters;

import java.util.Arrays;

public class Mago extends Personagens {
    private String[] magias; // Lista de magias do mago

    public Mago(String nome, int vida, int mana, int ataque, int defesa, int porcentagemXpGanho,
               int ataqueHabilidadeEspecial, String[] magias, String classe) {
        super(nome, vida, mana, ataque, defesa, ataqueHabilidadeEspecial, classe); // Chama o construtor da classe mãe
        this.magias = magias;
    }

    @Override
        public String toString() {
            return super.toString() + "\n" +
                    "Habilidades: " + Arrays.toString(magias);

        }

    public String[] getMagias() {
        return magias;
    }
}
