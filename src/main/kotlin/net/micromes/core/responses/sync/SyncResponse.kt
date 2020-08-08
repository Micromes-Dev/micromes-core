package net.micromes.core.responses.sync

import com.fasterxml.jackson.annotation.JsonProperty
import net.micromes.core.responses.MatrixResponse

data class SyncResponse(
    @JsonProperty("next_batch")
    val nextBatch: String,
    val rooms: Rooms,
    val presence: Presence,
    @JsonProperty("account_data")
    val accountData: AccountData,
    @JsonProperty("to_device")
    val toDevice: ToDevice,
    @JsonProperty("device_list")
    val deviceList: DeviceList,
    @JsonProperty("device_one_time_keys_count")
    val oneTimeKeysCount: OneTimeKeysCount
) : MatrixResponse