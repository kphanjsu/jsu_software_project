/*Unit Tests*/
import org.junit.*;
import static org.junit.Assert.*;

public Class UnitTests {
  private ArgumentParser a;
  @Before
  public void start{
    a = new ArgumentParser();
  }

  //Test
  @Test
  public void testAddString() {
    for (int i = 0; i < 3; i++) {
      a.parseIn(i);
    }
    if ()
    return assertTrue(true);
  }

  @Test
  public void testOnlyNumbers() {
    String[] numberList = {"1", "2", "5"};
    for (int i = 0; i < numberList.length; i++) {
      a.parseIn(numberList[i]);
    }
}
