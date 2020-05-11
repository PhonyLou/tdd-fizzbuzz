package cn.xpbootcamp.fizzbuzz;

import static cn.xpbootcamp.fizzbuzz.Constant.*;

public class FizzBuzz {
    static String doFizzBuzz(int index) {
        String result = "";

        boolean isMultipleOf3 = index % 3 == 0;
        boolean isMultipleOf5 = index % 5 == 0;
        boolean isMultipleOf7 = index % 7 == 0;

        String input = String.valueOf(index);
        boolean isContains3 = input.contains("3");
        boolean isContains5 = input.contains("5");
        boolean isContains7 = input.contains("7");


        if (isContains3 && isContains5 && isContains7){
            String res = ((index % 3 == 0)? "Fizz" : "") + ((index % 7 == 0)? "Whizz" : "");
            return  res.equals("") ? input: res;
        }

        if (isContains7){
            isMultipleOf5 = false;
            if (isContains5 && index%3 == 0){
                isMultipleOf3 = true;
            }
            if (isContains3 && index%7 ==0){
                isMultipleOf7 = true;
            }
        }

        if (isContains5 && !isContains7){
            isContains3 = false;
            isMultipleOf3 = false;
        }

        if (isContains3) {
            isMultipleOf3 = false;
            isMultipleOf5 = false;
            isMultipleOf7 = false;
            result += "Fizz";
        }

        if (isMultipleOf3) result += "Fizz";
        if (isMultipleOf5) result += "Buzz";
        if (isMultipleOf7) result += "Whizz";

        return result.equals("") ? input : result;
    }
}
