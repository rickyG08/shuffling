package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Random;
import org.junit.jupiter.api.Test;

class ShufflerTest {

  @Test
  void shuffle() {
    int[] input = {13, 11, 1, 3, 5, 7, 9};
    System.out.printf("Input %s%n", Arrays.toString(input));

    int[] original = Arrays.copyOf(input, input.length);
    int[] sortedInput = Arrays.copyOf(input, input.length);
    Arrays.sort(sortedInput);
    System.out.printf("Sorted Input %s%n", Arrays.toString(sortedInput));

    Shuffler shuffler = new Shuffler(new Random());
    shuffler.shuffle(input);
    System.out.printf("Output %s%n", Arrays.toString(input));

    assertFalse(Arrays.equals(original, input));
    int[] sortedOutput = Arrays.copyOf(input, input.length);
    Arrays.sort(sortedOutput);
    System.out.printf("Sorted output %s%n", Arrays.toString(input));

    assertArrayEquals(sortedInput, sortedOutput);
  }
}