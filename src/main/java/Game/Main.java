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
        Scanner scanner = new Scanner(System.in);

        ArrayList<Monstro> monstros = new ArrayList<Monstro>();
        
        /*
        monstros.add(new Monstro("Goblin", 50, 20, 10, "Ataque Rápido"));
        monstros.add(new Monstro("Troll", 120, 40, 30, "Regeneração"));
        monstros.add(new Monstro("Dragão", 200, 60, 50, "Sopro de Fogo"));
        monstros.add(new Monstro("Esqueleto", 70, 25, 15, "Ataque Sombrio")); */
        
        Random random = new Random();
        int indexAleatorio = random.nextInt(monstros.size());
        Monstro monstroEscolhido = monstros.get(indexAleatorio);

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
                case 1:         // NOME, HP, MP, ATK, DEF, HPR,MPR, V, XP, VATK, cast,range,CDR, nomeSkill                                
                    Samurai samurai = CreateCharacter.createSamurai();
                    personagemEscolhido = samurai;
                    error = 0;
                    break;
                case 2:         // NOME, HP, MP, ATK, DEF, HPR, MPR, V, XP, VATK, castM, rangeM, CDR, nomeMagia (ADICIONAR )
                    Mago mago = CreateCharacter.createMago();
                    personagemEscolhido = mago;
                    error = 0;
                    break;
                case 3: // NOME, HP, MP, ATK, DEF, HPR,MPR, V, XP, VATK, cast,range,CDR, nomeSkill // (PASSIVA: QUANTO MENOS VIDA TIVER, MAIS REGEN DE VIDA)
                    Guerreiro guerreiro = CreateCharacter.createGuerreiro();
                    personagemEscolhido = guerreiro;
                    error = 0;
                    break;
                case 4: // NOME, HP, MP, ATK, DEF, HPR, MPR, XP, ATKS, MVS,cast,range,CDR, nomeSkill // (ALTERAR MECANICA, SÓ PODE BATER COM FELHA)
                    Arqueiro arqueiro = CreateCharacter.createArqueiro();
                    personagemEscolhido = arqueiro;
                    error = 0;
                    break;
                case 5: // NOME, HP, MP, ATK, DEF, HPR, MPR, XP, ATKS, MVS,cast,range,CDR, nomeSkill// (PASSIVA: CAUSA CRITCO NO PRIMEIRO HIT)
                    Ladino ladino = CreateCharacter.createLadino();
                    personagemEscolhido = ladino;
                    error = 0;
                    break;
                case 6: // NOME, HP, MP, ATK, DEF, HPR,MPR, XP, ATKS, MVS,cast,range,CDR, nomeSkill// (PASSIVA: (VAI POSSUIR UM ARSENAL DE "PLANTAS COM BASE NOS BROTOS (ZYRA)"))
                    Druida druida = CreateCharacter.createDruida();
                    personagemEscolhido = druida;
                    error = 0;
                    break;
                case 7: // NOME, HP, MP, ATK, DEF, HPR,MPR, XP, ATKS, MVS,cast,range,CDR, nomeSkill, FÉ // (PASSIVA: A CADA MEDITAÇÃO, AUMENTA UMA QUANTIDADE DE FÉ,O DANO É BASEADO NA// FÉ)
                    Monge monge = CreateCharacter.createMonge();
                    personagemEscolhido = monge;
                    error = 0;
                    break;
                case 8: // NOME, HP, MP, ATK, DEF, HPR,MPR, XP, ATKS, MVS,cast,range,CDR, nomeSkill, // trevas (DANO DAS INVOCAÇÕES AUMENTA COM BASE EM "TREVAS")
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

        Dungeon dungeon = new Dungeon(personagemEscolhido);
        dungeon.combate();
    }
}