package com.test.resturantorderapp.taxcalculate;

public class TaxCalculateImpl implements TaxCalculate{
    private static final double TAX_RATE = .1;


    @Override
    public double calculationTotalTax(double totalAmount) {
        double tax = totalAmount*TAX_RATE;
      double  totalCost = tax + totalAmount;
        System.out.println("total cost :" + totalCost);
        return totalAmount;
    }

}
