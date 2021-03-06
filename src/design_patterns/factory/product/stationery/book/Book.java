package design_patterns.factory.product.stationery.book;

import design_patterns.factory.product.stationery.Stationery;

/**
 * 产品 - 本子
 *
 * @Author yuc
 */
public class Book extends Stationery {

    public Book() {
        super();
    }

    public Book(int price) {
        super(price);
    }

    @Override
    public void getName() {
        System.out.println("本子");
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void getPrice() {
        System.out.println(this.price + "元");
    }
}
