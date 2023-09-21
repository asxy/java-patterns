package com.asxy.decorator.shop;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/13
 */
public class ShoppingCart implements CostCalculator {

    private final List<GoodsDetail> goods = new ArrayList<>();

    public void addGoods(GoodsDetail goodsDetail) {
        goods.add(goodsDetail);
    }

    @Override
    public String description() {
        return "商品总费用";
    }

    @Override
    public BigDecimal finalCost() {
        BigDecimal totalCost = BigDecimal.ZERO;
        for (GoodsDetail item : goods) {
            BigDecimal cost = item.price.multiply(BigDecimal.valueOf(item.number));
            totalCost = totalCost.add(cost);
        }
        return totalCost;
    }

    public String getDetails() {
        List<String> details = goods.stream()
                .map(o -> MessageFormat.format("      商品名：【{0}】，商品单价：【{1}元】，商品数量：【{2}】",
                        o.name, o.price, o.number))
                .collect(Collectors.toList());
        return String.join("\n", details);
    }


    public static class GoodsDetail {
        private final String name;
        private final BigDecimal price;
        private final int number;

        public GoodsDetail(String name, BigDecimal price, int number) {
            this.name = name;
            this.price = price;
            this.number = number;
        }
    }
}


