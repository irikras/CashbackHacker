package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void shouldReturn1IfAmntLowerThan1000() {
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturn600IfAmntMoreThan1000() {
        int amount = 1400;
        int expected = 600;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturnZeroIfAmntEqual1000() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}