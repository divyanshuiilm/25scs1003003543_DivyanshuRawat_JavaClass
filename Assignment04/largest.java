import java.util.Scanner;
public class largest {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();

        if(n1>n2&&n1>n3)
            System.out.println(n1+"  is the greatest number");
        else if(n2>n1&&n2>n3)
        System.out.println(n2+" is the greatest number");
    else if(n3>n1&&n3>n2) 
        System.out.println(n3+" is the greatest number ");
   else
    System.out.println("all are same number");

    }
    
}
