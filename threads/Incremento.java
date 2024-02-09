/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author JoãoPaulo
 */
public class Incremento{

    private Contador contador;

    public Incremento(Contador c) {
        this.contador = c;
    }
    
    public synchronized void run() {
        for(int i = 0; i < 5; i++){
            contador.incrementar();
        }
    }

    
    public void start() {        
    }   
}
