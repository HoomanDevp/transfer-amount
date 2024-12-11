package ir.stts.transferamount.adapters.repositories;

import ir.stts.transferamount.usecases.AutoTransferUseCases;
import org.springframework.stereotype.Service;

@Service
public class AutoTransferUseCasesImpl implements AutoTransferUseCases {
    @Override
    public void transferAmount() {
        System.out.println("Transfer amount");
    }
}
