package ua.serhiy_subbotin.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by TOSHIBA on 22.02.2017.
 */

public class SquareTests {
  @Test
    public void testArea(){
    Square s = new Square(5);
    Assert.assertEquals(s.area(), 25.0);
  }
}
