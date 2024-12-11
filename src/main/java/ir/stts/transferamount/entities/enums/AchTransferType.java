package ir.stts.transferamount.entities.enums;

import lombok.Getter;

@Getter
public enum AchTransferType {

    DIRECT,
    INIT,
    REVOKE,
    STATUS_WITH_CORRELATION_ID,
    STATUS_WITH_CLIENT_CORRELATION_ID,
    TRANSFER;
}
