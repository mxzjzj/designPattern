package com.jxs.builder;

/**
 * Created by jiangxs on 2018/5/7.
 *
 * @description: 具体建造类2
 */
public class ConcreteBuilder2 extends Builder {

    private Product product = new Product();

    @Override
    public void buildPartA() {

        product.add("部件X");
    }

    @Override
    public void buildPartB() {

        product.add("部件Y");
    }

    @Override
    public Product getResult() {

        return product;
    }
}
