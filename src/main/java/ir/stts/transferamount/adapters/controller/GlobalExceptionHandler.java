package ir.stts.transferamount.adapters.controller;

import ir.stts.transferamount.adapters.dto.autotransfer.response.AutoTransferWithoutCorrelationResponseDto;
import ir.stts.transferamount.usecases.exceptions.TransferException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(TransferException.class)
    public ResponseEntity<AutoTransferWithoutCorrelationResponseDto> handleTransferException(TransferException ex) {
        AutoTransferWithoutCorrelationResponseDto responseDto = new AutoTransferWithoutCorrelationResponseDto();
        responseDto.setResultCode(ex.getMessage());
        responseDto.setExceptionDetail(ex.getMessage());
        return new ResponseEntity<>(responseDto, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<AutoTransferWithoutCorrelationResponseDto> handleGenericException(Exception ex) {
        AutoTransferWithoutCorrelationResponseDto responseDto = new AutoTransferWithoutCorrelationResponseDto();
        responseDto.setResultCode("500");
        responseDto.setExceptionDetail("An unexpected error occurred: " + ex.getMessage());
        return new ResponseEntity<>(responseDto, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}