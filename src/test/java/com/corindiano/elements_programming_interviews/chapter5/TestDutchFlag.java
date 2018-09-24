package com.corindiano.elements_programming_interviews.chapter5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;

class TestDutchFlag {
    @Test
    void testCase1() {
        DutchFlag.Color pivot = DutchFlag.Color.RED;
        List<DutchFlag.Color> input = new ArrayList<>();
        input.add(DutchFlag.Color.RED);
        input.add(DutchFlag.Color.WHITE);
        input.add(DutchFlag.Color.RED);
        input.add(DutchFlag.Color.RED);
        input.add(DutchFlag.Color.BLUE);
        input.add(DutchFlag.Color.BLUE);
        input.add(DutchFlag.Color.WHITE);
        input.add(DutchFlag.Color.RED);
        DutchFlag.rearrange(pivot, input);

        boolean foundRed = false;

        for (DutchFlag.Color c : input) {
            if (foundRed && c == pivot) continue;
            if (foundRed && c.ordinal() <= pivot.ordinal()) fail();
            if (!foundRed && c == pivot) foundRed = true;
        }
    }

    @Test
    void testCase2() {
        DutchFlag.Color pivot = DutchFlag.Color.WHITE;
        List<DutchFlag.Color> input = new ArrayList<>();
        input.add(DutchFlag.Color.RED);
        input.add(DutchFlag.Color.WHITE);
        input.add(DutchFlag.Color.RED);
        input.add(DutchFlag.Color.RED);
        input.add(DutchFlag.Color.BLUE);
        input.add(DutchFlag.Color.BLUE);
        input.add(DutchFlag.Color.WHITE);
        input.add(DutchFlag.Color.RED);
        DutchFlag.rearrange(pivot, input);

        boolean foundWhite = false;

        for (DutchFlag.Color c : input) {
            if (foundWhite && c == pivot) continue;
            if (foundWhite && c.ordinal() <= pivot.ordinal()) fail();
            if (!foundWhite && c == pivot) foundWhite = true;
        }
    }

    @Test
    void testCase3() {
        DutchFlag.Color pivot = DutchFlag.Color.BLUE;
        List<DutchFlag.Color> input = new ArrayList<>();
        input.add(DutchFlag.Color.RED);
        input.add(DutchFlag.Color.WHITE);
        input.add(DutchFlag.Color.RED);
        input.add(DutchFlag.Color.RED);
        input.add(DutchFlag.Color.BLUE);
        input.add(DutchFlag.Color.BLUE);
        input.add(DutchFlag.Color.WHITE);
        input.add(DutchFlag.Color.RED);
        DutchFlag.rearrange(pivot, input);

        boolean foundBlue = false;

        for (DutchFlag.Color c : input) {
            if (foundBlue && c == pivot) continue;
            if (foundBlue && c.ordinal() <= pivot.ordinal()) fail();
            if (!foundBlue && c == pivot) foundBlue = true;
        }
    }
}