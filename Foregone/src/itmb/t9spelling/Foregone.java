package itmb.t9spelling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Foregone {

    public static void main(String[] args) throws IOException {
        // write your code here
        Scanner s = new Scanner(new File("small-in.in"));
        BufferedWriter bf = new BufferedWriter(new FileWriter("small.out"));
        int T = s.nextInt();
        //T = 1;
        for (int i = 0; i < T; i++) {
            int N = s.nextInt();
            //N =
            int[] a = new int[N];
            for (int j = 0; j < N; j++) {
                a[j] = j + 1;
            }

            bf.write("Case #" + (i + 1) + ": ");

            for (int k = 0; k < N; k++) {
                for (int l = 0; l < N; l++) {
                    //if (k < l){
                    if ((a[k] + a[l] == N) && !numberContainDigit(a[k], '4') && !numberContainDigit(a[l], '4')) {
                        bf.write((k + 1) + " " + (l + 1));
                        System.out.println("Case #" + (i + 1) + ": " + (k + 1) + " " + (l + 1));
                    }
                }
            }
            bf.flush();


        }

    }

    static boolean numberContainDigit(int number, char c) {
        String tmp = Integer.toString(number);
        return (tmp.indexOf(c) >= 0);
    }
}
