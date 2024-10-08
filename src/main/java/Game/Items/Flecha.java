package Game.Items;

public class Flecha {
    private String tipo; //o tipo da flecha pode ativar atributos especiais
    private int dano;
    private int penetracao;
    private int quantidade;

    public Flecha(String tipo, int dano, int penetracao, int quantidade) {
        this.tipo = tipo;
        this.dano = dano;
        this.penetracao = penetracao;
        this.quantidade = quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public int getDano() {
        return dano;
    }

    public int getPenetracao() {
        return penetracao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void usarFlecha() {
        if (quantidade > 0) {
            quantidade--;
        } else {
            System.out.println("Sem flechas restantes.");
        }
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Dano: " + dano + ", Penetração: " + penetracao + ", Quantidade: " + quantidade;
    }
}
