package cn.xpbootcamp.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static cn.xpbootcamp.fizzbuzz.Constant.*;

public class FizzBuzzSpec {
    @Test
    void return_Fizz_when_index_is_3() {
        int givenIndex = 3;
        String expect = FIZZ;
        String actual = FizzBuzz.doFizzBuzz(givenIndex);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    void return_Fizz_when_index_is_multiple_of_3() {
        int givenIndex = 6;
        String expect = FIZZ;
        String actual = FizzBuzz.doFizzBuzz(givenIndex);

        Assertions.assertEquals(expect, actual);
    }
}
