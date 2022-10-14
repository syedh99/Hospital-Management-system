import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class Test
{
    public static void main (String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        String firstName,lastName,docFirst,docLast,docSpeciality;
        int patientId;

        Date dateAdmitted = new Date(4,15,2009);
        Date dateDismissed = new Date(4,21,2009);

        System.out.print("Enter patient ID: ");
        patientId = input.nextInt();
        System.out.print("Enter patient first Name: ");
        firstName = input.next();
        System.out.print("Enter patient last Name: ");
        lastName = input.next();

        System.out.print("Enter doctor's first Name: ");
        docFirst = input.next();
        System.out.print("Enter doctor's last name: ");
        docLast = input.next();
        System.out.print("Enter doctor's specialty: ");
        docSpeciality = input.next();

        Doctor doc = new Doctor(docFirst,docLast,docSpeciality);
        Patient pt = new Patient(firstName, lastName,patientId,dateAdmitted, dateDismissed, doc);

        System.out.println(" ");
        System.out.println(pt);

        Bill bt = new Bill(245.50,2500.00,3500.38);

        System.out.println(bt.toString());

        FileWriter fileWriter = new FileWriter(firstName+lastName + " .txt");
        fileWriter.write(pt.toString() + "\n");
        fileWriter.write(bt.toString() + "\n");
        fileWriter.close();


    }

}