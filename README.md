# RPG Java Game - POO 

- Prof. Eduardo Takeo

# Integrantes - 
- Breno Amorim Candido;
- Gabriel Ferreira Delinardi;
- Gabriel Frigo Sena.

# Vídeo
Assista ao vídeo abaixo no Youtube para obter detalhes do funcionamento do jogo RPG:
Link: https://youtu.be/eJ3IUj5E1uc

Este é um projeto de um jogo RPG baseado em Java. O objetivo é criar um sistema de combate por turnos, onde os jogadores podem escolher personagens, lutar contra monstros, usar habilidades e itens, e evoluir suas classes. Abaixo está uma descrição dos principais componentes do sistema.

## 1. Classes de Personagens
Criamos várias classes de personagens, cada uma com atributos e habilidades específicas. As classes atualmente implementadas incluem:

- **Samurai**
- **Mago**
- **Guerreiro**
- **Arqueiro**
- **Necromante**
- **Druida**
- **Monge/Buda**

Todas as classes herdam atributos básicos, como vida, mana, ataque e defesa, da classe-mãe `Personagens`. Cada personagem possui habilidades únicas e métodos específicos de combate.

## 2. Sistema de Nível e Habilidades
O sistema de nível permite que os personagens ganhem experiência e subam de nível conforme jogam. As principais características desse sistema incluem:

- Habilidades específicas são desbloqueadas a cada 5 ou 10 níveis.
- Cada habilidade tem um custo de mana, tempo de recarga (em turnos) e causa danos aos inimigos.
- Um método foi implementado para desbloquear habilidades à medida que o personagem sobe de nível.

## 3. Necromante e Druida
Essas duas classes possuem mecânicas únicas:

- **Necromante**: Possui um "reservatório de mortos" para armazenar invocações, como zumbis com atributos específicos.
- **Druida**: Pode criar plantas que ajudam no combate. Para criar uma planta, o Druida precisa de uma "semente", que se regenera a cada 5 turnos.

## 4. Arqueiro
O **Arqueiro** utiliza um sistema de flechas:

- Ele possui uma bolsa de flechas e só pode atacar se houver flechas disponíveis.
- A classe de Arqueiro gerencia os diferentes tipos de flechas, cada uma com atributos únicos.

## 5. Sistema de Itens
O jogo inclui um sistema de itens que podem ser equipados e desequipados, com os seguintes atributos:

- Aumento de vida, mana, ataque, velocidade.
- Debuffs que reduzem atributos temporariamente.

## 6. Monstros (Inimigos)
Também criamos uma classe para armazenar diferentes tipos de monstros que os jogadores enfrentarão. Os monstros são gerados aleatoriamente, com exemplos de tipos de inimigos já prontos para serem usados no jogo.

## 7. Switch Case de Escolha de Classe
Foi implementado um `switch case` que permite ao jogador escolher sua classe no início do jogo. Após a escolha, o jogador pode:

- Alterar o nome do personagem.
- Visualizar os atributos da classe, como invocações e flechas disponíveis.

## 8. História do game.

- Arco 1 - Introdução

Feixes da Fé: A Ascensão dos Guerreiros da Esperança

Em um mundo quebrado, onde o céu parecia escurecido permanentemente e os rios corriam com vestígios de sangue das guerras intermináveis, a última centelha de luz residia numa antiga profecia. Falava-se de uma fonte, uma energia pura e incansável que sustentava a fé e a esperança. Para todos, esta força era apenas um sussurro, uma lenda contada para aquecer os corações no frio da desesperança. Porém, essa fonte era real, e seu poder estava guardado para aqueles que se tornariam os Feixes da Fé.

Esses guerreiros não eram escolhidos ao acaso; cada um deles carregava cicatrizes da opressão, testemunhos de uma vida devastada pelo caos imposto por Aarfeus, o demônio soberano que há gerações havia mergulhado o mundo no terror e desespero. Aarfeus, um ser de poderes abissais e astúcia inigualável, governava com mão de ferro, e sua presença era tão temida quanto a própria morte. Sob seu jugo, todas as nações se curvaram, e os sobreviventes das cidades destruídas vagavam como sombras, sem esperança de ver um novo amanhecer.

