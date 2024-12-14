package ir.stts.transferamount.adapters.dto.ach.request;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class AchTransferWithoutCorrelationRequestDto {

    @NotNull
    private Amount amount;
    @NotBlank
    private String destinationComment;
    @NotBlank
    private String destinationIban;
    @NotBlank
    private String documentDescription;
    @NotBlank
    private String documentNumber;
    @NotBlank
    private String paymentIdentifier1;
    @NotBlank
    private String reasonDescriptionCode;
    @NotBlank
    private String referenceNumber;
    @NotBlank
    private String requesterBranchCode;
    @NotBlank
    private Integer shahabCode;
    @NotBlank
    private String sourceAccountNumber;
    @NotBlank
    private String sourceComment;
    @NotBlank
    private String transactionOperationCode;
    @NotNull
    private Wage wage;


    @Data
    public static class Amount {
        @NotBlank
        private String type;
        @NotNull
        @DecimalMin(value = "0.0", inclusive = false)
        private BigDecimal value;
    }

    @Data
    public static class Wage {
        @NotBlank
        private String method;
    }
}
