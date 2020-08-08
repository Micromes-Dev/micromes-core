package net.micromes.core.responses.sync

import net.micromes.makocommons.mevents.MatrixEvent

data class Ephemeral(
    val events: Array<MatrixEvent>
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Ephemeral

        if (!events.contentEquals(other.events)) return false

        return true
    }

    override fun hashCode(): Int {
        return events.contentHashCode()
    }
}
