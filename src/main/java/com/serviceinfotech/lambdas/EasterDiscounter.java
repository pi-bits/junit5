package com.serviceinfotech.lambdas;

import java.math.BigDecimal;
import java.math.BigInteger;

public class EasterDiscounter implements Discounter {
    @Override
    public BigDecimal applyDiscount(final BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.5));
    }


}
