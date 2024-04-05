package edu.miu.cs489;

import edu.miu.cs489.model.Contact;

public class TrackingContactSystem {
    public static void main(String[] args) {
        Contact contact = new Contact("You Kim", "Chhay", "MIU", "Software Engineer");
        contact.addPhone("555-123-9876", "work");
        contact.addEmail("youkim.chhay@miu.edu", "school");

        System.out.println(contact);
    }
}