package math;

import constant.AssertMsgConstant;
import utils.AssertUtil;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class BigDecimalExt {

    private BigDecimal bigDecimal;

    private final boolean isConvertZero;

    public BigDecimalExt(String value) {
        this(value, false);
    }

    public BigDecimalExt(String value, boolean isConvertZero) {
        this.bigDecimal = new BigDecimal(value);
        this.isConvertZero = isConvertZero;
    }

    public BigDecimalExt multiply(BigDecimal multiplier) {
        this.bigDecimal = this.bigDecimal.multiply(convertZero(multiplier));
        return this;
    }

    public BigDecimalExt divide(BigDecimal divisor, RoundingMode roundingMode) {
        AssertUtil.isNull(roundingMode, "roundingMode " + AssertMsgConstant.NULL_POINTER_MSG);
        this.bigDecimal = this.bigDecimal.divide(convertZero(divisor), roundingMode);
        return this;
    }

    public BigDecimalExt subtract(BigDecimal subtrahend) {
        this.bigDecimal = this.bigDecimal.subtract(convertZero(subtrahend));
        return this;
    }

    public BigDecimalExt add(BigDecimal augEnd) {
        this.bigDecimal = this.bigDecimal.add(convertZero(augEnd));
        return this;
    }

    public BigDecimal getBigDecimal() {
        return this.bigDecimal;
    }

    private BigDecimal convertZero(BigDecimal target) {
        if (Objects.isNull(target)) {
            if (isConvertZero) {
                return new BigDecimal("0.0");
            }
            throw new NullPointerException("target " + AssertMsgConstant.NULL_POINTER_MSG);
        }
        return target;
    }

}
