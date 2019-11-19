package com.example.demo.thread;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.concurrent.CompletableFuture;

public class TestCompleteFuture {

    public static void main(String[] args) {

        /*CompletableFuture future = new CompletableFuture();

        NumberFormat numberFormat = NumberFormat.getInstance();

        numberFormat.setMaximumFractionDigits(0);
        numberFormat.setGroupingUsed(true);

        System.out.println(numberFormat.format(0.654));*/


        BigDecimal bigDecimal = new BigDecimal("a");
        System.out.println(bigDecimal.stripTrailingZeros().toPlainString());
    }

}
