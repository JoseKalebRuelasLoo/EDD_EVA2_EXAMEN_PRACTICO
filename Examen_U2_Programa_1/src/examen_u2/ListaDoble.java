/* 
 <PROGRAMA 1>  
Diseñar un programa que capture valores tipo String desde 
el teclado y los almacene en un arbol ninario balanceado.
Hecho por: Jose Kaleb Ruelas Loo  No. de Control 20550387  
           Irving Javier Gardea Beltran No. de Control 20550406
           <16/12/2021> 
*/ 
package examen_u2;

public class ListaDoble {

    private Nodo inicio;
    private Nodo fin;

    public ListaDoble() {
        inicio = null;
        fin = null;
    }

    //agregar Nodos
    public void add(String valor) {
        Nodo nuevo = new Nodo(valor);
        //HAY NODOS EN LA LISTA?
        if (inicio == null) { //LISTA VACIA
            inicio = nuevo;//conectamos el primer nodo a la lista
            fin = nuevo;
        } else {
            fin.setDerecha(nuevo);
            nuevo.setIzquierda(fin);
            fin = nuevo;
        }
    }

    public void printList() {
        Nodo temp = inicio;//aqui empezamos
        //WHILE
        while (temp != null) {//MIENTRAS TEMP.SIGUIENTE != NULL NOS VAMOS A MOVER
            System.out.print(temp.getDato() + " - ");
            temp = temp.getDerecha();//mover a temp al siguiente nodo
        }
    }
}
