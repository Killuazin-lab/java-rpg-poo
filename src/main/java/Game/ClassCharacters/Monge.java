package Game.ClassCharacters;

import java.util.Arrays;

public class Monge extends Personagens {
    String Classe;
    private int porcentagemXpGanho;
    private int velocidadeAtaque;
    private int tempoConjuracaoHabilidade;
    private int alcanceAtaque;
    private int tempoRecargaHabilidades;
    private String[] habilidades;
    private int fe; // Atributo extra de fé

    public Monge(String nome, int vida, int mana, int ataque, int defesa,int regenVida, int regenMana,int velocidade, int porcentagemXpGanho,
                 int velocidadeAtaque, int tempoConjuracaoHabilidade, 
                 int alcanceAtaque, int tempoRecargaHabilidades, int fe, String[] habilidades) {
        super(nome, vida, mana, ataque, defesa, regenVida,regenMana,velocidade);
        this.Classe = "Monge";
        this.porcentagemXpGanho = porcentagemXpGanho;
        this.velocidadeAtaque = velocidadeAtaque;
        this.tempoConjuracaoHabilidade = tempoConjuracaoHabilidade;
        this.alcanceAtaque = alcanceAtaque;
        this.tempoRecargaHabilidades = tempoRecargaHabilidades;
        this.fe = fe;
        this.habilidades = habilidades;
    }

    @Override
        public String toString() {
            return super.toString() + "\n" +  // Chama o toString da classe mãe (Personagens)
                    "Classe: " + Classe + "\n" +
                    "Porcentagem de XP ganho: " + porcentagemXpGanho + "\n" +
                    "Velocidade de Ataque: " + velocidadeAtaque + "\n" +
                    "Tempo de Conjuração de Habilidade: " + tempoConjuracaoHabilidade + "\n" +
                    "Alcance de Ataque: " + alcanceAtaque + "\n" +
                    "Tempo de Recarga de Habilidades (em segundos): " + tempoRecargaHabilidades + "\n" +
                    "Habilidades: " + Arrays.toString(habilidades) + "\n" +
                    "Fé (quanto mais fé, mais dano no proximo hit): " + fe;

        }

    // Getters e setters
    public int getPorcentagemXpGanho() {
        return porcentagemXpGanho;
    }

    public int getVelocidadeAtaque() {
        return velocidadeAtaque;
    }

    public int getTempoConjuracaoHabilidade() {
        return tempoConjuracaoHabilidade;
    }

    public int getAlcanceAtaque() {
        return alcanceAtaque;
    }

    public int getTempoRecargaHabilidades() {
        return tempoRecargaHabilidades;
    }

    public String[] getHabilidades() {
        return habilidades;
    }

    public int getFe() {
        return fe;
    }
}
