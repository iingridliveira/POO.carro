public class Main {
  public static void main(String[] args) {
    System.out.println("--- Questão 01 ---");
    Carro meuCarro = new Carro();
    meuCarro.setCarroInfo("Toyota", "Corolla", 2022);
    meuCarro.exibirCarroInfo();

    System.out.println("--- Questão 02 ---");
    meuCarro.rodar(100);
    meuCarro.rodar(-100);
    meuCarro.rodar(50);
    meuCarro.rodar(73);
    meuCarro.rodar(122);
    meuCarro.rodar(-3);
    System.out.println("Quilometragem: " + meuCarro.getQuilometragem());

    System.out.println("--- Questão 03 ---");
    CarroEsportivo meuCarroEsportivo = new CarroEsportivo();
    meuCarroEsportivo.setCarroInfo("Ferrari", "488 GTB", 2023);
    meuCarroEsportivo.setVelocidadeMaxima(330);
    meuCarroEsportivo.acelerar();
    System.out.println(meuCarroEsportivo);
    meuCarroEsportivo.setVelocidadeMaxima(80);
    System.out.println(meuCarroEsportivo);

    System.out.println("--- Questão 04 ---");
    Motor motorCarro = new Motor("V8", 500);
    Carro meuCarroComMotor = new Carro("Chevrolet", "Camaro", 2023, motorCarro);
    meuCarroComMotor.ligar();
  }
}