package Game;

import java.util.Scanner;

import Game.ClassCharacters.Arqueiro;
import Game.ClassCharacters.Druida;
import Game.ClassCharacters.Guerreiro;
import Game.ClassCharacters.Ladino;
import Game.ClassCharacters.Mago;
import Game.ClassCharacters.Monge;
import Game.ClassCharacters.Necromante;
import Game.ClassCharacters.Personagens;
import Game.ClassCharacters.Samurai;
import Game.GunShops.GunShop;
import Game.Invocation.Invocacao;
import Game.Invocation.Planta;
import Game.Items.Flecha;
import Game.Monters.Monstro;
import Game.Texts.Text;

import java.util.ArrayList;
import java.util.Random;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Monstro> Monstro = new ArrayList<Monstro>();
        Monstro.add(new Monstro("Goblin", 50, 20, 10, "Ataque Rápido"));
        Monstro.add(new Monstro("Troll", 120, 40, 30, "Regeneração"));
        Monstro.add(new Monstro("Dragão", 200, 60, 50, "Sopro de Fogo"));
        Monstro.add(new Monstro("Esqueleto", 70, 25, 15, "Ataque Sombrio"));
        Random random = new Random();
        int indexAleatorio = random.nextInt(Monstro.size());
        Monstro monstroEscolhido = Monstro.get(indexAleatorio);

        
        System.out.println("************************************");
        System.out.println("Bem vindo ao RPG de texto em Java!");
        System.out.println("Prepare-se para uma aventura épica!");
        System.out.println("************************************\n\n");

        System.out.println(Text.boasVindas());
        
        System.out.println(Text.cidadeInicial());
        System.out.println("Qual o seu nome ?\n");
        String nomePersonagem = scanner.next();
        System.out.println(Text.escolhaPersonagem());
        int escolha = scanner.nextInt();
        Personagens personagemEscolhido = null;

        switch (escolha) {
            case 1:                                 // NOME, HP, MP, ATK, DEF, HPR,MPR, V, XP, VATK, cast,range,CDR, nomeSkill
                Samurai samurai = new Samurai("Samurai", 100, 50, 70, 60, 3, 5, 2, 3, 1, 2, 1,2, 
                                              new String[] { "Corte Rápido", "Postura Defensiva" });

                personagemEscolhido = samurai;
                personagemEscolhido.setDinheiro(100);
                break;

            case 2:                 // NOME, HP, MP, ATK, DEF, HPR, MPR, V, XP, VATK, castM, rangeM, CDR, nomeMagia
                    // (ADICIONAR )
                Mago mago = new Mago("Mago", 80, 200, 40, 30, 3, 5, 2, 1, 1, 2, 4, 5,
                                    new String[] { "Bola de Fogo", "Tiro de Gelo" });

                personagemEscolhido = mago;
                personagemEscolhido.setDinheiro(100);
                break;

            case 3: // NOME, HP, MP, ATK, DEF, HPR,MPR, V, XP, VATK, cast,range,CDR, nomeSkill
                    // (PASSIVA: QUANTO MENOS VIDA TIVER, MAIS REGEN DE VIDA)
                Guerreiro guerreiro = new Guerreiro("Guerreiro", 120, 30, 80, 70, 4, 1, 1, 1, 1, 2, 1, 2, 
                                                    new String[] { "Golpe Brutal", "Escudo Protetor" });

                personagemEscolhido = guerreiro;
                personagemEscolhido.setDinheiro(100);
                break;

            case 4: // NOME, HP, MP, ATK, DEF, HPR, MPR, XP, ATKS, MVS,cast,range,CDR, nomeSkill
                    // (ALTERAR MECANICA, SÓ PODE BATER COM FELHA)
                Arqueiro arqueiro = new Arqueiro("Arqueiro", 90, 40, 60, 50, 2, 2, 1, 1, 1, 3, 5,2, 
                                                 new String[] { "Tiro Certeiro", "Tiro Duplo" });

                arqueiro.adicionarFlechaNaBolsa(new Flecha("Flecha Normal", 10, 5, 10));
                arqueiro.adicionarFlechaNaBolsa(new Flecha("Flecha Explosiva", 20, 10, 5));

                personagemEscolhido = arqueiro;
                personagemEscolhido.setDinheiro(100);
                break;

            case 5: // NOME, HP, MP, ATK, DEF, HPR, MPR, XP, ATKS, MVS,cast,range,CDR, nomeSkill
                    // (PASSIVA: CAUSA CRITCO NO PRIMEIRO HIT)
                Ladino ladino = new Ladino("Ladino", 85, 45, 65, 45, 1, 2, 1, 2, 3, 1, 2, 2, 
                                           new String[] { "Golpe Furtivo", "Fuga das Sombras" });

                personagemEscolhido = ladino;
                personagemEscolhido.setDinheiro(100);
                
                
                break;

            case 6: // NOME, HP, MP, ATK, DEF, HPR,MPR, XP, ATKS, MVS,cast,range,CDR, nomeSkill
                    // (PASSIVA: (VAI POSSUIR UM ARSENAL DE "PLANTAS COM BASE NOS BROTOS (ZYRA)"))
                Druida druida = new Druida("Druida", 95, 150, 50, 40, 2, 3, 1, 1, 2, 2, 4, 3,
                                            new String[] { "Crescer Semente", "Aura Curativa" });

                Planta espinheiro = new Planta("Espinheiro", 40, 10, 5, 3);
                System.out.println("\nO Druida começa ja com sua primeira Planta: ");
                druida.criarPlanta(espinheiro);

                personagemEscolhido = druida;
                personagemEscolhido.setDinheiro(100);

                break;

            case 7: // NOME, HP, MP, ATK, DEF, HPR,MPR, XP, ATKS, MVS,cast,range,CDR, nomeSkill, FÉ
                    // (PASSIVA: A CADA MEDITAÇÃO, AUMENTA UMA QUANTIDADE DE FÉ,O DANO É BASEADO NA
                    // FÉ)
                Monge monge = new Monge("Monge", 110, 60, 70, 50, 2, 2, 1, 1, 1, 3, 1, 1,
                        new String[] { "Golpe de Fé", "Meditação" }, 100);

                personagemEscolhido = monge;
                personagemEscolhido.setDinheiro(100);
                break;

            case 8: // NOME, HP, MP, ATK, DEF, HPR,MPR, XP, ATKS, MVS,cast,range,CDR, nomeSkill,
                    // trevas (DANO DAS INVOCAÇÕES AUMENTA COM BASE EM "TREVAS")
                Necromante necromante = new Necromante("Necromante", 90, 170, 55, 40, 4, 4, 1, 1, 2,2, 3, 1, 
                                                       new String[] { "Invocação de Cadaver", "Comandar Cadaver" }, 120);

                Invocacao pequenoZumbi = new Invocacao("Pequeno Zumbi", 50, 10, 5, 5); // Zumbi com vida, ataque, defesa
                                                                                       // e duração
                necromante.adicionarInvocacao(pequenoZumbi);

                personagemEscolhido = necromante;
                personagemEscolhido.setDinheiro(100);
                break;

            default:
                System.out.println("\nOpção inválida. Escolha uma classe válida.");
                break;

        }

        if (personagemEscolhido == null) {
            System.out.println("erro ao escolher personagem, informe um numero valido");
        }
            personagemEscolhido.setNome(nomePersonagem);
            System.out.println("\nDeseja ver os atributos do seu personagem ?\n1. Sim\n2. Não\n");
            int escolhaPrincipal = scanner.nextInt();
            if (escolhaPrincipal == 1) {
                System.out.println("\nAtributos iniciais da classe escolihda: \n");
                System.out.println("\n" + personagemEscolhido);
                System.out.println("\n************************************");

            }

            System.out.println(Text.posRegistro());

            System.out.println("\nDeseja uma explicação de como funciona as Dungeons ?\n1. Sim\n2. Não\n");
            escolhaPrincipal = scanner.nextInt();
            if (escolhaPrincipal == 1){
                System.out.println(Text.explicDuegons());
            }
            System.out.println("\n0. Por enquanto, só isso\n1. Tenho outras duvidas \n");
            escolhaPrincipal = scanner.nextInt();
            if (escolhaPrincipal == 1){
                do {
                    System.out.println(Text.duvidas());
                    escolhaPrincipal = scanner.nextInt();
                    switch (escolhaPrincipal) {
                        case 0:
                            System.out.println("\nPerfeito!");
                            break;
                    
                        case 1:
                            System.out.println(Text.xpMonstro());
                            break;
                        
                        case 2:
                            System.out.println(Text.duegonNomes());
                            break;
                        
                        case 3:
                            System.out.println(Text.cidadesSobreviventes());
                            break;
                        
                        case 4:
                            System.out.println(Text.MonstroDescobertos());
                            break;
                        
                        case 5:
                            System.out.println(Text.explicDinheiro());
                            break;
                        
                        case 6:
                            System.out.println(Text.explicItens());
                            break;
                        
                        case 7:
                            System.out.println(Text.explicPocoes());
                            break;

                        default:
                            System.out.println("Informe uma opção válida");
                            break;
                    }
                } while (escolhaPrincipal != 0);
            }
        
            System.out.println(Text.fimApresentBalconista());
            System.out.println("\n****************************************");
            
            System.out.println(Text.visitaLoja());
            
            GunShop.exibirItens(personagemEscolhido);
            System.out.println("Dinheiro restante: " + personagemEscolhido.getDinheiro() + " moedas.");

            System.out.println("\nTudo certo, acho que ja é hora de desafiar a primeira dungeon!\nVou então para a dungeon A\n");

            System.out.println(Text.entrarDungeon());
        

            
            

            
            
            
            //teste

