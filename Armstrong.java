import java.util.Scanner;


public class ArmstrongNumber{


     public static void main(String []args)
{
      Scanner sc=new Scanner(System.in);

      int n=sc.nextInt();

    int result=0;

    int tmp=n;
 
   while(n>0){
  
       int r=n%10;
 
       result+=r*r*r;
   
     n/=10;
    }
  
  if(result==tmp)
  
  System.out.print("Armstrong");
  
  else
  
  System.out.print(" Not Armstrong");
    

     }
}