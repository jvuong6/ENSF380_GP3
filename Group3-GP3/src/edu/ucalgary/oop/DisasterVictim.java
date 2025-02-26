package edu.ucalgary.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

public class DisasterVictim {
    //private variables
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private final int ASSIGNED_SOCIAL_ID;
    private FamilyRelation[] familyConnections;
    private MedicalRecord[] medicalRecords;
    private Supply[] personalBelongings;
    private final String ENTRY_DATE;
    private String gender;
    private String comments;
    private static int counter = 0;

    //constructors and methods
    public DisasterVictim(String firstName, String ENTRY_DATE)
    {
        if (!isValidDateFormat(ENTRY_DATE)) 
        {
            throw new IllegalArgumentException("Invalid date format. Use YYYY-MM-DD.");
        }
        this.firstName = firstName;
        this.ENTRY_DATE = ENTRY_DATE;
        //have a counter that increments whenever a new disaster victim is added so that each victim has a unique ID
        this.ASSIGNED_SOCIAL_ID = generateSocialID();
        this.familyConnections = new FamilyRelation[0];
        this.medicalRecords = new MedicalRecord[0];
        this.personalBelongings = new Supply[0];
    }

    public DisasterVictim(String firstName, String ENTRY_DATE, String dateOfBirth)
    {
        //constructor chaining to avoid duplicating same code in multiple constructors
        this(firstName, ENTRY_DATE);
        if (!isValidDateFormat(dateOfBirth))
        {
            throw new IllegalArgumentException("Invalid date format. Use YYYY-MM-DD.");
        }
        if (dateOfBirth.compareTo(ENTRY_DATE) >= 0) {
            throw new IllegalArgumentException("Birthdate cannot be after entry date");
        }
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth)
    {
        if (!isValidDateFormat(dateOfBirth)) 
        {
            throw new IllegalArgumentException("Invalid date format. Use YYYY-MM-DD.");
        }
        this.dateOfBirth = dateOfBirth;
    }

    public int getAssignedSocialID()
    {
        return ASSIGNED_SOCIAL_ID;
    }

    public FamilyRelation[] getFamilyConnections() 
    {
        return familyConnections; 
    }

    public void setFamilyConnections(FamilyRelation[] connections) 
    { 
        this.familyConnections = connections; 
    }

    public void addFamilyConnection(FamilyRelation record) 
    {
        this.familyConnections = addToArray(familyConnections, record);
    }

    public void removeFamilyConnection(FamilyRelation exRelation) 
    {
        this.familyConnections = removeFromArray(familyConnections, exRelation);
    }

    public MedicalRecord[] getMedicalRecords() 
    { 
        return medicalRecords; 
    }

    public void setMedicalRecords(MedicalRecord[] records) 
    { 
        this.medicalRecords = records; 
    }

    public void addMedicalRecord(MedicalRecord record) 
    {
        this.medicalRecords = addToArray(medicalRecords, record);
    }
    
    public Supply[] getPersonalBelongings() 
    { 
        return personalBelongings; 
    }

    public void setPersonalBelongings(Supply[] belongings) 
    { 
        this.personalBelongings = belongings; 
    }

    public void addPersonalBelonging(Supply supply) 
    {
        this.personalBelongings = addToArray(personalBelongings, supply);
    }

    public void removePersonalBelonging(Supply unwantedSupply) 
    {
        this.personalBelongings = removeFromArray(personalBelongings, unwantedSupply);
    }
    
    public String getEntryDate() 
    { 
        return ENTRY_DATE; 
    }
    
    public String getComments() 
    { 
        return comments; 
    }

    public void setComments(String comments) 
    { 
        this.comments = comments; 
    }
    
    public String getGender() 
    { 
        return gender; 
    }

    public void setGender(String gender) 
    { 
        this.gender = gender.toLowerCase(); 
    }
    
    private static int generateSocialID() 
    {
        return new Random().nextInt(900000) + 100000; // Generates a 6-digit social ID
    }

    private static boolean isValidDateFormat(String date)
    {
        return date.matches("\\d{4}-\\d{2}-\\d{2}");
    }

    private static int convertDateStringToInt(String dateStr) 
    {
        if (!isValidDateFormat(dateStr)) {
            throw new IllegalArgumentException("Invalid date format. Use YYYY-MM-DD.");
        }
        return Integer.parseInt(dateStr.replace("-", ""));
    }

    private <T> T[] addToArray(T[] array, T item) 
    {
        if (array == null) 
        {
            return (T[]) new Object[]{item};
        }
        List<T> list = new ArrayList<>(List.of(array));
        list.add(item);
        return list.toArray(array);
    }

    //<T> is a java generic to work with any type of array
    private <T> T[] removeFromArray(T[] array, T item) 
    {
        if (array == null) 
        {
            return null;
        }
        List<T> list = new ArrayList<>(List.of(array));
        list.remove(item);
        return list.toArray(array);
    }
}


