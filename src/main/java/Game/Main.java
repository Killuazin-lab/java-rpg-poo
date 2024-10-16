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
import Game.Invocation.Invocacao;
import Game.Invocation.Planta;
import Game.Items.Flecha;
import Game.Monters.Monstro;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Monstro> monstros = new ArrayList<Monstro>();
        monstros.add(new Monstro("Goblin", 50, 20, 10, "Ataque Rápido"));
        monstros.add(new Monstro("Troll", 120, 40, 30, "Regeneração"));
        monstros.add(new Monstro("Dragão", 200, 60, 50, "Sopro de Fogo"));
        monstros.add(new Monstro("Esqueleto", 70, 25, 15, "Ataque Sombrio"));
        Random random = new Random();
        int indexAleatorio = random.nextInt(monstros.size());
        Monstro monstroEscolhido = monstros.get(indexAleatorio);

        System.out.println("************************************");
        System.out.println("Bem vindo ao RPG de texto em Java!");
        System.out.println("Prepare-ce para uma aventura épica!");
        System.out.println("************************************\n\n");
        
        System.out.println("Em um mundo dominado pelo caos, guerras, tiranias e atrocidades, ainda resta uma pequena fagulha de fé, uma fagulha que movimenta a esperança de todos do mundo.\nEssa faguha logo se tornou uma fonte, gerando herois para lutarem na tentativa de resaturar a paz\n" );
        System.out.println("Esses herois, que são chamados de Feixes de fé , eles terão que passar por diversos desafios e obstaculos em sua jornada.\n");

        System.out.println("Você é um recém formado em uma cidadela, um feixe de fé que sempre foi um grande aspirante, com grandes sonhos e ambições, e hoje é o dia de se registrar na guilda.\n");
        System.out.println("Você acaba de entrar no predio da guilda, e segue direto para o balcão onde se encontra a atendente, e ela diz:\n");
        System.out.println(" - Bem vindo a guilda, como posso ajudar hoje?\n");
        System.out.println("Você diz que deseja se registrar como um feixe de fé, e a atendente lhe passa um formulario para preencher.\n");

        System.out.println("\nQual o seu nome? ");
        String nomePersonagem = scanner.next();
        
        
        System.out.println("Qual a sua classe? ");
        System.out.println("1. Samurai (Usa uma Katana e possui golpes rapidos)");
        System.out.println("2. Mago (Usa uma variedade de magias)");
        System.out.println("3. Guerreiro (Usa uma espada e um escudo)");
        System.out.println("4. Arqueiro (Usa uma arco e flechas)");
        System.out.println("5. Ladino (Usa duas adagas e possui otima agilidade) ");
        System.out.println("6. Druida (Consegue usar o poder da natureza e espirituais)");
        System.out.println("7. Monge (Usa poderes sagrados e possui uma grande força física)");
        System.out.println("8. Necromante (Usa poderes das trevas e um exercito de mortos\n");

        int escolha = scanner.nextInt();
        Personagens personagemEscolhido = null;

        switch (escolha) {
            case 1: // NOME, HP, MP, ATK, DEF, HPR,MPR, V, XP, VATK, cast,range,CDR, nomeSkill
                Samurai samurai = new Samurai("Samurai", 100.0, 50.0, 70.0, 60.0, 3.0, 1.0, 1.3, 1.2, 1.3, 2.5, 1.5,
                        2.5, new String[] { "Corte Rápido", "Postura Defensiva" });

                personagemEscolhido = samurai;
                break;

            case 2: // NOME, HP, MP, ATK, DEF, HPR, MPR, V, XP, VATK, castM, rangeM, CDR, nomeMagia
                    // (ADICIONAR )
                Mago mago = new Mago("Mago", 80.0, 200.0, 40.0, 30.0, 1.5, 3.0, 1.0, 1.2, 1.0, 2.2, 4.0, 5.0,
                        new String[] { "Bola de Fogo", "Tiro de Gelo" });

                personagemEscolhido = mago;
                break;

            case 3: // NOME, HP, MP, ATK, DEF, HPR,MPR, V, XP, VATK, cast,range,CDR, nomeSkill
                    // (PASSIVA: QUANTO MENOS VIDA TIVER, MAIS REGEN DE VIDA)
                Guerreiro guerreiro = new Guerreiro("Guerreiro", 120.0, 30.0, 80.0, 70.0, 4.0, 1.5, 1.0, 1.2, 1.4, 2.8,
                        1.25, 2.5, new String[] { "Golpe Brutal", "Escudo Protetor" });

                personagemEscolhido = guerreiro;
                break;

            case 4: // NOME, HP, MP, ATK, DEF, HPR, MPR, XP, ATKS, MVS,cast,range,CDR, nomeSkill
                    // (ALTERAR MECANICA, SÓ PODE BATER COM FELHA)
                Arqueiro arqueiro = new Arqueiro("Arqueiro", 90.0, 40.0, 60.0, 50.0, 2.0, 2.0, 1.3, 1.5, 1.2, 3.0, 5.0,
                        2.0, new String[] { "Tiro Certeiro", "Tiro Duplo" });

                arqueiro.adicionarFlechaNaBolsa(new Flecha("Flecha Normal", 10, 5, 10));
                arqueiro.adicionarFlechaNaBolsa(new Flecha("Flecha Explosiva", 20, 10, 5));

                personagemEscolhido = arqueiro;
                break;

            case 5: // NOME, HP, MP, ATK, DEF, HPR, MPR, XP, ATKS, MVS,cast,range,CDR, nomeSkill
                    // (PASSIVA: CAUSA CRITCO NO PRIMEIRO HIT)
                personagemEscolhido = new Ladino("Ladino", 85.0, 45.0, 65.0, 45.0, 1.5, 2.5, 1.4, 1.7, 3.0, 1.5, 2.0,
                        2.5, new String[] { "Golpe Furtivo", "Fuga das Sombras" });
                break;

            case 6: // NOME, HP, MP, ATK, DEF, HPR,MPR, XP, ATKS, MVS,cast,range,CDR, nomeSkill
                    // (PASSIVA: (VAI POSSUIR UM ARSENAL DE "PLANTAS COM BASE NOS BROTOS (ZYRA)"))
                Druida druida = new Druida("Druida", 95.0, 150.0, 50.0, 40.0, 2.25, 2.75, 1.2, 1.0, 2.0, 2.3, 4.0, 3.5,
                        new String[] { "Crescer Semente", "Aura Curativa" });

                Planta espinheiro = new Planta("Espinheiro", 40, 10, 5, 3);
                System.out.println("\nO Druida começa ja com sua primeira Planta: ");
                druida.criarPlanta(espinheiro);

                personagemEscolhido = druida;

                break;

            case 7: // NOME, HP, MP, ATK, DEF, HPR,MPR, XP, ATKS, MVS,cast,range,CDR, nomeSkill, FÉ
                    // (PASSIVA: A CADA MEDITAÇÃO, AUMENTA UMA QUANTIDADE DE FÉ,O DANO É BASEADO NA
                    // FÉ)
                Monge monge = new Monge("Monge", 110.0, 60.0, 70.0, 50.0, 2.5, 2.5, 1.1, 1.2, 1.4, 2.7, 1.0, 1.5,
                        new String[] { "Golpe de Fé", "Meditação" }, 100);

                personagemEscolhido = monge;
                break;

            case 8: // NOME, HP, MP, ATK, DEF, HPR,MPR, XP, ATKS, MVS,cast,range,CDR, nomeSkill,
                    // trevas (DANO DAS INVOCAÇÕES AUMENTA COM BASE EM "TREVAS")
                Necromante necromante = new Necromante("Necromante", 90.0, 170.0, 55.0, 40.0, 4.0, 4.0, 1.3, 1.1, 2.1,
                        2.5, 3.2, 1.0, new String[] { "Invocação de Cadaver", "Comandar Cadaver" }, 120);

                Invocacao pequenoZumbi = new Invocacao("Pequeno Zumbi", 50, 10, 5, 5); // Zumbi com vida, ataque, defesa
                                                                                       // e duração
                necromante.adicionarInvocacao(pequenoZumbi);

                personagemEscolhido = necromante;
                break;

            default:
                System.out.println("\nOpção inválida. Escolha uma classe válida.");
                break;

        }

        if (personagemEscolhido != null) {
            personagemEscolhido.setNome(nomePersonagem);
            System.out.println("\nDeseja ver os atributos do seu personagem ?");
            System.out.println("1. Sim");
            System.out.println("2. Não\n");
            int escolhaAtributos = scanner.nextInt();
            if (escolhaAtributos == 1) {
                System.out.println("\nAtributos iniciais da classe escolihda: \n");
                System.out.println("\n" + personagemEscolhido);
                System.out.println("\n************************************");

            }
            
            System.out.println("\n");
            System.out.println("Após preencher o formulario, você entrega ele para a atendente, ela agradeçe e te entrega a sua identificação de feixe novato junto de um discurso rapido.\n");
            System.out.println(" - Pequeno Feixe, adentre masmorras, supere os seus limites, ganhe mais experiência e evolue, para enfim derrotar o Aarfeus, o rei dos demonios, mas, acima de tudo");

            personagemEscolhido.ganharExperiencia(10520);
            personagemEscolhido.mostrarHabilidades();

            //TESTE

        }
    }
}

// ai dps que o cara escolher temos que fazer algo
// por custo de mana nas skils e tals
// da tambem para criar equipamentos, como armadura e arma, creio que seria
// legal

// ANOTAÇÕES

// CRIAÇÃO DE MONSTROS

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

// AREA SOBRE A CRIAÇÃO DE ITENS

// Item espadaCursed = new Item("Espada Amaldiçoada", "Aumenta muito o ataque,
// mas reduz vida\n", 20, 0, -10, 0, 0, -10);
// Item elmoSabio = new Item("Chapeu de mago", "Aumenta a mana, mas reduz a
// velocidade\n", 0, 5, 0, 15, -5, 0);

// // Equipando itens
// personagemEscolhido.equiparItem(espadaCursed);
// personagemEscolhido.equiparItem(elmoSabio);

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
