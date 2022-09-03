import java.util.*;

public class Patient {
    private static int count=0;
    private String Firstname,Lastname,Gender,Specialization,Phone,Address,Allergies,prescriptions,sickness,Notes;
    private int Patientid;
    private Date date=new Date();

    public Patient() {
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
        this.Patientid=++count;
        System.out.println("Enter Allergies");
        this.Allergies = Sc.nextLine();
        System.out.println("Enter prescriptions");
        this.prescriptions = Sc.nextLine();
        System.out.println("Enter sickness");
        this.sickness = Sc.nextLine();
        System.out.println("Enter Notes About the patient");
        this.Notes = Sc.nextLine();
    }
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
        System.out.println("The Patient id is:");
        System.out.println(this.Patientid);
        System.out.println("The Allergies are:");
        System.out.println(this.Allergies);
        System.out.println("The prescriptions are:");
        System.out.println(this.prescriptions);
        System.out.println("The sicknesses are:");
        System.out.println(this.sickness);
        System.out.println("The Notes are:");
        System.out.println(this.Notes);
        System.out.println("The date of the treatment is:");
        System.out.println(this.date);
    }
    public void printname(){
        System.out.println(this.Firstname + this.Lastname);
    }
};
