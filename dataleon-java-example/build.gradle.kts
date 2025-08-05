plugins {
    id("dataleon.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":dataleon-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :dataleon-java-example:run` to run `Main`
    // Use `./gradlew :dataleon-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.dataleon.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
