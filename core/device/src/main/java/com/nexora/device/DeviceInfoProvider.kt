package com.nexora.device

import android.os.Build

class DeviceInfoProvider {
    fun getSnapshot(): DeviceSnapshot = DeviceSnapshot(
        manufacturer = Build.MANUFACTURER.orEmpty(),
        model = Build.MODEL.orEmpty(),
        androidRelease = Build.VERSION.RELEASE.orEmpty(),
        sdkInt = Build.VERSION.SDK_INT,
        supportedAbis = Build.SUPPORTED_ABIS.toList()
    )
}
