
package edu.ucalgary.oop;

import java.util.regex.Pattern;

public class ReliefService {
    private Inquirer inquirer;
    private DisasterVictim missingPerson;
    private String dateOfInquiry;
    private String infoProvided;
    private Location lastKnownLocation;

    //ctr
    public ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry, String infoProvided, Location lastKnownLocation) {
        this.inquirer = inquirer;
        this.missingPerson = missingPerson;
        setDateOfInquiry(dateOfInquiry); // Uses setter to validate date format
        this.infoProvided = infoProvided;
        this.lastKnownLocation = lastKnownLocation;
    }

    public Inquirer getInquirer()
    {
        return inquirer;
    }

    public void setInquirer(Inquirer inquirer)
    {
        this.inquirer = inquirer;
    }

    public DisasterVictim getMissingPerson()
    {
        return missingPerson;
    }

    public void setMissingPerson(DisasterVictim missingPerson)
    {
        this.missingPerson = missingPerson;
    }

    public String getDateOfInquiry()
    {
        return dateOfInquiry;
    }

    public void setDateOfInquiry(String dateOfInquiry)
    {
        //exception handling to ensure dateOfInquiry is correct date format
        if (!isValidDateFormat(dateOfInquiry)) 
        {
            throw new IllegalArgumentException("Invalid date format. Expected format: YYYY-MM-DD");
        }
        this.dateOfInquiry = dateOfInquiry;
    }

    public String getInfoProvided()
    {
        return infoProvided;
    }

    public void setInfoProvided(String infoProvided)
    {
        this.infoProvided = infoProvided;
    }

    public Location getLastKnownLocation()
    {
        return lastKnownLocation;
    }

    public void setLastKnownLocation(Location lastKnownLocation)
    {
        this.lastKnownLocation = lastKnownLocation;
    }

    //this is a private helper method to validate the date format
    private boolean isValidDateFormat(String date)
    {
        return date.matches("\\d{4}-\\d{2}-\\d{2}");
    }

      //generates the log details in the expected format
      public String getLogDetails() 
      {
        return String.format("Inquirer: %s, Missing Person: %s, Date of Inquiry: %s, Info Provided: %s, Last Known Location: %s", inquirer.getFirstName(), missingPerson.getName(), dateOfInquiry, infoProvided, lastKnownLocation.getName());
    }
}
