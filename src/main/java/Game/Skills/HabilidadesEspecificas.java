package Game.Skills;

import java.util.HashMap;
import java.util.Map;


public class HabilidadesEspecificas {
    private static Map<String, Map<Integer, Habilidade>> habilidadesPorClasse = new HashMap<>();

    static {
        // Habilidades do Mago
        Map<Integer, Habilidade> habilidadesMago = new HashMap<>(); 
        habilidadesMago.put(5, new Habilidade("Bola de Fogo", "Lança uma bola de fogo que queima o inimigo.", 20, 15, 1, false));
        habilidadesMago.put(10, new Habilidade("Tiro de Gelo", "Dispara um projetil de gelo em direção ao inimigo." , 30, 35, 2, false));
        habilidadesMago.put(15, new Habilidade("Tiro de Pedra", "Dispara projeteis de pedra em direção ao inimigo.", 50, 35, 3, false));
        habilidadesMago.put(20, new Habilidade("Tempestade de Gelo", "Cria uma tempestade de gelo que congela os inimigos.", 60, 50, 4, false));
        habilidadesMago.put(25, new Habilidade("Explosão Arcana", "Explode uma onda de energia arcana ao redor do mago.", 70, 60, 5, false));
        habilidadesMago.put(30, new Habilidade("Pilar de Chamas", "Cria um grande pilar de fogo sobre os pés do seu inimigo.", 80, 70, 5, false));
        habilidadesMago.put(35, new Habilidade("Bola Negra", "Invoca uma esfera de energia negra e atira no seu inimigo", 90, 85, 6, false));
        habilidadesMago.put(40, new Habilidade("Pila de Gelo", "Cria um pilar de gelo sobre os pés do seu inimigo.", 100, 90, 7, false));
        habilidadesMago.put(45, new Habilidade("Feixe de Luz", "Cria um grande feixe de luz, que causa bastante dano", 130, 95, 8, false));
        habilidadesMago.put(50, new Habilidade("Zero Absoluto", "Cria uma enorme tempestade de gelo, causando dano extremo e impedindo inimigos de ataquerem por 2 turnos", 300, 110, 8, true));
        habilidadesPorClasse.put("Mago", habilidadesMago);

        // Habilidades do Guerreiro
        Map<Integer, Habilidade> habilidadesGuerreiro = new HashMap<>();
        habilidadesGuerreiro.put(5, new Habilidade("Golpe Devastador", "Um golpe forte que causa grande dano.", 20, 15, 2, false));
        habilidadesGuerreiro.put(10, new Habilidade("Fúria do Guerreiro", "Aumenta o ataque por alguns turnos.", 0, 20, 2, false));
        habilidadesGuerreiro.put(15, new Habilidade("Terremoto", "Cria um tremor que atinge todos os inimigos.", 30, 20, 3, false));
        habilidadesGuerreiro.put(20, new Habilidade("Redemoinho", "Você começa a girar com sua arma, batendo diversas vezes no seu inimigo.", 40, 30, 3, false));
        habilidadesGuerreiro.put(25, new Habilidade("Investida Feroz", "Avança rapidamente para frente, causando dano ao inimigo no caminho.", 45, 35, 4, false));
        habilidadesGuerreiro.put(30, new Habilidade("Golpe Relampago", "Imbui sua arma com um poder de raio causando bastante dano.", 55, 40, 4, false));
        habilidadesGuerreiro.put(35, new Habilidade("Corte Veloz", "Executa uma série de ataques rápidos, causando múltiplos danos em sucessão.", 70, 50, 5, false));
        habilidadesGuerreiro.put(40, new Habilidade("Chama Ardente", "Um ataque envolto em fogo que causa muito dano.", 95, 60, 6, false));
        habilidadesGuerreiro.put(45, new Habilidade("Golpe Congelante", "Imbui sua arma com um poder de gelo desferindo um golpe extremamente forte.", 110, 80, 7, false));
        habilidadesGuerreiro.put(50, new Habilidade("Justiça Perfeita", "Crava sua arma no chão, e invoca uma grande espada do ceu, caindo no seu inimigo, impedindo ele de agir por dois turnos", 300, 130, 8, true));
        habilidadesPorClasse.put("Guerreiro", habilidadesGuerreiro);

        // Habilidades do Arqueiro
        Map<Integer, Habilidade> habilidadesArqueiro = new HashMap<>();
        habilidadesArqueiro.put(5, new Habilidade("Tiro Preciso", "Dispara uma flecha que acerta pontos vitais do seu inimigo.", 40, 10, 1, false));
        habilidadesArqueiro.put(10, new Habilidade("Chuva de Flechas", "Dispara várias flechas ao ceu, que caem sobre seu inimigo.", 45, 20, 2, false));
        habilidadesArqueiro.put(15, new Habilidade("Flecha Explosiva", "Dispara uma flecha que explode no impacto.", 50, 25, 2, false));
        habilidadesArqueiro.put(20, new Habilidade("Flecha Gélidar", "Dispara uma flecha envolta em gelo, causando dano e congelando o alvo, impedindo ele de agir por dois turnos", 20, 40, 2, true));
        habilidadesArqueiro.put(25, new Habilidade("Tiro Multiplo", "Dispara uma flecha que causa alto dano.", 40, 10, 3, false));
        habilidadesArqueiro.put(30, new Habilidade("Flecha Sombria", "Dispara uma flecha  infundida com energia sombria.", 60, 40, 5, false));
        habilidadesArqueiro.put(35, new Habilidade("Tiro Penetrante", "Dispara uma flecha que penetra na armadura do alvo.", 70, 50, 5, false));
        habilidadesArqueiro.put(40, new Habilidade("Flecha Tripla", "Dispara Tres flechas de uma só vez, acertando o mesmo alvo no mesmo lugar.", 80, 60, 6, false));
        habilidadesArqueiro.put(45, new Habilidade("Flecha Teleguiada", "Dispara uma flecha que segue o alvo e acerta o seu ponto vital.", 120, 70, 7, false));
        habilidadesArqueiro.put(50, new Habilidade("Flecha Espiritual", "Dispara uma flecha embuido com o poder dos espiritos, causando dano massivo e impedindo seu inimigo de agir por dois turnos.", 300, 110, 8, true));
        habilidadesPorClasse.put("Arqueiro", habilidadesArqueiro);

        // Habilidades do Samurai 
        Map<Integer, Habilidade> habilidadesSamurai = new HashMap<>();
        habilidadesSamurai.put(5, new Habilidade("Corte Horizontal", "Realiza um corte simples e rapido na Horizontal.", 20, 10, 1, false));
        habilidadesSamurai.put(10, new Habilidade("Golpe Devastador", "Um ataque poderoso que ignora parte da defesa do inimigo, causando dano massivo.", 30, 15, 2, false));
        habilidadesSamurai.put(15, new Habilidade("Lâmina de Vento", "Um corte rápido que atira uma grande rajada de vento.", 40, 20, 2, false));
        habilidadesSamurai.put(20, new Habilidade("Corte Duplo", "Realiza dois cortes rapido no inimigo", 45, 20, 2, false));
        habilidadesSamurai.put(25, new Habilidade("Corte Triplo", "Realiza Tres cortes rapido no inimigo", 50, 30, 3, false));
        habilidadesSamurai.put(30, new Habilidade("Cascata", "Realiza diversos golpes no inimigo", 60, 40, 4, false));
        habilidadesSamurai.put(35, new Habilidade("Tempestade de Aço", "Realiza um grande corte para frente", 70, 50, 5, false));
        habilidadesSamurai.put(40, new Habilidade("Corte Rapido", "Realiza um corte simples e rapido na Horizontal, sendo extremamente forte", 90, 60, 6, false));
        habilidadesSamurai.put(45, new Habilidade("Golpe da Lua Cheia", "Um ataque desferido com força total, que se assemelha a uma lua, causando dano massivo.", 120, 65, 6, false));
        habilidadesSamurai.put(50, new Habilidade("Corte da Alma", "Realiza um Grande corte, com força para rasgar a alma do inimigo, deixando ele atordoado por 2 turnos", 300, 110, 8, true));
        habilidadesPorClasse.put("Samurai", habilidadesSamurai);

        // Habilidades do Ladino
        Map<Integer, Habilidade> habilidadesLadino = new HashMap<>();
        habilidadesLadino.put(5, new Habilidade("Golpe da Sombra", "Um ataque rápido que explora as fraquezas do inimigo causando um pequeno dano.", 20, 10, 1, false));
        habilidadesLadino.put(10, new Habilidade("Golpe Certeiro", "Acerta um golpe direto nos pontos vitais da vitima.", 30, 15, 2, false));
        habilidadesLadino.put(15, new Habilidade("Adaga Mortal", "Um ataque certeiro que visa pontos vitais, causando grande dano em um único golpe.", 40, 20, 2, false));
        habilidadesLadino.put(20, new Habilidade("Ataque Costeiro", "Realiza um pequeno golpe nas costas do inimigo", 45, 30, 3, false));
        habilidadesLadino.put(25, new Habilidade("Esfaqueada Mortal", "Realiza um Grande corte nas costas do inimigo", 60, 40, 4, false));
        habilidadesLadino.put(30, new Habilidade("Truque Sujo", "Lança um ataque surpresa, causando dano adicional", 60, 40, 4, false));
        habilidadesLadino.put(35, new Habilidade("Arremesso de Agada", "Arremessa uma adaga no seu inimigo, causando dano consideravel", 70, 50, 5, false));
        habilidadesLadino.put(40, new Habilidade("Dança das Adagas", "Começa a rodar e lançar diversas adagas no seu inimigo", 90, 60, 6, false));
        habilidadesLadino.put(45, new Habilidade("Golpe Duplo", "Desfere um ataque duplo no seu inimigo, ambos causando critico.", 120, 65, 6, false));
        habilidadesLadino.put(50, new Habilidade("Rasga Almas", "Realiza um grande corte com sua adaga, penetrando na alma de seu inimigo, deixando ele atordoado por 2 turnos", 300, 110, 8, true));
        habilidadesPorClasse.put("Ladino", habilidadesLadino);

        // Habilidades do Monge
        Map<Integer, Habilidade> habilidadesMonge = new HashMap<>();
        habilidadesMonge.put(5, new Habilidade("Golpe da Fé", "Desfere um golpe com seus punhos no inimigo", 25, 10, 1, false));
        habilidadesMonge.put(10, new Habilidade("Punho Divino", "Desfere um golpe embuido de poder divino", 35, 20, 2, false));
        habilidadesMonge.put(15, new Habilidade("Buda de Bronze", "Invoca um pequeno Buda que da um pequeno golpe nos seus inimigos", 40, 20, 2, false));
        habilidadesMonge.put(20, new Habilidade("Buda de Prata", "Invoca um Buda Medio que da um golpe nos seus inimigos", 45, 30, 3, false));
        habilidadesMonge.put(25, new Habilidade("Buda de Ouro", "Invoca um Grande Buda que da um Grande golpe nos seus inimigos", 50, 40, 4, false));
        habilidadesMonge.put(30, new Habilidade("Mao Divina", "Desfere uma poderosa palmada nos seu inimigo", 55, 50, 5, false));
        habilidadesMonge.put(35, new Habilidade("Redenção", "Da uma benção para seu inimigo, causando um grande dano nele", 60, 55, 6, false));
        habilidadesMonge.put(40, new Habilidade("Punho Divino Duplo", "DDesfere Dois golpe embuido de poder divino",6, 60, 6, false));
        habilidadesMonge.put(45, new Habilidade("Pequena divindade", "Buda invoca uma pequena personificação de divindade para causar dano ao inimigo", 80, 70, 7, false));
        habilidadesMonge.put(50, new Habilidade("O Grande Buda Divino", "Invoca a maior personificação de Buda possivel, que desefere um poderoso golpe, deixando o inimigo atordoado por 2 rodadas", 300, 110, 8, true));
        habilidadesPorClasse.put("Monge", habilidadesMonge);

        // Habilidades do Druida
        Map<Integer, Habilidade> habilidadesDruida = new HashMap<>();
        habilidadesDruida.put(5, new Habilidade("Vento da Natureza", "Uma fraca rajada de vento, com o poder da natureza", 20, 10, 1, false));
        habilidadesDruida.put(10, new Habilidade("Chamado da Natureza", "Invoca plantas que se prendem ao seu inimigo", 25, 15, 2, false));
        habilidadesDruida.put(15, new Habilidade("Espinheiro Sangrento", "Invoca um espinheiro que atira nos inimigos", 30, 20, 2, false));
        habilidadesDruida.put(20, new Habilidade("Pequena Manada", "Convoca uma pequena manada de javalis para atropelar seus inimigos", 35, 25, 3, false));
        habilidadesDruida.put(25, new Habilidade("Ajuda da Matilha", "Chama uma matilha de lobos parate ajudar no ataque", 40, 30, 4, false));
        habilidadesDruida.put(30, new Habilidade("Floresta Ardente", "Invoca arvores em chamas sobre seu inimigo", 50, 40, 5, false));
        habilidadesDruida.put(35, new Habilidade("Chamado dos Espiritos", "Pede ajuda aos espiritos elementais na sua batalha", 60, 45, 5, false));
        habilidadesDruida.put(40, new Habilidade("Inverno Cruel", "Cria uma pequena nevasca sobre o seu inimigo, causando alto dano", 70, 50, 6, false));
        habilidadesDruida.put(45, new Habilidade("Quatro Estações", "Cria um grande vortex com o poder das 4 estações sobre seu inimigo", 80, 60, 7, false));
        habilidadesDruida.put(50, new Habilidade("A Mãe Primordial", "Usa todos os poderes da natureza conta o seu inimigo, causando dano massivo e incapacitando ele por 2 rodadas", 300, 110, 8, true));
        habilidadesPorClasse.put("Druida", habilidadesDruida);

        // Habilidade do Necromante
        Map<Integer, Habilidade> habilidadesNecromante = new HashMap<>();
        habilidadesNecromante.put(5, new Habilidade("Explosão de Cadaver", "Explode um cadaver proximo ao alvo", 40, 5, 0, false));
        habilidadesNecromante.put(10, new Habilidade("Tiro de sangue", "Atira uma grande gota de sangue no alvo", 45, 10, 1, false));
        habilidadesNecromante.put(15, new Habilidade("Maldição da Dor", "Causa uma grande dor no alvo", 50, 15, 2, false));
        habilidadesNecromante.put(20, new Habilidade("Deteriorização", "Necrosa o corpo do alvo, causando extremo dano", 60, 20, 3, false));
        habilidadesNecromante.put(25, new Habilidade("Correntes do Submundo", "Crava correntes dolorosas no corpo do alvo", 65, 25, 3, false));
        habilidadesNecromante.put(30, new Habilidade("Explosão Sanguinea", "Explode o sangue interno do alvo", 70, 30, 4, false));
        habilidadesNecromante.put(35, new Habilidade("Maldição da morte", "Marca o alvo para morrer, causando muito dano", 80, 40, 5, false));
        habilidadesNecromante.put(40, new Habilidade("Golem de Cadaveres", "Invoca um Grande golem de cadaveres, que causa muito dano no alvo", 90, 50, 5, false));
        habilidadesNecromante.put(45, new Habilidade("Prisão de ossos", "Causa extremo dano e deixa o inimigo preso por 2 rodadas", 100, 60, 5, true));
        habilidadesNecromante.put(50, new Habilidade("Rei dos Mortos", "Invoca um enorme exercito de mortos sobre o alvo", 550, 80, 6, false));
        habilidadesPorClasse.put("Necromante", habilidadesNecromante);

    }

    // Retorna a habilidade específica para a classe e nível
    public static Habilidade getHabilidadePorClasseENivel(String classe, int nivel) {
        if (habilidadesPorClasse.containsKey(classe)) {
            return habilidadesPorClasse.get(classe).getOrDefault(nivel, null);
        }
        return null;
    }
}
