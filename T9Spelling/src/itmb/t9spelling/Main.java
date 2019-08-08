package itmb.t9spelling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        HashMap<Character,Integer> hp = new HashMap<Character, Integer>();
        hp.put('a', 2);		hp.put('n', 66);
        hp.put('b', 22);	hp.put('o', 666);
        hp.put('c', 222);	hp.put('p', 7);
        hp.put('d', 3);		hp.put('q', 77);
        hp.put('e', 33);	hp.put('r', 777);
        hp.put('f', 333);	hp.put('s', 7777);
        hp.put('g', 4);		hp.put('t', 8);
        hp.put('h', 44);	hp.put('u', 88);
        hp.put('i', 444);	hp.put('v', 888);
        hp.put('j', 5);		hp.put('w', 9);
        hp.put('k', 55);	hp.put('x', 99);
        hp.put('l', 555);	hp.put('y', 999);
        hp.put('m', 6);		hp.put('z', 9999);
        hp.put(' ', 0);

        Scanner scanner = new Scanner(new File("C-large-practice.in"));
        BufferedWriter bf = new BufferedWriter(new FileWriter("C-large.out"));
        int N = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i< N; i++){
            String line = scanner.nextLine();
            char[] chars = line.toCharArray();
            StringBuilder output = new StringBuilder("");
            for( int j = 0; j< chars.length; j ++){
                if(j>0){
                    String a = hp.get(chars[j]).toString();
                    String b = hp.get(chars[j-1]).toString();
                    if (a.charAt(0) == b.charAt(0)){
                        output.append(" ");
                    }
                }
                output.append(hp.get(chars[j]).toString());
            }
            bf.write("Case #" +(i+1) + ": " + output.toString() + "\n");
            //System.out.println("Case #" +(i+1) + ": " + line + "\n");
            //System.out.println("Case #" +(i+1) + ": " + output.toString() + "\n");
        }
        bf.flush();
    }
}
