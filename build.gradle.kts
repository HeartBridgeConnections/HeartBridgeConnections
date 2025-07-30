// Top-level build.gradle.kts

// No need for buildscript block with plugins {} in settings.gradle.kts

plugins {
    // These plugins are managed by settings.gradle.kts, so this section can be empty or removed.
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
