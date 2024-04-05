package edu.miu.cs489.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Email {
    private String emailAddress;
    private String label;
}
