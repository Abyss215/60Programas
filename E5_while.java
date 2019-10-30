
/**
 * Imprime los valores en las posiciones pares con while
 * 
 * @criss_215
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class E5_while
{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        //creacion del arreglo
        System.out.println("ingrese el tamano de su arreglo");
        int t=sc.nextInt();
        int [] arre=new int[t];
        ///llenado del arreglo
        int i=0;
        while(i<t){
            System.out.println("ingrese el valor de su arreglo en la posicion "+i);
            arre[i]=sc.nextInt();
            i++;
        }
        //imprimir posiciones pares
        i=2;
        while(i<t){
            System.out.print(arre[i]+" ");
            i=i+2;
        }
        
    }
}
