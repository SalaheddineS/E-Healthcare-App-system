import java.util.*;
public class Intern {
    private String FirstName,LastName,School,Number,Address,InternshipDuration;
    private Date Entry=new Date();
    public Intern(){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter your FirstName: ");
        this.FirstName=Sc.nextLine();
        System.out.println("Enter your LastName: ");
        this.LastName=Sc.nextLine();
        System.out.println("Enter your School: ");
        this.School=Sc.nextLine();
        System.out.println("Enter your Number: ");
        this.Number=Sc.nextLine();
        System.out.println("Enter your Address: ");
        this.Address=Sc.nextLine();
        System.out.println("Enter your Internship Duration: ");
        this.InternshipDuration=Sc.nextLine();
    }
}
