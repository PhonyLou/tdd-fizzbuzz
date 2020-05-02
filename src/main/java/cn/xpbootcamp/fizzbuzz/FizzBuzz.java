package cn.xpbootcamp.fizzbuzz;

import static cn.xpbootcamp.fizzbuzz.Constant.FIZZ;

public class FizzBuzz {

    static String doFizzBuzz(int index) {

        if (index % 3 == 0) {
            return FIZZ;
        }
        return String.valueOf(index);
    }
}
