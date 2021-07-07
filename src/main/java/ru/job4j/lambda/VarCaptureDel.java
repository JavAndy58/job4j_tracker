package ru.job4j.lambda;

interface MyFunc {
    int func(int n);
}

public class VarCaptureDel {
    public static void main(String[] args) {

        int num = 10;

        MyFunc myLambda = (n) -> {
            int v = num + n;

            return v;
        };
        System.out.println(myLambda.func(8));

    }
}
