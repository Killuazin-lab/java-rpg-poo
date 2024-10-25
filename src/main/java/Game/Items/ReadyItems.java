package Game.Items;
// nome, descricao, aumentoAtaque, aumentoDefesa, aumentoVida, aumentoMana,  aumentoVelocidade, debuf
public class ReadyItems {
 //DIMINIU O DANO DESSAS PORRAS MANO
  // Item espada de aço (Item comum)
  public static Item espadaDeAco() {
      return new Item("Espada de Aço", "Uma espada media feita de aço ", 50, 0, 0, 20, 0, 0);  // Aumenta ataque
  }

  // Item escudo de madeira (Item comum)
  public static Item escudoDeMadeira() {
      return new Item("Escudo de Madeira", "Um pequeno escudo feito de madeira ", 0, 35, 0, 0, 0, 0);  // Aumenta defesa
  }

  // Botas de velocidade (Item comum)
  public static Item botasDeVelocidade() {
      return new Item("Botas Confortaveis", "Botas que deixam os pés mais confortaveis", 0, 0, 0, 0, 20, 0);  // Aumenta velocidade
  }

  // Espada Grande (Item Incomum) - Referência a BERSERK
  public static Item espadaGrande() {
      return new Item("Espada Grande", "Um pedaço de ferro gigante que esmaga e rasga os inimigos quando balançada.", 75, 30, 0, 0, 0, 0);
  }

  // Martelo da Forja (Item Incomum)
  public static Item marteloDaForja() {
      return new Item("Martelo da Forja", "Martelo utilizado em forjas de aço negro, extremamente resistente e pesado.", 90, 50, 0, 0, -30, 0);
  }

    // Cetro de Magias (Item Incomum)
  public static Item cetroDeMagias() {
      return new Item("Cetro de Magias", "Cetro utilizado por aqueles que possuem afinidade com magia elementar.", 70, 0, 50, 50, 0, 0);
  }

   // Escudo de Diamante  (Item Incomum)
  public static Item escudoDeDiamante() {
      return new Item("Escudo de Diamante", "Escudo de diamante feito por ferreiros e forjadores execepcionais", 30, 90, 75, 0, 0, 0);
  }
   // Botas de vento (Item Incomum)
  public static Item botasDeVento() {
      return new Item("Botas de Vento", "Botas feitas pelos ferreiros das névoas, fornecem velocidade e proteção.", 10, 40, 30, 0, 75, 0);
  }
    // Cajado da Escurdao (Item raro)
  public static Item cajadoDaEscuridao() {
      return new Item("Cajado da Escuridao", "Cajado que utiliza de forças obscuras desconhecidas para atormentar a alma do adversario", 110, 70, -50, 30, 0, 0); 
  }

    // Lanca do primeiro Lorde (Item raro)
  public static Item lancaDoPrimeiroLorde() {
      return new Item("Lanca do Primeiro Lorde", "Lanca utilizada pelo primeiro Feixe da Fé a se tornar Lorde antes da era de Aarfeus", 120, -70, 50, 50, 50, 0); 
  }

    // Laminas Rasga Demonios (Item raro)
  public static Item laminasRasgaDemonios() {
      return new Item("Laminas Rasga Demonios", "Laminas forjadas por um ferreiro lendario, com chamas ardentes de dragão, serve para rasgar a carne rigida de demonios", 150, -70, -50, 0, 100, 0); 
  }

    // Tridente de Aarlen (Item épico)
  public static Item tridenteDeAarlen() {
      return new Item("Tridente de Aarlen", "Tridente deixado de heranca por Aarlen, irmao de Aarfeus, que se recusou a utilizar o tridente, agora perdido por aí", 170, 70, 100, 100, 100, 0);
  }

    // Katana de Vento (Item épico)
  public static Item katanaDeVento() {
      return new Item("Katana de Vento", "Uma katana de fio tão fino quanto papel, reza a lenda que sua lamina é capaz de criar rajadas cortantes de vento capazes de cortar aço", 200, 0, 150, 0, 200, 0);
  }

    // Foice de Aarfeus (Item épico)
  public static Item foiceDeAarfeus() {
      return new Item("Foice De Aarfeus", "Foice utilizada por Aarfeus na guerra pelo trono de Lorde, sua força é tamanha por conta de sua lâmina, feita com sangue de demônios ancestrais", 210, 100, 200, 0, 0, 0);
  }

  // Armadura Demoniaca (Item Épico) 
  public static Item armaduraDemoniaca() {
      return new Item("Armadura Demoniaca", "Uma armadura forjada por demonios ferreiros, responsaveis pelos equipamentos utilizados por Aarfeus em sua conquista.", 50, 200, 100, 60, 50, 0);
  } 

   // Capacete de Aarfeus (Item Épico)
  public static Item capaceteDeAarfeus() {
      return new Item("Capacete de Aarfeus", "Elmo lendário que Aarfeus utilizou em sua conquista, está rachado, porém possui altíssima proteção, aumento de Mana e velocidade..", 55, 150, 200, 200, 100, 0);
  }

  // Botas Draconicas (Item Épico)
  public static Item botasDraconicas() {
      return new Item("Botas Dracônicas", "Botas utilizadas pelos dragões anciões, reza a lenda que se pareciam com humanos.", 50, 100, 100, 50, 200, 0);
  }
 
    // Adaga da Fé (Item Místico) USO UNICO NO GAME, ARMA HITKILL EM QUALQUER INIMIGO, INCLUSIVE BOSS FINAL, TEM Q SER MT RARA //VAI SER USO UNICO
  public static Item adagaDaFe() {
      return new Item("Adaga da Fé", "Adaga forjada pelo primeiro Lorde, sua lâmina é radiante, seu poder é infinito, porém seu uso é único.", 1000000, 0, 0, 0, 0, 0); 
  }
  // Outros itens podem ser adicionados aqui...
}
