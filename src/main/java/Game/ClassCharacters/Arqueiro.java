package Game.ClassCharacters;

import java.util.Arrays;

import Game.Items.BolsaDeFlechas;
import Game.Items.Flecha;

public class Arqueiro extends Personagens {
    String Classe;
    private String[] habilidades;
    private BolsaDeFlechas bolsaDeFlechas;

    public Arqueiro(String nome, int vida, int mana, int ataque, int defesa, int porcentagemXpGanho,
                int ataqueHabilidadeEspecial, String[] habilidades, String classe) {
        super(nome, vida, mana, ataque, defesa, ataqueHabilidadeEspecial, classe);
        this.Classe = "Arqueiro";
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