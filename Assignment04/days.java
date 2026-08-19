import java.util.Scanner;
public class days {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a number between 1 to 7");
 
int n=sc.nextInt();
  
if(n>=1&&n<=5)
    System.out.println("it is a working day");
else
    System.out.println("it is a weekend");


    }
    
}
