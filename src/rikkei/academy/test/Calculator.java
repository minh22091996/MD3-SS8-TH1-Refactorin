package rikkei.academy.test;

public class Calculator {
    public static int calculate(int t, int b, char o) {
        switch (o) {
            case '+':
                return t + b;
            case '-':
                return t - b;
            case '*':
                return t * b;
            case '/':
                if (b != 0)
                    return t / b;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}