import java.util.*;
public class Paiment {
    private Date date=new Date();
    private float amount;
    private Patient patient;

    public Paiment(Patient P){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Amount to pay: ");
        this.amount=Sc.nextFloat();
        this.patient=P;
    }
    public void PrintTicket(){
        System.out.print("The Transacation for :");
        patient.printname();
        System.out.print("The" +date+"for the amount of :" +amount+" has been correctly completed");
    }
}
