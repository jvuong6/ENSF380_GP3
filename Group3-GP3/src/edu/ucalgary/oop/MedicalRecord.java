package edu.ucalgary.oop;

public class MedicalRecord {
    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;

    private boolean isValidDateFormat(String dateOfTreatment) {
        return true;
    }

    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) throws IllegalArgumentException {
        if (!isValidDateFormat(dateOfTreatment)) {
            throw new IllegalArgumentException("invalid date");
        } 
        else {
            this.location = location;
            this.treatmentDetails = treatmentDetails;
            this.dateOfTreatment = dateOfTreatment;
        }

    }

    public Location getLocation() {
        return this.location;
    }

    public String getTreatmentDetails() {
        return this.treatmentDetails;
    }

    public String getDateOfTreatment() {
        return this.dateOfTreatment;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setTreatmentDetails(String treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }

    public void setDateOfTreatment(String dateOfTreatment) {
        if (!isValidDateFormat(dateOfTreatment)) {
            throw new IllegalArgumentException("Invalid date format");
        }
        else {
            this.dateOfTreatment = dateOfTreatment;
        }
    }
}
