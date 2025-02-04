package org.isnoc.invoicemed.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long invoiceId;

    @NotBlank(message = "Bill number is required")
    private String billNo;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @NotNull(message = "Date is required")
    private Date date;

    @Positive(message = "Total amount must be a positive number")
    private double totalAmount;
}