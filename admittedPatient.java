package MediCare;

import java.util.Date;

public class admittedPatient extends Patient {
  private Date dateOfAdmission;
  private int amtToPay;

    public admittedPatient() {
        super();
    }

    public int getAmtToPay() {
        return amtToPay;
    }

    public void setAmtToPay(int amtToPay) {
        this.amtToPay = amtToPay;
    }

    public Date getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(Date dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public String getDiagnosis() {
        return super.getDiagnosis();
    }

    @Override
    public void setDiagnosis(String diagnosis) {
        super.setDiagnosis(diagnosis);
    }

    @Override
    public String getNameOfDoctor() {
        return super.getNameOfDoctor();
    }

    @Override
    public void setNameOfDoctor(String nameOfDoctor) {
        super.setNameOfDoctor(nameOfDoctor);
    }


    @Override
    public Date getDob() {
        return super.getDob();
    }

    @Override
    public void setDob(Date dob) {
        super.setDob(dob);
    }


    public int cost() {
        int a=7500;

        return a;
    }

    @Override
    public char getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(char gender) {
        super.setGender(gender);
    }
}
