package Game.ClassCharacters;

public class Criatura {
  protected String nome;
  protected int vida;
  protected int ataque;
  protected int defesa;
  protected int ataqueHabilidadeEspecial;

  public Criatura(String nome, int vida, int ataque, int defesa, int ataqueHabilidadeEspecial){
    this.nome = nome;
    this.vida = vida;
    this.ataque = ataque;
    this.defesa = defesa;
    this.ataqueHabilidadeEspecial = ataqueHabilidadeEspecial;
  }

  public void sofrerDano(int danoSofrido){
    this.vida = this.vida - (danoSofrido - defesa);
  }

  public int getAtaque() {
    return ataque;
  }

  public void setAtaque(int ataque) {
    this.ataque = ataque;
  }

  public int getDefesa() {
    return defesa;
  }

  public void setDefesa(int defesa) {
    this.defesa = defesa;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getVida() {
    return vida;
  }

  public void setVida(int vida) {
    this.vida = vida;
  }

  public int getAtaqueHabilidadeEspecial() {
    return ataqueHabilidadeEspecial;
  }

  public void setAtaqueHabilidadeEspecial(int ataqueHabilidadeEspecial) {
    this.ataqueHabilidadeEspecial = ataqueHabilidadeEspecial;
  }
}
