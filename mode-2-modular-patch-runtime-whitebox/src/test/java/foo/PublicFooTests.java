package foo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PublicFooTests {
  @Test
  void accessPublicFoo() {
    Assertions.assertEquals("foo", PublicFoo.class.getPackageName());
    Assertions.assertEquals("foo", PublicFoo.class.getModule().getName());
  }
}
