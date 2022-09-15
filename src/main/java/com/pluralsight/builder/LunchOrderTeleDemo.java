package com.pluralsight.builder;

public class LunchOrderTeleDemo {
    public static void main(String[] args) {

        LunchOrderTele order = new
                LunchOrderTele("Wheat", "Lettuce", "Mustard", "Ham");
//        order.setBread("Wheat");
//        order.setCondiments("Lettuce");
//        order.setDressing("Mustard");
//        order.setMeat("Ham");

        System.out.println(order.getBread());
        System.out.println(order.getCondiments());
        System.out.println(order.getDressing());
        System.out.println(order.getMeat());
    }
}
