import java.util.Scanner;

public class password {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a password to be checked ");
  String p=sc.nextLine();
  int l=p.length();

        if(l<8)
            System.out.println("password too short");
        else if (l<12)
            System.out.println("password is acceptable ");
        else if(l>12)
            System.out.println("strong password");
    
    }
    
}
