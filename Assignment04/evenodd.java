import java.util.Scanner;
public class evenodd {

    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a no");

        int  n =sc.nextInt();

        if(n%2==0)
        System.out.println(n+" is a even number.");
    else
        System.out.println(n +" is a odd number. ");
    }
    
}
