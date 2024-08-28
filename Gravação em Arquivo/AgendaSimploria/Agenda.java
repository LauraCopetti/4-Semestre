package AgendaSimploria;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Agenda{
    public static void main(String[] args) {
        Pessoa[] p= new Pessoa[2];

        p[0]= new Pessoa("Joana", 999229922);
        p[1] = new Pessoa("Joao", 989898989);


        File arquivo= new File("AgendaSimploria/texto.txt");
        try{
            FileOutputStream fout= new FileOutputStream(arquivo);
            ObjectOutputStream oos= new ObjectOutputStream(fout);

            oos.writeObject(p);

            oos.flush();
            oos.close();
            fout.close();
        }catch(Exception ex){
            System.err.println("erro : "+ex.toString());
        }

        try{
            FileInputStream fin= new FileInputStream(arquivo);
            ObjectInputStream oin= new ObjectInputStream(fin);

            Pessoa[] ler = (Pessoa[]) oin.readObject();

            for(int i=0; i<ler.length; i++){
                ler[i].imprimirDados();
            }
            fin.close();
            oin.close();

        }catch(Exception ex){
            System.err.println("erro : "+ex.toString());
        }
        
    }
}