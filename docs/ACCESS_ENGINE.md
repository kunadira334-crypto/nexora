# Hybrid Access Engine

## Provider roles

| Provider | Role | Example capability family |
|---|---|---|
| Standard | Public Android APIs | Device info, user-mediated app settings |
| ADB | Authorized shell identity | Selected shell operations, diagnostics |
| Shizuku | Binder service under Shizuku server identity | Selected privileged Android APIs |

## Provider selection

1. Resolve requested operation's required capability.
2. Inspect available providers.
3. Check permission, binder/bridge liveness, API level, and OEM limitations.
4. Select only a provider that satisfies the capability.
5. Ask for permission or explain why unavailable.
6. Execute with timeout and cancellation.
7. Verify the postcondition.
8. Write a sanitized audit event.

## Important distinctions

- Wireless debugging enabled does not itself grant an app an ADB shell.
- Shizuku is not root. Its server identity determines privileges.
- Standard APIs remain the fallback for supported tasks.
- Never silently elevate or switch access modes for sensitive operations.
- Keep provider-specific code behind interfaces.
