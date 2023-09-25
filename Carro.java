public class Carro {
  private String marca, modelo;
  private int ano;
  private int quilometragem;
  private Motor motor;

  public Carro(String marca, String modelo, int ano, Motor motor) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.motor = motor;
  }

  // Criei esse constructor para que não fosse necessário passar atributos através
  // de parâmetros conforme o que foi pedido na questão 01.
  public Carro() {
  }

  public void ligar() {
    System.out.println("Ligando o carro...");
    motor.ligarMotor();
  }

  public void setCarroInfo(String marca, String modelo, int ano) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
  }

  public void exibirCarroInfo() {
    System.out.println("Marca: " + this.getMarca());
    System.out.println("Modelo: " + this.getModelo());
    System.out.println("Ano: " + this.getAno());
  }

  public void rodar(int quilometragem) {
    setQuilometragem(quilometragem);
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public int getQuilometragem() {
    return quilometragem;
  }

  public void setQuilometragem(int quilometragem) {
    if (quilometragem >= 0) {
      this.quilometragem += quilometragem;
    }
  }

  @Override
  public String toString() {
    return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano;
  }
}
