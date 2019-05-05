package com.sepfibo;

import java.math.BigInteger;
import java.util.List;

public final class FiboUtils {

  /**
   * Convert List<BigInteger> to a space-separate string
   * @param list of BigInteger values
   * @return String space-separated values
   */
  public static String bigIntegerListToString(List<BigInteger> list) {
    StringBuilder stringBuilder = new StringBuilder();
    for (BigInteger value : list) {
      stringBuilder.append(value);
      stringBuilder.append(" ");
    }
    return stringBuilder.toString();
  }
}
