package org.example.SearchingTechniques;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class BothSearchingTimeCalculation {

    public static void main(String[] args) {

        int[] a = {1, 2, 4, 5, 6, 7, 11, 14};
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        Instant start = Instant.now();
        int steps=0;

        int result = LinearSearch.findIndexOfNumber(val, a,steps);

        Instant end = Instant.now();

        Duration duration = Duration.between(start, end);

        if (result != -1) {
            System.out.println("Start Time : " + start);
            System.out.println("End Time   : " + end);
            System.out.println("Time taken : " + duration.toMillis() + " ms");
            System.out.println("Found the index: " + result);
        } else {
            System.out.println("Not found the index");
        }
    }
}
