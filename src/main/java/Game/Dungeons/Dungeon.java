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
import Game.Skills.Habilidade;
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
            Monstro monstroAleatorio = monstrosDisponiveis.get(random.nextInt(monstrosDisponiveis.size()));
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
        int vidaMaxima = personagemEscolhido.getVida(); 
        int round = 0;
        for(Monstro monstro: monstrosDungeon){
            
            boolean personagemComeca = caraCoroa(monstro);
            int roundUltimateMonstro = roundUltimateMonstro(round);

            while(this.personagemEscolhido.getVida() > 0 && monstro.getVida() > 0){
               System.out.println("Round: " + round); 
               System.out.println("Vida do personagem: " + this.personagemEscolhido.getVida() + "\n");
               System.out.println("Vida do " + monstro.getNome()+ " : " + monstro.getVida());

               if(personagemComeca){
                personagemAtacar(monstro);
                if (monstro.getVida() <= 0) break;
                monstroAtacar(monstro, round, roundUltimateMonstro);
                personagemComeca = false;
               }else{
                monstroAtacar(monstro, round, roundUltimateMonstro);
                if (this.personagemEscolhido.getVida() <= 0) break;
                personagemAtacar(monstro);
                personagemComeca = true;
               }
               round = round + 1;
            }
            if(personagemEscolhido.morreu){
                break;
            }
            if(monstro.getVida() <= 0){
                System.out.println("Parabéns você matou o monstro!\n Vamos para o próximo...\n");
                System.out.println("Você recupera uma certa quatidade de vida\n");
                personagemEscolhido.setVida(vidaMaxima + 50);
                personagemEscolhido.setMana(personagemEscolhido.getMana() + 60);
                Random random = new Random();
                int chanceDrop = random.nextInt(3);
                if (chanceDrop == 2){
                    SistemaDrop.verificarDrop(personagemEscolhido);
                }
                continue;
            }
        } 
    }

    private boolean caraCoroa(Monstro monstro){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("CARA ou COROA?\n1. Cara\n2. Coroa\n");
        int caraCoroa = scanner.nextInt();
        caraCoroa = caraCoroa - 1;
        int escolhaCaraCoroa = random.nextInt(2);
        boolean personagemComeca = caraCoroa == escolhaCaraCoroa;

        System.out.println("\n" + this.personagemEscolhido.getNome() + " VS " + monstro.getNome() + "\n");
        if(personagemComeca){
            System.out.println(this.personagemEscolhido.getNome() + " começa!\n");
        }else{
            System.out.println("O "+ monstro.getNome() +" começa!");
        }
        return personagemComeca;
    }

    private int roundUltimateMonstro(int round){
        Random random = new Random();
        int roundUltimateMonstro = random.nextInt(5);
        return roundUltimateMonstro;
    }

    private int escolherAtaque(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEscolha seu ataque:");
        System.out.println(Text.ataquesDisponiveis());
        int escolhaAtaque = scanner.nextInt();
        return escolhaAtaque;
    }

    private void caso1UsarAtaqueBasico(Monstro monstro){
        System.out.println("\n" + this.personagemEscolhido.getNome() + " deu um Ataque Basico");
        monstro.sofrerDano(this.personagemEscolhido.getAtaque());
        System.out.println(monstro.getNome() + " sofreu " + this.personagemEscolhido.getAtaque() + " de dano.");
        System.out.println(monstro.getNome() + " ficou com " + monstro.getVida() + " de vida.\n");
    }

    private void caso2UsarHabilidade(Monstro monstro){
        Scanner scanner = new Scanner(System.in);
        int indiceHabilidade = 1;
        for(Habilidade habilidade : personagemEscolhido.getHabilidade()){
            System.out.println(indiceHabilidade + ". " + habilidade.getNome());
            indiceHabilidade += 1;
        }
        int escolhaHabilidade = scanner.nextInt();
        int danoTotal = personagemEscolhido.usarHabilidade(escolhaHabilidade - 1);
        System.out.println("\n" + this.personagemEscolhido.getNome() + " usou sua habilidade.");
        monstro.sofrerDano(danoTotal);
        System.out.println(monstro.getNome() + " sofreu " + danoTotal + " de dano.");
        System.out.println(monstro.getNome() + " ficou com " + monstro.getVida() + " de vida.\n");
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
        System.out.println(monstro.getNome() + " sofreu " + this.personagemEscolhido.getAtaque() + " de dano.");
        System.out.println(monstro.getNome() + " ficou com " + monstro.getVida() + " de vida.\n");
        this.personagemEscolhido.desequiparItem(itemEquipado);
    }

    public void personagemAtacar(Monstro monstro){
        int escolhaAtaque = escolherAtaque();
        switch (escolhaAtaque) {
            case 1:
                caso1UsarAtaqueBasico(monstro); // FEITO
                break;
            case 2:
                caso2UsarHabilidade(monstro); // FEITO
                break;
            case 3:
                caso3UsarItem(monstro); // FEITO
                break;
            default:
                System.out.println("\nEscolha uma opção válida!");
                break;
        }
    }

    public void monstroAtacar(Monstro monstro, int round, int roundUltimateMonstro){
        if(roundUltimateMonstro == round){
            System.out.println("O " + monstro.getNome() +" usou su habilidade Suprema " +
             "\nVocê foi atacado por " + monstro.getHabilidadeEspecial() + " Se Lascou zé!");
            this.personagemEscolhido.sofrerDano(monstro.getAtaqueHabilidadeEspecial());
            System.out.println("Você ficou com " + personagemEscolhido.getVida() + " de vida");
        }else{
            System.out.println("\nPrepare-se! O " + monstro.getNome() + " irá atacar!\n");
            this.personagemEscolhido.sofrerDano(monstro.getAtaque());
            System.out.println("O " + monstro.getNome() + " te atacou e você ficou com " + personagemEscolhido.getVida() + " de vida.\n" );
        }
        if(personagemEscolhido.getVida() <= 0){
            personagemEscolhido.morreu = true;
        }
    }

    public boolean combaterBossFinal(Monstro bossFinal){
        int round = 0;
        int vidaMaxima = personagemEscolhido.getVida(); 
        while(this.personagemEscolhido.getVida() > 0 && bossFinal.getVida() > 0){
            personagemEscolhido.setVida(vidaMaxima + 50);
            int roundUltimateBossFinal = roundUltimateMonstro(round);
            System.out.println("Round: " + round); 
            System.out.println("Vida do personagem: " + this.personagemEscolhido.getVida() + "\n");
            System.out.println("Vida do " + bossFinal.getNome()+ " : " + bossFinal.getVida());

            personagemAtacar(bossFinal);
            if (bossFinal.getVida() <= 0){
                boolean personagemVenceu = true;
                return personagemVenceu;
            };
            monstroAtacar(bossFinal, round, roundUltimateBossFinal);
            if (personagemEscolhido.getVida() <= 0){
                boolean bossVenceu = false;
                return bossVenceu;
            }
        }
        return false;
    }
}