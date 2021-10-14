package com.quiz.two_number_side_by_side;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class TwoNumberSideBySideApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        var size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        var n = scanner.nextInt();
        var m = scanner.nextInt();
        boolean nextTo = false;
        for (int i = 0, j = 1; i < array.length - 1; i++, j++) {
            if (array[i] == n && array[j] == m) {
                nextTo = true;
            } else if (array[i] == m && array[j] == n) {
                nextTo = true;
            }
        }
        System.out.println(nextTo);
		scanner.close();
	}

}
