package bar;

import foo.PublicFoo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BlackBoxTests {

  @Test
  void accessPublicFoo() {
    Assertions.assertEquals("foo", PublicFoo.class.getPackageName());
  }

  // @Test
  // void accessPackageFoo() {
  // Assertions.assertEquals("foo", foo.PackageFoo.class.getPackageName());
  // }
}
