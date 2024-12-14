package ir.stts.transferamount.adapters.dto.autotransfer.response;

import lombok.Data;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.util.List;

@Data
public class AutoInitResponseDto {
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
        private String sourceNumber;
        @NotBlank
        private String destinationNumber;
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
        private TransactionOperation transactionOperation;
        @NotNull
        private RequesterBranch requesterBranch;
        @NotBlank
        private String transferType;
        private String destinationIdentifier;
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
        private String name;
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
        @NotNull
        private City city;
    }

    @Data
    public static class City {
        @NotBlank
        private String code;
        @NotBlank
        private String name;
    }
}