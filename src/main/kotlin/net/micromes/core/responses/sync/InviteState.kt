package net.micromes.core.responses.sync

import net.micromes.makocommons.mevents.EventContent

data class InviteState(
    val events: Array<EventContent>
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as InviteState

        if (!events.contentEquals(other.events)) return false

        return true
    }

    override fun hashCode(): Int {
        return events.contentHashCode()
    }
}
