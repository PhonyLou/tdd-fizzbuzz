package cn.xpbootcamp.fizzbuzz;

import static cn.xpbootcamp.fizzbuzz.Constant.*;

public class FizzBuzz {

    static String doFizzBuzz(int index) {
        String result = String.valueOf(index);

        result = index % 3 == 0 ? FIZZ : result;
        result = index % 5 == 0 ? BUZZ : result;
        result = index % 7 == 0 ? WHIZZ : result;

        return result;
    }
}
