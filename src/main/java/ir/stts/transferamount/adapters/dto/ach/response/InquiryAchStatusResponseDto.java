package ir.stts.transferamount.adapters.dto.ach.response;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class InquiryAchStatusResponseDto {
    private String resultCode;
    //TODO: change to enum
    private String exceptionDetail;
    private String requestID;
    private Result result;

    @Data
    public static class Result {
        private String sourceAccountNumber;
        private DestinationIban destinationIban;
        private Amount amount;
        private String sourceComment;
        private String destinationComment;
        private String documentNumber;
        private String documentDescription;
        private String referenceNumber;
        private String hostReferenceNumber;
        private String cbiReferenceNumber;
        private TransactionOperation transactionOperation;
        private Wage wage;
        private String status;
        private PaymentIdentifier paymentIdentifier1;
        private RequesterBranch requesterBranch;
        private String effectiveDate;
        private String mainServiceExceptionData;
        private ReasonDescription reasonDescription;
        private String shahabCode;
        private StatusDetail statusDetail;
        private String correlationId;
        private String clientCorrelationId;
    }

    @Data
    public static class DestinationIban {
        private String iban;
        private Bank bank;
    }

    @Data
    public static class Bank {
        private String code;
        private String name;
    }

    @Data
    public static class Amount {
        private BigDecimal value;
        private String type;
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
        private CbiWageAmount cbiWageAmount;
    }

    @Data
    public static class BankWageAmount {
        private String deductionStatus;
        private Amount amount;
    }

    @Data
    public static class CbiWageAmount {
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
    public static class ReasonDescription {
        private String code;
        private String name;
    }

    @Data
    public static class StatusDetail {
        private Integer code;
        private String text;
    }
}