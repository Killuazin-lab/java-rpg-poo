package Game.Items;

public class Item {
    private String nome;
    private String descricao;
    private int aumentoAtaque;
    private int aumentoDefesa;
    private int aumentoVida;
    private int aumentoMana;
    private int aumentoVelocidade;
    private int debuf;  // perda de atributos

    public Item(String nome, String descricao, int aumentoAtaque, int aumentoDefesa, int aumentoVida, int aumentoMana, int aumentoVelocidade, int debuf) {
        this.nome = nome;
        this.descricao = descricao;
        this.aumentoAtaque = aumentoAtaque;
        this.aumentoDefesa = aumentoDefesa;
        this.aumentoVida = aumentoVida;
        this.aumentoMana = aumentoMana;
        this.aumentoVelocidade = aumentoVelocidade;
        this.debuf = debuf;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getAumentoAtaque() {
        return aumentoAtaque;
    }

    public int getAumentoDefesa() {
        return aumentoDefesa;
    }

    public int getAumentoVida() {
        return aumentoVida;
    }

    public int getAumentoMana() {
        return aumentoMana;
    }

    public int getAumentoVelocidade() {
        return aumentoVelocidade;
    }

    public int getDebuf() {
        return debuf;
    }

    @Override
    public String toString() {
        return "Item: " + nome + "\n" +
               "Descrição: " + descricao + "\n" +
               "Aumento de Ataque: " + aumentoAtaque + "\n" +
               "Aumento de Defesa: " + aumentoDefesa + "\n" +
               "Aumento de Vida: " + aumentoVida + "\n" +
               "Aumento de Mana: " + aumentoMana + "\n" +
               "Aumento de Velocidade: " + aumentoVelocidade + "\n" +
               "Debuff: " + debuf + "\n";
    }
}
