package ir.stts.transferamount.adapters.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/account/transfer/rtgs/")
public class RtgsTransferController {

    @PostMapping("/init/")
    public void transferAmount(Long paymentDetailId) {

    }

    @PostMapping("/direct/")
    public void transferAmountDirect(Long paymentDetailId) {

    }

    @PostMapping("/status/{clientCorrelationId}")
    public void getStatusClientCorrelationId(String clientCorrelationId) {

    }

    @PostMapping("/status/{correlationId}")
    public void getStatusByCorrelationId(String correlationId) {

    }

    @PostMapping("/without-withdraw/init/")
    public void transferAmountWithoutWithdraw(Long paymentDetailId) {

    }

    @PostMapping("/without-withdraw/direct/")
    public void transferAmountDirectWithoutWithdraw(Long paymentDetailId) {

    }

    @PostMapping("/without-withdraw/status/{clientCorrelationId}")
    public void getStatusClientCorrelationIdwithoutWithdraw(String clientCorrelationId) {

    }
    @PostMapping("/without-withdraw/status/{correlationId}")
    public void getStatusByCorrelationIdWithoutWithdraw(String correlationId) {

    }


}
