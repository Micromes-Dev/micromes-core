package net.micromes.core.responses.sync

import net.micromes.makocommons.mevents.roomstate.MatrixStateEvent

data class State(
    val events: Array<MatrixStateEvent>
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as State

        if (!events.contentEquals(other.events)) return false

        return true
    }

    override fun hashCode(): Int {
        return events.contentHashCode()
    }
}