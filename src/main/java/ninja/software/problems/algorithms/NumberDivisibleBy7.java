package ninja.software.problems.algorithms;

public class NumberDivisibleBy7 {

    public boolean check(int number) {
        if(number < 0) {
            return check(Math.abs(number));
        }
        if(number == 0 || number == 7) {
            return true;
        }
        if(number < 10) {
            return false;
        }

        return check(number / 10 - 2 * (number - number / 10 * 10));
    }
}
