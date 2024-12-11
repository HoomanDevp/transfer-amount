package ir.stts.transferamount.frameworks.persistence;

import ir.stts.transferamount.entities.FinancialTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancialTransactionRepository extends JpaRepository<FinancialTransaction,Long> {
}
