package com.nexora.model

enum class AccessMode { STANDARD, ADB, SHIZUKU }

enum class CapabilityStatus {
    AVAILABLE,
    LIMITED,
    UNAVAILABLE,
    PERMISSION_REQUIRED
}

data class Capability(
    val name: String,
    val status: CapabilityStatus,
    val requiredMode: AccessMode?,
    val reason: String? = null
)
