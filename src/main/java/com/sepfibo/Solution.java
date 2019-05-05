package com.sepfibo;

import static com.sepfibo.FiboUtils.bigIntegerListToString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.List;


public class Solution {
  private static final FibonacciService service = new FibonacciServiceImpl();

  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      System.out.println("Enter N to generate Fibonacci sequence up to Nth digit:");
      try {
        String input = br.readLine();
        final int range = service.validateInput(input);
        final List<BigInteger> fibonacciRange = service.findFibonacciRange(range);
        final String result = bigIntegerListToString(fibonacciRange);

        System.out.println(result);
      } catch (IOException e) {
        System.err.println("ERROR: Input/Output error. Exiting");
        System.exit(1);
      } catch (Exception e) {
        System.err.println("ERROR: " + e.getMessage());
      }
    }
  }
}
