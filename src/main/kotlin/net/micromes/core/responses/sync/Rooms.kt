package net.micromes.core.responses.sync

import com.fasterxml.jackson.annotation.JsonProperty

data class Rooms(
    // Mapped to room id
    val join: Map<String, JoinedRoom>,
    val invite: Map<String, InvitedRoom>,
    val leave: Map<String, LeftRoom>
) {
    data class JoinedRoom(
        val summery: RoomSummery,
        val state: State,
        val timeline: Timeline,
        val ephemeral: Ephemeral,
        @JsonProperty("account_data")
        val accountData: AccountData,
        @JsonProperty("unread_notifications")
        val unreadNotifications: UnreadNotificationCounts
    )
    data class InvitedRoom(
        @JsonProperty("invite_state")
        val inviteState: InviteState
    )
    data class LeftRoom(
        val state: State,
        val timeline: Timeline,
        @JsonProperty("account_data")
        val accountData: AccountData
    )
}