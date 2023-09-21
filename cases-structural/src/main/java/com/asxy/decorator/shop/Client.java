package com.asxy.decorator.shop;

import com.asxy.decorator.shop.calculator.DiscountDecorator;
import com.asxy.decorator.shop.calculator.FullDiscountDecorator;
import com.asxy.decorator.shop.calculator.VoucherDecorator;

import java.math.BigDecimal;
import java.text.MessageFormat;

/**
 * @author 肖玉
 * @version 1.0
 * @description:
 * @date 2023/07/13
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("|==> Start ----------------------");
        ShoppingCart cart = new ShoppingCart();

        // 添加商品
        cart.addGoods(new ShoppingCart.GoodsDetail("夏季T恤", BigDecimal.valueOf(59.9), 2));
        cart.addGoods(new ShoppingCart.GoodsDetail("网球拍", BigDecimal.valueOf(100), 1));
        cart.addGoods(new ShoppingCart.GoodsDetail("网红款家用驱蚊液", BigDecimal.valueOf(28.5), 2));
        System.out.println(MessageFormat.format("   购物车商品明细：\n{0}", cart.getDetails()));
        System.out.println(MessageFormat.format("   商品原价：【{0}元】", cart.finalCost()));

        VoucherDecorator decorator =
                new VoucherDecorator(
                        new VoucherDecorator(
                                new FullDiscountDecorator(
                                        new DiscountDecorator(cart, BigDecimal.valueOf(0.85)), BigDecimal.valueOf(20), BigDecimal.valueOf(100)
                                ), BigDecimal.valueOf(20)
                        ), BigDecimal.valueOf(5)
                );
        System.out.println(MessageFormat.format("   优惠后价格：【{0}元】，优惠说明：【{1}】",
                decorator.finalCost(),
                decorator.description()));
    }
}
