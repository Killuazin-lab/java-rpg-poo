package Game.ClassCharacters;

import java.util.ArrayList;
import java.util.Arrays;

import Game.Invocation.Invocacao;

public class Necromante extends Personagens {
    String Classe;
    private double porcentagemXpGanho;
    private double velocidadeAtaque;
    private double tempoConjuracaoHabilidade;
    private double alcanceAtaque;
    private double tempoRecargaHabilidades;
    private String[] habilidades;
    private double energiaDasTrevas; // Energia das trevas do necromante
    private ArrayList<Invocacao> reservatorioDeMortos; // Armazena invocações

    public Necromante(String nome, Double vida, Double mana, Double ataque, Double defesa, Double regenVida, Double regenMana, Double velocidade, double porcentagemXpGanho,
                      double velocidadeAtaque, double tempoConjuracaoHabilidade, 
                      double alcanceAtaque, double tempoRecargaHabilidades, String[] habilidades, double energiaDasTrevas) {
        super(nome, vida, mana, ataque, defesa, regenVida, regenMana, velocidade);
        this.Classe = "Necromante";
        this.porcentagemXpGanho = porcentagemXpGanho;
        this.velocidadeAtaque = velocidadeAtaque;
        this.tempoConjuracaoHabilidade = tempoConjuracaoHabilidade;
        this.alcanceAtaque = alcanceAtaque;
        this.tempoRecargaHabilidades = tempoRecargaHabilidades;
        this.habilidades = habilidades;
        this.energiaDasTrevas = energiaDasTrevas;
        this.reservatorioDeMortos = new ArrayList<Invocacao>();
    }  

    @Override
        public String toString() {
            StringBuilder invocacoesInfo = new StringBuilder();
            for (Invocacao invocacao : reservatorioDeMortos) {
                invocacoesInfo.append(invocacao.toString()).append("\n");
            }
            return super.toString() + "\n" +  // Chama o toString da classe mãe (Personagens)
                    "Classe: " + Classe + "\n" +
                    "Porcentagem de XP ganho: " + porcentagemXpGanho + "\n" +
                    "Velocidade de Ataque: " + velocidadeAtaque + "\n" +
                    "Tempo de Conjuração de Habilidade: " + tempoConjuracaoHabilidade + "\n" +
                    "Alcance de Ataque: " + alcanceAtaque + "\n" +
                    "Tempo de Recarga de Habilidades (em segundos): " + tempoRecargaHabilidades + "\n" +
                    "Habilidades: " + Arrays.toString(habilidades) + "\n" +
                    "Energia das Trevas: " + energiaDasTrevas + "\n" +
                    "Reservatório de Mortos: \n" + invocacoesInfo.toString();
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

    public double getEnergiaDasTrevas() {
        return energiaDasTrevas;
    }

     // logica para adicionar e remover invocações

    public ArrayList<Invocacao> getReservatorioDeMortos() {
        return reservatorioDeMortos;
    }

     public void adicionarInvocacao(Invocacao invocacao) {
        reservatorioDeMortos.add(invocacao);
    }

    public void removerInvocacao(Invocacao invocacao) {
        reservatorioDeMortos.remove(invocacao);
    }

    
}
