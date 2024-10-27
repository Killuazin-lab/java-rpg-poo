package Game.ClassCharacters;

import java.util.Arrays;

public class Ladino extends Personagens {
    private String[] habilidades;

    public Ladino(String nome, int vida, int mana, int ataque, int defesa,int regenVida, int regenMana, int velocidade, int porcentagemXpGanho,
                 int ataqueHabilidadeEspecial, String[] habilidades, String classe) {
        super(nome, vida, mana, ataque, defesa, regenVida, regenMana, velocidade, ataqueHabilidadeEspecial, classe);
        this.habilidades = habilidades;
    }

    @Override
        public String toString() {
            return super.toString() + "\n" +
                    "Habilidades: " + Arrays.toString(habilidades);

        }

    public String[] getHabilidades() {
        return habilidades;
    }
}
