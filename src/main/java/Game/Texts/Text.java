package Game.Texts;

public class Text {
  //TERMINE TODOS OS TEXTOS COM /N, NÃO ESQUEÇAM
  // Texto de boas-vindas
  public static String boasVindas() {
      return "Em um mundo dominado pelo caos, guerras, tiranias e atrocidades, ainda resta uma pequena fagulha de fé, uma fagulha que movimenta a esperança de todos do mundo.\nEssa fagulha logo se tornou uma fonte, gerando herois para lutarem na tentativa de resaturar a paz\n" +
              "Esses herois, que são chamados de Feixes de fé, terão que passar por diversos desafios e obstaculos em sua jornada.\n" +
              "Você é um recém formado em uma cidadela, um feixe de fé que sempre foi um grande aspirante, com grandes sonhos e ambições, e hoje é o dia de se registrar na guilda.\n";
  }

  // Texto da Cidade inicial
  public static String cidadeInicial() {
      return "\nVocê acaba de entrar no predio da guilda, e segue direto para o balcão onde se encontra a atendente, e ela diz:\n" +
              "\n - Bem vindo a guilda, como posso ajudar hoje?\n" + 
              "\nVocê diz que deseja se registrar como um feixe de fé, e a atendente lhe passa um formulario para preencher.\n";
  }

  // Texto de escolha de personagem
  public static String escolhaPersonagem() {
      return "\nQual a sua classe? \n" + 
              "1. Samurai (Usa uma Katana e possui golpes rapidos)\n" + 
              "2. Mago (Usa uma variedade de magias)\n" + 
              "3. Guerreiro (Usa uma espada e um escudo)\n" + 
              "4. Arqueiro (Usa uma arco e flechas)\n" + 
              "5. Ladino (Usa duas adagas e possui otima agilidade) \n" + 
              "6. Druida (Consegue usar o poder da natureza e espirituais)\n" +
              "7. Monge (Usa poderes sagrados e possui uma grande força física)\n" + 
              "8. Necromante (Usa poderes das trevas e um exercito de mortos\n";
  }

  // Texto pós registro
  public static String posRegistro() {
      return "\nApós preencher o formulario, você entrega ele para a atendente, ela agradeçe e te entrega a sua identificação de feixe novato junto de um discurso rapido.\n" +
              " - Pequeno Feixe, adentre masmorras, supere os seus limites, ganhe mais experiência e evolue, para enfim derrotar o Aarfeus, o rei dos demonios, mas, acima " + "de tudo, se mantenha vivo, pois a vida de uma pessoa forte e corasoja como você é unica pra gente.\n";
  }

  // Texto explicação Dungeons
  public static String explicDuegons() {
      return "\n - A Dungeons possui diversos monstros, sua quantidade variam de 4 a 5, algumas raras vezes um monstro especial aparece.\n"+
              " - Podemos dizer que elas possuem 'niveis' de dificuldade, e cada nivel possui uma dificuldade diferente, indo de 1 a 7\n" +
              " - Como você acabou de se registrar, só pode acessar a Duegon de nivel 1, para poder liberar o acesso as outras, tem que conseguir mais nivel\n" +
              " - Conforme você subir de nivel, vai liberar as Dungeons\n";
  }

  // Texto explicação nivel
  public static String explicLevel() {
      return " - Você sobe de nivel matando os Monstros que aparecem nas Dungeons, a cada ve que você sobe um nivel, o proximo vai precisar de ainda mais experiencia.\n";
  }

  // Texto duvidas
  public static String duvidas(){
      return "\n1. Quanto de experiencia cada monstro da ?\n" +
              "2. Quais são os nomes das Dungeons ?\n" +
              "3. Quais as cidades que posso visitar ?\n" +
              "4. Quais tipos de monstros existem ?\n" +
              "5. Como eu recebo dinheiro ?\n" +
              "6. Onde posso comprar equipamentos?\n" +
              "7. Onde posso comprar poções ?\n"+
              "0. Por enquanto, só isso\n";
  }
  // Texto xp por monstro
  public static String xpMonstro() {
      return "\n - Para você descobrir isso, vai ter que matar um por um e ir se lembrando ou anotando, infelizmente não temos registros de outros feixes. \n";
  }

  // Texto de nomes das duegons
  public static String duegonNomes() {
      return "\n - Atualmente conhecemos somente 5, são elas: A,B,C,D,E\n";
  }

  // Texto de cidades
  public static String cidadesSobreviventes() {
      return "\n - Essa é a ultima cidade que sobreviveu após o ataque dos monstros acompanhandos pelo Lorde Demonio\n";
  }

  // Texto de monstros
  public static String monstrosDescobertos() {
      return "\n - Aqui estão os monstros que conhecemos e temos registro atualmente: \n" +
              "Slime\n" +
              "Esqueleto\n" +
              "Morto vivo\n" +
              "Goblin\n" +
              "Troll\n" +
              "Demonios\n" +
              "Dragão\n" +
              "Se você encontrar algum outro diferente desses, não esqueça de me informar\n";
  }

  // Texto de ganhar Dinheiro
  public static String explicDinheiro() {
       return "\n - Você pode ganhar dinheiro de duas formas: \n" +
              "Matando os monstros e pegando os cristais que eles deixam largar, cadas cristal pequeno equivale a 10 moedas, o medio a 25 e o grande a 50.\n" +
              "Ou, você pode ganhar dinheiro a partir de uma loja seja de equipamento ou de poções, onde você vende seus itens antigos e compra novos.\n";
  }

  // Texto de comprar itens
  public static String explicItens() {
      return "\n - Você pode comprar itens da loja de equipamentos, eles podem ser: \n" +
              "Armas\n" +
              "Escudos\n" +
              "Armaduras\n" +
              "e uma Bolsa de itens maior, onde você vai conseguir levar cada vez mais itens ou drops de monstros (a bolsa de cristais é separada e sem limite)\n";
  }

  // Texto de comprar poções
  public static String explicPocoes() {
      return "\n - Você pode comprar poções da loja de poções, elas podem ser: \n" +
              "Poções de cura (Recupera Vida)n" +
              "Poções de mana (Recupera Mana)\n" +
              "Antidoto (Ajuda contra veneno)" +
              "Poções de Teleporte (te leva pra fora da Duegon)\n";
  }

  // Texto final apresentação balconista guilda
  public static String fimApresentBalconista() {
      return "\n - Acho que te falei tudo que precisava meu pequeno feixe, boa sorte na sua aventura, espero poder te ver novamente em breve.\n";
  }

  public static String visitaLoja() {
      return "\nAcho que antes de ir para a dungeon, vou passar numa loja de armas para me equipar melhor.\nVocê caminha por 10 minutos ate encontrar uma loja de Equipamentos," + "e entra nela\n";
  }

  public static String entrarDungeon() {
      return "Depois de se despedir de seus amigos, você segue em direção a Dungeon, e em meio dia de caminhada, você finalmente chega e adentra na Dungeon ";
  }
  // Outros textos...
}

