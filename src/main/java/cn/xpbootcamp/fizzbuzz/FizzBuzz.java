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

        boolean passRule7 = input.contains("7") && index % 3 == 0;
        if (passRule7) {
            return FIZZ;
        }

        String result = "";

        if (isMultipleOf3)
            result += FIZZ;

        if (isMultipleOf5)
            result += BUZZ;

        if (isMultipleOf7)
            result += WHIZZ;

//        result = index % 3 == 0 ? FIZZ : result;
//        result = index % 5 == 0 ? BUZZ : result;
//        result = index % 7 == 0 ? WHIZZ : result;
//        result = index % (3 * 5) == 0 ? FIZZ + BUZZ : result;
//        result = index % (3 * 7) == 0 ? FIZZ + WHIZZ : result;
//        result = index % (5 * 7) == 0 ? BUZZ + WHIZZ : result;
//        result = index % (3 * 5 * 7) == 0 ? FIZZ + BUZZ + WHIZZ : result;



//        contains 3 => Fizz // rule 4 + rule 5
//
//        contains 5 =>
//        multiple of 5 => Buzz
//        multiple of 7 => Whizz
//        multiple of 7 * 5 => Buzz + Whizz
//        // rule 6
//
//        contains 7 =>
//        multiple of 3 => Fizz
//        multiple of 3 * 7 => Fizz + Whizz
// rule 7

        return result.equals("") ? input : result;
    }
}
