
/**
 * programa q ordena un arreglo int con for.
 * 
 * @criss_215 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class A1_for
{
    public static void main(String  [] args){
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
        ///ordenamiento del arreglo
        for(int i=0;i<t-1;i++)
            for(int ii=i+1;ii<t;ii++)
                if(arre[i]>arre[ii]){
                    int aux=arre[i];
                    arre[i]=arre[ii];
                    arre[ii]=aux;
                }
        //comprobacion
        for(int i=0;i<t;i++)
        System.out.print(arre[i]+" ");
    }
}
