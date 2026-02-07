package org.example.mobile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MobilePhone {
        private String myNumber;
        private List<Contact>myContact=new ArrayList<>();

    public String getMyNumber() {
        return myNumber;
    }

    public List<Contact> getMyContact() {
        return myContact;
    }

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    public boolean addNewContact(Contact contact) {
        if (myContact.contains(contact) == false) {
            myContact.add(contact);
            return true;
        } else {
            return false;
        }

    }

    public boolean updateContact(Contact contact,Contact newContact) {
        if (myContact.contains(contact)) {
            this.myContact= myContact;
            return true;
        }else {
            return false;
    }
}


    }
