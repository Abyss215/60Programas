
/**
 * Imprime los valores en las posiciones pares con for.
 * 
 * @Criss_215
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class E5_for
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //creacion del arreglo
        System.out.println("ingrese el tamano de su arreglo");
        int t=sc.nextInt();
        int [] arre=new int[t];
        ///llenado del arreglo
        for(int i=0;i<t;i++){
            System.out.println("ingrese el valor de su arreglo en la posicion "+i);
            arre[i]=sc.nextInt();
        }
        //imprimir posiciones pares
        for(int i=2;i<t;i=i+2)
            System.out.print(arre[i]+" ");
        
    }
}
