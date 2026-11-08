# ADR-003: Plugin Security

Status: Proposed

Decision: Start with declarative, capability-limited plugins. Do not enable arbitrary dynamic code execution by default.

Reason: Third-party executable code expands the attack surface and can undermine the non-root safety model.
