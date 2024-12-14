package ir.stts.transferamount.usecases;

import ir.stts.transferamount.adapters.dto.ach.request.AchTransferRequestDto;
import ir.stts.transferamount.adapters.dto.ach.request.AchTransferWithoutCorrelationRequestDto;
import ir.stts.transferamount.adapters.dto.ach.request.InitExternalTransferRequestDto;
import ir.stts.transferamount.adapters.dto.ach.request.RevokeAchTransferRequestDto;
import ir.stts.transferamount.adapters.dto.ach.response.AchTransferResponseDto;
import ir.stts.transferamount.adapters.dto.ach.response.InitExternalTransferResponseDto;
import ir.stts.transferamount.adapters.dto.ach.response.InquiryAchStatusResponseDto;
import ir.stts.transferamount.adapters.dto.ach.response.RevokeAchTransferResponseDto;

public interface AchUseCases {

    InitExternalTransferResponseDto initTransfer(InitExternalTransferRequestDto initExternalTransferRequestDto);

    AchTransferRequestDto transfer (AchTransferRequestDto achTransferRequestDto);

    AchTransferResponseDto directTransfer(AchTransferWithoutCorrelationRequestDto achTransferRequestDto);

    InquiryAchStatusResponseDto getStatusByClientCorrelationId(String clientCorrelationId);

    InquiryAchStatusResponseDto getStatusByCorrelationId(String correlationId);

    RevokeAchTransferResponseDto revokeTransfer(RevokeAchTransferRequestDto revokeAchTransferRequestDto);
}
