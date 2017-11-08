package MediCare;

import java.util.Date;

public class walkInPatient extends Patient {

    private Date dateOfVisit;

    public walkInPatient() {
        super();
    }

    public Date getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(Date dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
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


    @Override
    public char getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(char gender) {
        super.setGender(gender);
    }
}
