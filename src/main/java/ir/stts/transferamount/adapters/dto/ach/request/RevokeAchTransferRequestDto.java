package ir.stts.transferamount.adapters.dto.ach.request;

import lombok.Data;

@Data
public class RevokeAchTransferRequestDto {

    private String clientCorrelationId;
    private String correlationId;
}
