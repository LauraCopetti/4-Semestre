package AgendaSimploria;
import java.io.Serializable;

public class Pessoa implements Serializable{
    private String nome;
    private int numero;

    public Pessoa(String nome, int numero){
        this.nome= nome;
        this.numero= numero;
    }

    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + numero);
    }

    public Pessoa getPessoa(){
        return this;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
