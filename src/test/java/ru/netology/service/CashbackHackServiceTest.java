package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;

        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(actual,expected);
    }

    @Test
    public void testRemain2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual,expected);
    }

    @Test
    public void testRemain3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual,expected);
    }

    @Test
    public void testRemain4() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual,expected);
    }

    @Test
    public void testRemain5() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual,expected);
    }
}