package sawdust.alpha;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("[sawdust.alpha] AlphaProtectedTests")
class AlphaProtectedTests {
  @Test
  void simpleNameIsAlphaProtected() {
    assertEquals("AlphaProtected", AlphaProtected.class.getSimpleName());
  }
}
