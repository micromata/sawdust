import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

class Build {

  public static void main(String... args) throws Exception {
    Bach.Default.VERBOSE = true;
    new Build().build();
  }

  Path DEPS = Paths.get("deps");
  Path MAIN = Paths.get("target", "bach", "main");
  Path TEST = Paths.get("target", "bach", "test");

  Path moduleAlphaMain = Paths.get("modules/sawdust.alpha/src/main/java");
  Path moduleAlphaTest = Paths.get("modules/sawdust.alpha/src/test/java");
  Path moduleUserViewTest = Paths.get("modules/user.view/src/test/java");

  void build() throws Exception {
    System.out.println("\n build \n");
    Bach.Basics.treeDelete(Paths.get("target", "bach"));
    compileMain();
    run();
    compileTest();
    test();
  }

  void compileMain() {
    System.out.println("\n compile main modules \n");
    Bach.JdkTool.Javac javac = new Bach.JdkTool.Javac();
    javac.destination = MAIN;
    javac.modulePath = List.of(DEPS);
    javac.moduleSourcePath = List.of(moduleAlphaMain);
    javac.run();
  }

  void run() {
    System.out.println("\n run main \n");
    Bach.JdkTool.Java java = new Bach.JdkTool.Java();
    java.modulePath = List.of(MAIN, DEPS);
    java.module = "sawdust.alpha/sawdust.alpha.AlphaMain";
    java.run();
  }

  void compileTest() {
    System.out.println("\n compile test modules \n");
    Bach.JdkTool.Javac javac = new Bach.JdkTool.Javac();
    javac.destination = TEST;
    javac.modulePath = List.of(DEPS);
    javac.moduleSourcePath = List.of(moduleAlphaTest, moduleUserViewTest);
    javac.patchModule = Bach.Basics.getPatchMap(javac.moduleSourcePath, List.of(moduleAlphaMain));
    javac.run();
  }

  void test() {
    System.out.println("\n launch junit platform console \n");
    Bach.JdkTool.Java java = new Bach.JdkTool.Java();
    java.modulePath = List.of(TEST, DEPS);
    java.addModules = List.of("ALL-MODULE-PATH");
    java.module = "org.junit.platform.console";
    java.args = List.of("--scan-module-path");
    java.run();
  }
}
