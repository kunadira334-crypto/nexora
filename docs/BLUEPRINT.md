# NEXORA Master Blueprint

## Product definition

NEXORA is a native Android device-management platform designed around non-root use. Its access modes are Standard, authorized ADB bridge, and Shizuku. Root is not required and is not part of the implementation target.

## Product principles

1. Non-root first.
2. Least privilege.
3. Capability-driven UI.
4. Verified operations.
5. Offline-first local data.
6. Modular feature development.
7. Transparent limitations.
8. Security before convenience.

## Technology baseline

- Kotlin
- Jetpack Compose
- Material 3
- AndroidX Lifecycle
- Kotlin Coroutines and Flow
- Room (planned data layer)
- DataStore (planned preferences)
- Shizuku API (planned provider integration)
- Gradle Kotlin DSL
- JUnit and AndroidX Test

Dependency versions are centralized in `gradle/libs.versions.toml`.

## Main subsystems

- Presentation: Compose screens, navigation, state holders.
- Domain: use cases, entities, repository contracts, policies.
- Data: repository implementations, database, Android APIs.
- Access: Standard, ADB, and Shizuku providers.
- Privilege: provider discovery, capability checks, access policy.
- Security: command risk policy, validation, audit, plugin trust.
- Observability: structured logs and operation results.

## Access strategy

### Standard
Use public Android SDK APIs and user-mediated system flows. Respect runtime permissions, package visibility, background execution limits, and OEM restrictions.

### ADB
Use a separately designed, authorized bridge. Do not assume an ordinary application can invoke `adb shell` merely because Wireless debugging is enabled. Pairing, transport, authentication, lifecycle, and shell identity must be explicitly implemented and tested.

### Shizuku
Integrate the official Shizuku API and bind to its service. Check permission and binder liveness before operations. The server's actual identity and privileges determine what is possible.

## Capability model

Every feature operation must resolve a capability state:
- AVAILABLE
- LIMITED
- UNAVAILABLE
- PERMISSION_REQUIRED

Never present unsupported operations as available. Capability results should include a human-readable reason and the access mode needed, where applicable.

## Feature domains

Dashboard, Device Information, App Manager, Permission Manager, Terminal, System Tweaks, Monitoring, Performance Center, Plugin Center, Automation Center, Security Center, Backup Center, Settings, About.

## Completion definition

A feature is complete only when:
- UI and state handling are implemented.
- Business logic and provider implementation exist.
- Permission and compatibility checks exist.
- Success and failure are verified.
- Unit and relevant integration/UI tests pass.
- Documentation and feature matrix are updated.
- Real-device evidence is recorded.
