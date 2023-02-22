package com.nogayhusrev.introduction;

import java.util.Scanner;

public class JavaLoops2 {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            loop(a, b, n, i, t);
        }
        in.close();
    }

    public static void loop(int a, int b, int n, int i, int t) {
        int sum = a;
        for (int j = 0; j < n; j++) {
            int nextEle = (int) Math.pow(2, j) * b;
            sum = sum + nextEle;
            System.out.printf("%s ", sum);
        }
        if (i < t - 1) {
            System.out.print("\n");
        }
    }
}
