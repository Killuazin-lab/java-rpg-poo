package Game.ClassCharacters;

import Game.Invocation.Invocacao;
import Game.Invocation.Planta;
import Game.Items.Flecha;

public class CreateCharacter {
  
  public static Samurai createSamurai(){
    Samurai samurai = new Samurai("Samurai",
                                  100, 50, 70, 15,
                                  1,
                                  0, 
                                  new String[] {"Golpe Basico"}, "Samurai"); 
    return samurai;
  }

  public static Mago createMago(){
    Mago mago = new Mago("Mago",
                        80, 200, 40, 10,1,
                        0,
                        new String[] {"Magia Basica"}, "Mago");
    return mago;
  }

  public static Guerreiro createGuerreiro(){
    Guerreiro guerreiro = new Guerreiro("Guerreiro",
                                        120, 30, 80, 15,
                                        1,0,
                                        new String[] {"Golpe Basico"}, "Guerreiro");
    return guerreiro;
  }

  public static Arqueiro createArqueiro(){
    Arqueiro arqueiro = new Arqueiro("Arqueiro",
                                    90, 40, 60,10,
                                    1, 0,
                                    new String[] {"Disparo Basico"}, "Arqueiro");
    arqueiro.adicionarFlechaNaBolsa(new Flecha("Flecha de Pedra", 10, 5, 20));
    arqueiro.adicionarFlechaNaBolsa(new Flecha("Flecha de Ferro", 20, 10, 10));
    return arqueiro;
  }

  public static Ladino createLadino(){
    Ladino ladino = new Ladino("Ladino",
                              85, 45, 65, 10,
                              1, 0,
                              new String[] {"Golpe Basico"}, "Ladino");
    return ladino;
  }

  public static Druida createDruida(){
    Druida druida = new Druida("Druida",
                              95, 150, 50, 10,
                              1, 0,
                              new String[] {"Golpe Basico"}, "Druida");
    Planta espinheiro = new Planta("Espinheiro", 40, 10, 5, 3);
    System.out.println("\nO Druida começou com uma planta:"); 
    druida.criarPlanta(espinheiro);

    return druida;
  }

  public static Monge createMonge(){
    Monge monge = new Monge("Monge",
                            110, 60, 70, 10,
                            1, 0,
                            new String[] {"Golpe Basico"}, "Monge");
    return monge;
  }

  public static Necromante createNecromante(){
    Necromante necromante = new Necromante("Necromante",
                                          190, 170, 160, 20,
                                          1, 120, 0,
                                          new String[] {"Golpe Basico","Invocação de Cadaver"}, "Necromante");
    Invocacao pequenoZumbi = new Invocacao("Pequeno Zumbi", 50, 10, 5, 5);
    necromante.adicionarInvocacao(pequenoZumbi);
    return necromante;
  }
}