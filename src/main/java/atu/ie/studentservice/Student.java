package atu.ie.studentservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private long studentId;
    private String firstname;
    private String lastName;
    private String email;
    private int dateOfBirth;
}
