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
public class DiscountDecorator extends AbstractCostDecorator {

    private final BigDecimal discount;

    public DiscountDecorator(CostCalculator costCalculator, BigDecimal discount) {
        super(costCalculator);
        this.discount = discount;
    }

    @Override
    public String description() {
        return calculator.description() + MessageFormat.format("->{0}折扣", discount.multiply(BigDecimal.TEN));
    }

    @Override
    public BigDecimal finalCost() {
        return calculator.finalCost().multiply(discount);
    }
}
