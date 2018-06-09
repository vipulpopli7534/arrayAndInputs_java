import java.util.Scanner;


public class ReverseNumber{

   
  public static void main(String []args){
   
   Scanner sc=new Scanner(System.in);
     
 int arr[]=new int[10];
   
   for(int i=0;i<arr.length;i++){
 
     int n=sc.nextInt();
   
   arr[i]=n;}
 
     
      for(int i=0;i<arr.length-1;i++){
   
       for(int j=0;j<arr.length-1-i;j++){
     
         if(arr[j+1]<arr[j]){
        
          int tmp=arr[j];
        
          arr[j]=arr[j+1];
           
       arr[j+1]=tmp;
     
         }
          }
      }
      
     
 
      for(int i=0;i<arr.length;i++){
     
     System.out.println(arr[i]);
      }

}
}