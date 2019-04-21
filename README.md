# gradle-annotation-processing-8996
Minimal example project for Gradle issue #8996

https://github.com/gradle/gradle/issues/8996

The source in the main source set invokes an annotation processor. The processor throws an exception with an incomplete stack trace. In this case it is obvious where in the processor code the exception is coming from, but in a more complex processor the full stack trace is needed for diagnosing the cause.
