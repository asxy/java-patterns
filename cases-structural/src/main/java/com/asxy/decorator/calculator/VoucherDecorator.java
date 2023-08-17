package com.asxy.decorator.calculator;

import com.asxy.decorator.AbstractCostDecorator;
import com.asxy.decorator.CostCalculator;

import java.math.BigDecimal;
import java.text.MessageFormat;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/13
 */
public class VoucherDecorator extends AbstractCostDecorator {

    private final BigDecimal amount;

    public VoucherDecorator(CostCalculator costCalculator, BigDecimal amount) {
        super(costCalculator);
        this.amount = amount;
    }

    @Override
    public String description() {
        return calculator.description() + MessageFormat.format(" -> {0}元抵用券", amount);
    }

    @Override
    public BigDecimal finalCost() {
        return calculator.finalCost().subtract(amount);
    }
}




