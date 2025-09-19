plugins {
    application
    id("java")
}

group = "edu.nd.paradigms.hw2"

application {
    mainClass.set("edu.nd.paradigms.hw2.PlayWordle")
}

tasks.jar {
    manifest {
        attributes(mapOf("Main-Class" to "edu.nd.paradigms.hw2.PlayWorld"))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}