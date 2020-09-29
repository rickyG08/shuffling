package edu.cnm.deepdive;

import java.util.Random;

public class Shuffler {

  private final Random rng;

  public Shuffler(Random rng) {
    this.rng = rng;

  }

  public void shuffle(int[] data) {
    for (int i = data.length - 1; i > 0; i--)  {
      int j = rng.nextInt(i + 1);
      int temp = data[i];
      data[i] = data[j];
      data[j] = temp;
    }
  }

}
