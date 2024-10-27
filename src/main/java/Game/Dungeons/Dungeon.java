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
        ordenarMonstros();

        int round = 0;
        for(Monstro monstro: monstrosDungeon){
            boolean personagemComeca = caraCoroa(monstro);
            int roundUltimateMonstro = roundUltimateMonstro(round);

            while(this.personagemEscolhido.getVida() > 0 && monstro.getVida() > 0){
               System.out.println("Round: " + round); 
               System.out.println("Vida do personagem: " + this.personagemEscolhido.getVida() + "\n");
               System.out.println("Vida do monstro: " + monstro.getVida());

               if(personagemComeca){
                int escolhaAtaque = escolherAtaque();

                switch (escolhaAtaque) {
                    case 1:
                        caso1UsarAtaqueBásico(monstro); // FEITO
                        break;
                    case 2:
                        caso2UsarHabilidade(monstro);
                        break;
                    case 3:
                        caso3UsarItem(monstro); // FEITO
                        break;
                    case 4:
                        caso4UsarFuga();
                        break;
                    default:
                        System.out.println("\nEscolha uma opção válida!");
                        break;
                }

                if(roundUltimateMonstro == round){
                    System.out.println("MONSTER ULTIMATE!" +
                     "\nVocê foi atacado por " + monstro.getHabilidadeEspecial() + "\nSe lascou!");
                    this.personagemEscolhido.sofrerDano(monstro.getAtaqueHabilidadeEspecial());
                }else{
                    System.out.println("\nPrepare-se! O monstro irá atacar!");
                    this.personagemEscolhido.sofrerDano(monstro.getAtaque());
                }
                round = round + 1;
               }else{
                System.out.println("\nProgramar a lógica para o monstro começando.");
               }
               round++;
            }
        } 
    }

    private boolean caraCoroa(Monstro monstro){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("CARA ou COROA?\n1. Cara\n2. Coroa");
        int caraCoroa = scanner.nextInt();
        caraCoroa = caraCoroa - 1;
        int escolhaCaraCoroa = random.nextInt(2);
        //boolean personagemComeca = caraCoroa == escolhaCaraCoroa;
        boolean personagemComeca = true;

        System.out.println("\n" + this.personagemEscolhido.getNome() + " VS " + monstro.getNome() + "\n");
        if(personagemComeca){
            System.out.println(this.personagemEscolhido.getNome() + " começa!\n");
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
        System.out.println("Escolha seu ataque:");
        System.out.println(Text.ataquesDisponiveis());
        int escolhaAtaque = scanner.nextInt();
        return escolhaAtaque;
    }

    
    private void caso1UsarAtaqueBásico(Monstro monstro){
        System.out.println("\n" + this.personagemEscolhido.getNome() + "deu um socão!");
        monstro.sofrerDano(this.personagemEscolhido.getAtaque());
        System.out.println(monstro + " sofreu " + this.personagemEscolhido.getAtaque() + " de dano.");
        System.out.println(monstro + " ficou com " + monstro.getVida() + " de vida.\n");
    }

    private void caso2UsarHabilidade(Monstro monstro){
        System.out.println("\n" + this.personagemEscolhido.getNome() + "usou sua habilidade.");
        monstro.sofrerDano(this.personagemEscolhido.getAtaque());
    }

    private void caso3UsarItem(Monstro monstro){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o item para atacar o monstro:\n");
        int indexItem = 1;
        for(Item item : this.personagemEscolhido.getItensColetados()){
            System.out.println(indexItem + ". " + item.getNome());
            indexItem = indexItem + 1;
        }
        int indexEscolhaIem = scanner.nextInt();
        Item itemEquipado = this.personagemEscolhido
                            .getItensColetados()
                            .get(indexEscolhaIem - 1);
        if(this.personagemEscolhido.getItemEquipado() != null){
            this.personagemEscolhido.desequiparItem(this.personagemEscolhido.getItemEquipado());
        }
        this.personagemEscolhido.equiparItem(itemEquipado);
        System.out.println("\n" + this.personagemEscolhido.getNome() + " usou seu item.");
        monstro.sofrerDano(this.personagemEscolhido.getAtaque());
        System.out.println(monstro + " sofreu " + this.personagemEscolhido.getAtaque() + " de dano.");
        System.out.println(monstro + " ficou com " + monstro.getVida() + " de vida.\n");
        this.personagemEscolhido.desequiparItem(itemEquipado);
    }

    private void caso4UsarFuga(){
        System.out.println("\nVocê escolheu fugir da luta, e consequentemente, sair da Dungeon");
    }

}
