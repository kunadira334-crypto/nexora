# Feature Implementation Matrix

Legend: `PLANNED` = documented only; `SCAFFOLD` = module boundary exists; `IMPLEMENTED` = code exists; `TESTED` = verified by tests and device evidence; `LIMITED` = capability varies by Android/OEM.

| Feature | Initial status | Notes |
|---|---|---|
| App shell | SCAFFOLD | Compose entry point |
| Dark theme | IMPLEMENTED | Initial palette |
| Device metadata | IMPLEMENTED | Public Build APIs |
| Dashboard | SCAFFOLD | Initial overview |
| Standard provider | PLANNED | Public SDK APIs |
| ADB provider | PLANNED | Authorized bridge required |
| Shizuku provider | PLANNED | Official API integration required |
| App Manager | PLANNED | Package visibility and operation limits |
| Permission Manager | PLANNED | Android/OEM capability-dependent |
| Terminal | PLANNED | Risk-controlled execution |
| System Tweaks | PLANNED | Per-setting compatibility |
| Monitoring | PLANNED | Metrics vary by API/access |
| Plugin Center | PLANNED | Secure declarative model first |
| Automation | PLANNED | WorkManager/platform limits |
| Security Center | PLANNED | Audit and policy engine |

Update this matrix only when implementation and evidence justify a status change.
