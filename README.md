# sawdust [![build status](https://travis-ci.org/micromata/sawdust.svg?branch=master)](https://travis-ci.org/micromata/sawdust)
Collection of build tools and IDEs tackling Java 9 module system and JUnit 5 tests.

## Command Line Tool

Overview

| Tool        | compile | white-box testing | black-box testing |
|-------------|:-------:|------------------:|-------------------|
| JShell/Bach |    ✓    |         ✓         |         ✓         |
| Ant         |    ✓    |         ✓         |         ✓         |
| Gradle      |    ✓    |         ✓         |         ✓         |
| Maven       |    ✓    |         ❌         |         ✓         |

### JDK [JShell] 9 with [Bach]

See [build.jsh](./build.jsh) and files in [bach](./bach) directory, especially [Build.java](./bach/Build.java).

### Apache [Ant] 1.9.7

See [build.xml](./build.xml) for details.

### [Gradle] 4.2.1

See [build.gradle](./build.gradle) and [settings.gradle](./settings.gradle) for details.

Other resources coping with Gradle + Java 9 and testing
- https://guides.gradle.org/building-java-9-modules
- https://blog.gradle.org/java-9-support-update

### Apache [Maven] 3.5.0

See [pom.xml](./pom.xml) and similar files in `modules` directory.

**TODO**: Enable [white-box](https://github.com/micromata/sawdust/issues/7) testing and cleanup dependency configuration.

## IDE

### IntelliJ IDEA 2017.3 EAP

See [sawdust.iml](sawdust.iml) and [.idea](./.idea) directory.

### Eclipse Oxygen.1a (4.7.1a)

See various `.project`, `.classpath` and `.settings` files.

**TODO** Enable [testing](https://github.com/micromata/sawdust/issues/4) with JUnit 5 at all

### Netbeans

**TODO** https://github.com/micromata/sawdust/issues/5

## Dependencies

For the sake of clarity all dependencies are stored in the `deps/` directory.

- SLF4J 1.8.0-alpha2
- JUnit Platform 1.1.0-SNAPSHOT
- JUnit Jupiter 5.1.0-SNAPSHOT
- ApiGuardian 1.0.0
- OpenTest4J 1.0.0

[Bach]: https://github.com/sormuras/bach
[JShell]: https://docs.oracle.com/javase/9/jshell/introduction-jshell.htm#JSHEL-GUID-630F27C8-1195-4989-9F6B-2C51D46F52C8
[Ant]: https://ant.apache.org
[Gradle]: https://gradle.org
[Maven]: https://maven.apache.org
