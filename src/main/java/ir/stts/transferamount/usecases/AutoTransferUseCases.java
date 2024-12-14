package ir.stts.transferamount.usecases;

import ir.stts.transferamount.adapters.dto.autotransfer.request.AutoInitRequestDto;
import ir.stts.transferamount.adapters.dto.autotransfer.request.AutoReverseRequestDto;
import ir.stts.transferamount.adapters.dto.autotransfer.request.AutoTransferWithCorrelationRequestDto;
import ir.stts.transferamount.adapters.dto.autotransfer.request.AutoTransferWithoutCorrelationRequestDto;
import ir.stts.transferamount.adapters.dto.autotransfer.response.*;

public interface AutoTransferUseCases {

    AutoTransferWithoutCorrelationResponseDto directTransfer(AutoTransferWithoutCorrelationRequestDto requestDto);

    AutoInitResponseDto initTransfer(AutoInitRequestDto requestDto);

    AutoInquiryStatusResponseDto getStatusByCorrelationId(String correlationId);

    AutoInquiryStatusResponseDto getStatusClientCorrelationId(String clientCorrelationId);

    AutoReverseResponseDto reverseTransfer(AutoReverseRequestDto autoReverseRequestDto);

    AutoTransferResponseDto transferWithInit(AutoTransferWithCorrelationRequestDto requestDto);
}
