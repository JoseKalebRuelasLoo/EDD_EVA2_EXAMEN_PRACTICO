/* 
 <PROGRAMA 1>  
Diseñar un programa que capture valores tipo String desde 
el teclado y los almacene en un arbol ninario balanceado.
Hecho por: Jose Kaleb Ruelas Loo  No. de Control 20550387  
           Irving Javier Gardea Beltran No. de Control 20550406
           <16/12/2021> 
 */
package examen_u2;

public class ArbolBinario {

    ListaDoble listaDoble = new ListaDoble();
    private Nodo root;
    private int cont = 0;
    private boolean existe;

    public ArbolBinario() {
        this.root = null;//Arbol vacio
    }

    //De aqui todo es recursivo
    //Agregar nodo
    public void add(String valor) {
        Nodo nuevo = new Nodo(valor);
        // Verfificar si ya hay nodos 
        if (root == null) {
            //Si no hay un nodo, se crea uno 
            root = nuevo;
        } else {
            //Metodo recursivo para agregar nodos
            addRecu(root, nuevo);
        }
    }

    private void addRecu(Nodo actual, Nodo nuevo) {
        //Si un dato ya existe dentro del arbol, no se agrega 
        if (true == nuevo.getDato().equals(actual.getDato())) {
            System.out.println("El dato ingresado ya existe");

        } else if (nuevo.getDato().length() > cont + 1) {

            /*Cuando a un valor de tipo int se le asigna valor tipo char, este
            se transforma en su valor correspondiente en la tabla ascii
            para poder comparar facilmente su posicion en el alfabeto */
            int nuevoValor = nuevo.getDato().charAt(cont);
            int actualValor = actual.getDato().charAt(cont);
            /*El contador (cont) se utiliza para cuando hay mas de una palabra 
            que empieza con la misma letra, para que asi se ordenen conforme 
            a la siguiente letra.*/

            //verificar el lado al que va el nodo comparando los valores ascii
            if (nuevoValor < actualValor) {
                if (actual.getIzquierda() == null) {
                    //Si no existe nodo a la izquierda, se crea uno con el valor nuevo
                    actual.setIzquierda(nuevo);
                } else {
                    //Llamar al metodo recursivo, moviendose a la izquierda
                    addRecu(actual.getIzquierda(), nuevo);
                }
            } else if (nuevoValor > actualValor) {
                if (actual.getDerecha() == null) {
                    //Si no existe nodo a la derecha, se crea uno con el valor nuevo
                    actual.setDerecha(nuevo);
                } else {//Llamar metodo recursivo, moviendose a la derecha
                    addRecu(actual.getDerecha(), nuevo);
                }
            } else if (nuevoValor == actualValor) {
                //si la letra del nodo nuevo es igual a la del nodo actual, 
                //se pasa a la siguiente letra
                cont++;
                //Llamar metodo recursivo con los mismos nodos pero con diferente letra a comparar
                addRecu(actual, nuevo);
            }
        }

    }

    //Metodo para imprimir Pre order
    public void printPreOrder() {
        preOrder(root);
    }

    private void preOrder(Nodo actual) {
        if (actual != null) {
            System.out.print("[" + actual.getDato() + "]");//Visit nodo
            preOrder(actual.getIzquierda());//travers left subtree
            preOrder(actual.getDerecha());//travers right subtree
        }
    }

    //Metodo para imprimir Post order
    public void printPostOrder() {
        postOrder(root);
    }

    private void postOrder(Nodo actual) {
        if (actual != null) {
            postOrder(actual.getIzquierda());//travers left subtree
            postOrder(actual.getDerecha());//travers right subtree
            System.out.print("[" + actual.getDato() + "]");//Visit nodo
        }
    }

    //Metodo para imprimir In order
    public void printInOrder() {
        inOrder(root);
    }

    private void inOrder(Nodo actual) {
        if (actual != null) {
            inOrder(actual.getIzquierda());//travers left subtree
            System.out.print("[" + actual.getDato() + "]");//Visit nodo
            inOrder(actual.getDerecha());//travers right subtree
        }
    }

    //Metodo para exportar a una lista los datos almacenados (usando In Order)
    public void printExportar() {
        exportar(root);
        listaDoble.printList();
    }

    private void exportar(Nodo actual) {
        if (actual != null) {
            exportar(actual.getIzquierda());//travers left subtree
            listaDoble.add(actual.getDato());//Visit nodo
            exportar(actual.getDerecha());//travers right subtree
        }
    }

    //Metodo que comprueba si un dato se encuntra almacenado en el arbol
    public void comprobar(String valor) {
        existe = false;
        comprobarValor(valor, root);
        if (existe == true) {
            System.out.print("El dato " + valor + " existe dentro del arbol");
        } else if (existe == false) {
            System.out.print("El dato " + valor + " no existe dentro del arbol");
        }
    }

    private void comprobarValor(String valor, Nodo actual) {
        if (actual != null) {
            comprobarValor(valor, actual.getIzquierda());
            if (actual.getDato().equals(valor)) {
                existe = true;
            }
            comprobarValor(valor, actual.getDerecha());
        }
    }

}
