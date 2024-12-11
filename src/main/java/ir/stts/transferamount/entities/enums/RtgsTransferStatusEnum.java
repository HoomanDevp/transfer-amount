package ir.stts.transferamount.entities.enums;

import lombok.Getter;

@Getter
public enum RtgsTransferStatusEnum {
    UNKNOWN,
    SUCCESS,
    FAIL,
    IN_PROGRESS,
    REJECT,
    PENDING,
    EXPIRE,
    RETURN;
}
