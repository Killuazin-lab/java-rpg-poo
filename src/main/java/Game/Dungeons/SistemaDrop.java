package Game.Dungeons;
import java.util.ArrayList;
import java.util.Random;

import Game.ClassCharacters.Personagens;
import Game.Items.Item;
import Game.Items.ReadyItems;

public class SistemaDrop {

  // Método para verificar drop após matar um monstro
    public static Item verificarDrop(Personagens personagemEscolhido) {
        Random random = new Random();
        int chance = random.nextInt(100)+1;  // Gera um número de 1 a 100

        if (chance < 60) {  // 60% de chance para item comum
            return droparItemComum();
        } else if (chance < 85) {  // 25% de chance para item Incomum (60 + 25)
            return droparItemIncomum();
        } else if (chance < 90) {  // 20% de chance para item raro (85 + 10)
            return droparItemRaro();
        } else if (chance < 95) {  // 15% de chance para item épico (85 + 10)
            return droparItemEpico();          
        } else {  // 5% de chance para item lendário
            return droparItemMistico();
        }
    }
  // Métodos para dropar itens de acordo com a raridade
    public static Item droparItemComum() {
        ArrayList<Item> itensComuns = new ArrayList<>();
        itensComuns.add(ReadyItems.espadaDeAco());  
        itensComuns.add(ReadyItems.escudoDeMadeira());
        itensComuns.add(ReadyItems.botasDeVelocidade());

        return selecionarItemAleatorio(itensComuns);
    }

    public static Item droparItemIncomum() {
        ArrayList<Item> itensIncomum = new ArrayList<>();
        itensIncomum.add(ReadyItems.espadaGrande());  
        itensIncomum.add(ReadyItems.marteloDaForja());
        itensIncomum.add(ReadyItems.cetroDeMagias());

        return selecionarItemAleatorio(itensIncomum);
    }

    public static Item droparItemRaro() {
        ArrayList<Item> itensRaro = new ArrayList<>();
        itensRaro.add(ReadyItems.cajadoDaEscuridao()); 
        itensRaro.add(ReadyItems.lancaDoPrimeiroLorde());
        itensRaro.add(ReadyItems.laminasRasgaDemonios());

        return selecionarItemAleatorio(itensRaro);
    }

    public static Item droparItemEpico() {
        ArrayList<Item> itensEpico = new ArrayList<>();
        itensEpico.add(ReadyItems.tridenteDeAarlen()); 
        itensEpico.add(ReadyItems.katanaDeVento());
        itensEpico.add(ReadyItems.foiceDeAarfeus());

        return selecionarItemAleatorio(itensEpico);
    }

     public static Item droparItemMistico() {
        ArrayList<Item> itensMistico = new ArrayList<>();
        itensMistico.add(ReadyItems.adagaDaFe()); 

        return selecionarItemAleatorio(itensMistico);
    } 
    // Método para selecionar um item aleatório da lista
    public static Item selecionarItemAleatorio(ArrayList<Item> itens) {
        Random random = new Random();
        return itens.get(random.nextInt(itens.size()));
    }
}
