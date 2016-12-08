package com.codewars.validarrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lnfra on 8/12/16.
 */
public class AreSameTest {

  @Test
  public void test1() {
    int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
    int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
    assertEquals(true, AreSame.comp(a, b));
  }

  @Test
  public void test2() {
    int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
    int[] b = new int[]{121, 146411, 20736, 361, 25921, 361, 20736, 361};
    assertEquals(false, AreSame.comp(a, b));
  }

  @Test
  public void test3() {
    int[] a = null;
    int[] b = new int[]{121, 146411, 20736, 361, 25921, 361, 20736, 361};
    assertEquals(false, AreSame.comp(a, b));
  }

}