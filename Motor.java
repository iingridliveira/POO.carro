public class Motor {
  private String tipo;
  private int potencia;

  public Motor(String tipo, int potencia) {
    this.tipo = tipo;
    this.potencia = potencia;
  }

  public void ligarMotor() {
    System.out.println("Motor: " + tipo + ", Potência: " + potencia + " HP");
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public int getPotencia() {
    return potencia;
  }

  public void setPotencia(int potencia) {
    this.potencia = potencia;
  }
}