No entanto, em cada coração havia uma pequena chama, e essa chama era alimentada pela lenda dos Feixes da Fé. Quando o chamado foi feito, aqueles escolhidos como Feixes da Fé sentiram uma mudança em seus espíritos. Cada um recebeu uma arma sagrada, um vínculo com a fonte da esperança que os tornava verdadeiros emissários da luz. Esses guerreiros sabiam que a estrada seria longa e que teriam de enfrentar desafios além da imaginação. Cada masmorra, cada caverna sombria, cada castelo infestado de seres corrompidos era uma prova de sua fé e um teste à sua coragem.

Esses Feixes da Fé eram guerreiros de diversos passados e habilidades. Alguns eram ex-soldados desiludidos, outros, camponeses que perderam tudo, e havia até aqueles que vinham de antigas ordens que tentaram, sem sucesso, derrubar Aarfeus. Todos eles, no entanto, compartilhavam uma única missão: alcançar o nível máximo de poder, pois só assim poderiam enfrentar Aarfeus.

Os desafios tornavam-se cada vez mais intensos à medida que os guerreiros avançavam. As masmorras eram armadilhas vivas, com corredores que se moviam, portas que levavam ao abismo e monstros capazes de destroçar corpos e mentes. No entanto, a cada vitória, os Feixes da Fé ficavam mais fortes, e sua fé, mais inabalável. Eles aprenderam a aprimorar suas habilidades, a unir suas forças em combates brutais e a confiar em seus aliados para superar o impossível.

Quando finalmente se aproximaram da fortaleza de Aarfeus, os guerreiros sentiam que estavam à beira de seu limite. Mas a fonte de esperança os envolvia como um manto, e eles sabiam que a luta final não era apenas pela vitória, mas por restaurar a paz que Aarfeus havia roubado.

Agora, diante da presença sombria e colossal de Aarfeus, os Feixes da Fé ergueram suas armas, sabendo que, mesmo que caíssem, seu sacrifício reavivaria a fé e a esperança que o mundo tanto precisava. Era o momento de decidir o destino do mundo – e eles estavam prontos para enfrentar o demônio soberano.

Que os Feixes da Fé lutem com coragem. Que o caos seja derrotado. Que a esperança prevaleça.

- Arco 2 - Masmorras

Feixes da Fé: As Dungeons Elementais

A jornada dos Feixes da Fé se desenrola agora por quatro dungeons elementais, cada uma dedicada a um elemento primordial que guardará, em suas profundezas, o poder necessário para enfrentar Aarfeus. Esses elementos representam as forças indomáveis do mundo, e apenas aqueles que conseguirem dominar e harmonizar com esses elementos estarão preparados para enfrentar o último desafio.

Dungeon da Água

A primeira dungeon leva os Feixes da Fé a uma caverna submersa e traiçoeira, onde a água é tanto aliada quanto inimiga. Nela, os Slimes aquáticos dominam, criaturas mutáveis que fluem pelas passagens como correntes, capazes de transformar-se em maremotos de gosma e arrastar os guerreiros para a escuridão. Neste ambiente, os Feixes da Fé precisarão dominar sua resistência subaquática e aprender a respirar em harmonia com o ritmo da água, sendo pacientes e precisos em cada movimento. Só aqueles que se conectarem à essência fluida do elemento água poderão sair vitoriosos e intactos.

Dungeon da Terra

Na segunda dungeon, os guerreiros adentram um labirinto de pedra e terra, um local onde o próprio solo parece pulsar com vida. Guardado por lobos rochosos, criaturas formadas por minerais endurecidos, esse labirinto é cheio de armadilhas naturais – deslizamentos de pedras, fendas traiçoeiras e passagens que se fecham e se abrem ao comando da própria dungeon. Neste cenário, os Feixes da Fé precisam aprender a respeitar e utilizar a força da terra, firmando-se como rochas inabaláveis para resistir aos ataques. Aqui, os guerreiros desenvolvem resiliência e estabilidade, essenciais para prosseguir.

Dungeon da Escuridão

A terceira dungeon é um abismo de escuridão pura, onde a luz quase não alcança e onde demônios das sombras aguardam. Nesse cenário, os demônios atacam psicologicamente, sussurrando dúvidas e espalhando ilusões para enfraquecer a confiança dos guerreiros. Para vencer este desafio, os Feixes da Fé devem encontrar a luz interior que os guiará em meio à escuridão. A fé torna-se seu escudo mais poderoso, pois aqui qualquer medo ou dúvida pode ser fatal. Essa dungeon é um teste definitivo para a determinação e a coragem, forçando os guerreiros a confrontarem suas próprias trevas e emergirem mais fortalecidos.

Dungeon Infernal:

