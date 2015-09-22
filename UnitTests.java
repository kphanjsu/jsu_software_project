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
    ArgumentParser parser = new ArgumentParser();
    for (int i = 0; i < 3; i++) {
      parser.parseIn(i);
    }
    if ()
    return assertTrue(true);
  }
}
