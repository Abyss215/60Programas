
/**
 * determinar q arreglo tiene mas elementos, con for?.
 * 
 * @criss_215 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class S19_for
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese tamaño del primer arreglo");
        int t1=sc.nextInt();
        int arr1[]=new int[t1];
        for(int i=0;i<t1;i++)
            arr1[i]=sc.nextInt();
        System.out.println("ingrese tamaño del segundo arreglo");
        int t2=sc.nextInt();
        int arr2[]=new int[t2];
        for(int i=0;i<t2;i++)
            arr2[i]=sc.nextInt();
        if(t1>t2)
            System.out.println("el primer arreglo tiene mas elementos");
        else if(t1<t2)
            System.out.println("el segundo arreglo tiene mas elementos");
        else
            System.out.println("los dos arreglos son del mismo tamaño");
    }
}
