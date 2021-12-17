/* 
 <PROGRAMA 1>  
Diseñar un programa que capture valores tipo String desde 
el teclado y los almacene en un arbol ninario balanceado.
Hecho por: Jose Kaleb Ruelas Loo  No. de Control 20550387  
           Irving Javier Gardea Beltran No. de Control 20550406
           <16/12/2021> 
*/ 
package examen_u2;

import java.util.Scanner;

public class Examen_U2 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        ArbolBinario arbolB = new ArbolBinario();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 1; i++) {
            int j=0;
            i--;
            System.out.println("Dato a capturar");
            String val = input.nextLine();
            val = val.toLowerCase();
            arbolB.add(val);
            do {
                System.out.println("Desea Agregar mas datos\n 1. si\n 2. no");
                String resp = input.nextLine();
                int numEntero = Integer.parseInt(resp);

                switch (numEntero) {
                    case 1:
                        j++;
                        val = null;
                        break;
                    case 2:
                        j++;
                        i++;
                        break;
                    default:
                        System.out.println("Respuesta incorrecta");
                        break;
                }
            } while (j==0);

        }
        for (int i = 0; i < 1; i++) {
            //ciclo indeterminada hasta que el usuario lo termine
            i--;
            System.out.println("");
            //se presentan diversas acciones que puede realizar el usuario
            System.out.println("¿Como desea que se impriman los datos?"
                    + "\n 1. Imprimir en Pre order"
                    + "\n 2. Imprimir en Post order"
                    + "\n 3. Imprimir en In order"
                    + "\n 4. Exportar a lista e imprimir"
                    + "\n 5. Salir del programa"
            );

            int val2 = input.nextInt();
            switch (val2) {
                //switch con las acciones disponibles
                case 1:
                    //Pre order
                    System.out.println("Pre Order");
                    arbolB.printPreOrder();
                    break;
                case 2:
                    //Post order
                    System.out.println("Post Order");
                    arbolB.printPostOrder();

                    break;
                case 3:
                    //In order
                    System.out.println("In Order");
                    arbolB.printInOrder();

                    break;
                case 4:
                    //Pre order
                    System.out.println("Exportar a Lista");
                    arbolB.printExportar();

                    break;
                case 5:
                    System.out.println("Gracias por utilizar");
                    i++;
                    //Se termina el codigo
                    System.exit(0);
                    break;
                default:
                    System.out.println("Respuesta incorrecta");
                    break;
            }
            System.out.println("");
        }
    }
}
