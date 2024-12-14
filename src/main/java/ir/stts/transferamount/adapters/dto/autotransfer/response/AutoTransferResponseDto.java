package ir.stts.transferamount.adapters.dto.autotransfer.response;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AutoTransferResponseDto {
    private String resultCode;
    private String exceptionDetail;
    private String requestID;
    private Result result;

    @Data
    public static class Result {
        private String sourceNumber;
        private String destinationNumber;
        private Amount amount;
        private RequesterBranch requesterBranch;
        private String documentNumber;
        private String documentDescription;
        private TransactionOperation transactionOperation;
        private Wage wage;
        private String referenceNumber;
        private String hostReferenceNumber;
        private String depositHostReferenceNumber;
        private String status;
        private PaymentIdentifier paymentIdentifier1;
        private PaymentIdentifier paymentIdentifier2;
        private String transferType;
        private String correlationId;
        private String clientCorrelationId;
        private ReasonDescription reasonDescription;
    }

    @Data
    public static class Amount {
        private BigDecimal value;
        private String type;
    }

    @Data
    public static class RequesterBranch {
        private String code;
        private String name;
        private City city;
    }

    @Data
    public static class City {
        private String code;
        private String name;
    }

    @Data
    public static class TransactionOperation {
        private String code;
        private String text;
    }

    @Data
    public static class Wage {
        private String method;
        private BankWageAmount bankWageAmount;
    }

    @Data
    public static class BankWageAmount {
        private String deductionStatus;
        private Amount amount;
    }

    @Data
    public static class PaymentIdentifier {
        private String identifier;
        private String mandatoryStatus;
        private String validityStatus;
    }

    @Data
    public static class ReasonDescription {
        private String code;
        private String name;
    }
}