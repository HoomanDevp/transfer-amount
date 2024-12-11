package ir.stts.transferamount.frameworks.persistence;

import ir.stts.transferamount.entities.AchPaymentDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AchPaymentDetailRepository extends JpaRepository<AchPaymentDetail, Long> {
}