package net.micromes.core.responses.sync

import com.fasterxml.jackson.annotation.JsonProperty

data class UnreadNotificationCounts(
    @JsonProperty("notification_count")
    val notificationCount: Int,
    @JsonProperty("highlight_count")
    val highlightCount: Int
)
