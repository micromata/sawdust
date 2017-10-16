package sawdust.alpha;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("[sawdust.alpha] AlphaPublicTests")
class AlphaPublicTests {
  @Test
  void simpleNameIsAlphaPublic() {
    assertEquals("AlphaPublic", AlphaPublic.class.getSimpleName());
  }
}
