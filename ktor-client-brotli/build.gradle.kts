plugins {
    alias(libs.plugins.jetbrainsKotlinJvm)
}

sourceSets.all {
    java.srcDir("src/$name/kotlin")
}

dependencies {
    implementation(libs.ktor.client.encoding)
    implementation(libs.brotli)
}