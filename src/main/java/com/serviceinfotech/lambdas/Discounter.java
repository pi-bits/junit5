package com.serviceinfotech.lambdas;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface Discounter {
    BigDecimal applyDiscount(final BigDecimal amount);
}
