
# Dependancies

* [vavr](https://www.vavr.io/)
* [List](https://docs.vavr.io/#_list)
* [Option](https://docs.vavr.io/#_option)
* [Tuple](https://docs.vavr.io/#_tuples)

# How to run

We're a scala shop so this is how we will run the code
This is not mandatory for the test, you can use maven / graddle / other...

* git clone
* install [sbt](https://www.scala-sbt.org/)
* run this command

```
cd /some_path/java-interview
sbt clean update compile
sbt test
```

# Result of tests - 2024/08/15

After running the command above, my computer returned positive result.
```shell
WARNING: A terminally deprecated method in java.lang.System has been called
WARNING: System::setSecurityManager has been called by sbt.TrapExit$ (file:/home/agl/.sbt/boot/scala-2.12.14/org.scala-sbt/sbt/1.5.5/run_2.12-1.5.5.jar)
WARNING: Please consider reporting this to the maintainers of sbt.TrapExit$
WARNING: System::setSecurityManager will be removed in a future release
[info] welcome to sbt 1.5.5 (Arch Linux Java 17.0.12)
[info] loading project definition from /home/agl/java-interview/project
[info] loading settings for project root from build.sbt ...
[info] set current project to java-interview (in build file:/home/agl/java-interview/)
[info] BasicTestSpec:
[info] The Basic test
[info] - should compute power
[info] CollectionTestSpec:
[info] The Collection test
[info] - should compute some value for first method
[info] The Collection test
[info] - should compute some value for second method
[info] AsyncTestSpec:
[info] The Async test
[info] - should compute ceo and enterprise
[info] Run completed in 251 milliseconds.
[info] Total number of tests run: 4
[info] Suites: completed 3, aborted 0
[info] Tests: succeeded 4, failed 0, canceled 0, ignored 0, pending 0
[info] All tests passed.
[success] Total time: 1 s, completed Aug 15, 2024, 3:23:51 PM
```
