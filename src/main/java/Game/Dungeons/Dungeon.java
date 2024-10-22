package Game.Dungeons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;

import Game.Dungeons.SistemaDrop;
import Game.ClassCharacters.Personagens;
import Game.Combatant.Combatente;
import Game.Items.Item;
import Game.Items.ReadyItems;
import Game.Monters.Monstro;
import Game.Monters.Monstros;

public class Dungeon {

    // Gera de 5 a 6 Monstro aleatórios
    public static ArrayList<Monstro> gerarMonstro() {
        ArrayList<Monstro> MonstroDisponiveis = new ArrayList<Monstro>();
        MonstroDisponiveis.add(Monstros.slime()); // Adicionar Monstro que você já criou
        MonstroDisponiveis.add(Monstros.goblin());
        MonstroDisponiveis.add(Monstros.dragao());
        MonstroDisponiveis.add(Monstros.lobisomem());
        MonstroDisponiveis.add(Monstros.demonio());
        // etc...

        Random random = new Random();
        int quantidadeMonstro = random.nextInt(2) + 5; // Gera 5 ou 6 Monstro

        ArrayList<Monstro> MonstroDungeon = new ArrayList<Monstro>();
        for (int i = 0; i < quantidadeMonstro; i++) {
            Monstro monstroAleatorio = MonstroDisponiveis.get(random.nextInt(MonstroDisponiveis.size()));
            MonstroDungeon.add(monstroAleatorio);
        }

        return MonstroDungeon;
    }

    // Ordena a lista de personagens e Monstro pela velocidade
    public static ArrayList<Personagens> ordenarPorVelocidade(ArrayList<Personagens> personagens) {        
        Collections.sort(personagens, (Combatente p1, Combatente p2) -> p2.getVelocidade() - p1.getVelocidade());        
        return personagens;
    }

    // Sistema de combate por turnos
    public static void combate(Personagens personagemEscolhido, ArrayList<Monstro> Monstro) {
        ArrayList<Personagens> Combatentes = new ArrayList<Personagens>();
        Combatentes.add(personagemEscolhido);
        Combatentes.addAll(Monstro.stream().map(m -> (Personagens) m).collect(Collectors.toList())); // Adiciona os Monstro como Combatentes

        // Ordenar por velocidade
        Combatentes = ordenarPorVelocidade(Combatentes);

        boolean emCombate = true;

        while (emCombate) {
            for (Personagens Combatente : Combatentes) {
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
        }
    }
