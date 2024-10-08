package Game.ClassCharacters;

import java.util.Arrays;

public class Monge extends Personagens {
    String Classe;
    private double porcentagemXpGanho;
    private double velocidadeAtaque;
    private double tempoConjuracaoHabilidade;
    private double alcanceAtaque;
    private double tempoRecargaHabilidades;
    private String[] habilidades;
    private double fe; // Atributo extra de fé

    public Monge(String nome, Double vida, Double mana, Double ataque, Double defesa,Double regenVida, Double regenMana,Double velocidade, double porcentagemXpGanho,
                 double velocidadeAtaque, double tempoConjuracaoHabilidade, 
                 double alcanceAtaque, double tempoRecargaHabilidades, String[] habilidades, double fe) {
        super(nome, vida, mana, ataque, defesa, regenVida,regenMana,velocidade);
        this.Classe = "Monge";
        this.porcentagemXpGanho = porcentagemXpGanho;
        this.velocidadeAtaque = velocidadeAtaque;
        this.tempoConjuracaoHabilidade = tempoConjuracaoHabilidade;
        this.alcanceAtaque = alcanceAtaque;
        this.tempoRecargaHabilidades = tempoRecargaHabilidades;
        this.habilidades = habilidades;
        this.fe = fe;
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
    public double getPorcentagemXpGanho() {
        return porcentagemXpGanho;
    }

    public double getVelocidadeAtaque() {
        return velocidadeAtaque;
    }

    public double getTempoConjuracaoHabilidade() {
        return tempoConjuracaoHabilidade;
    }

    public double getAlcanceAtaque() {
        return alcanceAtaque;
    }

    public double getTempoRecargaHabilidades() {
        return tempoRecargaHabilidades;
    }

    public String[] getHabilidades() {
        return habilidades;
    }

    public double getFe() {
        return fe;
    }
}
