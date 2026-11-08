# Local Data Design

Planned Room entities:
- `AppInfoEntity`: cached package metadata; cache only fields permitted by package visibility.
- `CommandHistoryEntity`: command label, timestamp, sanitized output summary, provider mode.
- `FavoriteCommandEntity`: user-authored command templates; never store secrets.
- `OperationLogEntity`: operation ID, type, provider, result code, timestamp, sanitized details.
- `DeviceSnapshotEntity`: coarse device snapshots; avoid persistent hardware identifiers.
- `MonitoringSampleEntity`: metric, value, unit, timestamp, sampling source.
- `TweakProfileEntity`: named user profile with validated setting keys.
- `TweakBackupEntity`: prior values for supported settings.
- `PluginRecordEntity`: plugin metadata, trust state, requested capabilities.
- `AutomationRuleEntity`: user-defined rule and execution policy.
- `SecurityEventEntity`: policy events and denied operations.

Use explicit Room migrations. Define retention and deletion controls for history. Avoid collecting device identifiers unless a documented feature requires them.
