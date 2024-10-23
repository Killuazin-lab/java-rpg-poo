package Game.Dungeons;

import java.util.ArrayList;

import Game.ClassCharacters.Personagens;
import Game.Monters.Monstro;

public class CharacterMonsterDTO {
  private Personagens personagem;
  private ArrayList<Monstro> monstros;

  public CharacterMonsterDTO(Personagens personagem, ArrayList<Monstro> monstros){
    this.personagem = personagem;
    this.monstros = monstros;
  }

  @Override
  public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Personagem: ").append(personagem.toString()).append("\n");
      stringBuilder.append("Monstros: ").append(monstros.toString());
      return stringBuilder.toString();
  }
}
