package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int expected = 180;

        int actual = service.calculateSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAvg() {
        StatsService service = new StatsService();
        int expected = 15;

        int actual = service.calculateAvg(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMaxSaleMonth() {
        StatsService service = new StatsService();
        int expected = 8;

        int actual = service.findMaxSaleMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMinSaleMonth() {
        StatsService service = new StatsService();
        int expected = 9;

        int actual = service.findMinSaleMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthBelowAvg() {
        StatsService service = new StatsService();
        int expected = 5;

        int actual = service.countMonthBelowAvg(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthOverAvg() {
        StatsService service = new StatsService();
        int expected = 5;

        int actual = service.countMonthOverAvg(sales);

        assertEquals(expected, actual);
    }
}