public class Bicicleta extends Veiculo {

    public Bicicleta(int dist) {
        super(2, dist);
    }

    public void mover() {
        boolean podeMover = true;

        for (Roda roda : rodas) {
            if (!roda.getCalibragem()) {
                podeMover = false;
                break;
            }
        }
        if (podeMover) {
            distanciaPercorrida++;
        }
    }

    public String toString() {
        return "Bicicleta: " + super.toString();
    }

    public void desenhar() {
        String[] bike1 = new String[3];
        bike1[0] = "   __o\n";
        bike1[1] = " _`\\<,_\n";
        bike1[2] = "(*)/ (*)\n";

        String[] bike2 = new String[3];
        bike2[0] = "   __o\n";
        bike2[1] = " _`\\<,_\n";
        bike2[2] = "(x)/ (*)\n";

        String[] bike3 = new String[3];
        bike3[0] = "   __o\n";
        bike3[1] = " _`\\<,_\n";
        bike3[2] = "(*)/ (x)\n";

        String[] bike4 = new String[3];
        bike4[0] = "   __o\n";
        bike4[1] = " _`\\<,_\n";
        bike4[2] = "(x)/ (x)\n";

        // Desenhando a bicicleta:
        Roda[] rodas = getRodas();
        // verificando a calibragem das rodas
        if (rodas[0].getCalibragem() == true && rodas[1].getCalibragem() == true) {
            for (int i = 0; i < getDistanciaPercorrida(); i++)
                for (int j = 0; j < bike1.length; j++)
                    bike1[j] = " " + bike1[j];

            for (int i = 0; i < bike1.length; i++)
                System.out.print(bike1[i]);

        } else if (rodas[0].getCalibragem() == true && rodas[1].getCalibragem() == false) {
            for (int i = 0; i < getDistanciaPercorrida(); i++)
                for (int j = 0; j < bike1.length; j++)
                    bike2[j] = " " + bike2[j];

            for (int i = 0; i < bike2.length; i++)
                System.out.print(bike2[i]);
        } else if (rodas[0].getCalibragem() == false && rodas[1].getCalibragem() == true) {
            for (int i = 0; i < getDistanciaPercorrida(); i++)
                for (int j = 0; j < bike1.length; j++)
                    bike3[j] = " " + bike3[j];

            for (int i = 0; i < bike3.length; i++)
                System.out.print(bike3[i]);
        } else if (rodas[0].getCalibragem() == false && rodas[1].getCalibragem() == false) {
            for (int i = 0; i < getDistanciaPercorrida(); i++)
                for (int j = 0; j < bike1.length; j++)
                    bike4[j] = " " + bike4[j];

            for (int i = 0; i < bike4.length; i++)
                System.out.print(bike4[i]);
        }

    }

}
