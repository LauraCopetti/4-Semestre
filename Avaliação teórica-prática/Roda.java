import java.util.Random;
public class Roda {
    private boolean calibragem;

    public Roda() {
        Random r = new Random();
        this.calibragem = r.nextBoolean();
    }

    public void setCalibragem(boolean calibragem) {
        this.calibragem = calibragem;
    }

    public boolean getCalibragem() {
        return calibragem;
    }

}
