package com.outr.arango.api

import io.youi.client.HttpClient
          
class ApiReplicationLoggerState(client: HttpClient) {
  val get = new ApiReplicationLoggerStateGet(client)
}