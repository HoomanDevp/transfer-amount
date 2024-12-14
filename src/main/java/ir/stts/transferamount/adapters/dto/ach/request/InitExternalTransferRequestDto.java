package ir.stts.transferamount.adapters.dto.ach.request;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class InitExternalTransferRequestDto {

    @NotNull
    private Amount amount;
    @NotBlank
    private String destinationIban;
    @NotBlank
    private String paymentIdentifier1;
    @NotBlank
    private String paymentIdentifier2;
    @NotBlank
    private String requesterBranchCode;
    @NotBlank
    private String sourceAccountNumber;
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
