package com.asxy.decorator.shop;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/13
 */
public abstract class AbstractCostDecorator implements CostCalculator {

    protected final CostCalculator calculator;

    public AbstractCostDecorator(CostCalculator costCalculator) {
        this.calculator = costCalculator;
    }

}
