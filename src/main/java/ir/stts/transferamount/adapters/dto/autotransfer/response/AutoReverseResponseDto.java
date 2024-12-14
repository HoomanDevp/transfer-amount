package ir.stts.transferamount.adapters.dto.autotransfer.response;

import lombok.Data;

@Data
public class AutoReverseResponseDto {
    private String resultCode;
    private String exceptionDetail;
    private String requestID;
    private Result result;

    @Data
    public static class Result {
        private String referenceNumber;
        private String hostReferenceNumber;
        private String depositHostReferenceNumber;
        private String status;
        private String transferType;
        private String correlationId;
        private String clientCorrelationId;
    }
}