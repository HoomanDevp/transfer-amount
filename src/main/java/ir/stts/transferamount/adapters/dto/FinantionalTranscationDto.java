package ir.stts.transferamount.adapters.dto;

import ir.stts.transferamount.entities.enums.OperatingSystemEnm;
import ir.stts.transferamount.entities.FinancialTransaction;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link FinancialTransaction}
 */
public record FinantionalTranscationDto(Long id, String exceptionDetail, String channelType,
                                        OperatingSystemEnm gatewayType, String gatewayVersion, String deviceModel,
                                        String appVersion, LocalDateTime lastStatusModifiedDate,
                                        String sourceAccountNumber, String destinationAccountNumber,
                                        String destinationIban, String transferType, String amount,
                                        String requesterBranchCode, String requesterBranchName,
                                        String destinationBankName, String destinationBankCode, String wageAmount,
                                        String referenceNumber, String hostReferenceNumber, String status,
                                        String paymentIdentifier1, String paymentIdentifier2, String correlationId,
                                        String clientCorrelationId, String correlationToken, String sourceComment,
                                        String destinationComment, String ownerFirstName, String ownerLastName,
                                        String description, String inputJson,
                                        String outputJson) implements Serializable {
}