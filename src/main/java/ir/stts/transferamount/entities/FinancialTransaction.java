package ir.stts.transferamount.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import ir.stts.transferamount.entities.enums.DeviceModelEnum;
import ir.stts.transferamount.entities.enums.OperatingSystemEnm;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CurrentTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "tbl_financial_transaction", indexes = {
        @Index(name = "idx_financialtranscation_unq", columnList = "id", unique = true)
})
@AllArgsConstructor
public class FinancialTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "seq_tbl_financial_transaction")
    @SequenceGenerator(name = "seq_tbl_financial_transaction",sequenceName = "seq_tbl_financial_transaction",allocationSize = 1)
    private Long id;

    @Column(name = "exception_detail")
    private String exceptionDetail;

    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "channel_type",length = 20)
    private String channelType;

    @Column(name = "gateway_type")
    @Enumerated(EnumType.STRING)
    private OperatingSystemEnm gatewayType = OperatingSystemEnm.NONE;

    @Column(name = "gateway_version")
    private String gatewayVersion;

    @Column(name = "device_model",length = 20)
    @Enumerated(EnumType.STRING)
    private DeviceModelEnum deviceModel = DeviceModelEnum.NONE;

    @Column(name = "app_version")
    private String appVersion;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @Column(name = "last_status_modified_date")
    private LocalDateTime lastStatusModifiedDate;

    @Column(name = "source_account_number",columnDefinition = "nvarchar2(13)",length = 13)
    private String sourceAccountNumber;

    @Column(name = "destination_account_number",columnDefinition = "nvarchar2(13)",length = 13)
    private String destinationAccountNumber;

    @Column(name = "destination_iban",columnDefinition = "nvarchar2(26)",length = 26)
    private String destinationIban;

    @Column(name = "transaction_operation_code")
    private String transactionOperationCode;

    @Column(name = "transfer_type")
    private String transferType;

    @Column(name = "amount",precision = 20)
    private BigDecimal amount;

    @Column(name = "try_count")
    private Integer tryCount = 0;

    @Column(name = "requester_branch_code")
    private String requesterBranchCode;

    @Column(name = "requester_branch_name")
    private String requesterBranchName;

    @Column(name = "destination_bank_name")
    private String destinationBankName;

    @Column(name = "destination_bank_code")
    private String destinationBankCode;

    @Column(name = "wage_amount",precision = 10)
    private BigDecimal wageAmount;

    @Column(name = "reference_number")
    private String referenceNumber;

    @Column(name = "host_reference_number")
    private String hostReferenceNumber;

    @Column(name = "status")
    private String status;

    @Column(name = "payment_identifier1")
    private String paymentIdentifier1;

    @Column(name = "payment_identifier2")
    private String paymentIdentifier2;

    @Column(name = "source_comment")
    private String sourceComment;

    @Column(name = "destination_comment")
    private String destinationComment;

    @Column(name = "shahab_code",columnDefinition = "nvarchar2(16)",length = 16)
    private String shahabCode;

    @Column(name = "description")
    private String description;

    @Lob
    @Column(name = "input_json")
    private String inputJson;

    @Lob
    @Column(name = "output_json")
    private String outputJson;

    @Column
    @Version
    @CurrentTimestamp
    private Date version;
}
