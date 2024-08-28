public class usaSimulador{
    public static void main(String[] arg){

        System.out.println("Simulador Corrida de Veiculos");
        Simulador sim = new Simulador();
        
        
        
        sim.incluirVeiculo(new Bicicleta(5));
        sim.incluirVeiculo(new Motocicleta(2));
        sim.incluirVeiculo(new Bicicleta(8));
        sim.incluirVeiculo(new Motocicleta(5));
        sim.incluirVeiculo(new CarroPopular(3));
        
        sim.imprimirPista(); //invocando desenhar de todas as instancias
        sim.moverVeiculos(); //invocando mover de todas as instancias  
        sim.imprimirPista(); 
        
        System.out.println(sim); //invocando o toString de todas as instancias
        

        /*Exemplo de desenhos dos veiculos*/
            
        /* moto com os dois pneus vazios e tanque cheio
           ,_oo
        .-/c-//::  
        (x)'==(x)
        
        */


        /* moto com os dois pneus cheios e tanque vazio
           ,_oo
        .-/v-//::  
        ( )'==( )
        
        */
        
        
        /* moto com os dois pneus cheios e tanque cheio
           ,_oo
        .-/c-//::  
        ( )'==( )
        
        */
        
        
        /* carro com um ou os dois pneus traseiros vazios e tanque de combustível cheio
            ____
         __/  |_\_
        | c_     _``-.
        '-(x)---(_)--'
        */
        
        /*  bike com os dois pneus cheios
           __o    
         _`\<,_
        (*)/ (*)
        
        */    
                
    
    }

}