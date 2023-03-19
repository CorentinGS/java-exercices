package com.corentings.ex1;

import com.corentings.utils.Tester;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @org.junit.jupiter.api.Test
    void removeTrailingZero() {
        String[] strings = {"1.00", "0000001234", "0032.12000", "0.000000", "000000.0000000000", "03.002"};
        ArrayList<Tester> testCases = new ArrayList<>();

        testCases.add(new Tester("1.00", "1"));
        testCases.add(new Tester("0000001234", "1234"));
        testCases.add(new Tester("0032.12000", "32.12"));
        testCases.add(new Tester("0.000000", "0"));
        testCases.add(new Tester("000000.0000000000", "0"));
        testCases.add(new Tester("03.002", "3.002"));
        testCases.add(new Tester("0", "0"));
        testCases.add(new Tester("0.0", "0"));
        testCases.add(new Tester("3.8", "3.8"));

        for (Tester s : testCases) {
            assertEquals(s.getExpected(), Main.removeTrailingZero(s.getInput()));
        }
    }

    @Test
    void ex14() {
        assertEquals("0032.12000", Main.ex14(32.12F));
        assertEquals("0000.00000", Main.ex14(0F));
        assertEquals("-000.00000", Main.ex14(-0F));
        assertEquals("-000.00000", Main.ex14(-0.0F));
        assertEquals("0032.42900", Main.ex14(32.429F));
        assertEquals("0321.00000", Main.ex14(321F));
    }
}

