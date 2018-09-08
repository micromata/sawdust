package mode1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Mode 1 - Modular Slanted Blackbox // main=classic test=module")
class Mode1Tests {

  @Test
  void modular() {
    var module = getClass().getModule();
    Assertions.assertTrue(module.isNamed());
    Assertions.assertEquals("mode1.modular.slanted.blackbox", module.getName());
  }
}
