//usr/bin/env jshell --show-version --execution local "$0" "$@"; exit $?

/*
 * Download "Bach.java" and "Bach.jsh" from github to local "bach" directory.
 */
Path target = Files.createDirectories(Paths.get("bach"))
URL context = new URL("https://raw.githubusercontent.com/sormuras/bach/master/src/bach/")
for (Path script : Set.of(target.resolve("Bach.java"), target.resolve("Bach.jsh"))) {
    // if (Files.exists(script)) continue; // comment to overwrite existing files
    try (InputStream stream = new URL(context, script.getFileName().toString()).openStream()) {
        Files.copy(stream, script, StandardCopyOption.REPLACE_EXISTING);
    }
}

/*
 * Source "Bach.java", "Bach.jsh" and "Build.java" into this jshell session.
 */
/open bach/Bach.java
/open bach/Bach.jsh
/open bach/Build.java

/*
 * Execute.
 */
Build.main()

/exit
