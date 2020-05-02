package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {

    static String doFizzBuzz(int index) {

        if (index % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(index);
    }
}
