package ir.stts.transferamount.entities;


import ir.stts.transferamount.entities.enums.AutoTransferStatus;
import ir.stts.transferamount.entities.enums.AutoTransferTypeEnum;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "auto_payment_detail")
public class AutoPaymentDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_tbl_auto_payment")
    @SequenceGenerator(name = "seq_tbl_auto_payment", sequenceName = "SEQ_TBL_AUTO_PAYMENT", allocationSize = 1)
    private Long id;

    @Column(name = "source_account_number")
    private String sourceAccountNumber;

    @Column(name = "destination_account_number")
    private String destinationAccountNumber;

    @Column(name = "amount",precision = 20)
    private BigDecimal amount;

    @Column(name = "wage_amount",precision = 20)
    private BigDecimal wageAmount;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private AutoTransferStatus status = AutoTransferStatus.UNKNOWN;

    @Column(name = "correlation_id",columnDefinition = "nvarchar2(256)",length = 256,unique = true)
    private String correlationId;

    @Column(name = "client_correlation_id",columnDefinition = "nvarchar2(256)",length = 256,unique = true)
    private String clientCorrelationId;

    @Column(name = "correlation_token",columnDefinition = "nvarchar2(256)",length = 256,unique = true)
    private String correlationToken;

    @Column(name = "transfer_type")
    private AutoTransferTypeEnum transferType = AutoTransferTypeEnum.UNKNOWN;

    @Column(name = "result_code")
    private String resultCode;

}
