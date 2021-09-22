package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldReturn1IfAmntLowerThan1000() {
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldReturn600IfAmntMoreThan1000() {
        int amount = 1400;
        int expected = 600;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldReturnZeroIfAmntEqual1000() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}