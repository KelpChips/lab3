import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] input2 = {3,4,5};
    int[] input3 = {3,4,5,6};
    ArrayExamples.reverseInPlace(input1);
    ArrayExamples.reverseInPlace(input2);
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{ 3 }, input1);
    assertArrayEquals(new int[]{5,4,3}, input2);
    assertArrayEquals(new int[]{6,5,4,3}, input3);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] input2 = {3,4,5,6,7,8,9};
    int[] input3 = {0};
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{0}, ArrayExamples.reversed(input3));
    assertArrayEquals(new int[]{9,8,7,6,5,4,3}, ArrayExamples.reversed(input2));
  }

  @Test
  public void averageWithoutLowest() {
    double[] input1 = {1.0,2.0,3.0,4.0};
    double stoopidNum = ArrayExamples.averageWithoutLowest(input1);
    double[] input2 = {3,3,3,3,3};
    assertEquals(3, stoopidNum, 0);
    assertEquals(3, ArrayExamples.averageWithoutLowest(input2), 0);
  }
}
