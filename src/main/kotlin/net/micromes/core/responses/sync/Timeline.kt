package net.micromes.core.responses.sync

import com.fasterxml.jackson.annotation.JsonProperty
import net.micromes.makocommons.mevents.MatrixRoomEvent

data class Timeline(
    val events: Array<MatrixRoomEvent>,
    val limited: Boolean,
    @JsonProperty("prev_batch")
    val previousBatch: String
)
