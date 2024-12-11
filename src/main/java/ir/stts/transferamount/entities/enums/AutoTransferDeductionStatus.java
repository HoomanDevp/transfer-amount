package ir.stts.transferamount.entities.enums;

import lombok.Getter;

@Getter
public enum AutoTransferDeductionStatus {
    UNKNOWN,
    DEDUCTED,
    TO_BE_DEDUCT,
    WITHOUT_WAGE;
}
