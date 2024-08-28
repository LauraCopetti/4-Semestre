public class CarroPopular extends VeiculoMotorizado {

  public CarroPopular(int dist) {
    super(4, dist);
  }

  public void mover() {
    boolean podeMover = tanque;
    for (Roda roda : rodas) {
      if (!roda.getCalibragem()) {
        podeMover = false;
        break;
      }
    }
    if (podeMover) {
      distanciaPercorrida++;
      tanque = false;
    }
  }

  public void desenhar() {
    String[] carro1 = new String[4];
    carro1[0] = "   ____\n";
    carro1[1] = "__/  |__\n";
    carro1[2] = "| c_     _``-.\n";
    carro1[3] = "'-(_)---(_)--'\n";

    String[] carro2 = new String[4];
    carro2[0] = "   ____\n";
    carro2[1] = "__/  |__\n";
    carro2[2] = "| c_     _``-.\n";
    carro2[3] = "'-(x)---(_)--'\n";

    String[] carro3 = new String[4];
    carro3[0] = "   ____\n";
    carro3[1] = "__/  |__\n";
    carro3[2] = "| c_     _``-.\n";
    carro3[3] = "'-(_)---(x)--'\n";

    String[] carro4 = new String[4];
    carro4[0] = "   ____\n";
    carro4[1] = "__/  |__\n";
    carro4[2] = "| c_     _``-.\n";
    carro4[3] = "'-(x)---(x)--'\n";

    Roda[] rodas = getRodas();
    // verificando a calibragem das rodas
    if (rodas[0].getCalibragem() == true && rodas[1].getCalibragem() == true) {
      for (int i = 0; i < getDistanciaPercorrida(); i++)
        for (int j = 0; j < carro1.length; j++)
          carro1[j] = " " + carro1[j];

      for (int i = 0; i < carro1.length; i++)
        System.out.print(carro1[i]);
    } else if (rodas[0].getCalibragem() == true && rodas[1].getCalibragem() == false) {
      for (int i = 0; i < getDistanciaPercorrida(); i++)
        for (int j = 0; j < carro2.length; j++)
          carro2[j] = " " + carro2[j];

      for (int i = 0; i < carro2.length; i++)
        System.out.print(carro2[i]);
    } else if (rodas[0].getCalibragem() == false && rodas[1].getCalibragem() == true) {
      for (int i = 0; i < getDistanciaPercorrida(); i++)
        for (int j = 0; j < carro3.length; j++)
          carro3[j] = " " + carro3[j];

      for (int i = 0; i < carro3.length; i++)
        System.out.print(carro3[i]);
    } else if (rodas[0].getCalibragem() == false && rodas[1].getCalibragem() == true) {
      for (int i = 0; i < getDistanciaPercorrida(); i++)
        for (int j = 0; j < carro4.length; j++)
          carro4[j] = " " + carro4[j];

      for (int i = 0; i < carro4.length; i++)
        System.out.print(carro4[i]);
    }
  }

  public String toString() {
    return "CarroPopular: " + distanciaPercorrida + " metros, tanque " + (tanque ? "cheio" : "vazio");
  }
}
