import java.util.Scanner;
public class Lab4four
{
     public static void main(String args[])
     //Aniket Chatterjee . 2005783
     { Box aniket=new Box();
         System.out.println("Enter length: ");
         Scanner input =new Scanner(System.in);
         int length=input.nextInt();
         int breadth=input.nextInt();
         int height=input.nextInt();
         int res=aniket.Volume(length,breadth,height);
          System.out.println("Volume is : "+ res); 
          System.out.println("Three input parameters are: "+length+" "+breadth+" "+height); 
     }
} 
class Box{
     int Volume(int a,int b,int c)
     {
          int result=a*b*c; 
        return result;
     } 
}

