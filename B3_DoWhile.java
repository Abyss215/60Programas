
/**
 * obtiene el menor elemento de un arreglo con do while.
 * 
 * @criss_215 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class B3_DoWhile
{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        //creacion del arreglo
        System.out.println("ingrese el tamano de su arreglo");
        int t=sc.nextInt();
        int [] arre=new int[t];
        ///llenado del arreglo
        int i=0;
        do{
            System.out.println("ingrese el valor de su arreglo en la posicion "+i);
            arre[i]=sc.nextInt();
            i++;
        }while(i<t);
        //encontraar el menor
        int menor=arre[0];
        i=0;
        do{
            if(menor>arre[i])
                menor=arre[i];
            i++;
        }while(i<t);
        System.out.println("el menor es "+menor);
        
    }
}
