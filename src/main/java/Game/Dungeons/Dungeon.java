package Game.Dungeons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

import Game.Dungeons.SistemaDrop;
import Game.ClassCharacters.Criatura;
import Game.ClassCharacters.Personagens;
import Game.Items.Item;
import Game.Items.ReadyItems;
import Game.Monters.Monstro;
import Game.Monters.Monstros;
import Game.Texts.Text;

public class Dungeon {
    private ArrayList<Monstro> monstrosDungeon;
    private Personagens personagemEscolhido;

    public Dungeon(Personagens personagemEscolhido){
        this.monstrosDungeon = gerarMonstro();
        this.personagemEscolhido = personagemEscolhido;
    }

    private ArrayList<Monstro> gerarMonstro() {
        ArrayList<Monstro> monstrosDisponiveis = new ArrayList<Monstro>();
        monstrosDisponiveis.add(Monstros.slime()); 
        monstrosDisponiveis.add(Monstros.slimeDeMusgo());
        monstrosDisponiveis.add(Monstros.goblin());
        monstrosDisponiveis.add(Monstros.goblinXama());
        monstrosDisponiveis.add(Monstros.dragao());
        monstrosDisponiveis.add(Monstros.dragaoFlamejante());
        monstrosDisponiveis.add(Monstros.loboDePedra());
        monstrosDisponiveis.add(Monstros.lobisomemDePedra());
        monstrosDisponiveis.add(Monstros.demonioDaEscuridao());
        monstrosDisponiveis.add(Monstros.demonioFlamejante());

        Random random = new Random();
        int quantidadeMonstro = random.nextInt(2) + 5;

        ArrayList<Monstro> monstrosDungeon = new ArrayList<Monstro>();
        for (int i = 0; i < quantidadeMonstro; i++) {
            Monstro monstroAleatorio = monstrosDisponiveis.get(random.nextInt(monstrosDisponiveis.size()+1));
            monstrosDungeon.add(monstroAleatorio);
        }
        return monstrosDungeon;
    }
    
    private void ordenarMonstros(){
        // Bubble Sort -> Ordenar monstro por ataque (menor -> maior)
        for(int i = 0; i < this.monstrosDungeon.size() - 1; i++){
            for(int j = 0; j < this.monstrosDungeon.size() - 1 - i; j++){
                if(this.monstrosDungeon.get(j).getAtaque() > this.monstrosDungeon.get(j + 1).getAtaque()){
                    Monstro temp = this.monstrosDungeon.get(j);
                    this.monstrosDungeon.set(j, this.monstrosDungeon.get(j + 1));
                    this.monstrosDungeon.set(j + 1, temp);
                }
            }
        }
    }

    // Sistema de combate por turnos
    public void combate() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        ordenarMonstros();

        int round = 0;
        for(Monstro monstro: monstrosDungeon){
            boolean personagemComeca = caraCoroa(personagemEscolhido, monstro);
            int roundUltimateMonstro = roundUltimateMonstro(round);

            while(personagemEscolhido.getVida() > 0 && monstro.getVida() > 0){
               System.out.println("Round: " + round); 

               if(personagemComeca){
                int escolhaAtaque = escolherAtaque();

                switch (escolhaAtaque) {
                    case 1:
                        System.out.println("Escolha o item para atacar o monstro:\n");
                        System.out.println("\n" + personagemEscolhido.getNome() + "usou seu item.");
                        monstro.sofrerDano(personagemEscolhido.getAtaque());
                        break;
                    case 2:
                        System.out.println("\n" + personagemEscolhido.getNome() + "usou sua habilidade.");
                        monstro.sofrerDano(personagemEscolhido.getAtaque());
                        break;
                    case 3:
                        System.out.println("\n" + personagemEscolhido.getNome() + "deu um socão!");
                        monstro.sofrerDano(personagemEscolhido.getAtaque());
                        break;
                    
                    case 4:
                        System.out.println("\nVocê escolheu fugir da luta, e consequentemente, sair da Dungeon");

                    default:
                        System.out.println("\nEscolha uma opção válida!");
                        break;
                }

                if(roundUltimateMonstro == round){
                    System.out.println("MONSTER ULTIMATE!" +
                     "\nVocê foi atacado por " + monstro.getHabilidadeEspecial() + "\nSe lascou!");
                    personagemEscolhido.sofrerDano(monstro.getAtaqueHabilidadeEspecial());
                }else{
                    System.out.println("\nPrepare-se! O monstro irá atacar!");
                    personagemEscolhido.sofrerDano(monstro.getAtaque());
                }
                round = round + 1;
               }else{
                System.out.println("\nProgramar a lógica para o monstro começando.");
               }
               round++;
            }
        } 
    }

    private boolean caraCoroa(Personagens personagemEscolhido, Monstro monstro){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("CARA ou COROA?\n1. Cara\n2. Coroa");
        int caraCoroa = scanner.nextInt();
        caraCoroa = caraCoroa - 1;
        int escolhaCaraCoroa = random.nextInt(2);
        boolean personagemComeca = caraCoroa == escolhaCaraCoroa;

        System.out.println(personagemEscolhido.getNome() + "VS" + monstro.getNome());
        if(personagemComeca){
            System.out.println(personagemEscolhido.getNome() + " começa!\n");
        }else{
            System.out.println("O monstro começa!");
        }
        return personagemComeca;
    }

    private int roundUltimateMonstro(int round){
        Random random = new Random();
        int roundUltimateMonstro = random.nextInt(10);
        return roundUltimateMonstro;
    }

    private int escolherAtaque(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha seu ataque:\n");
        System.out.println(Text.ataquesDisponiveis());
        int escolhaAtaque = scanner.nextInt();
        return escolhaAtaque;
    }

    private void caso1UsarItem(){}

    private void caso2UsarHabilidade(){}

    private void caso3UsarAtaqueBásico(){}

    private void caso4UsarFuga(){}

}
