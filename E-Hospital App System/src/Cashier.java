import java.util.Date;
import java.util.*;
public class Cashier {
    private static int count=0;
    private String Firstname,Lastname,Gender,Phone,Address,Birthday;
    private int Cashierid;
    private Date date=new Date();
    public Cashier(){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter FirstName");
        this.Firstname = Sc.nextLine();
        System.out.println("Enter LastName");
        this.Lastname = Sc.nextLine();
        System.out.println("Enter Birthday");
        this.Birthday = Sc.nextLine();
        System.out.println("Enter Phone Number");
        this.Phone = Sc.nextLine();
        System.out.println("Enter Gender");
        this.Gender = Sc.nextLine();
        System.out.println("Enter Address");
        this.Address = Sc.nextLine();
        this.Cashierid=++count;
    }
    public void Show(){
        System.out.println("The Firstname is:");
        System.out.println(this.Firstname);
        System.out.println("The Lastname is:");
        System.out.println(this.Lastname);
        System.out.println("The Birthday is:");
        System.out.println(this.Birthday);
        System.out.println("The Phone Number is:");
        System.out.println(this.Phone);
        System.out.println("The Address is:");
        System.out.println(this.Address);
        System.out.println("The Doctor's id is:");
        System.out.println(this.Cashierid);
        System.out.println("The date of the treatment is:");
        System.out.println(this.date);
    }

    public Operation AddOperation(){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the new Patient's informations: ");
        Patient tmp= new Patient();
        Operation Op=new Operation(tmp);
        return Op;
    }
    public void AddDoctors(Doctor D,Operation O){
        O.AddDoc(D);
    }
    public void AddIntern(Intern I,Operation O){
        O.AddIntern(I);
    }
    public void Paiment(Operation O,Paiment P){
        P.PrintTicket();
        O.PaimentSuccess();

    }
}

