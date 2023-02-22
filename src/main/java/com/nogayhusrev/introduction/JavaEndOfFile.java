package com.nogayhusrev.introduction;

import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        int line = 0;

        while (scanner.hasNext()) {
            line++;
            System.out.println(line + " " + scanner.nextLine());


        }
    }
}
