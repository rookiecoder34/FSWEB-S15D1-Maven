package org.example.mobile;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static String createContact(String name, String phoneNumber) {
        return Contact contact=new Contact(name,phoneNumber);
    }
}
