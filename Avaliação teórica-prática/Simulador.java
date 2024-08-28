public class Simulador {
  private Veiculo[] veiculos;
  private int qtdVeiculos;

  public Simulador() {
    this.veiculos = new Veiculo[10];
    this.qtdVeiculos = 0;
  }

  public void moverVeiculos() {
    for (int i = 0; i < veiculos.length; i++) {
      if (veiculos[i] != null) {
        veiculos[i].mover();
      }
    }
  }

  public void incluirVeiculo(Veiculo v) {
    if (qtdVeiculos < veiculos.length) {
      for (int i = 0; i < veiculos.length; i++) {
        if (veiculos[i] == null) {
          veiculos[i] = v;
          qtdVeiculos++;
          break;
        }
      }
    } else {
      System.out.println("Não é possível adicionar mais veículos.");
    }
  }

  public void imprimirPista() {
    for (Veiculo v : veiculos) {
      if (v != null) {
        v.desenhar();
        System.out.print(" ");
      }
    }
    System.out.println();
  }

  public void abastecerVeiculo(VeiculoMotorizado v) {
    v.abastecerVeiculo();
  }

  public void calibrarVeiculo(Veiculo v) {
    for (Roda roda : v.rodas) {
      roda.setCalibragem(true);
    }
  }

  public String toString() {
    String s = "";
    for (int i = 0; i < veiculos.length; i++) {
      if (veiculos[i] != null) {
        s += veiculos[i].toString() + "\n";
      }
    }
    return s;
  }
}
