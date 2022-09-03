import java.util.*;
public class Hospital {
    private String Name,Address,Phone,EmergencyPhone;
    private Hospital(){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Hospital Name");
        this.Name= Sc.nextLine();
        System.out.println("Enter Hospital Address");
        this.Address= Sc.nextLine();
        System.out.println("Enter Hospital PhoneLine");
        this.Phone= Sc.nextLine();
        System.out.println("Enter Hospital Emergency PhoneLine");
        this.EmergencyPhone= Sc.nextLine();
    };
}
