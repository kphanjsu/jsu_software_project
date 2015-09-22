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

  public void testOnlyNumbers() {
    ArgumentParser parser = new ArgumentParser();
    

  }
}
