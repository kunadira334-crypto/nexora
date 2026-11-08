# Roadmap

Each phase is gated. A phase is not complete until its acceptance criteria pass.

| Phase | Scope | Exit criteria |
|---|---|---|
| 0 | Project foundation | Gradle sync, debug build, module graph, CI |
| 1 | Design system | Theme, reusable components, navigation |
| 2 | Device engine | Real device metadata and graceful unavailable states |
| 3 | Privilege engine | Standard/ADB/Shizuku discovery and capability checks |
| 4 | Monitoring | Real metrics, sampling policy, battery-aware behavior |
| 5 | App Manager | Package inventory and verified permitted operations |
| 6 | Permission Manager | Permission inspection and supported changes |
| 7 | Terminal | Authorized execution, output streaming, cancellation, risk controls |
| 8 | System Tweaks | Compatibility matrix, backups, verified restore where possible |
| 9 | Performance | Evidence-based diagnostics and recommendations |
| 10 | Plugin Center | Signed/trusted manifest, capability allowlist, isolation strategy |
| 11 | Automation | Android-compliant scheduling and user controls |
| 12 | Security Center | Auditing, event history, security reports |
| 13 | Integration/release | Regression, device matrix, release build, documentation |

## Initial sprint

1. Open project in Android Studio.
2. Sync Gradle.
3. Build and run the starter dashboard.
4. Verify device metadata on at least one emulator and one physical device.
5. Add CI build/test/lint.
6. Implement navigation and app-wide state.
7. Implement capability registry before privileged operations.

## Device test matrix

Record device model, Android version/API, OEM build, access mode, operation, expected result, actual result, and logs. Do not generalize one device's result to all devices.
