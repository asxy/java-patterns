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
public class FullDiscountDecorator extends AbstractCostDecorator {

    private final BigDecimal amount;

    private final BigDecimal threshold;

    public FullDiscountDecorator(CostCalculator costCalculator, BigDecimal amount, BigDecimal threshold) {
        super(costCalculator);
        this.amount = amount;
        this.threshold = threshold;
    }

    @Override
    public String description() {
        if (aboveThreshold()) {
            return calculator.description() + MessageFormat.format("-> 满{0}减{1}", threshold, amount);
        }
        return null;
    }

    @Override
    public BigDecimal finalCost() {
        if (aboveThreshold()) {
            return calculator.finalCost().subtract(amount);
        }
        return calculator.finalCost();
    }

    public boolean aboveThreshold() {
        return calculator.finalCost().compareTo(threshold) > 0;
    }
}
