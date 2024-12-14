package ir.stts.transferamount.adapters.dto.autotransfer.request;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class AutoTransferWithCorrelationRequestDto {

    @NotBlank
    private String correlationToken;
    @NotBlank
    private String destinationComment;
    @NotBlank
    private String documentDescription;
    @NotBlank
    private String documentNumber;
    @NotNull
    private Integer reasonDescriptionCode;
    @NotBlank
    private String referenceNumber;
    @NotBlank
    private String sourceComment;
    @NotNull
    private Wage wage;

    @Data
    public static class Wage {
        @NotNull
        private Amount amount;
        @NotBlank
        private String method;
    }

    @Data
    public static class Amount {
        @NotBlank
        private String type;
        @NotNull
        @DecimalMin(value = "0.0", inclusive = false)
        private BigDecimal value;
    }
}