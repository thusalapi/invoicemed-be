package org.isnoc.invoicemed.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;

    @NotBlank(message = "Name is required")
    private String name;

    private String sex;

    @Min(value = 0, message = "Age must be a positive number")
    private int age;

    private String address;

    @Pattern(regexp = "^[0-9]{10}$", message = "Contact number must be 10 digits")
    private String contactNumber;

    @Email(message = "Invalid email format")
    private String email;
}