package Game.Skills;

import java.util.HashMap;
import java.util.Map;

public class HabilidadesEspecificas {
    private static Map<String, Map<Integer, Habilidade>> habilidadesPorClasse = new HashMap<>();

    static {
        // Habilidades do Mago
        Map<Integer, Habilidade> habilidadesMago = new HashMap<>(); 
        habilidadesMago.put(5, new Habilidade("Bola de Fogo", "Lança uma bola de fogo que queima o inimigo.", 40, 30, 2));
        habilidadesMago.put(10, new Habilidade("Tempestade de Gelo", "Cria uma tempestade de gelo que congela os inimigos.", 70, 50, 5));
        habilidadesMago.put(15, new Habilidade("Explosão Arcana", "Explode uma onda de energia arcana ao redor do mago.", 100, 80, 7));
        habilidadesPorClasse.put("Mago", habilidadesMago);

        // Habilidades do Guerreiro
        Map<Integer, Habilidade> habilidadesGuerreiro = new HashMap<>();
        habilidadesGuerreiro.put(5, new Habilidade("Golpe Devastador", "Um golpe forte que causa grande dano.", 50, 20, 2));
        habilidadesGuerreiro.put(10, new Habilidade("Fúria do Guerreiro", "Aumenta o ataque por alguns turnos.", 0, 30, 5));
        habilidadesGuerreiro.put(15, new Habilidade("Terremoto", "Cria um tremor que atinge todos os inimigos.", 80, 50, 7));
        habilidadesPorClasse.put("Guerreiro", habilidadesGuerreiro);

        // Habilidades do Arqueiro
        Map<Integer, Habilidade> habilidadesArqueiro = new HashMap<>();
        habilidadesArqueiro.put(5, new Habilidade("Tiro Preciso", "Um tiro que nunca erra e causa alto dano.", 40, 10, 1));
        habilidadesArqueiro.put(10, new Habilidade("Chuva de Flechas", "Dispara várias flechas atingindo todos os inimigos.", 60, 20, 4));
        habilidadesArqueiro.put(15, new Habilidade("Flecha Explosiva", "Dispara uma flecha que explode no impacto.", 90, 40, 6));
        habilidadesPorClasse.put("Arqueiro", habilidadesArqueiro);

        // Outras classes (Samurai, Necromante, etc.) seguem a mesma lógica...
    }

    // Retorna a habilidade específica para a classe e nível
    public static Habilidade getHabilidadePorClasseENivel(String classe, int nivel) {
        if (habilidadesPorClasse.containsKey(classe)) {
            return habilidadesPorClasse.get(classe).getOrDefault(nivel, null);
        }
        return null;
    }
}
