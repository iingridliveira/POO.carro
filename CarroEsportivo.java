public class CarroEsportivo extends Carro {
  private int velocidadeMaxima;

  public CarroEsportivo() {
    super();
  }

  
  public void acelerar() {
    System.out.println("Acelerando o carro esportivo!");
  }

  public int getVelocidadeMaxima() {
    return velocidadeMaxima;
  }

  public void setVelocidadeMaxima(int velocidadeMaxima) {
    this.velocidadeMaxima = velocidadeMaxima;
  }

  @Override
  public String toString() {
    return super.toString() + ", Velocidade Máxima: " + velocidadeMaxima;
  }
}