<<<<<<< HEAD
=======
            //TESTE

        }
>>>>>>> 8f20e5b598957e6a9fb9bcc117986e6332f3f2f0
    }
}


// ai dps que o cara escolher temos que fazer algo
// por custo de mana nas skils e tals
// da tambem para criar equipamentos, como armadura e arma, creio que seria
// legal

// ANOTAÇÕES

// CRIAÇÃO DE Monstro

// exemplo de criação de monstro direto na duegon, por exemplo, esse modo cria o
// monstro direto
// Monstro goblin = new Monstro("Goblin", 50, 20, 10, "Ataque Rápido");
// Monstro troll = new Monstro("Troll", 120, 40, 30, "Regeneração");
// Monstro dragao = new Monstro("Dragão", 200, 60, 50, "Baforada de fogo");
// Monstro esqueleto = new Monstro("Esqueleto", 70, 25, 15, "fodase");

// teste pra printar eles
// System.out.println(goblin);
// System.out.println(troll);
// System.out.println(dragao);
// System.out.println(esqueleto);

// System.out.println("Você encontrou um monstro!");
// System.out.println(monstroEscolhido); // aqui gera um monstro na hora


// //AREA SOBRE A CRIAÇÃO DE ITENS

// Item espadaCursed = new Item("Espada Amaldiçoada", "Aumenta muito o ataque, mas reduz vida", 20, 0, -10, 0, 0, -10);
// Item elmoSabio = new Item("Chapeu de mago", "Aumenta a mana, mas reduz a velocidade", 0, 5, 0, 15, -5, 0);

