package Game.ClassCharacters;

import java.util.Arrays;

public class Mago extends Personagens {
    String Classe;
    private double porcentagemXpGanho;
    private double velocidadeAtaque;
    private double tempoConjuracaoMagia;
    private double alcanceMagia;
    private double tempoRecargaMagias;
    private String[] magias; // Lista de magias do mago

    public Mago(String nome, Double vida, Double mana, Double ataque, Double defesa, Double regenVida, Double regenMana , Double velocidade, double porcentagemXpGanho,
                double velocidadeAtaque, double tempoConjuracaoMagia, 
                double alcanceMagia, double tempoRecargaMagias, String[] magias) {
        super(nome, vida, mana, ataque, defesa, regenVida,regenMana, velocidade); // Chama o construtor da classe mãe
        this.Classe = "Mago";
        this.porcentagemXpGanho = porcentagemXpGanho;
        this.velocidadeAtaque = velocidadeAtaque;
        this.tempoConjuracaoMagia = tempoConjuracaoMagia;
        this.alcanceMagia = alcanceMagia;
        this.tempoRecargaMagias = tempoRecargaMagias;
        this.magias = magias;
    }

    @Override
        public String toString() {
            return super.toString() + "\n" +  // Chama o toString da classe mãe (Personagens)
                    "Classe: " + Classe + "\n" +
                    "Porcentagem de XP ganho: " + porcentagemXpGanho + "\n" +
                    "Velocidade de Ataque: " + velocidadeAtaque + "\n" +
                    "Tempo de Conjuração de Habilidade: " + tempoConjuracaoMagia + "\n" +
                    "Alcance de Ataque: " + alcanceMagia + "\n" +
                    "Tempo de Recarga de Habilidades (em segundos): " + tempoRecargaMagias + "\n" +
                    "Habilidades: " + Arrays.toString(magias);

        }

    // Getters e setters para os atributos específicos do Mago
    public double getPorcentagemXpGanho() {
        return porcentagemXpGanho;
    }

    public double getVelocidadeAtaque() {
        return velocidadeAtaque;
    }

    public double getTempoConjuracaoMagia() {
        return tempoConjuracaoMagia;
    }

    public double getAlcanceMagia() {
        return alcanceMagia;
    }

    public double getTempoRecargaMagias() {
        return tempoRecargaMagias;
    }

    public String[] getMagias() {
        return magias;
    }
}
