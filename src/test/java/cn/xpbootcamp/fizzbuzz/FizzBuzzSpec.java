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

    @Test
    void return_Buzz_when_index_is_5() {
        int givenIndex = 5;
        String expect = BUZZ;
        String actual = FizzBuzz.doFizzBuzz(givenIndex);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    void return_Buzz_when_index_is_multiple_of_5() {
        int givenIndex = 10;
        String expect = BUZZ;
        String actual = FizzBuzz.doFizzBuzz(givenIndex);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    void return_Whizz_when_index_is_7() {
        int givenIndex = 7;
        String expect = WHIZZ;
        String actual = FizzBuzz.doFizzBuzz(givenIndex);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    void return_Whizz_when_index_is_multiple_of_7() {
        int givenIndex = 14;
        String expect = WHIZZ;
        String actual = FizzBuzz.doFizzBuzz(givenIndex);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    void return_FizzBuzz_when_index_is_multiple_of_3x5() {
        int givenIndex = 15;
        String expect = FIZZ + BUZZ;
        String actual = FizzBuzz.doFizzBuzz(givenIndex);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    void return_FizzWhizz_when_index_is_multiple_of_3x7() {
        int givenIndex = 21;
        String expect = FIZZ + WHIZZ;
        String actual = FizzBuzz.doFizzBuzz(givenIndex);

        Assertions.assertEquals(expect, actual);
    }
}
