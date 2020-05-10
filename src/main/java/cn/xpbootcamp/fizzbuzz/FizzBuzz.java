package cn.xpbootcamp.fizzbuzz;

import static cn.xpbootcamp.fizzbuzz.Constant.*;

public class FizzBuzz {
    static String doFizzBuzz(int index) {
        boolean isMultipleOf3 = index % 3 == 0;
        boolean isMultipleOf5 = index % 5 == 0;
        boolean isMultipleOf7 = index % 7 == 0;

        String input = String.valueOf(index);
        boolean isContains3 = input.contains("3");
        boolean isContains5 = input.contains("5");
        boolean isContains7 = input.contains("7");

        if (isContains7) {
            isMultipleOf5 = false;
            isContains5 = false;
            isContains3 = false;
        }

        if (isContains5) {
            isMultipleOf3 = false;
            isContains3 = false;
        }

        if (isContains3) return FIZZ;

        String result = "";
        if (isMultipleOf3) result += FIZZ;
        if (isMultipleOf5) result += BUZZ;
        if (isMultipleOf7) result += WHIZZ;

        return result.equals("") ? input : result;
    }
}
