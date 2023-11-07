package com.example.firstapp;
class SeniorCitizenDiscountHandler implements DiscountHandler {
    private DiscountHandler nextHandler;

    @Override
    public void applyDiscount(double originalPrice) {
        if (originalPrice > 50 && originalPrice <= 100) {
            double discountedPrice = originalPrice * 0.9;
            System.out.println("Discount Applied. New Price: $" + discountedPrice);
        } else if (nextHandler != null) {
            nextHandler.applyDiscount(originalPrice);
        }
    }

    @Override
    public void setNextHandler(DiscountHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}

class PromoCodeDiscountHandler implements DiscountHandler {
    private DiscountHandler nextHandler;

    @Override
    public void applyDiscount(double originalPrice) {
        if (originalPrice > 100) {
            double discountedPrice = originalPrice * 0.8;
            System.out.println("Promo Code Discount Applied. New Price: $" + discountedPrice);
        } else if (nextHandler != null) {
            nextHandler.applyDiscount(originalPrice);
        }
    }

    @Override
    public void setNextHandler(DiscountHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}


 class DiscountClient {
    public static void main(String[] args) {
        DiscountHandler seniorCitizenHandler = new SeniorCitizenDiscountHandler();
        DiscountHandler promoCodeHandler = new PromoCodeDiscountHandler();

        seniorCitizenHandler.setNextHandler(promoCodeHandler);

        double originalPrice1 = 60;
        System.out.println("Original Price: $" + originalPrice1);
        seniorCitizenHandler.applyDiscount(originalPrice1);

        System.out.println();

        double originalPrice2 = 120;
        System.out.println("Original Price: $" + originalPrice2);
        seniorCitizenHandler.applyDiscount(originalPrice2);
    }
}
