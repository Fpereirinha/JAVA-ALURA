package br.com.alura.shop.Fees;

import java.math.BigDecimal;

public enum TypeFeeEnumExample {
    ICMS(new BigDecimal(".1")),
    ISS(new BigDecimal(".06"));
    private BigDecimal Fee;
    TypeFeeEnumExample(BigDecimal feeP){
        this.Fee = feeP;
    }
    BigDecimal getFee(){
        return this.Fee;
    }
}
