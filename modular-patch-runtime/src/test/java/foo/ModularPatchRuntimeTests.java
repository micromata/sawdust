package foo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Modular Patch Runtime Tests // main -> 'module foo' | test -> _no module_")
class ModularPatchRuntimeTests {
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
