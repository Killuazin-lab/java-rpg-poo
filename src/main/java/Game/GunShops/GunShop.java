package Game.GunShops;

import java.util.Scanner;

import Game.ClassCharacters.Personagens;
import Game.Items.ReadyItems;

public class GunShop {

    // Exibe os itens disponíveis para compra e permite que o herói compre
    public static void exibirItens(Personagens personagem) {
        System.out.println(" -Bem-vindo à loja de Equipamentos! Escolha um item para comprar:\n");
        System.out.println(" Você possui atualmente " + personagem.getDinheiro());
        System.out.println("1. Espada de Aço - 100 moedas");
        System.out.println("2. Escudo de Madeira - 80 moedas");
        System.out.println("3. Poção de Vida - 70 moedas");
        System.out.println("4. Botas de Velocidade - 70 moedas");
        System.out.println("5. Espada Grande - 100 moedas");
        System.out.println("6. Martelo da Forja - 80 moedas");
        System.out.println("7. Cetro de Magias - 95 moedas");
        System.out.println("8. Escudo de Diamante - 100 moedas");
        System.out.println("9. Botas de Vento - 75 moedas\n");
        
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                if (personagem.gastarDinheiro(100)) {
                    personagem.coletarItens(ReadyItems.espadaDeAco());
                }
                break;
                
            case 2:
                if (personagem.gastarDinheiro(80)) {
                    personagem.coletarItens(ReadyItems.escudoDeMadeira());
                }
                break;
                
            case 4:
                if (personagem.gastarDinheiro(70)) {
                    personagem.coletarItens(ReadyItems.botasDeVelocidade());
                }
                break;
            case 5:
                if (personagem.gastarDinheiro(100)) {
                    personagem.coletarItens(ReadyItems.espadaGrande());
                }
                break; 
            case 6:
                if (personagem.gastarDinheiro(80)) {
                    personagem.coletarItens(ReadyItems.marteloDaForja());
                }
                break;
            case 7:
                if (personagem.gastarDinheiro(95)) {
                    personagem.coletarItens(ReadyItems.cetroDeMagias());
                }
                break;
            case 8:
                if (personagem.gastarDinheiro(100)) {
                    personagem.coletarItens(ReadyItems.escudoDeDiamante());
                }
                break;
            case 9:
                if (personagem.gastarDinheiro(75)) {
                    personagem.coletarItens(ReadyItems.botasDeVento());
                }
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
