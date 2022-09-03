import java.util.Date;
import java.util.Scanner;
public class Doctor {
    private static int count=0;
    private String Firstname,Lastname,Gender,Specialization,Phone,Address;
    private int Docid;
    private Date date=new Date();

    public Doctor() {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter FirstName");
        this.Firstname = Sc.nextLine();
        System.out.println("Enter LastName");
        this.Lastname = Sc.nextLine();
        System.out.println("Enter Specialization");
        this.Specialization = Sc.nextLine();
        System.out.println("Enter Phone Number");
        this.Phone = Sc.nextLine();
        System.out.println("Enter Gender");
        this.Gender = Sc.nextLine();
        System.out.println("Enter Address");
        this.Address = Sc.nextLine();
        this.Docid=++count;
    };
    public void Show(){
        System.out.println("The Firstname is:");
        System.out.println(this.Firstname);
        System.out.println("The Lastname is:");
        System.out.println(this.Lastname);
        System.out.println("The Specialization is:");
        System.out.println(this.Specialization);
        System.out.println("The Phone Number is:");
        System.out.println(this.Phone);
        System.out.println("The Address is:");
        System.out.println(this.Address);
        System.out.println("The Doctor's id is:");
        System.out.println(this.Docid);
        System.out.println("The date of the treatment is:");
        System.out.println(this.date);
    }
}
