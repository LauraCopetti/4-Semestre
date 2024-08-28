public class Motocicleta extends VeiculoMotorizado {

    public Motocicleta(int dist) {
        super(2, dist); 
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


    public String toString() {
        return  "Motocicleta: " + getDistanciaPercorrida() + " metros, tanque " + (tanque ? "cheio" : "vazio");
    }

    public void desenhar() {
        String[] moto1 = new String[3];
        moto1[0] = "   ,_oo\n";
        moto1[1] = ".-/c-//::\n";
        moto1[2] = "(_)'==(_)\n";

        String[] moto2 = new String[3];
        moto2[0] = "   ,_oo\n";
        moto2[1] = ".-/c-//::\n";
        moto2[2] = "(x)'==(_)\n";

        String[] moto3 = new String[3];
        moto3[0] = "   ,_oo\n";
        moto3[1] = ".-/c-//::\n";
        moto3[2] = "(_)'==(x)\n";

        String[] moto4 = new String[3];
        moto4[0] = "   ,_oo\n";
        moto4[1] = ".-/c-//::\n";
        moto4[2] = "(x)'==(x)\n";

        // System.out.println("Desenhando a bicicleta");
        Roda[] rodas = getRodas();
        // verificando a calibragem das rodas
        if (rodas[0].getCalibragem() == true && rodas[1].getCalibragem() == true) {
            for (int i = 0; i < getDistanciaPercorrida(); i++)
                for (int j = 0; j < moto1.length; j++)
                    moto1[j] = " " + moto1[j];

            for (int i = 0; i < moto1.length; i++)
                System.out.print(moto1[i]);
        } else if (rodas[0].getCalibragem() == true && rodas[1].getCalibragem() == false) {
            for (int i = 0; i < getDistanciaPercorrida(); i++)
                for (int j = 0; j < moto2.length; j++)
                    moto2[j] = " " + moto2[j];

            for (int i = 0; i < moto2.length; i++)
                System.out.print(moto2[i]);
        } else if (rodas[0].getCalibragem() == false && rodas[1].getCalibragem() == true) {
            for (int i = 0; i < getDistanciaPercorrida(); i++)
                for (int j = 0; j < moto3.length; j++)
                    moto3[j] = " " + moto3[j];

            for (int i = 0; i < moto3.length; i++)
                System.out.print(moto3[i]);
        } else if (rodas[0].getCalibragem() == false && rodas[1].getCalibragem() == true) {
            for (int i = 0; i < getDistanciaPercorrida(); i++)
                for (int j = 0; j < moto4.length; j++)
                    moto4[j] = " " + moto4[j];

            for (int i = 0; i < moto4.length; i++)
                System.out.print(moto4[i]);
        }

    }

}
