package ir.stts.transferamount.frameworks.persistence;

import ir.stts.transferamount.entities.AutoPaymentDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutoPaymentDetailRepository extends JpaRepository<AutoPaymentDetail, Long> {
}