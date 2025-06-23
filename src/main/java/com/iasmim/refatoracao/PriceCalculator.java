package com.iasmim.refatoracao;

public class PriceCalculator {

    public double calculateFinalPrice(double basePrice, int customerType, boolean isHoliday) {
        double customerDiscount = getCustomerDiscount(customerType);
        double holidayDiscount = isHoliday ? getHolidayDiscount() : 0;
        double totalDiscount = customerDiscount + holidayDiscount;

        return basePrice * (1 - totalDiscount);
    }

    private double getCustomerDiscount(int customerType) {
        return switch (customerType) {
            case 1 -> 0.10; // Cliente comum
            case 2 -> 0.15; // Cliente VIP
            default -> 0.0; // Outro
        };
    }

    private double getHolidayDiscount() {
        return 0.05;
    }
}
