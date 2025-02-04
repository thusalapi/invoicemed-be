package org.isnoc.invoicemed.repository;

import org.isnoc.invoicemed.model.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemRepository extends JpaRepository<InvoiceItem, Long> {
}