plugins {
    java
}

repositories {
    jcenter()
}

dependencies {
    testImplementation("junit:junit:4.13.2")
}

tasks.test {
    useJUnit {
        // Configure XML output for test results
        testLogging {
            events("passed", "skipped", "failed")
            outputs.upToDateWhen { false }
            showStandardStreams = true
            exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
            debug {
                // XML output location for test results
                destinationFile = file("${buildDir}/test-results/test-results.xml")
            }
        }
    }
}
