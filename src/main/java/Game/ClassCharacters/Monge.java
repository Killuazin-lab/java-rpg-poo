package Game.ClassCharacters;

import java.util.Arrays;

public class Monge extends Personagens {
    public String Classe;
    private String[] habilidades;

    public Monge(String nome, int vida, int mana, int ataque, int defesa,int regenVida, int regenMana,int velocidade, int porcentagemXpGanho,
            int ataqueHabilidadeEspecial, String[] habilidades, String classe) {
        super(nome, vida, mana, ataque, defesa, regenVida,regenMana,velocidade,ataqueHabilidadeEspecial, classe);
        this.Classe = "Monge";
        this.habilidades = habilidades;
    }

    @Override
        public String toString() {
            return super.toString() + "\n" +  // Chama o toString da classe mãe (Personagens)
                    "Classe: " + Classe + "\n" +
                    "Habilidades: " + Arrays.toString(habilidades) + "\n";

        }

    public String[] getHabilidades() {
        return habilidades;
    }
}
