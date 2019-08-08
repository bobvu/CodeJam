package itmb.reversewords;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * https://code.google.com/codejam/contest/351101/dashboard#s=p0
 * Given a list of space separated words, reverse the order of the words. Each line of text contains L letters and W words. A line will only consist of letters and space characters. There will be exactly one space character between each pair of consecutive words.
 *
 * Input
 *
 * The first line of input gives the number of cases, N.
 * N test cases follow. For each test case there will a line of letters and space characters indicating a list of space separated words. Spaces will not appear at the start or end of a line.
 *
 * Output
 *
 * For each test case, output one line containing "Case #x: " followed by the list of words in reverse order.
 *
 * Limits
 *
 * Small dataset
 *
 * N = 5
 * 1 ≤ L ≤ 25
 *
 * Large dataset
 *
 * N = 100
 * 1 ≤ L ≤ 1000
 *
 * Sample
 *
 *
 * Input
 *
 * Output
 * 3
 * this is a test
 * foobar
 * all your base
 * Case #1: test a is this
 * Case #2: foobar
 * Case #3: base your all
 *
 *
 */
public class ReverseWords {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new File("B-large-practice.in"));
        BufferedWriter bf = new BufferedWriter(new FileWriter("B-large.out"));
        int N = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            String[] words = line.split(" ");
            //System.out.println((i+1) + " round: " + line);
            bf.write("Case #" + (i + 1) + ":");
            for (int k = words.length - 1; k >= 0; k--) {
                bf.write(" " + words[k]);
            }
            bf.write("\n");
        }
        bf.flush();


    }
}
