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
      if (i != j) {
        var temp = data[i];
        data[i] = data[j];
        data[j] = temp;
      }
    }
  }

  public void shuffle(long[] data) {
    for (int i = data.length - 1; i > 0; i--)  {
      int j = rng.nextInt(i + 1);
      if (i != j) {
        var temp = data[i];
        data[i] = data[j];
        data[j] = temp;
      }
    }
  }

  public void shuffle(byte[] data) {
    for (int i = data.length - 1; i > 0; i--)  {
      int j = rng.nextInt(i + 1);
      if (i != j) {
        var temp = data[i];
        data[i] = data[j];
        data[j] = temp;
      }
    }
  }

  public void shuffle(boolean[] data) {
    for (int i = data.length - 1; i > 0; i--)  {
      int j = rng.nextInt(i + 1);
      if (i != j) {
        var temp = data[i];
        data[i] = data[j];
        data[j] = temp;
      }
    }
  }

  public void shuffle(char[] data) {
    for (int i = data.length - 1; i > 0; i--)  {
      int j = rng.nextInt(i + 1);
      if (i != j) {
        var temp = data[i];
        data[i] = data[j];
        data[j] = temp;
      }
    }
  }

  public void shuffle(short[] data) {
    for (int i = data.length - 1; i > 0; i--)  {
      int j = rng.nextInt(i + 1);
      if (i != j) {
        var temp = data[i];
        data[i] = data[j];
        data[j] = temp;
      }
    }
  }

  public void shuffle(float[] data) {
    for (int i = data.length - 1; i > 0; i--)  {
      int j = rng.nextInt(i + 1);
      if (i != j) {
        var temp = data[i];
        data[i] = data[j];
        data[j] = temp;
      }
    }
  }

  public void shuffle(double[] data) {
    for (int i = data.length - 1; i > 0; i--)  {
      int j = rng.nextInt(i + 1);
      if (i != j) {
        var temp = data[i];
        data[i] = data[j];
        data[j] = temp;
      }
    }
  }



}
