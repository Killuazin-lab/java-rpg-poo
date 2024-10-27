package Game;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

import Game.ClassCharacters.Arqueiro;
import Game.ClassCharacters.CreateCharacter;
import Game.ClassCharacters.Druida;
import Game.ClassCharacters.Guerreiro;
import Game.ClassCharacters.Ladino;
import Game.ClassCharacters.Mago;
import Game.ClassCharacters.Monge;
import Game.ClassCharacters.Necromante;
import Game.ClassCharacters.Personagens;
import Game.ClassCharacters.Samurai;
import Game.Dungeons.Dungeon;
import Game.GunShops.GunShop;
import Game.Monters.Monstro;
import Game.Texts.Text;

public class Main {

    public static void main(String[] args) {
        for(int tentativa = 0; tentativa <= 5; tentativa++){
            Scanner scanner = new Scanner(System.in);

            // Introdução
            System.out.println("************************************");
            System.out.println("Bem vindo ao RPG de texto em Java!");
            System.out.println("Prepare-se para uma aventura épica!");
            System.out.println("************************************\n\n");
            System.out.println(Text.boasVindas());
            System.out.println(Text.cidadeInicial());
            System.out.println("Qual o seu nome ?\n");
            String nomePersonagem = scanner.next();
            Personagens personagemEscolhido = null;

            int error = 1;
            do{
                System.out.println(Text.escolhaPersonagem());
                int escolha = scanner.nextInt();
                switch (escolha) {
                    case 1:                        
                        Samurai samurai = CreateCharacter.createSamurai();
                        personagemEscolhido = samurai;
                        error = 0;
                        break;
                    case 2:        
                        Mago mago = CreateCharacter.createMago();
                        personagemEscolhido = mago;
                        error = 0;
                        break;
                    case 3:
                        Guerreiro guerreiro = CreateCharacter.createGuerreiro();
                        personagemEscolhido = guerreiro;
                        error = 0;
                        break;
                    case 4:
                        Arqueiro arqueiro = CreateCharacter.createArqueiro();
                        personagemEscolhido = arqueiro;
                        error = 0;
                        break;
                    case 5: 
                        Ladino ladino = CreateCharacter.createLadino();
                        personagemEscolhido = ladino;
                        error = 0;
                        break;
                    case 6: 
                        Druida druida = CreateCharacter.createDruida();
                        personagemEscolhido = druida;
                        error = 0;
                        break;
                    case 7: 
                        Monge monge = CreateCharacter.createMonge();
                        personagemEscolhido = monge;
                        error = 0;
                        break;
                    case 8: 
                        Necromante necromante = CreateCharacter.createNecromante();
                        personagemEscolhido = necromante;
                        error = 0;
                        break;
                    default:
                        System.out.println("\nOpção inválida. Escolha uma classe válida.");
                        break;
                }
            }while(error != 0);

            personagemEscolhido.setDinheiro(100);
            personagemEscolhido.setNome(nomePersonagem);

            System.out.println("\nDeseja ver os atributos do seu personagem ?\n1. Sim\n2. Não\n");
            int escolhaPrincipal = scanner.nextInt();
            if (escolhaPrincipal == 1) {
                System.out.println("\nAtributos iniciais da classe escolhida: \n");
                System.out.println("\n" + personagemEscolhido);
                System.out.println("\n************************************");
            }

            System.out.println(Text.posRegistro());

            // Dúvidas do jogador
            System.out.println("\nDeseja uma explicação de como funciona as dungeons ?\n1. Sim\n2. Não\n");
            escolhaPrincipal = scanner.nextInt();
            if (escolhaPrincipal == 1){
                System.out.println(Text.explicarDungeons());
            }
            System.out.println("Antes de desbravar as dungeons, tem mais alguma dúvida?\n1. Sim\n2. Não\n");
            escolhaPrincipal = scanner.nextInt();
            if (escolhaPrincipal == 1){
                while (escolhaPrincipal != 0){
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
                            System.out.println(Text.dungeonNomes());
                            break;
                        case 3:
                            System.out.println(Text.cidadesSobreviventes());
                            break;
                        case 4:
                            System.out.println(Text.monstrosDescobertos());
                            break;
                        case 5:
                            System.out.println(Text.explicarDinheiro());
                            break;
                        case 6:
                            System.out.println(Text.explicarItens());
                            break;
                        case 7:
                            System.out.println(Text.explicarPocoes());
                            break;
                        default:
                            System.out.println("Informe uma opção válida");
                            break;
                    }
                }
            }

            System.out.println(Text.fimApresentacaoBalconista());
            System.out.println("\n****************************************");
            System.out.println(Text.visitaLoja());
            GunShop.exibirItens(personagemEscolhido);
            System.out.println("Dinheiro restante: " + personagemEscolhido.getDinheiro() + " moedas.");
            System.out.println("\n'Tudo certo, acho que ja é hora de desafiar a primeira dungeon!\n");
            System.out.println(Text.entrarDungeon());

            System.out.println("-Ei herói... Quase me esqueci... Tome este punhado de experiência!");
        
            for(int totalRodadasDungeon = 0; totalRodadasDungeon <= 5; totalRodadasDungeon++){
                personagemEscolhido.ganharExperiencia(1000); // Começar no nível 10 == 2 habilidades
                Dungeon dungeon = new Dungeon(personagemEscolhido);
                dungeon.combate();
                if(personagemEscolhido.morreu){
                    break;
                }
                // Volte para a cidade
                // Compre mais itens
            }
            if(personagemEscolhido.morreu){
                System.out.println("Seu personagem morreu. Jogar novamente?\n1. Sim\n2. Não");
                int escolhaJogarNovamente = scanner.nextInt();
                if(escolhaJogarNovamente == 1){
                    continue;
                }else{
                    break;
                }
            }
            // Continuação da história.
        }
    }
}