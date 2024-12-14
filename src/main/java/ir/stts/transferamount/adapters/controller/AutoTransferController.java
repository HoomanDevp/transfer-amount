package ir.stts.transferamount.adapters.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/account/transfer/internal/")
public class AutoTransferController {

    @PostMapping("/init/")
    @ResponseBody
    public void transferAmount() {

    }

    @PostMapping("/direct/")
    @ResponseBody
    public void transferAmountDirect() {

    }

    @PostMapping("/status/{clientCorrelationId}")
    public void getStatusClientCorrelationId(String clientCorrelationId) {

    }

    @PostMapping("/status/{correlationId}")
    public void getStatusByCorrelationId(String correlationId) {

    }

    @PostMapping("/reverse/")
    public void reverseTransfer(Long paymentDetailId) {

    }


}
