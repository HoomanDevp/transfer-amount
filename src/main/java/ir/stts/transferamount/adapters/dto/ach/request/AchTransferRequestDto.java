package ir.stts.transferamount.adapters.dto.ach.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AchTransferRequestDto {

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
    @NotNull
    private Long shahabCode;
    @NotBlank
    private String sourceComment;
    @NotNull
    private Wage wage;

    @Data
    public static class Wage {
        @NotBlank
        private String method;
    }
}