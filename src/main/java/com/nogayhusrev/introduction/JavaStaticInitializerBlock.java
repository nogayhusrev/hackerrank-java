package com.nogayhusrev.introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

    static boolean isValid = true;
    static int H, B;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        scanner.nextLine();
        H = scanner.nextInt();
        scanner.close();

        if (B > 0 && H > 0) {
            isValid = true;
        } else {
            isValid = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        if (isValid) {
            System.out.println(B * H);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }


}
