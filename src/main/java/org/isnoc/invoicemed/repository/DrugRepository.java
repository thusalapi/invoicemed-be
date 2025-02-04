package org.isnoc.invoicemed.repository;

import org.isnoc.invoicemed.model.Drug;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrugRepository extends JpaRepository<Drug, Long> {
}