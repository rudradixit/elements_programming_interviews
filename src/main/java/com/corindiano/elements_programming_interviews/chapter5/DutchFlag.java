package com.corindiano.elements_programming_interviews.chapter5;

import java.util.Collections;
import java.util.List;

class DutchFlag {
    public enum Color { RED, WHITE, BLUE }

    static void rearrange(Color pivot, List<Color> colors) {
        int smaller = 0;
        int equal = 0;
        int larger = colors.size();

        while (equal < larger) {
            if (colors.get(equal).ordinal() < pivot.ordinal()) {
                Collections.swap(colors, smaller++, equal++);
            } else if (colors.get(equal).ordinal() == pivot.ordinal()) {
                ++equal;
            } else {
                Collections.swap(colors, equal, --larger);
            }
        }
    }
}