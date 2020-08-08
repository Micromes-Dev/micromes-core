package net.micromes.core

import org.http4k.core.HttpHandler
import org.http4k.core.Method
import org.http4k.core.Response
import org.http4k.core.Status
import org.http4k.routing.PathMethod
import org.http4k.routing.bind

val dummyHandler: HttpHandler = { Response(Status.OK).body("dummy_response") }
infix fun Method.at(route: String) = route bind this
infix fun PathMethod.respondWith(body: String) = this to { Response(Status.OK).body(body) }
