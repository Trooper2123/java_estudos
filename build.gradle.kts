import org.codehaus.groovy.tools.shell.util.Logger.io

plugins {
    id("org.springframework.boot") version "2.7.6"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.6.21" // Ajusta la versión de Kotlin si es necesario
    kotlin("plugin.spring") version "1.6.21" // También incluye el plugin para Spring
}

group = "com.tere"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.projectlombok:lombok:1.18.20")
    implementation("org.springframework.boot:spring-boot-starter")
    implementation ("org.hibernate.validator:hibernate-validatorÇ8.0.2.Final")

    runtimeOnly("org.springframework.boot:spring-boot-devtools")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.apache.httpcomponents:httpclient:4.5.13")

}

tasks.test {
    useJUnitPlatform()
}