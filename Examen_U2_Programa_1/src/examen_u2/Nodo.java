/* 
 <PROGRAMA 1>  
Diseñar un programa que capture valores tipo String desde 
el teclado y los almacene en un arbol ninario balanceado.
Hecho por: Jose Kaleb Ruelas Loo  No. de Control 20550387  
           Irving Javier Gardea Beltran No. de Control 20550406
           <16/12/2021> 
*/ 
package examen_u2;

public class Nodo {

    private String dato;
    private Nodo derecha;
    private Nodo izquierda;

    //constructores
    public Nodo() {
        this.derecha = null;
        this.izquierda = null;
    }

    public Nodo(String dato) {
        this.dato = dato;
        this.derecha = null;
        this.izquierda = null;
    }

    //get y set 
    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

}