// // Equipando itens
// personagemEscolhido.equiparItem(ItensProntos.espadaDeAco());

// // Mostrar atributos após equipar itens
// System.out.println(personagemEscolhido.toString());
// personagemEscolhido.mostrarItensEquipados();

// // Desequipando itens
// personagemEscolhido.desequiparItem(espadaCursed);

// // Mostrar atributos após desequipar um item
// System.out.println("\nApós desequipar a Espada Amaldiçoada:");
// System.out.println(personagemEscolhido.toString());
// personagemEscolhido.mostrarItensEquipados();



// TESTE PARA GANHAR EXPERIENCIA
// personagemEscolhido.ganharExperiencia(720); // Sobe de nível

// // Mostrar habilidades desbloqueadas
// personagemEscolhido.mostrarHabilidades();

// // Usar uma habilidade
// personagemEscolhido.usarHabilidade(0);

// // Passar turnos para recarregar habilidades
// for (int i = 0; i < 3; i++) {
// personagemEscolhido.passarTurno();
// }

// // Tentar usar a habilidade novamente
// personagemEscolhido.usarHabilidade(0);
// }

// subir level e  mostrar habilidade teste
// personagemEscolhido.ganharExperiencia(10520);
// personagemEscolhido.mostrarHabilidades();

//testando dano do monstro
// System.out.println(TesteMonstro.GOBLIN.getAtaque());
