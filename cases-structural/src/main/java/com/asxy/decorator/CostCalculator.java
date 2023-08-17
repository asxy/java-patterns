package com.asxy.decorator;

import java.math.BigDecimal;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/13
 */
public interface CostCalculator {

    /**
     * 计算描述
     * @return 描述
     */
    String description();

    /**
     * 商品的最终费用
     * @return 最终费用
     */
    BigDecimal finalCost();
}
