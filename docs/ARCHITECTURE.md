# Architecture and Module Boundaries

## Dependency direction

`app` composes feature modules and shared infrastructure.

`feature:*` depends on domain contracts and shared UI/design-system modules. A feature must not execute shell commands directly.

`domain:*` contains business rules, use cases, models, and repository interfaces. Domain modules must not depend on Android UI or Shizuku implementation details.

`data:*` implements repository contracts and coordinates Android APIs, storage, and access providers.

`access:*` contains provider-specific code for Standard, ADB, and Shizuku.

`core:privilege` selects and validates provider capabilities. It must not silently fall back to a more privileged provider without policy and user awareness.

## MVVM and state

- UI renders immutable UI state.
- User actions are sent to a ViewModel or state holder.
- ViewModel invokes use cases.
- Use cases invoke repository interfaces.
- Repositories select data sources/providers.
- Results are mapped into explicit UI states.

Use StateFlow for observable state and coroutines for asynchronous work. Keep long-running work cancellable and lifecycle-aware.

## Operation contract

Use `OperationResult<T>`:
- Success(data)
- Failure(code, message)
- Unsupported(reason)
- PermissionRequired

Add typed error codes as modules mature. Avoid swallowing exceptions.

## Access provider contract

Provider implementations report their access mode and availability. Each operation must verify its required capability immediately before execution. Provider selection is centralized.

## Modularity rules

- No circular dependencies.
- No UI dependency in domain.
- No direct provider dependency in feature UI.
- Shared code belongs in `core:*` only when used by multiple modules.
- Avoid creating abstractions without a real use case.
- Every module owns its tests.
