
/**
 *optiene la suma de todos los valores impares del arreglo con for.
 * 
 * @Criss_215
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class G7_for
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
        //sumar valores
        int suma=0;
        for(int i=0;i<t;i++)
            if(arre[i]%2!=0)
            suma+=arre[i];
        
        System.out.println("la suma de los valores es: "+suma);
    }
}
