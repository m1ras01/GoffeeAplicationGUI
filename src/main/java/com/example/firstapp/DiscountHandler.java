package com.example.firstapp;
public interface DiscountHandler {
    void applyDiscount(double originalPrice);
    void setNextHandler(DiscountHandler nextHandler);
}
