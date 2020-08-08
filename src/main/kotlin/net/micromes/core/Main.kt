package net.micromes.core

import org.http4k.core.Method.*
import org.http4k.routing.bind
import org.http4k.routing.routes
import org.http4k.server.Jetty
import org.http4k.server.asServer

fun main() {
    routes(
        "_matrix/client/r0" bind routes(
            GET at "/versions" respondWith("{[\"r0.0.0\"]}"),
            GET at "/capabilities" to dummyHandler,
            GET at "/sync" to dummyHandler,
            "/rooms/{roomId}" bind routes(
                GET at "/event/{eventId}" to dummyHandler,
                GET at "/state" to dummyHandler,
                GET at "/state/{eventType}/{stateKey}" to dummyHandler,
                GET at "/state" to dummyHandler,
                GET at "/members" to dummyHandler,
                GET at "/joined_members" to dummyHandler,
                GET at "/messages" to dummyHandler
            )
        )
    ).asServer(Jetty(9009)).start()
}