public class Main {
    public static void main(String[] args) {
        Patient Salah=new Patient();
        Doctor Salah2=new Doctor();
        Operation Op1=new Operation(Salah);
        Op1.AddDoc(Salah2);
        Op1.Show();

    }
}