import java.util.Scanner;


public class FindNumber{

  
   public static void main(String []args){
 
     Scanner sc=new Scanner(System.in);

      int arr[]=new int[10];
     
 for(int i=0;i<arr.length;i++){
  
    int n=sc.nextInt();
   
   arr[i]=n;}
     
 int FindNumber=sc.nextInt();

      boolean flag=false;
 
     for(int i=0;i<arr.length-1;i++){
 
         if(arr[i]==FindNumber)
    
      flag=true;
        
  
    }
  
    if(flag)
  
    System.out.print("Number Exists");
 
     else
   
   System.out.print("Number Not Exists");
      
 
     
      
     
}
}