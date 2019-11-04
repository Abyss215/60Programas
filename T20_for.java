
/**
 * determinar q arreglo tiene una suma de sus elementos mas grande con for.
 * 
 * @criss_215 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class T20_for
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int sum1=0,sum2=0;
        System.out.println("ingrese tamaño del primer arreglo");
        int t1=sc.nextInt();
        int arr1[]=new int[t1];
        for(int i=0;i<t1;i++){
            arr1[i]=sc.nextInt();
            sum1+=arr1[i];
        }
        System.out.println("ingrese tamaño del segundo arreglo");
        int t2=sc.nextInt();
        int arr2[]=new int[t2];
        for(int i=0;i<t2;i++){
            arr2[i]=sc.nextInt();
            sum2+=arr2[i];
        }
        if(sum1>sum2)
            System.out.println("el primer arreglo tiene la suma mas grande de elementos");
        else if(sum1<sum2)
            System.out.println("el segundo arreglo tiene la suma mas grande de elementos");
        else
            System.out.println("la suma de los dos arreglos es del mismo tamaño");
    }
}
