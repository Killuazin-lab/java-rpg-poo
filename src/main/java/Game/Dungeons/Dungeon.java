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
        monstrosDisponiveis.add(Monstros.slimeGrande());
        monstrosDisponiveis.add(Monstros.goblin());
        monstrosDisponiveis.add(Monstros.goblinXama());
        monstrosDisponiveis.add(Monstros.dragao());
        monstrosDisponiveis.add(Monstros.dragaoRei());
        monstrosDisponiveis.add(Monstros.lobo());
        monstrosDisponiveis.add(Monstros.lobisomem());
        monstrosDisponiveis.add(Monstros.demonio());
        monstrosDisponiveis.add(Monstros.demonioRei());

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

        System.out.println("CARA ou COROA?\nEscolha:\n1. Cara\n2. Coroa");
        int caraCoroa = scanner.nextInt();
        caraCoroa = caraCoroa - 1;
        int escolhaCaraCoroa = random.nextInt(2);
        boolean personagemComeca = caraCoroa == escolhaCaraCoroa;

        if(personagemComeca){
            System.out.println(personagemEscolhido.getNome() + "começa!");
        }else{
            System.out.println("O monstro começa!");
        }

        int round = 0;

        // Decidir o round da ultimate do monstro
        int roundUltimate = random.nextInt(7);
        boolean monstroUltimate = roundUltimate == round;

        for(Monstro monstro: monstrosDungeon){
            // ESCREVER UMA CONTINUAÇÃO DA HISTORIA ANTES DE IR PARA O PROXIMO MONSTRO
            // PERSONAGEM ACHA NOVOS ITENS NO CAMINHO PARA SEREM EQUIPADOS
            // REGENERAR VIDA ANTES DE LUTAR NOVAMENTE 
            while(personagemEscolhido.getVida() > 0 && monstro.getVida() > 0){
               System.out.println("Round " + round + ". FIGHT!"); 

               if(personagemComeca){
                System.out.println(Text.ataquesDisponiveis());
                int escolhaAtaque = scanner.nextInt();

                // Ataque do personagem
                switch (escolhaAtaque) {
                    case 1:
                        System.out.println(personagemEscolhido.getNome() + "atacou com um martelo.");
                        monstro.sofrerDano(personagemEscolhido.getAtaque());
                        break;
                    case 2:
                        System.out.println(personagemEscolhido.getNome() + "usou sua habilidade.");
                        monstro.sofrerDano(personagemEscolhido.getAtaque());
                        break;
                    case 3:
                        System.out.println(personagemEscolhido.getNome() + "deu um socão!");
                        monstro.sofrerDano(personagemEscolhido.getAtaque());
                        break;

                    default:
                        System.out.println("Escolha uma opção válida!");
                        break;
                }

                if(monstroUltimate){
                    System.out.println("MONSTER ULTIMATE!" +
                     "\nVocê foi atacado por " + monstro.getHabilidadeEspecial() + "\nSe lascou!");
                    personagemEscolhido.sofrerDano(monstro.getAtaqueHabilidadeEspecial());
                }else{
                    System.out.println("Prepare-se! O monstro irá atacar!");
                    personagemEscolhido.sofrerDano(monstro.getAtaque());
                }
                round = round + 1;
               }else{
                System.out.println("Programar a lógica para o monstro começando.");
               }
            }
        } 
    }
}