package edu.ucalgary.oop;

public class Inquirer {
    private final String FIRST_NAME;
    private final String LAST_NAME;
    private final String INFO;
    private final String SERVICES_PHONE;

    public Inquirer(String firstName, String lastName, String phone, String info)
    {
        FIRST_NAME = firstName;
        LAST_NAME = lastName;
        SERVICES_PHONE = phone;
        INFO = info;
    }

    public String getFirstName()
    {
        return FIRST_NAME;
    }

    public String getLastName()
    {
        return LAST_NAME;
    }

    public String getServicesPhoneNum()
    {
        return SERVICES_PHONE;
    }

    public String getInfo()
    {
        return INFO;
    }
}
