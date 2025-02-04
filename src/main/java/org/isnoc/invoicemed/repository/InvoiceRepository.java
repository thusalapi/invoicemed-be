package org.isnoc.invoicemed.repository;

import org.isnoc.invoicemed.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}