# sawdust [![build status](https://travis-ci.org/micromata/sawdust.svg?branch=master)](https://travis-ci.org/micromata/sawdust)
Collection of build tools and IDEs tackling Java 9 module system and JUnit 5 tests.

## Command Line Tool

### JDK [JShell] (9 or higher) with [Bach]

See [build.jsh](./build.jsh) and files in [bach/](./bach) directory.

### Apache Ant (1.9.7 or higher)

See [build.xml](./build.xml) for details.

### Gradle

**TODO** https://github.com/micromata/sawdust/issues/2

### [Maven]

See [pom.xml](./pom.xml) and similar files in `modules` directory.

**TODO**: enable [white-box](https://github.com/micromata/sawdust/issues/7) testing and cleanup dependency configuration

## IDE

### IntelliJ IDEA

See [sawdust.iml](sawdust.iml) and (.idea)[./.idea] directory.

### Eclipse

**TODO** https://github.com/micromata/sawdust/issues/4

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
[Maven]: https://maven.apache.org
