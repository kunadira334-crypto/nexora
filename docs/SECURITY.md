# Security Policy

## Threat model

NEXORA may interact with device-management APIs and user-authorized shell identities. Treat command input, plugin metadata, imported profiles, and device output as untrusted.

## Mandatory controls

- Least privilege and explicit access checks.
- No root requirement.
- No arbitrary shell execution from composables.
- Command allowlist for built-in actions.
- Risk classification based on parsed command and arguments, not substring matching alone.
- Explicit confirmation for sensitive operations.
- Deny destructive or out-of-scope operations by default.
- Timeouts, cancellation, and output-size limits.
- Redact tokens, identifiers, and sensitive command arguments from logs.
- Never store credentials in source control or plaintext preferences.
- Verify postconditions after state-changing operations.
- Plugin signature/trust and capability checks before activation.

## Command engine

The terminal must distinguish interactive user terminal behavior from built-in application actions. Built-in actions should use typed operations wherever possible instead of assembling shell strings. If shell is necessary, use strict argument construction, validated targets, bounded execution, and explicit policy checks.

## Plugin policy

Initial plugin system should be declarative and capability-limited. Do not load arbitrary executable code by default. A plugin must declare identity, version, signature, compatibility, and requested capabilities.

## Incident reporting

Do not include personal data, serial numbers, account identifiers, or secrets in public bug reports. Report security vulnerabilities privately to the maintainers.
