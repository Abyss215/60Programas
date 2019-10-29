
/**
 * programa q ordena un arreglo int con do while.
 * 
 * @criss_215 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class A1_DoWhile
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //creacion del arreglo
        System.out.println("ingrese el tamano de su arreglo");
        int t=sc.nextInt();
        int [] arre=new int[t];
        ///llenado del arreglo
        int i = 0;
        do{
            System.out.println("ingrese el valor de su arreglo en la posicion " + i);
            arre[i]=sc.nextInt();
            i=i+1;
        }while (i<t);
        ///ordenamiento del arreglo
        i=0;
        do{
            int ii=i+1;
            do{
                if(arre[i]>arre[ii]){
                    int aux=arre[i];
                    arre[i]=arre[ii];
                    arre[ii]=aux;
                }
                ii++;
            }while(ii<t);
            i++;
        }while(i<t-1);
        //comprobacion
        i=0;
        do{
            System.out.print(arre[i]+" ");
            i++;
        }while(i<t);
    }
}
