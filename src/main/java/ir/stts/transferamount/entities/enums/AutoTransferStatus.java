package ir.stts.transferamount.entities.enums;

import lombok.Getter;

@Getter
public enum AutoTransferStatus {
    UNKNOWN,
    SUCCESS,
    FAIL,
    REVERSED,
    TO_BE_REVERSED,
}
