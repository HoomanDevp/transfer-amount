package ir.stts.transferamount.entities.enums;

import lombok.Getter;

@Getter
public enum AutoTransferTypeEnum {
    UNKNOWN,
    ACCOUNT_TO_ACCOUNT,
    ACCOUNT_TO_GL,
    GL_TO_ACCOUNT,
    GL_TO_GL,
}
