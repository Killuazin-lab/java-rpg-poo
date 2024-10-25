package Game.ClassCharacters;

import Game.Invocation.Invocacao;
import Game.Invocation.Planta;
import Game.Items.Flecha;

public class CreateCharacter {
  
  public static Samurai createSamurai(){
    Samurai samurai = new Samurai("Samurai",
                                  100, 50, 70, 60,5,
                                  3, 2, 1,
                                  0, 
                                  new String[] {"Golpe Basico"}); 
    return samurai;
  }

  public static Mago createMago(){
    Mago mago = new Mago("Mago",
                        80, 200, 40, 30, 3,
                        5, 2, 1,
                        0,
                        new String[] {"Magia Basica"});
    return mago;
  }

  public static Guerreiro createGuerreiro(){
    Guerreiro guerreiro = new Guerreiro("Guerreiro",
                                        120, 30, 80, 
                                        70, 4, 0, 2,
                                        1,0,
                                        new String[] {"Golpe Basico"});
    return guerreiro;
  }

  public static Arqueiro createArqueiro(){
    Arqueiro arqueiro = new Arqueiro("Arqueiro",
                                    90, 40, 60,
                                    50, 2, 2, 3,
                                    1, 0,
                                    new String[] {"Disparo Basico"});
    arqueiro.adicionarFlechaNaBolsa(new Flecha("Flecha de Pedra", 10, 5, 20));
    arqueiro.adicionarFlechaNaBolsa(new Flecha("Flecha de Ferro", 20, 10, 10));
    return arqueiro;
  }

  public static Ladino createLadino(){
    Ladino ladino = new Ladino("Ladino",
                              85, 45, 65, 45,
                              2, 2, 3,
                              1, 0,
                              new String[] {"Golpe Basico"});
    return ladino;
  }

  public static Druida createDruida(){
    Druida druida = new Druida("Druida",
                              95, 150, 50, 40,
                              2, 3, 1,
                              1, 0,
                              new String[] {"Golpe Basico"});
    Planta espinheiro = new Planta("Espinheiro", 40, 10, 5, 3);
    System.out.println("\nO Druida começou com uma planta:"); 
    druida.criarPlanta(espinheiro);

    return druida;
  }

  public static Monge createMonge(){
    Monge monge = new Monge("Monge",
                            110, 60, 70, 50,
                            8, 5, 2,
                            1, 0,
                            new String[] {"Golpe Basico"});
    return monge;
  }

  public static Necromante createNecromante(){
    Necromante necromante = new Necromante("Necromante",
                                          90, 170, 55, 40,
                                          4, 4, 1,
                                          1, 120, 0,
                                          new String[] {"Golpe Basico","Invocação de Cadaver"});
    Invocacao pequenoZumbi = new Invocacao("Pequeno Zumbi", 50, 10, 5, 5);
    necromante.adicionarInvocacao(pequenoZumbi);
    return necromante;
  }
}