package Game.Skills;

public class Habilidade {
    private String nome;
    private String descricao;
    private int dano;
    private int custoMana;
    private int tempoRecarga;  // Turnos para recarregar
    private int turnosRestantesRecarga;  // Turnos restantes para poder usar a habilidade novamente

    public Habilidade(String nome, String descricao, int dano, int custoMana, int tempoRecarga) {
        this.nome = nome;
        this.descricao = descricao;
        this.dano = dano;
        this.custoMana = custoMana;
        this.tempoRecarga = tempoRecarga;
        this.turnosRestantesRecarga = 0;  // Começa disponível
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDano() {
        return dano;
    }
    public int getCustoMana() {
        return custoMana;
    }

    public int getTempoRecarga() {
        return tempoRecarga;
    }

    public int getTurnosRestantesRecarga() {
        return turnosRestantesRecarga;
    }

    public void usarHabilidade() {
        if (turnosRestantesRecarga == 0) {
            System.out.println(nome + " usada! Causa " + dano + " de dano.");
            turnosRestantesRecarga = tempoRecarga;  // Reseta o tempo de recarga
        } else {
            System.out.println(nome + " ainda está em recarga por " + turnosRestantesRecarga + " turno(s).");
        }
    }

    public void reduzirRecarga() {
        if (turnosRestantesRecarga > 0) {
            turnosRestantesRecarga--;
        }
    }

    @Override
    public String toString() {
        return "Habilidade: " + nome + "\n" +
               "Descrição: " + descricao + "\n" +
               "Dano: " + dano + "\n" +
               "Custo de Mana: " + custoMana + "\n" +
               "Tempo de Recarga: " + tempoRecarga + " turnos\n";
    }
}
