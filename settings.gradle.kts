pluginManagement {
    repositories {
        google()
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

rootProject.name = "NEXORA"
include(
    ":app",
    ":core:common",
    ":core:model",
    ":core:designsystem",
    ":core:device",
    ":core:privilege",
    ":core:security",
    ":core:logging",
    ":core:terminal",
    ":core:testing",
    ":core:ui",
    ":core:database",
    ":core:datastore",
    ":access:standard",
    ":access:adb",
    ":access:shizuku",
    ":data:device",
    ":data:applications",
    ":data:permissions",
    ":data:monitoring",
    ":data:settings",
    ":data:plugins",
    ":domain:device",
    ":domain:applications",
    ":domain:permissions",
    ":domain:system",
    ":domain:monitoring",
    ":feature:onboarding",
    ":feature:dashboard",
    ":feature:deviceinfo",
    ":feature:appmanager",
    ":feature:permissions",
    ":feature:terminal",
    ":feature:systemtweaks",
    ":feature:monitoring",
    ":feature:performance",
    ":feature:plugins",
    ":feature:automation",
    ":feature:securitycenter",
    ":feature:backup",
    ":feature:settings",
    ":feature:about"
)
