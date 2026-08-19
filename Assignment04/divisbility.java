import java.util.Scanner;
class divisbility{
    public static void main(String[]args){
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    if(n%5==0)
    {
        if(n%10==0)
            System.out.println(n+" is divisible by both 5 and 10.");

    }
    else
        System.out.println(n+" is not divisible by both 5 and 10.");
    }
}
