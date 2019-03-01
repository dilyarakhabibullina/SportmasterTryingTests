package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SportmasterTest {

    @Test
    void calculateBonus() {
        {
            Sportmaster service = new Sportmaster();
            int sumPurchase = service.calculateBonus(15_000);
            assertEquals(19_000, sumPurchase);
        }
    }
}