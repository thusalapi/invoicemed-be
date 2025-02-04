package org.isnoc.invoicemed.repository;

import org.isnoc.invoicemed.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report, Long> {
}