
/**
 * imprimir la posicion en la que se encuentra un valor con for.
 * 
 * @criss_215
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class O15_for
{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese tamaño del arreglo");
        int t=sc.nextInt();
        int [] arre=new int[t];
        for(int i=0;i<t;i++)
            arre[i]=sc.nextInt();
        System.out.println("de que valor quiere saber su(s) posicion(s)");
        int v=sc.nextInt();
        for(int i=0;i<t;i++)
            if(arre[i]==v)
                System.out.println("esta en la posicion "+i);
    }
}
