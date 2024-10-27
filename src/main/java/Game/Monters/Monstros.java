package Game.Monters;

public class Monstros {
  //String nome, int vida, int ataque, int defesa, String habilidadeEspecial
  public static Monstro slime() {
      return new Monstro("Slime", 150, 50, 10, "Dissolve armadura", 100); 
  } 
    public static Monstro slimeDeMusgo() {
      return new Monstro("Slime Grande", 350, 80,15, "Dissolve armadura e Provoca Lentidão", 100); 
  }    
    public static Monstro goblin() {
      return new Monstro("Goblin", 200, 55, 10, "Aplica veneno às suas armas", 100); 
  }
    public static Monstro goblinXama() {
      return new Monstro("Goblin Xamã", 400, 80, 15, "Aplica veneno e feitiços às suas armas", 100); 
  } 
    public static Monstro dragao() {
      return new Monstro("Dragão", 100, 50, 10, "Provoca Queimaduras", 100); 
  } 
    public static Monstro dragaoFlamejante() {
      return new Monstro("Dragão Rei", 350, 80, 15, "Queima armaduras", 100); 
  }
    public static Monstro loboDePedra() {
      return new Monstro("Lobo", 120, 55, 10, "Provoca sangramento", 100); 
  }
    public static Monstro lobisomemDePedra() {
      return new Monstro("Lobisomem", 300, 90, 15, "Provoca sangramento profundo", 100); 
  } 
    public static Monstro demonioDaEscuridao() {
      return new Monstro("Demonio", 200, 50, 10, "Invoca chamas para queimar", 100); 
  } 
    public static Monstro demonioFlamejante() {
    return new Monstro("Demonio Rei", 450, 80, 15, "Usa da maldição de Aarfeus para queimar o oponente.", 100); 
  }
}
