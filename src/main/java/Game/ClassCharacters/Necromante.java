package Game.ClassCharacters;

import java.util.ArrayList;
import java.util.Arrays;

import Game.Invocation.Invocacao;

public class Necromante extends Personagens {
    private String[] habilidades;
    private int energiaDasTrevas; // Energia das trevas do necromante
    private ArrayList<Invocacao> reservatorioDeMortos; // Armazena invocações

    public Necromante(String nome, int vida, int mana, int ataque, int defesa, int porcentagemXpGanho,
                    int energiaDasTrevas, int ataqueHabilidadeEspecial, String[] habilidades, String classe) {
        super(nome, vida, mana, ataque, defesa, ataqueHabilidadeEspecial, classe);
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
            return super.toString() + "\n" +
                    "Habilidades: " + Arrays.toString(habilidades) + "\n" +
                    "Energia das Trevas: " + energiaDasTrevas + "\n" +
                    "Reservatório de Mortos: \n" + invocacoesInfo.toString();
        }

    public String[] getHabilidades() {
        return habilidades;
    }

    public int getEnergiaDasTrevas() {
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
