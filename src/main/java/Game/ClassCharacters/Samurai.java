package Game.ClassCharacters;

import java.util.Arrays;

public class Samurai extends Personagens {
    String Classe;
    private double porcentagemXpGanho; // porcentagem de xp ganho por inimigo morto
    private double velocidadeAtaque; // ataques por segundo, se for maior que 2, pode ter chance de realizar 2 ataques em um unico turno
    private double tempoConjuracaoHabilidade; // tempo em segundos para conjurar habilidades
    private double alcanceAtaque; // distância do ataque
    private double tempoRecargaHabilidades; // em segundos
    private String[] habilidades; // lista de habilidades do samurai

    public Samurai(String nome, Double vida, Double mana, Double ataque, Double defesa,Double regenVida, Double regenMana,Double velocidade, double porcentagemXpGanho,
                   double velocidadeAtaque, double tempoConjuracaoHabilidade, 
                   double alcanceAtaque, double tempoRecargaHabilidades, String[] habilidades) {
        super(nome, vida, mana, ataque, defesa, regenVida,regenMana, velocidade); // Chama o construtor da classe mãe
        this.Classe = "Samurai";
        this.porcentagemXpGanho = porcentagemXpGanho;
        this.velocidadeAtaque = velocidadeAtaque;
        this.tempoConjuracaoHabilidade = tempoConjuracaoHabilidade;
        this.alcanceAtaque = alcanceAtaque;
        this.tempoRecargaHabilidades = tempoRecargaHabilidades;
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
                    "Habilidades: " + Arrays.toString(habilidades);

        }

    // Getters e setters para os atributos específicos do Samurai
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
}
