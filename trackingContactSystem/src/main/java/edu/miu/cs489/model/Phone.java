package edu.miu.cs489.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Phone {
    private String number;
    private String label;
}
