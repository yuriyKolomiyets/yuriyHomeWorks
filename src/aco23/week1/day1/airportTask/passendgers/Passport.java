package aco23.week1.day1.airportTask.passendgers;

public class Passport {

    private String passportId;
    private String dateOfBirth;
    private String validTo;

    public Passport(String passportId, String dateOfBirth, String validTo) {
        this.passportId = passportId;
        this.dateOfBirth = dateOfBirth;
        this.validTo = validTo;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getValidTo() {
        return validTo;
    }

    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }
}