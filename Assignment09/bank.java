import java.util.Scanner;
class bank
{
    public int AccountNo ;
    public String AccountName;
    public int balance;
    static double r;

    bank(String AccountName,int AccountNo,int balance){
        this.AccountNo=AccountNo;
        this.AccountName=AccountName;
        this.balance=balance;
    } 

    static void rate(double r )
    {
      bank.r=r;
    }

    void display(){
        System.out.println("Account holder name ="+AccountName+"\n"+"Account number ="+AccountNo+"\n"+"Balance ="+balance+"\n"+"rate of intrest ="+r);

        System.out.println();
    }


}
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        bank.r=3.5;
        bank obj=new bank("Deepu",4484949,200);
        
        bank obj1=new bank("Kamlesh",3333232,223);
        obj.display();
        obj1.display();
        bank.r=4.5;
        bank obj2=new bank("Dora",546245,5463);
        bank obj3=new bank("Hitachi",777672,4223);
obj2.display();
obj3.display();
obj.display();



    }
}
