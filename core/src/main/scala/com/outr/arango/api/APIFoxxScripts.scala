package com.outr.arango.api

import com.outr.arango.api.model._
import io.youi.client.HttpClient
import io.youi.http.HttpMethod
import io.youi.net._
import io.circe.Json
import scala.concurrent.Future
import scribe.Execution.global
      
class APIFoxxScripts(client: HttpClient) {
  /**
  * Fetches a list of the scripts defined by the service.
  * 
  * Returns an object mapping the raw script names to human-friendly names.
  */
  def get(mount: String): Future[ArangoResponse] = client
    .method(HttpMethod.Get)
    .path(path"/_db/_system/_api/foxx/scripts".withArguments(Map()))
    .params("mount" -> mount.toString)
    .call[ArangoResponse]
}