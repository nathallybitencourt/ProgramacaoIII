public class TestaCarro {
  public static void main(String[] args) {
    Carro carro1 = new Carro();
    carro1.marca = "Hyundai";
    carro1.modelo = "Creta";
    carro1.ano = 2021;

    Carro carro2 = new Carro();
    carro2.marca = "Fiat";
    carro2.modelo = "Grand Siena";
    carro2.ano = 2018;

    carro1.exibirInfo();
    carro2.exibirInfo();
  }
}
