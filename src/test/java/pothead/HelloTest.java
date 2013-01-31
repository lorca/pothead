package pothead;

import org.junit.Test;
import org.junit.Assert;

public class HelloTest {
  @Test
  public void testHello() {
    Hello hello = new Hello();
    String said = hello.talk();
    Assert.assertEquals("Result", "I am a pothead!", said);
  }

  @Test
  public void testBlowup() {
    Assert.assertEquals("Result", "1", "1");
  }

  @Test
  public void testProperty() {
    Assert.assertEquals("Result", "value", System.getProperty("property"));
  }
}