A última dungeon antes de Aarfeus é um caldeirão de chamas, lar de demônios flamejantes e dragões de fogo. Neste cenário, a temperatura é insuportável, e os guerreiros enfrentam labaredas que dançam como se possuídas pela própria essência do caos. Cada passo é um teste de resistência, e os Feixes da Fé precisam aprender a canalizar suas energias para resistir ao calor. As chamas não apenas queimam o corpo, mas também a alma, tentando corrompê-los. Aqui, eles dominam o poder do fogo, transformando-se em combatentes indomáveis, prontos para suportar qualquer dor em prol da missão.

Ao superarem essas dungeons, os Feixes da Fé se transformam em guerreiros completos, portadores dos quatro elementos. Ao longo dessas provas, eles fortalecem corpo, mente e espírito, unindo em si os poderes da água, terra, escuridão e fogo. Agora, com o poder dos elementos, estão prontos para enfrentar Aarfeus e trazer paz ao mundo.


- Arco 3 - Luta Final contra Aarfeus.

O Confronto Final: Aarfeus e a Restauração do Mundo

Após superarem as quatro dungeons elementais, os Feixes da Fé se encontram frente a frente com a imensa fortaleza de Aarfeus. Ela se ergue como uma sombra colossal no horizonte, envolta por uma escuridão tão densa que parece absorver toda a luz ao redor. Esse local não é apenas um castelo, mas uma manifestação física do caos e da tirania que Aarfeus espalhou pelo mundo. À medida que avançam, os guerreiros sentem o peso de cada alma perdida, cada vida destruída pelo domínio do demônio soberano.

No salão principal, Aarfeus os aguarda, um ser de pura escuridão, com chamas dançantes ao redor e um olhar que parece penetrar nas almas dos guerreiros. Ele os saúda com desprezo, ridicularizando sua jornada e proclamando que o poder que eles reuniram não é nada comparado à sua força ancestral. Mas os Feixes da Fé, fortalecidos pelos elementos e pela fé que carregam, não hesitam. Eles sabem que cada batalha, cada ferimento, e cada provação os trouxe até este momento.

A Batalha Contra Aarfeus:

O combate é brutal e devastador. Aarfeus manipula a escuridão ao seu redor, lançando rajadas de energia que parecem consumir tudo que tocam. Ele convoca demônios de chamas, sombras e terra, usando o próprio cenário contra os guerreiros. A cada ataque, os Feixes da Fé são forçados a unirem suas habilidades elementais, combinando a fluidez da água com a solidez da terra, a luz que vence a escuridão e as chamas que resistem ao medo. Eles lutam como um só, canalizando toda a força e esperança que o mundo depositou neles.

Em um momento crítico, Aarfeus ataca com um golpe que quase esmaga os guerreiros, espalhando-os pelo salão e ofuscando suas forças. A luz parece se extinguir, e o desespero quase os toma. Mas, ao lembrarem-se das vidas que contam com eles e das batalhas que já superaram, uma nova chama renasce. Reunindo suas últimas forças, os Feixes da Fé lançam um ataque conjunto com os quatro elementos, criando uma onda de energia purificadora que rompe a escuridão de Aarfeus. O grito do demônio ecoa pelo salão enquanto sua forma começa a se desfazer, derrotado pelo poder da fé e da união.

O Pós-Batalha: Renascer do Mundo

Com a queda de Aarfeus, a fortaleza começa a se despedaçar, e os guerreiros escapam enquanto o castelo desmorona. Quando finalmente chegam ao exterior, o mundo parece diferente. A escuridão que antes cobria o céu se dissipa, e os primeiros raios de luz iluminam a terra, revelando campos e rios que voltam a florescer. É como se a própria natureza respondesse à derrota do tirano. Cidades antes desertas e destruídas começam a se reerguer, e sobreviventes saem de seus esconderijos, vislumbrando a esperança de uma nova era.

Os Feixes da Fé são saudados como heróis, mas, com humildade, sabem que seu papel não acabou. Com o mundo ainda se recuperando, eles decidem compartilhar seu conhecimento e treinar novos guerreiros, para que a paz conquistada possa ser defendida. Ao final, os Feixes da Fé se tornam não apenas lendas, mas também guardiões de um mundo renascido, assegurando que a chama da esperança nunca mais se apague.

A Era dos Feixes da Fé começa


---

Este projeto ainda está em desenvolvimento, então, sinta-se à vontade para sugerir melhorias ou novas funcionalidades!
