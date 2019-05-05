package com.sepfibo;

import java.math.BigInteger;
import java.util.List;

public interface FibonacciService {

  /**
   * Find range of Fibonacci Sequence from 0 -> range
   * @param range N between 1-10000
   * @return List<BigInteger> List of Fibonacci sequence up to N
   */
  List<BigInteger> findFibonacciRange(int range);

  /**
   * Find the Nth value of the fibonacci sequence.
   * @param digit N between 1-10000
   * @return BigInteger Nth value of fibonacci sequence
   */
  BigInteger findFibonacciNumber(int digit);

  /**
   * Validate user input against following criteria:
   *    1) Non-null and non-empty input
   *    2) Valid non-negative int value
   *    3) Value is less than maximum value of 10000
   * @param input non-sanitized user input
   * @return int sanitized non-negative non-empty user input
   * @throws Exception
   */
  int validateInput(String input) throws Exception;
}
