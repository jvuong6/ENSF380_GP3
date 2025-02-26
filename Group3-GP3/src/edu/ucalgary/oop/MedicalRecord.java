package edu.ucalgary.oop;

import java.util.regex.*;

public class MedicalRecord {
    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;

    private boolean isValidDateFormat(String dateOfTreatment) {
        Pattern myPattern = Pattern.compile("\\d{4}[-]{0,1}\\d{2}[-]{0,1}\\d{2}");
        Matcher myMatcher = myPattern.matcher(dateOfTreatment);
        return myMatcher.find();
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
