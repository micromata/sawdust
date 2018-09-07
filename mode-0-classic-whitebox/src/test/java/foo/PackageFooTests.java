package foo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PackageFooTests {
  @Test
  void accessPackageFoo() {
    Assertions.assertEquals("foo", PackageFoo.class.getPackageName());
  }
}
