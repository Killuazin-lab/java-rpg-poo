package Game.Items;
// nome, descricao, aumentoAtaque, aumentoDefesa, aumentoVida, aumentoMana,  aumentoVelocidade, debuf
public class ReadyItems {

  // Item espada de aço (Item comum)
  public static Item espadaDeAco() {
      return new Item("Espada de Aço", "Uma espada media feita de aço ", 100, 0, 0, 20, 0, 0);  // Aumenta ataque
  }

  // Item escudo de madeira (Item comum)
  public static Item escudoDeMadeira() {
      return new Item("Escudo de Madeira", "Um pequeno escudo feito de madeira ", 0, 0, 0, 0, 30, 0);  // Aumenta defesa
  }

  // Botas de velocidade (Item comum)
  public static Item botasDeVelocidade() {
      return new Item("Botas Confortaveis", "Botas que deixam os pés mais confortaveis", 0, 0, 0, 0, 0, 10);  // Aumenta velocidade
  }

  // Espada Grande (Item Incomum) - Referência a BERSERK
  public static Item espadaGrande() {
      return new Item("Espada Grande", "Um pedaço de ferro gigante que esmaga e rasga os inimigos quando balançada.", 150, 50, 0, 0, 0, 10);
  }

  // Martelo da Forja (Item Incomum)
  public static Item marteloDaForja() {
      return new Item("Martelo da Forja", "Martelo utilizado em forjas de aço negro, extremamente resistente e pesado.", 100, 50, 10, 0, -50, 0);
  }

    // Cetro de Magias (Item Incomum)
  public static Item cetroDeMagias() {
      return new Item("Cetro de Magias", "Cetro utilizado por aqueles que possuem afinidade com magia elementar.", 70, 0, 50, 100, 0, 0);
  }
  
    // Cajado da Escurdao (Item raro)
  public static Item cajadoDaEscuridao() {
      return new Item("Cajado da Escuridao", "Cajado que utiliza de forças obscuras desconhecidas para atormentar a alma do adversario", 250, 100, -50, 30, 0, 10); 
  }

    // Lanca do primeiro Lorde (Item raro)
  public static Item lancaDoPrimeiroLorde() {
      return new Item("Lanca do Primeiro Lorde", "Lanca utilizada pelo primeiro Feixe da Fé a se tornar Lorde antes da era de Aarfeus", 200, -100, 50, 50, 100, 0); 
  }

    // Laminas Rasga Demonios (Item raro)
  public static Item laminasRasgaDemonios() {
      return new Item("Laminas Rasga Demonios", "Laminas forjadas por um ferreiro lendario, com chamas ardentes de dragão, serve para rasgar a carne rigida de demonios", 250, -100, -100, 0, 250, 0); 
  }

    // Tridente de Aarlen (Item épico)
  public static Item tridenteDeAarlen() {
      return new Item("Tridente de Aarlen", "Tridente deixado de heranca por Aarlen, irmao de Aarfeus, que se recusou a utilizar o tridente, agora perdido por aí", 350, 350, 350, 350, 350, 0);
  }

    // Katana de Vento (Item épico)
  public static Item katanaDeVento() {
      return new Item("Katana de Vento", "Uma katana de fio tão fino quanto papel, reza a lenda que sua lamina é capaz de criar rajadas cortantes de vento capazes de cortar aço", 500, 0, 100, 0, 500, 0);
  }

    // Foice de Aarfeus (Item épico)
  public static Item foiceDeAarfeus() {
      return new Item("Foice De Aarfeus", "Foice utilizada por Aarfeus na guerra pelo trono de Lorde, sua força é tamanha por conta de sua lâmina, feita com sangue de demônios ancestrais", 500, 100, 350, 0, 0, 0);
  }
  
    // Adaga da Fé (Item Místico) USO UNICO NO GAME, ARMA HITKILL EM QUALQUER INIMIGO, INCLUSIVE BOSS FINAL, TEM Q SER MT RARA
  public static Item adagaDaFe() {
      return new Item("Adaga da Fé", "Adaga forjada pelo primeiro Lorde, sua lâmina é radiante, seu poder é infinito, porém seu uso é único.", 1000000, 0, 0, 0, 0, 0); 
  }
  // Outros itens podem ser adicionados aqui...
}
