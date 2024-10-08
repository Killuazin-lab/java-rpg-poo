# RPG Java Game

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

---

Este projeto ainda está em desenvolvimento, então, sinta-se à vontade para sugerir melhorias ou novas funcionalidades!
