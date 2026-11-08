package com.nexora.common

import org.junit.Assert.assertEquals
import org.junit.Test

class OperationResultTest {
    @Test
    fun successRetainsPayload() {
        val result = OperationResult.Success("ok")
        assertEquals("ok", result.data)
    }
}
