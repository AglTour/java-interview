package collection;

import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * You should complete the function in this class
 * <p>
 * Feel free to define any method and / or class you want
 */
class CollectionTest {


  /**
   * operation : x -> ((x * 2) + 3) ^ 5
   */
  public static List<Double> compute1(List<Integer> input) {
    return input.stream().map(i -> Math.pow((i.doubleValue() * 2) + 3, 5)).toList();
  }

  /**
   * operation : abc -> AbcAbc
   */
  public static List<String> compute2(List<String> input) {
    return input.stream().map(str -> {
      if (str.isEmpty())
        return str;
      String temp = Character.toUpperCase(str.charAt(0)) + str.substring(1);
      return temp + temp;
    }).toList();
  }

}
