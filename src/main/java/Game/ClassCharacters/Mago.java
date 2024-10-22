package Game.ClassCharacters;

import java.util.Arrays;

public class Mago extends Personagens {
    String Classe;
    private int porcentagemXpGanho;
    private int velocidadeAtaque;
    private int tempoConjuracaoMagia;
    private int alcanceMagia;
    private int tempoRecargaMagias;
    private String[] magias; // Lista de magias do mago

    public Mago(String nome, int vida, int mana, int ataque, int defesa, int regenVida, int regenMana , int velocidade, int porcentagemXpGanho,
                int velocidadeAtaque, int tempoConjuracaoMagia, 
                int alcanceMagia, int tempoRecargaMagias, String[] magias) {
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
    public int getPorcentagemXpGanho() {
        return porcentagemXpGanho;
    }

    public int getVelocidadeAtaque() {
        return velocidadeAtaque;
    }

    public int getTempoConjuracaoMagia() {
        return tempoConjuracaoMagia;
    }

    public int getAlcanceMagia() {
        return alcanceMagia;
    }

    public int getTempoRecargaMagias() {
        return tempoRecargaMagias;
    }

    public String[] getMagias() {
        return magias;
    }
}
