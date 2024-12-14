package ir.stts.transferamount.adapters.dto.autotransfer.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AutoReverseRequestDto {

    @NotBlank
    private String clientCorrelationId;
    @NotBlank
    private String correlationId;
    @NotBlank
    private String transactionOperationCode;
}
