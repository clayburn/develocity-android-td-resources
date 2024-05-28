pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

plugins {
    id("com.gradle.develocity") version "3.17.4"
    id("com.gradle.common-custom-user-data-gradle-plugin") version "2.0.1"
}

rootProject.name = "My Application"
include(":app")

develocity {
    server = "https://ge.solutions-team.gradle.com"
    buildScan {
        publishing.onlyIf { it.isAuthenticated }
    }
}
 