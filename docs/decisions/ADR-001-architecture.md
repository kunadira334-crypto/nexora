# ADR-001: Modular Clean Architecture

Status: Accepted

Decision: Use feature-oriented Gradle modules with presentation, domain, data, and access boundaries.

Reason: Keeps provider-specific Android privileges out of UI and business rules, enables independent testing, and supports incremental delivery.
