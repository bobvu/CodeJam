package itmb.storecredit;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //System.out.println(FileSystems.getDefault().getPath("A-large-practice.in").toAbsolutePath().toString());
        //Scanner sc = new Scanner(new File(FileSystems.getDefault().getPath("A-large-practice.in").toAbsolutePath().toString()));
        Scanner sc = new Scanner(new File("A-large-practice.in"));
        BufferedWriter bf = new BufferedWriter(new FileWriter("A-large.out"));
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int C = sc.nextInt(); //Credit
            int I = sc.nextInt(); //number of items
            int[] items = new int[I];
            for (int j = 0; j < I; j++) {
                items[j] = sc.nextInt();
            }
            for (int k = 0; k < I; k++) {
                for (int l = 0; l < I; l++) {
                    if ((items[k] + items[l] == C) && (k < l)) {
                        bf.write("Case #" + (i + 1) + ": " + (k + 1) + " " + (l + 1) + "\n");
                        System.out.println("Case #" + (i + 1) + ": " + (k + 1) + " " + (l + 1) + "\n");
                    }
                }
            }
        }
        bf.flush();
    }
}
