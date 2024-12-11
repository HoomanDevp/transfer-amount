package ir.stts.transferamount.entities;


import ir.stts.transferamount.entities.enums.RtgsTransferStatusEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "rtgs_payment_detail")
@AllArgsConstructor
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
public class RtgsPaymentDetail {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_tbl_rtgs_payment")
    @SequenceGenerator(name = "seq_tbl_rtgs_payment", sequenceName = "SEQ_TBL_RTGS_PAYMENT", allocationSize = 1)
    private Long id;

    @Column(name = "debtor_source_account")
    private String debtorSourceAccount;

    @Column(name = "creditor_iban")
    private String creditorIban;

    @Column(name = "creditor_bank_name")
    private String creditorBankName;

    @Column(name = "creditor_bank_code")
    private String creditorBankCode;

    @Column(name = "creditor_branch_code")
    private String debtorBranchCode;

    @Column(name = "creditor_branch_name")
    private String creditorBranchName;

    @Column(name = "debtor_first_name")
    private String debtorFirstName;

    @Column(name = "debtor_last_name")
    private String debtorLastName;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "transfer_type")
    private String transferType;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private RtgsTransferStatusEnum status = RtgsTransferStatusEnum.UNKNOWN;

    @Column(name = "correlation_id",columnDefinition = "nvarchar2(256)",length = 256,unique = true)
    private String correlationId;

    @Column(name = "client_correlation_id",columnDefinition = "nvarchar2(256)",length = 256,unique = true)
    private String clientCorrelationId;

    @Column(name = "correlation_token",columnDefinition = "nvarchar2(256)",length = 256,unique = true)
    private String correlationToken;

    @Column(name = "reason_description")
    private String reasonDescription;

    @Column(name = "result_code")
    private String resultCode;

}
