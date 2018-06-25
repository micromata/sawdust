package user.view;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import sawdust.alpha.AlphaPublic;

@DisplayName("[user.view] UserViewTests")
class UserViewTests {
  @Test
  void accessExportedTypes() {
    assertEquals("AlphaPublic", AlphaPublic.class.getSimpleName());
  }

  @Test
  @EnabledIfSystemProperty(named = "modular.tests", matches = "true")
  void modular() {
    var module = UserViewTests.class.getModule();
    assertEquals("user.view", module.getName());
    assertFalse(module.getDescriptor().isAutomatic());
    assertTrue(module.getDescriptor().isOpen());
  }
}
