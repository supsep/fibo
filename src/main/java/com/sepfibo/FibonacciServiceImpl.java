package com.sepfibo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FibonacciServiceImpl implements FibonacciService {
  private ArrayList<BigInteger> fibonacciSequence;

  public FibonacciServiceImpl() {
    // Initialize Fibonacci array with value 0 and 1 at index 0 and respectively
    fibonacciSequence = new ArrayList<>();
    fibonacciSequence.add(new BigInteger("0"));
    fibonacciSequence.add(new BigInteger("1"));
  }

  public List<BigInteger> findFibonacciRange(int range) {
    // Check if we have the range populated
    if (fibonacciSequence.size() < range) {
      // If not populated, find fibonacci
      findFibonacciNumber(range);
    }
    return fibonacciSequence.subList(0, range);
  }

  public BigInteger findFibonacciNumber(int index) {
    // Check if we have the value populated
    if (fibonacciSequence.size() > index) {
      return fibonacciSequence.get(index);
    }
    else {
      // Value is not populated so calculate it recursively
      BigInteger fibonacciNumber = findFibonacciNumber(index - 2).add(findFibonacciNumber(index - 1));
      fibonacciSequence.add(fibonacciNumber);
      return fibonacciNumber;
    }
  }

  public int validateInput(String input) throws Exception {
    // Validate input is non-null and non-empty
    if (input == null || input.length() < 1) {
      throw new Exception("Empty input.");
    }

    // Convert input to int
    int value;

    try {
      value = Integer.parseInt(input.trim());
    } catch (NumberFormatException nfe) {
      throw new Exception("Invalid number.");
    }

    // Validate min and max for input
    if (value < 1) {
      throw new Exception("Value must be an integer greater than 0.");
    } else if (value > 10000) {
      throw new Exception("Value must be an integer less than 10000.");
    }

    return value;
  }
}
