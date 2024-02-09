package threads;

public class Decremento{

    private Contador contador;
   
    public Decremento(Contador c) {
        this.contador = c;
    }

    public synchronized void run() {
        for(int i = 0; i < 5; i++){
            contador.decrementar();
        }
    }

    
    public void start() {
        
    }
}
