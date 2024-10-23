package Game.GunShops;

import java.util.Scanner;

import Game.ClassCharacters.Personagens;
import Game.Items.ReadyItems;

public class GunShop {

    // Exibe os itens disponíveis para compra e permite que o herói compre
    public static void exibirItens(Personagens personagem) {
        System.out.println(" -Bem-vindo à loja de Equipamentos! Escolha um item para comprar:\n");
        System.out.println("1. Espada de Aço - 100 moedas");
        System.out.println("2. Escudo de Madeira - 80 moedas");
        System.out.println("3. Poção de Vida - 50 moedas");
        System.out.println("4. Botas de Velocidade - 70 moedas");
        System.out.println("5. Espada Grande - 150 moedas");
        System.out.println("6. Martelo da Forja - 130 moedas");
        System.out.println("7. Cetro de Magias - 125 moedas");
        System.out.println("\n Dinheiro atual: " + personagem.getDinheiro() + " moedas.");

        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                if (personagem.gastarDinheiro(100)) {
                    personagem.equiparItem(ReadyItems.espadaDeAco());
                }
                break;
                
            case 2:
                if (personagem.gastarDinheiro(80)) {
                    personagem.equiparItem(ReadyItems.escudoDeMadeira());
                }
                break;
                
            case 4:
                if (personagem.gastarDinheiro(70)) {
                    personagem.equiparItem(ReadyItems.botasDeVelocidade());
                }
                break;
            case 5:
                if (personagem.gastarDinheiro(150)) {
                    personagem.equiparItem(ReadyItems.espadaGrande());
                }
                break; 
            case 6:
                if (personagem.gastarDinheiro(130)) {
                    personagem.equiparItem(ReadyItems.marteloDaForja());
                }
                break;
            case 7:
                if (personagem.gastarDinheiro(125)) {
                    personagem.equiparItem(ReadyItems.cetroDeMagias());
                }
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}