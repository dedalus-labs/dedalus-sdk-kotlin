plugins {
    `maven-publish`
    signing
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("Dedalus API")
                description.set("MCP gateway for AI agents. Mix-and-match any model with any tool from our\nmarketplace.\n\n## Authentication\n\nUse Bearer token or X-API-Key header authentication:\n\n```\nAuthorization: Bearer your-api-key-here\n```\n\n```\nx-api-key: your-api-key-here\n```\n\n## Available Endpoints\n\n- **GET /v1/models**: list available models\n- **POST /v1/chat/completions**: Chat completions with MCP tools\n- **GET /health**: Service health check")
                url.set("https://docs.dedaluslabs.ai")

                licenses {
                    license {
                        name.set("MIT")
                    }
                }

                developers {
                    developer {
                        name.set("Dedalus")
                        email.set("oss@dedaluslabs.ai")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/dedalus-labs/dedalus-sdk-kotlin.git")
                    developerConnection.set("scm:git:git://github.com/dedalus-labs/dedalus-sdk-kotlin.git")
                    url.set("https://github.com/dedalus-labs/dedalus-sdk-kotlin")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
    repositories {
        if (project.hasProperty("publishLocal")) {
            maven {
                name = "LocalFileSystem"
                url = uri("${rootProject.layout.buildDirectory.get()}/local-maven-repo")
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.named("publish") {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}
