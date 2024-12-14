package ir.stts.transferamount.adapters.repositories;

import ir.stts.transferamount.adapters.dto.ach.request.AchTransferRequestDto;
import ir.stts.transferamount.adapters.dto.ach.request.AchTransferWithoutCorrelationRequestDto;
import ir.stts.transferamount.adapters.dto.ach.request.InitExternalTransferRequestDto;
import ir.stts.transferamount.adapters.dto.ach.request.RevokeAchTransferRequestDto;
import ir.stts.transferamount.adapters.dto.ach.response.AchTransferResponseDto;
import ir.stts.transferamount.adapters.dto.ach.response.InitExternalTransferResponseDto;
import ir.stts.transferamount.adapters.dto.ach.response.InquiryAchStatusResponseDto;
import ir.stts.transferamount.adapters.dto.ach.response.RevokeAchTransferResponseDto;
import ir.stts.transferamount.usecases.AchUseCases;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AchUseCasesImpl extends KahkeshanAbstractRestClient implements AchUseCases {


    public AchUseCasesImpl(@Value("#{environment['ach.transfer.service.base.url']}") String baseUrl, RestTemplate restTemplate) {
        super(baseUrl, restTemplate);
    }

    @Override
    public InitExternalTransferResponseDto initTransfer(InitExternalTransferRequestDto initExternalTransferRequestDto) {
        return post("init", initExternalTransferRequestDto, InitExternalTransferResponseDto.class);
    }

    @Override
    public AchTransferRequestDto transfer(AchTransferRequestDto achTransferRequestDto) {
        return post("", achTransferRequestDto, AchTransferRequestDto.class);
    }

    @Override
    public AchTransferResponseDto directTransfer(AchTransferWithoutCorrelationRequestDto achTransferRequestDto) {
        return post("direct", achTransferRequestDto, AchTransferResponseDto.class);
    }

    @Override
    public InquiryAchStatusResponseDto getStatusByClientCorrelationId(String clientCorrelationId) {
        return get("status/" + clientCorrelationId, InquiryAchStatusResponseDto.class);
    }

    @Override
    public InquiryAchStatusResponseDto getStatusByCorrelationId(String correlationId) {
        return get("status/" + correlationId, InquiryAchStatusResponseDto.class);
    }

    @Override
    public RevokeAchTransferResponseDto revokeTransfer(RevokeAchTransferRequestDto revokeAchTransferRequestDto) {
        return post("revoke", revokeAchTransferRequestDto, RevokeAchTransferResponseDto.class);
    }
}
