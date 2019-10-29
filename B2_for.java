
/**
 * obtiene el menor elemento de un arreglo con for.
 * 
 * @criss_215 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class B2_for
{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        //creacion del arreglo
        System.out.println("ingrese el tamano de su arreglo");
        int t=sc.nextInt();
        int [] arre=new int[t];
        ///llenado del arreglo
        for(int i=0;i<t;i++){
            System.out.println("ingrese el valor de su arreglo en la posicion "+i);
            arre[i]=sc.nextInt();
        }
        //encontraar el menor
        int menor=arre[0];
        for(int i=1;i<t;i++)
            if(menor>arre[i])
                menor=arre[i];
        System.out.println("el menor es "+menor);
        
    }
}
