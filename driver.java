package MediCare;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class driver {
    static Scanner input=new Scanner(System.in);
    static String pattern = "dd/MM/yyyy";
    public static void main(String args[])

    {
        walkInPatient[] wPatient=new walkInPatient[2];
        admittedPatient[] aPatient=new admittedPatient[2];

        System.out.println("Enter 1. To Enter Walk in Patients" + "\n   Press 2. To Enter Admitted Patient");
        System.out.print("Option: ");
        int count=input.nextInt();


        switch (count)
        {
            case 1:
                try {
                    walkIn(wPatient);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                try {
                    admit(aPatient);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("Enter the specified options");
        }
    }
    public static void walkIn(walkInPatient[] wPatient) throws ParseException
    {
        for(int z=0; z <wPatient.length;z++) wPatient[z] = new walkInPatient();
       for (int i=0;i<wPatient.length;i++)
       {
           System.out.println("Enter Patient First Name");
           String fName=input.next();
           System.out.println("Enter Patient Last Name");
           String lName=input.next();

           while (true)
           {
               char male='M';
               char female='F';

               System.out.print("Enter patient gender (M OR F): ");
               String gen=input.next();
               char gender=gen.charAt(0);
               gender=Character.toUpperCase(gender);
               if (gender == male || gender == female)
               {
                   wPatient[i].setGender(gender);
                   break;
               }
               else {
                   System.out.println("Please Enter 'M' or 'F' ");
               }
           }

           System.out.print("Enter DOB (dd/MM/yyyy): ");

           SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
           Date date2=null;
           String dob=input.next();
           try {
               dateFormat.setLenient(false);
               date2 = dateFormat.parse(dob);
           } catch (ParseException e) {
               e.printStackTrace();
           }
           input.nextLine();
           System.out.println("Enter Diagnosis");
           String diag=input.nextLine();
           System.out.println("Enter Doctor's Name");
           String dName=input.nextLine();
           System.out.println("Enter Date of Visit(dd/MM/YYYY)");
           String vDate=input.next();
           SimpleDateFormat sdf2 = new SimpleDateFormat(pattern);
           Date dateOfVisit=sdf2.parse(vDate);

           wPatient[i].setDiagnosis(diag);
           wPatient[i].setDob(date2);
           wPatient[i].setFirstName(fName);
           wPatient[i].setLastName(lName);
           wPatient[i].setNameOfDoctor(dName);
           wPatient[i].setDateOfVisit(dateOfVisit);

       }
        wPrint(wPatient);
    }
    public static void admit(admittedPatient[] aPatient) throws ParseException
    {
        int randomNum = 0 + (int)(Math.random() * 1); //0 minimum,1 max
        for(int z=0; z <aPatient.length;z++) aPatient[z] = new admittedPatient();

        for (int i=0;i<aPatient.length;i++)
        {
            System.out.println("Enter Patient First Name");
            String fName=input.next();
            System.out.println("Enter Patient Last Name");
            String lName=input.next();

            while (true)
            {
                char male='M';
                char female='F';

                System.out.print("Enter patient gender (M OR F): ");
                String gen=input.next();
                char gender=gen.charAt(0);
                gender=Character.toUpperCase(gender);
                if (gender == male || gender == female)
                {
                    aPatient[i].setGender(gender);
                    break;
                }
                else {
                    System.out.println("Please Enter 'M' or 'F' ");
                }
            }

            System.out.print("Enter DOB (dd/MM/yyyy): ");

            SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
            Date date2=null;
            String dob=input.next();
            try {
                dateFormat.setLenient(false);
                date2 = dateFormat.parse(dob);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            input.nextLine();
            System.out.println("Enter Diagnosis");
            String diag=input.nextLine();
            System.out.println("Enter Doctor's Name");
            String dName=input.nextLine();
            System.out.println("Enter Date of Admission(dd/MM/YYYY)");
            String aDate=input.next();
            SimpleDateFormat sdf2 = new SimpleDateFormat(pattern);
            Date dateOfAdmission=sdf2.parse(aDate);

            aPatient[i].setDiagnosis(diag);
            aPatient[i].setDob(date2);
            aPatient[i].setFirstName(fName);
            aPatient[i].setLastName(lName);
            aPatient[i].setNameOfDoctor(dName);
            aPatient[i].setDateOfAdmission(dateOfAdmission);
            if (randomNum==i)
            {
                System.out.println("Congratz,you'll not be charged for today's visit");
                aPatient[i].setAmtToPay(0);

            }
            else {
                aPatient[i].setAmtToPay(aPatient[i].cost());
            }


        }
        aPrint(aPatient);
    }
    public static void aPrint(admittedPatient[] aPatient)
    {
        for (int i=0;i<aPatient.length;i++)
        {
            System.out.println("Patient First Name: " + aPatient[i].getFirstName() + "\n" + "Patient Last Name: "+aPatient[i].getLastName() + "\n" + "Patient Diagnosis: "+ aPatient[i].getDiagnosis() + "\n" + "Patient's Doctor "+aPatient[i].getNameOfDoctor() + "\n" +"Amount Due: "+aPatient[i].getAmtToPay()+ "\n" +"Date of Admission: "+aPatient[i].getDateOfAdmission());
        }
    }
    public static void wPrint(walkInPatient[] aPatient)
    {
        for (int i=0;i<aPatient.length;i++)
        {
            System.out.println("Patient First Name: " + aPatient[i].getFirstName() + "\n" + "Patient Last Name: "+aPatient[i].getLastName() + "\n" + "Patient Diagnosis: "+ aPatient[i].getDiagnosis() +  "\n" +"Patient's Doctor "+aPatient[i].getNameOfDoctor() +"\n" +"Date of Visit: "+aPatient[i].getDateOfVisit());
        }
    }
}
