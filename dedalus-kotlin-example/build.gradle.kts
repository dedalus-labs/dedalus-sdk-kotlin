plugins {
    id("dedalus.kotlin")
    application
}

dependencies {
    implementation(project(":dedalus-kotlin-core"))
    implementation(project(":dedalus-kotlin-client-okhttp"))
}

application {
    // Use `./gradlew :dedalus-kotlin-example:run` to run `Main`
    // Use `./gradlew :dedalus-kotlin-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.dedalus_sdk.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}
