package ir.stts.transferamount.adapters.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/account/transfer/ach")
public class AchTransferController {

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

    @PostMapping("/revoke/")
    public void revokeTransfer(Long paymentDetailId) {

    }


}
