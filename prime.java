import java.util.Scanner;
public class prime{

     public static void main(String []args){
     int n,i,count=0;
     Scanner s=new Scanner(System.in);
     n=s.nextInt();
     for(i=2;i<n;i++)
     {
         if(n%i==0)
         {
            count++;
            break;
         }
         
     }
     if(count==0)
     {
         System.out.println("prime no");
         
     }
     else
     {
         System.out.println("not a prime no");
     }
     }
}
