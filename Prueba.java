import lang.stride.*;
import java.util.Scanner;

/**
 * Write a description of class Prueba here.
 * @author (your name) @version (a version number or a date)
 */
public class Prueba
{

    /**
     * 
     */
    static public void main(String[] args)
    {
        Scanner sc =  new  Scanner(System.in);
        System.out.println("ingrese el tamano de su arreglo");
        int t = sc.nextInt();
        int[] arre =  new  int[t];
        int i = 0;
        while (i < t) {
            System.out.println("ingrese el valor de su arreglo en la posicion " + i);
            arre[i] = sc.nextInt();
            i = i + 1;
        }
        /* arre=A1_for.OrdenarF(arre);*/
        switch (i) {
            case 1 : {
                break;
            }
        }
        
        
        int s = 0;
        while (i < arre.length) {
            System.out.print(arre[i] + " ");
            i = i + 1;
        }
    }
}
