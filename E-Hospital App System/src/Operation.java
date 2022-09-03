import java.util.*;
public class Operation {
    private boolean PaimentStatus;
    private static int count=0;
    private int Operationid;
    private List<Doctor> doctorList=new LinkedList<Doctor>();
    private Patient P;
    private String Time;
    private List<Intern> internList=new LinkedList<Intern>();
    public Operation(Patient P){
        this.PaimentStatus=false;
        Scanner Sc=new Scanner(System.in);
        this.Operationid=++count;
        this.P=P;
        System.out.println("Enter the date and hour of the Operation: ");
        this.Time=Sc.nextLine();
    }
    public void AddDoc(Doctor D){
        doctorList.add(D);
    }
    public void AddIntern(Intern I){
        internList.add(I);
    }
    public void Show(){
        System.out.println("The Operation's Id is is : " + this.Operationid);
        System.out.println("The Patient being operated is : " );
        P.Show();
        System.out.println("The Doctors taking part of this operation are : ");
        for(int i=0;i<doctorList.size();i++){
            doctorList.get(i).Show();
        }

    }
    public void PaimentSuccess(){
        this.PaimentStatus=true;
    }
}
