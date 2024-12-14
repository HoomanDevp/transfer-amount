package ir.stts.transferamount.adapters.dto.autotransfer.request;

import jakarta.validation.constraints.*;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AutoTransferWithoutCorrelationRequestDto {

    @NotNull
    private Amount amount;
    @NotBlank
    private String destinationNumber;
    @NotBlank
    private String paymentIdentifier1;
    @NotBlank
    private String paymentIdentifier2;
    @NotBlank
    private String requesterBranchCode;
    @NotBlank
    private String sourceNumber;
    @NotBlank
    private String transactionOperationCode;

    @Data
    public static class Amount {
        @NotBlank
        private String type;
        @NotNull
        @DecimalMin(value = "0.0", inclusive = false)
        private BigDecimal value;
    }
}