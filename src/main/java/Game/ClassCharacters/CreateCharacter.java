package Game.ClassCharacters;

import Game.Invocation.Invocacao;
import Game.Invocation.Planta;
import Game.Items.Flecha;

public class CreateCharacter {
  
  public static Samurai createSamurai(){
    Samurai samurai = new Samurai("Samurai",
                                  100, 50, 70, 60,3,
                                  5, 2, 3,
                                  1, 2, 
                                  1,2, 100,
                                  new String[] {"Corte Rápido", "Postura Defensiva"}); 
    return samurai;
  }

  public static Mago createMago(){
    Mago mago = new Mago("Mago",
                        80, 200, 40, 30, 3,
                        5, 2, 1,
                        1, 2,
                        4, 5, 100,
                        new String[] {"Bola de Fogo", "Tiro de Gelo"});
    return mago;
  }

  public static Guerreiro createGuerreiro(){
    Guerreiro guerreiro = new Guerreiro("Guerreiro",
                                        120, 30, 80, 
                                        70, 4, 1, 1,
                                        1, 1,
                                        2, 1,
                                        2, 100,
                                        new String[] {"Golpe Brutal", "Escudo Protetor"});
    return guerreiro;
  }

  public static Arqueiro createArqueiro(){
    Arqueiro arqueiro = new Arqueiro("Arqueiro",
                                    90, 40, 60,
                                    50, 2, 2, 1,
                                    1, 1,
                                    3, 5,
                                    2, 100,
                                    new String[] {"Tiro Certeiro", "Tiro Duplo"});
    arqueiro.adicionarFlechaNaBolsa(new Flecha("Flecha Normal", 10, 5, 10));
    arqueiro.adicionarFlechaNaBolsa(new Flecha("Flecha Explosiva", 20, 10, 5));
    return arqueiro;
  }

  public static Ladino createLadino(){
    Ladino ladino = new Ladino("Ladino",
                              85, 45, 65, 45,
                              1, 2, 1,
                              2, 3,
                              1, 2,
                              2, 100,
                              new String[] {"Golpe Furtivo", "Fuga das Sombras"});
    return ladino;
  }

  public static Druida createDruida(){
    Druida druida = new Druida("Druida",
                              95, 150, 50, 40,
                              2, 3, 1,
                              1, 2,
                              2, 4,
                              3,100,
                              new String[] {"Crescer Semente", "Aura Curativa"});
    Planta espinheiro = new Planta("Espinheiro", 40, 10, 5, 3);
    System.out.println("\nO Druida começou com uma planta:"); 
    druida.criarPlanta(espinheiro);

    return druida;
  }

  public static Monge createMonge(){
    Monge monge = new Monge("Monge",
                            110, 60, 70, 50,
                            2, 2, 1,
                            1, 1,
                            3, 1,
                            1, 100, 100,
                            new String[] {"Golpe de Fé", "Meditação"});
    return monge;
  }

  public static Necromante createNecromante(){
    Necromante necromante = new Necromante("Necromante",
                                          90, 170, 55, 40,
                                          4, 4, 1,
                                          1, 2,
                                          2, 3,
                                          1, 120, 100,
                                          new String[] {"Invocação de Cadaver", "Comandar Cadaver"});
    Invocacao pequenoZumbi = new Invocacao("Pequeno Zumbi", 50, 10, 5, 5);
    necromante.adicionarInvocacao(pequenoZumbi);
    return necromante;
  }
}