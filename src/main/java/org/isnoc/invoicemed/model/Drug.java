package org.isnoc.invoicemed.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Entity
public class Drug {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long drugId;

    @NotBlank(message = "Drug name is required")
    private String drugName;

    private String description;

    @Positive(message = "Price must be a positive number")
    private double price;
}