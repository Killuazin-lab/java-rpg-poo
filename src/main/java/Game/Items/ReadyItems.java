package Game.Items;

public class ReadyItems {

  // Item espada de aço
  public static Item espadaDeAco() {
      return new Item("Espada de Aço", "Uma espada media feita de aço ", 100, 0, 0, 20, 0, 0);  // Aumenta ataque
  }

  // Item escudo de madeira
  public static Item escudoDeMadeira() {
      return new Item("Escudo de Madeira", "Um pequeno escudo feito de madeira ", 0, 0, 0, 0, 30, 0);  // Aumenta defesa
  }

  // Botas de velocidade
  public static Item botasDeVelocidade() {
      return new Item("Botas Confortaveis", "Botas que deixam os pés mais confortaveis", 0, 0, 0, 0, 0, 10);  // Aumenta velocidade
  }

  // Outros itens podem ser adicionados aqui...
}
