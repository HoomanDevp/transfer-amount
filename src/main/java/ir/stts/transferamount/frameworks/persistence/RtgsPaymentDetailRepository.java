package ir.stts.transferamount.frameworks.persistence;

import ir.stts.transferamount.entities.RtgsPaymentDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RtgsPaymentDetailRepository extends JpaRepository<RtgsPaymentDetail, Long> {
}