package com.nexora.privilege

import com.nexora.common.OperationResult
import com.nexora.model.AccessMode
import com.nexora.model.Capability

/**
 * Provider contract. Implementations must never imply elevated access they do not possess.
 */
interface AccessProvider {
    val mode: AccessMode
    suspend fun checkAvailability(): Capability
    suspend fun executeReadOnly(command: String): OperationResult<String>
}
