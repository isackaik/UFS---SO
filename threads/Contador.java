/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author Jo�oPaulo
 */
public class Contador {

	public int contador = 0;

    public void incrementar() {
        contador++;
    }

    public void decrementar() {
        contador--;
    }
    
    public int getContador(){
        return contador;
    }
}
