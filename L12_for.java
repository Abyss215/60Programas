
/**
 * contar las silabas de una palabra o frase con for.
 * 
 * Criss_215
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class L12_for
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese una palabra o frase");
        String cad=sc.nextLine();
        //contador
        int t =cad.length();
        cad+=" ";
        int cont=0;
        
        System.out.println("hay "+cont+" silabas");
    }
   ////procesos xd
    private static boolean abr(char ct){
        int [] voc={'a','e','o','á','é','ó','Á','É','Ó','A','E','O'};
        boolean si=false;
        for(int i=0;i<12;i++)
            if(voc[i]==ct){
                si= true;
                break;
            }
        return si;
    }
    private static boolean cerr(char ct){
        int [] voc={'i','u','í','ú','I','U','Í','Ú'};
        boolean si=false;
        for(int i=0;i<8;i++)
            if(voc[i]==ct){
                si= true;
                break;
            }
        return si;
    }
    private static boolean toni(char ct){
        int [] voc={'á','é','í','ó','ú','Á','É','Í','Ó','Ú'};
        boolean si=false;
        for(int i=0;i<10;i++)
            if(voc[i]==ct){
                si= true;
                break;
            }
        return si;
    }
    private static boolean ato(char ct){
        int [] voc={'a','e','i','o','u','A','E','I','O','U'};
        boolean si=false;
        for(int i=0;i<10;i++)
            if(voc[i]==ct){
                si= true;
                break;
            }
        return si;
    }
    private static boolean vocal(char ct){
        int [] voc={'a','e','i','o','u','A','E','I','O','U','á','é','í','ó','ú','Á','É','Í','Ó','Ú'};
        boolean si=false;
        for(int i=0;i<20;i++)
            if(voc[i]==ct){
                si= true;
                break;
            }
        return si;
    }
    private static boolean cons(char ct){
        int [] cons={'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t',
            'v','w','x','y','z','B','C','D','F','G','H','J','K','L','M','N','P','Q',
            'R','S','T','V','W','X','Y','Z'};
        boolean si=false;
        for(int i=0;i<41;i++)
            if(cons[i]==ct){
                si= true;
                break;
            }
        return si;
    }
    private static boolean imse(char ct,char ct2){
        int [][] voc={{'q','u'},{'g','u'},{'c','h'},{'l','l'},{'r','r'},{'Q','U'},{'G','U'},{'C','H'},{'L','L'},{'R','R'}};
        boolean si=false;
        for(int i=0;i<10;i++)
            if(ct==voc[0][i]&&ct2==voc[1][i]){
                si=true;
                break;
            }
        return si;
    }
    private static boolean dip(char ct,char ct2){
        boolean si=false;
        if(cerr(ct)&&cerr(ct2))
            si= true;
        else if((abr(ct)&&(cerr(ct2)&&ato(ct2)))||((cerr(ct)&&ato(ct))&&abr(ct2)))
            si = true;
        return si;
    }
    private static boolean consT1(char ct,char ct2,char ct3){
        boolean si=false;
        if(cons(ct)&&cons(ct)&&(ct3=='l'||ct3=='r'||ct3=='L'||ct3=='R'))
            si= true;        
        return si;
    }
}
