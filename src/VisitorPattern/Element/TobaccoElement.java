package VisitorPattern.Element;

import VisitorPattern.Visitor.Visitor;

/**
 * Created by Ado on 2018-01-05.
 */
public class TobaccoElement implements Element {

    private double price;

    public TobaccoElement(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
