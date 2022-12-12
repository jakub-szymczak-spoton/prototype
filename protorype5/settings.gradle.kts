pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "protorype5"
include(":androidApp")
include(":shared")
include(":AccountDomain")
include(":AccountDomainv2")
