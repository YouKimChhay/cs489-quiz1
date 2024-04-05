package edu.miu.cs489.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Contact {
    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;
    private List<Phone> phones;
    private List<Email> emails;

    public Contact(String firstName, String lastName, String company, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.phones = new ArrayList<>();
        this.emails = new ArrayList<>();
    }

    public void addPhone(String number, String label) {
        this.phones.add(new Phone(number, label));
    }

    public void addEmail(String emailAddress, String label) {
        this.emails.add(new Email(emailAddress, label));
    }

    @Override
    public String toString() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this);
    }
}
