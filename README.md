# sawdust [![build status](https://travis-ci.org/micromata/sawdust.svg?branch=master)](https://travis-ci.org/micromata/sawdust)

_rebooting..._

## useful `mvn` commands

Show which Java module names you need to include in your `module-info.java ` files via:

`mvn compile org.apache.maven.plugins:maven-dependency-plugin:3.1.1:resolve -DexcludeTransitive`

[Robert Scholte](https://twitter.com/rfscholte/status/1005934505784500229) _The 'compile' is only required in case of a multi-module project. You can use 'package' if you also want to know the (automatic module) name of every created jar. With colors!_
