package Game.ClassCharacters;

import java.util.Arrays;

import Game.Items.BolsaDeFlechas;
import Game.Items.Flecha;

public class Arqueiro extends Personagens {
    String Classe;
    private double porcentagemXpGanho;
    private double velocidadeAtaque;
    private double tempoConjuracaoHabilidade;
    private double alcanceAtaque;
    private double tempoRecargaHabilidades;
    private String[] habilidades;
    private BolsaDeFlechas bolsaDeFlechas;

    public Arqueiro(String nome, Double vida, Double mana, Double ataque, Double defesa,Double regenVida, Double regenMana,Double velocidade, double porcentagemXpGanho,
                    double velocidadeAtaque, double tempoConjuracaoHabilidade, 
                    double alcanceAtaque, double tempoRecargaHabilidades, String[] habilidades) {
        super(nome, vida, mana, ataque, defesa,regenVida,regenMana,velocidade);
        this.Classe = "Arqueiro";
        this.porcentagemXpGanho = porcentagemXpGanho;
        this.velocidadeAtaque = velocidadeAtaque;
        this.tempoConjuracaoHabilidade = tempoConjuracaoHabilidade;
        this.alcanceAtaque = alcanceAtaque;
        this.tempoRecargaHabilidades = tempoRecargaHabilidades;
        this.habilidades = habilidades;
        this.bolsaDeFlechas = new BolsaDeFlechas();
    }

    public void adicionarFlechaNaBolsa(Flecha flecha) {
        bolsaDeFlechas.adicionarFlecha(flecha);
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
                    "Bolsa de Flechas: \n" + listarFlechas();

        }

    private String listarFlechas() {
        StringBuilder flechasInfo = new StringBuilder();
        for (Flecha flecha : bolsaDeFlechas.getFlechas()) {  // método para retornar a lista de flechas
            flechasInfo.append(flecha.toString()).append("\n");
        }
        return flechasInfo.toString();
    }

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


    public void atacar(String tipoDeFlecha) {
        Flecha flecha = bolsaDeFlechas.pegarFlecha(tipoDeFlecha);
        if (flecha != null) {
            System.out.println("Arqueiro atacou com uma " + tipoDeFlecha + " que causou " + flecha.getDano() + " de dano.");
        }
    }

    public void mostrarFlechas() {
        bolsaDeFlechas.mostrarFlechas();
    }
}


// Criar tipos de flechas
// Flecha flechaNormal = new Flecha("Flecha Normal", 10, 5, 10);
// Flecha flechaExplosiva = new Flecha("Flecha Explosiva", 20, 10, 5);

// Adicionar flechas na bolsa do arqueiro
// arqueiro.adicionarFlechaNaBolsa(flechaNormal);
// arqueiro.adicionarFlechaNaBolsa(flechaExplosiva);

// Mostrar as flechas disponíveis
// arqueiro.mostrarFlechas();

// Arqueiro ataca com uma flecha normal
// arqueiro.atacar("Flecha Normal");

// Mostrar as flechas novamente (após o uso de uma flecha)
// arqueiro.mostrarFlechas();