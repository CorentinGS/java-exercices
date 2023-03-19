package com.corentings.ex3;

import com.corentings.utils.RadiusTester;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void area() {
        ArrayList<RadiusTester> testCases = new ArrayList<>();

        testCases.add(new RadiusTester(1, Math.PI));
        testCases.add(new RadiusTester(0, 0));
        testCases.add(new RadiusTester(-1, Math.PI));
        testCases.add(new RadiusTester(3.8, Math.PI * 3.8 * 3.8));
        testCases.add(new RadiusTester(321, Math.PI * 321 * 321));

        for (RadiusTester s : testCases) {
            assertEquals(s.getExpected(), Main.area(s.getInput()));
        }


    }

    @Test
    void genericArea() {
        ArrayList<RadiusTester> testCases = new ArrayList<>();

        testCases.add(new RadiusTester(1, Math.PI));
        testCases.add(new RadiusTester(0, 0));
        testCases.add(new RadiusTester(-1, Math.PI));
        testCases.add(new RadiusTester(3.8, Math.PI * 3.8 * 3.8));
        testCases.add(new RadiusTester(321, Math.PI * 321 * 321));

        for (RadiusTester s : testCases) {
            assertEquals(s.getExpected(), Main.genericArea(s.getInput()));
        }
    }

    @Test
    void genericAreaFloat() {
        ArrayList<RadiusTester> testCases = new ArrayList<>();

        testCases.add(new RadiusTester(1F, Math.PI));
        testCases.add(new RadiusTester(0F, 0));
        testCases.add(new RadiusTester(-1F, Math.PI));
        testCases.add(new RadiusTester(3.8F, Math.PI * 3.8F * 3.8F));
        testCases.add(new RadiusTester(321F, Math.PI * 321F * 321F));

        for (RadiusTester s : testCases) {
            assertEquals(s.getExpected(), Main.genericArea(s.getInput()));
        }
    }
}