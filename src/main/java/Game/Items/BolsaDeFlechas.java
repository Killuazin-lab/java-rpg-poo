package Game.Items;

import java.util.ArrayList;

public class BolsaDeFlechas {
    private ArrayList<Flecha> flechas;

    public BolsaDeFlechas() {
        this.flechas = new ArrayList<>();
    }

    public ArrayList<Flecha> getFlechas() {
        return flechas;
    }

    public void adicionarFlecha(Flecha flecha) {
        flechas.add(flecha);
    }

    public void removerFlecha(Flecha flecha) {
        flechas.remove(flecha);
    }

    public Flecha pegarFlecha(String tipo) {
        for (Flecha flecha : flechas) {
            if (flecha.getTipo().equals(tipo) && flecha.getQuantidade() > 0) {
                flecha.usarFlecha();
                return flecha;
            }
        }
        System.out.println("Nenhuma flecha do tipo " + tipo + " disponível.");
        return null;
    }

    public void mostrarFlechas() {
        for (Flecha flecha : flechas) {
            System.out.println(flecha);
        }
    }
}
