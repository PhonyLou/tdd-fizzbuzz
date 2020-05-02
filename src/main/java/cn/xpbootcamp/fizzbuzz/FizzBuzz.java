package cn.xpbootcamp.fizzbuzz;

import static cn.xpbootcamp.fizzbuzz.Constant.BUZZ;
import static cn.xpbootcamp.fizzbuzz.Constant.FIZZ;

public class FizzBuzz {

    static String doFizzBuzz(int index) {
        String result = String.valueOf(index);

        result = index % 3 == 0 ? FIZZ : result;
        result = index % 5 == 0 ? BUZZ : result;
        
        return result;
    }
}
