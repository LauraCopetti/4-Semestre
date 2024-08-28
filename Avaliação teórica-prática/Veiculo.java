public abstract class Veiculo implements Calibrar {
    protected int distanciaPercorrida;
    protected Roda[] rodas;

    public Veiculo() {

    }

    public int getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public Roda[] getRodas() {
        return rodas;
    }

    public Veiculo(int dist) {
        this.distanciaPercorrida = dist;

    }

    public Veiculo(int numRodas, int dist) {
        this.distanciaPercorrida = dist;
        this.rodas = new Roda[numRodas];

        for (int i = 0; i < numRodas; i++) {
            rodas[i] = new Roda();
        }
    }


    public void calibrarVeiculo() {
        for (Roda roda : rodas) {
            roda.setCalibragem(true);
        }
    }

    public abstract void mover();

    public abstract void desenhar();

    public String toString() {
        return "Distancia percorrida: " + distanciaPercorrida + " metros";
    }
}
