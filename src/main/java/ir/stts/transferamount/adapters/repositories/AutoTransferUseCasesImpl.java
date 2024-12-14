package ir.stts.transferamount.adapters.repositories;

import ir.stts.transferamount.adapters.dto.autotransfer.request.AutoInitRequestDto;
import ir.stts.transferamount.adapters.dto.autotransfer.request.AutoReverseRequestDto;
import ir.stts.transferamount.adapters.dto.autotransfer.request.AutoTransferWithCorrelationRequestDto;
import ir.stts.transferamount.adapters.dto.autotransfer.request.AutoTransferWithoutCorrelationRequestDto;
import ir.stts.transferamount.adapters.dto.autotransfer.response.*;
import ir.stts.transferamount.usecases.AutoTransferUseCases;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AutoTransferUseCasesImpl extends KahkeshanAbstractRestClient implements AutoTransferUseCases {

    public AutoTransferUseCasesImpl(@Value("#{environment['internal.transfer.service.base.url']}") String baseUrl, RestTemplate restTemplate) {
        super(baseUrl, restTemplate);
    }

    @Override
    public AutoTransferWithoutCorrelationResponseDto directTransfer(AutoTransferWithoutCorrelationRequestDto autoTransferWithoutCorrelationRequestDto) {
        return post("transfer/direct", autoTransferWithoutCorrelationRequestDto, AutoTransferWithoutCorrelationResponseDto.class);
    }

    @Override
    public AutoInitResponseDto initTransfer(AutoInitRequestDto autoInitRequestDto) {
        return post("transfer/init", autoInitRequestDto, AutoInitResponseDto.class);
    }

    @Override
    public AutoInquiryStatusResponseDto getStatusByCorrelationId(String correlationId) {
        return post("transfer/status", correlationId, AutoInquiryStatusResponseDto.class);
    }

    @Override
    public AutoInquiryStatusResponseDto getStatusClientCorrelationId(String clientCorrelationId) {
        return post("transfer/status", clientCorrelationId, AutoInquiryStatusResponseDto.class);
    }

    @Override
    public AutoReverseResponseDto reverseTransfer(AutoReverseRequestDto autoReverseRequestDto) {
       return post("transfer/reverse", autoReverseRequestDto, AutoReverseResponseDto.class);
    }

    @Override
    public AutoTransferResponseDto transferWithInit(AutoTransferWithCorrelationRequestDto autoTransferWithCorrelationRequestDto) {
        return post("transfer", autoTransferWithCorrelationRequestDto, AutoTransferResponseDto.class);
    }
}
