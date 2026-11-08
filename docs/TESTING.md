# Testing Strategy

## Unit tests
- Use cases and domain policies
- Capability resolution
- Command parser and risk classifier
- Output parsing
- Data mapping

## Integration tests
- Repository/provider interaction
- Room persistence and migrations
- Shizuku binder lifecycle (instrumented/device tests)
- Authorized bridge lifecycle

## UI tests
- Dashboard rendering
- Navigation
- Permission-required and unavailable states
- Confirmation dialogs
- Accessibility semantics

## Device verification record
For each test record:
- Device model and manufacturer
- Android release and API level
- OEM build
- Access mode and permission state
- Feature and operation
- Expected and actual result
- Exit status or platform result
- Sanitized logs
