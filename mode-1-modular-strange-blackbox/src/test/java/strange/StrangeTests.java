package strange;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Mode 1 - Modular Strange Blackbox // main=classic test=module")
class StrangeTests {

  @Test
  void modular() {
    var module = getClass().getModule();
    Assertions.assertTrue(module.isNamed());
    Assertions.assertEquals("strange", module.getName());
  }
}
