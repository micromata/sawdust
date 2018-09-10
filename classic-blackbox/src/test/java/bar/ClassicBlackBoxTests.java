package bar;

import foo.PublicFoo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classic Black Box Tests // main -> 'package foo' | test -> 'package bar'")
class ClassicBlackBoxTests {

  @Test
  void accessPublicFoo() {
    Assertions.assertEquals("foo", PublicFoo.class.getPackageName());
  }

  // @Test
  // void accessPackageFoo() {
  // Assertions.assertEquals("foo", foo.PackageFoo.class.getPackageName());
  // }
}
