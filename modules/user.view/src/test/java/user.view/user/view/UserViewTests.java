package user.view;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sawdust.alpha.AlphaPublic;

@DisplayName("[user.view] UserViewTests")
class UserViewTests {
  @Test
  void accessExportedTypes() {
    assertEquals("AlphaPublic", AlphaPublic.class.getSimpleName());
  }
}
