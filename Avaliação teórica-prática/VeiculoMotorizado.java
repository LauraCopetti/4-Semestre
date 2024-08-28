import java.util.Random;

public abstract class VeiculoMotorizado extends Veiculo implements Abastecer {
  protected boolean tanque;

  public VeiculoMotorizado() {
    Random r = new Random();
    this.tanque = r.nextBoolean();
  }

  public VeiculoMotorizado(int numRodas, int dist) {
    super(numRodas, dist);
    Random r = new Random();
    this.tanque = r.nextBoolean();
  }

  public void abastecerVeiculo() {
    this.tanque = true;
  }

  public abstract void desenhar();

  public abstract void mover();

  public abstract String toString();

  public Roda[] getRodas(){
    return rodas;
  }

  public int getDistanciaPercorrida(){
    return distanciaPercorrida;
  }
}
