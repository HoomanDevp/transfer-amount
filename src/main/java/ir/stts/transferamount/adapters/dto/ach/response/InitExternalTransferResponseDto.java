package ir.stts.transferamount.adapters.dto.ach.response;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class InitExternalTransferResponseDto {
    @NotBlank
    private String resultCode;
    private String exceptionDetail;
    @NotBlank
    private String requestID;
    @NotNull
    private Result result;

    @Data
    public static class Result {
        @NotBlank
        private String correlationToken;
        @NotBlank
        private String correlationId;
        @NotBlank
        private String clientCorrelationId;
        @NotBlank
        private String sourceAccountNumber;
        @NotBlank
        private DestinationIban destinationIban;
        @NotBlank
        private String accountStatus;
        private String accountStatusDescription;
        @NotNull
        private Amount amount;
        @NotNull
        private List<Owner> owners;
        @NotBlank
        private String displayName;
        @NotNull
        private PaymentIdentifier paymentIdentifier1;
        @NotNull
        private PaymentIdentifier paymentIdentifier2;
        @NotNull
        private RequesterBranch requesterBranch;
        @NotNull
        private TransactionOperation transactionOperation;
    }

    @Data
    public static class DestinationIban {
        @NotBlank
        private String iban;
        @NotBlank
        private Bank bank;
    }

    @Data
    public static class Bank {
        @NotBlank
        private String code;
        @NotBlank
        private String name;
    }

    @Data
    public static class Amount {
        @NotNull
        private BigDecimal value;
        @NotBlank
        private String type;
    }

    @Data
    public static class Owner {
        @NotBlank
        private String firstName;
        @NotBlank
        private String lastName;
    }

    @Data
    public static class PaymentIdentifier {
        @NotBlank
        private String identifier;
        @NotBlank
        private String mandatoryStatus;
        @NotBlank
        private String validityStatus;
    }

    @Data
    public static class TransactionOperation {
        @NotBlank
        private String code;
        @NotBlank
        private String text;
    }

    @Data
    public static class RequesterBranch {
        @NotBlank
        private String code;
        @NotBlank
        private String name;
        private String city;
    }
}
