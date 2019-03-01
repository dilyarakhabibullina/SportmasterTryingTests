package ru.itpark;

import static org.junit.jupiter.api.Assertions.*;

class SportmasterTest {

    @org.junit.jupiter.api.Test
    void calculateBonus() {
        Sportmaster service = new Sportmaster();
        int sumPurchases = service.calculateBonus(15000);
        assertEquals(19000, sumPurchases);
    }
}