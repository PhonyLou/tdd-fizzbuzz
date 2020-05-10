package cn.xpbootcamp.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static cn.xpbootcamp.fizzbuzz.Constant.*;

public class FizzBuzzSpec {
    @Test
    void should_return_number_when_reporting_given_index_is_2() {
        int givenIndex = 2;
        String expect = "2";
        String actual = FizzBuzz.doFizzBuzz(givenIndex);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    void should_return_Fizz_when_reporting_given_index_is_3() {
        int givenIndex = 3;
        String expect = FIZZ;
        String actual = FizzBuzz.doFizzBuzz(givenIndex);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    void should_return_Fizz_when_reporting_given_index_is_multiple_of_3() {
        int givenIndex = 6;
        String expect = FIZZ;
        String actual = FizzBuzz.doFizzBuzz(givenIndex);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    void should_return_Buzz_when_reporting_given_index_is_5() {
        int givenIndex = 5;
        String expect = BUZZ;
        String actual = FizzBuzz.doFizzBuzz(givenIndex);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    void should_return_Buzz_when_reporting_given_index_is_multiple_of_5() {
        int givenIndex = 10;
        String expect = BUZZ;
        String actual = FizzBuzz.doFizzBuzz(givenIndex);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    void should_return_Whizz_when_reporting_given_index_is_7() {
        int givenIndex = 7;
        String expect = WHIZZ;
        String actual = FizzBuzz.doFizzBuzz(givenIndex);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    void should_return_Whizz_when_reporting_given_index_is_multiple_of_7() {
        int givenIndex = 14;
        String expect = WHIZZ;
        String actual = FizzBuzz.doFizzBuzz(givenIndex);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    void should_return_Buzz_when_reporting_given_index_is_multiple_of_3_and_contains_5() {
        int givenIndex = 15;
        String expect = BUZZ;
        String actual = FizzBuzz.doFizzBuzz(givenIndex);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    void should_return_FizzWhizz_when_reporting_given_index_is_multiple_of_3x7() {
        int givenIndex = 21;
        String expect = FIZZ + WHIZZ;
        String actual = FizzBuzz.doFizzBuzz(givenIndex);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    void should_return_BuzzWhizz_when_reporting_given_index_is_multiple_of_5x7() {
        int givenIndex = 35;
        String expect = BUZZ + WHIZZ;
        String actual = FizzBuzz.doFizzBuzz(givenIndex);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    void should_return_BuzzWhizz_when_reporting_given_index_contains_5() {
        int givenIndex = 105;
        String expect = BUZZ + WHIZZ;
        String actual = FizzBuzz.doFizzBuzz(givenIndex);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    void should_return_FizzWhizz_when_reporting_given_index_contains_7_and_multiple_of_3_and_7() {
        int givenIndex = 147;
        String expect = FIZZ + WHIZZ;
        String actual = FizzBuzz.doFizzBuzz(givenIndex);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    void should_return_FizzWhizz_when_reporting_given_index_is_75() {
        int givenIndex = 75;
        String expect = FIZZ;
        String actual = FizzBuzz.doFizzBuzz(givenIndex);

        Assertions.assertEquals(expect, actual);
    }
}
