package Game.Dungeons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;

import Game.Dungeons.SistemaDrop;
import Game.ClassCharacters.Personagens;
import Game.Items.Item;
import Game.Items.ReadyItems;
import Game.Monters.Monstro;
import Game.Monters.Monstros;

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

    // Sistema de combate por turnos
    public void combate() {
        CharacterMonsterDTO characterMonsterDTO = new CharacterMonsterDTO(this.personagemEscolhido, this.monstrosDungeon);
        ArrayList<CharacterMonsterDTO> combatentes = new ArrayList<CharacterMonsterDTO>();
        combatentes.add(characterMonsterDTO);
        System.out.println(combatentes.size());
        for(CharacterMonsterDTO combantente : combatentes){
            System.out.println(combantente);
        }


        
        /*  Ordenar por velocidade
        personagens = ordenarPorVelocidade(personagens);

        boolean emCombate = true;

        while (emCombate) {
            for (Personagens Combatente : personagens) {
                if (Combatente instanceof Monstro) {
                    // Monstro ataca o herói
                    System.out.println(Combatente.getNome() + " ataca o herói!");
                    personagemEscolhido.receberDano(Combatente.getAtaque());
                    if (personagemEscolhido.getVida() <= 0) {
                        System.out.println("O herói foi derrotado!");
                        emCombate = false;
                        break;
                    }
                } else {
                    // Herói ataca monstro
                    Monstro monstro = Monstro.get(0); // Seleciona o primeiro monstro
                    System.out.println("Herói ataca " + monstro.getNome());
                    monstro.receberDano(personagemEscolhido.getAtaque());

                    if (monstro.getVida() <= 0) {
                        System.out.println(monstro.getNome() + " foi derrotado!");
                        Monstro.remove(monstro); // Remove o monstro derrotado
                        SistemaDrop.verificarDrop(personagemEscolhido);

                        if (Monstro.isEmpty()) {
                            System.out.println("Todos os Monstro foram derrotados! A dungeon está limpa.");
                            emCombate = false;
                            break;
                        }
                    }
                }
            }

            // Herói recupera um pouco de vida e mana após cada turno
            personagemEscolhido.recuperarVida(10); // Exemplo: Recupera 10 de vida por turno
            personagemEscolhido.recuperarMana(5); // Exemplo: Recupera 5 de mana por turno
        }*/
    }
}