# ADR-004: Safe Operations

Status: Accepted

Decision: All device-changing operations must pass capability checks, risk policy, user confirmation where required, and postcondition verification.

Reason: A successful process exit does not necessarily mean the intended device state changed.
