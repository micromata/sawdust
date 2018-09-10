package bar;

import foo.PublicFoo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Mode 4 - Modular Blackbox // main -> 'module foo' test -> 'module bar'")
class BarTests {

  @Test
  void modular() {
    var module = getClass().getModule();
    Assertions.assertTrue(module.isNamed());
    Assertions.assertEquals("bar", module.getName());
  }

  @Test
  void accessPublicFoo() {
    Assertions.assertEquals("foo", PublicFoo.class.getPackageName());
  }
}
