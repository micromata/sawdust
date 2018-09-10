package foo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Modular White Box Patch Compile Tests // main -> 'module foo' | test -> 'module foo'")
class ModularWhiteBoxPatchCompileTests {
  @Test
  void accessPackageFoo() {
    Assertions.assertEquals("foo", PackageFoo.class.getPackageName());
    Assertions.assertEquals("foo", PackageFoo.class.getModule().getName());
  }

  @Test
  void accessPublicFoo() {
    Assertions.assertEquals("foo", PublicFoo.class.getPackageName());
    Assertions.assertEquals("foo", PublicFoo.class.getModule().getName());
  }
}
