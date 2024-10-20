package Game.Dungeons;

public class SistemaDrop {

  // Método para verificar drop após matar um monstro
    public static Item verificarDrop() {
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
        itensComuns.add(Item.espadaDeAco());  
        itensComuns.add(Item.escudoDeMadeira());
        itensComuns.add(Item.botasDeVelocidade());

        return selecionarItemAleatorio(itensComuns);
    }

    public static Item droparItemIncomum() {
        ArrayList<Item> itensIncomum = new ArrayList<>();
        itensIncomum.add(Item.espadaGrande());  
        itensIncomum.add(Item.marteloDaForja());
        itensIncomum.add(Item.cetroDeMagias());

        return selecionarItemAleatorio(itensIncomum);
    }

    public static Item droparItemRaro() {
        ArrayList<Item> itensRaro = new ArrayList<>();
        itensRaro.add(Item.cajadoDaEscuridao()); 
        itensRaro.add(Item.lancaDoPrimeiroLorde());
        itensRaro.add(Item.laminasRasgaDemonios());

        return selecionarItemAleatorio(itensRaro);
    }

    public static Item droparItemEpico() {
        ArrayList<Item> itensEpico = new ArrayList<>();
        itensEpico.add(Item.tridenteDeAarlen()); 
        itensEpico.add(Item.katanaDeVento());
        itensEpico.add(Item.foiceDeAarfeus());

        return selecionarItemAleatorio(ItensEpico);
    }

     public static Item droparItemMistico() {
        ArrayList<Item> itensMistico = new ArrayList<>();
        itensMistico.add(Item.adagaDaFe()); 

        return selecionarItemAleatorio(ItensMistico);
    } 
    // Método para selecionar um item aleatório da lista
    public static Item selecionarItemAleatorio(ArrayList<Item> itens) {
        Random random = new Random();
        return itens.get(random.nextInt(itens.size()));
    }
}
