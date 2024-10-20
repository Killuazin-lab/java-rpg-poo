package Game.Monters;

public class Monstros {
  //String nome, int vida, int ataque, int defesa, String habilidadeEspecial
  public static Monstro slime() {
      return new Monstro("Slime", 150, 10, 50, "Dissolve armadura"); 
  } 
    public static Monstro slimeGrande() {
      return new Monstro("Slime Grande", 350, 100, 50, "Dissolve armadura e Provoca Lentidão"); 
  }    
    public static Monstro goblin() {
      return new Monstro("Goblin", 200, 15, 10, "Aplica veneno às suas armas"); 
  }
    public static Monstro goblinXama() {
      return new Monstro("Goblin Xamã", 400, 50, 20, "Aplica veneno e feitiços às suas armas"); 
  } 
    public static Monstro dragao() {
      return new Monstro("Dragão", 100, 30, 0, "Provoca Queimaduras"); 
  } 
    public static Monstro dragaoRei() {
      return new Monstro("Dragão Rei", 350, 120, 10, "Queima armaduras"); 
  }
    public static Monstro lobo() {
      return new Monstro("Lobo", 120, 35, 20, "Provoca sangramento"); 
  }
    public static Monstro lobisomem() {
      return new Monstro("Lobisomem", 300, 150, 10, "Provoca sangramento profundo"); 
  } 
    public static Monstro demonio() {
      return new Monstro("Demonio", 200, 30, 10, "Invoca chamas para queimar"); 
  } 
    public static Monstro demonioRei() {
    return new Monstro("Demonio Rei", 450, 150, 30, "Usa da maldição de Aarfeus para queimar o oponente."); 
  }
}
