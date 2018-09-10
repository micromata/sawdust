package foo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classic White Box Tests // main -> 'package foo' | test -> 'package foo'")
class ClassicWhiteBoxTests {
  @Test
  void accessPackageFoo() {
    Assertions.assertEquals("foo", PackageFoo.class.getPackageName());
  }

  @Test
  void accessPublicFoo() {
    Assertions.assertEquals("foo", PublicFoo.class.getPackageName());
  }
}
