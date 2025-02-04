package org.isnoc.invoicemed.repository;

import org.isnoc.invoicemed.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}