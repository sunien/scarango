package com.outr.arango.api.model

import io.circe.Json

/**
  * GetAPIDatabaseNew
  *
  * @param name Has to contain a valid database name.
  * @param users *** No description ***
  *
  * WARNING: This code is generated by youi-plugin's generateHttpClient. Do not modify directly.
  */
case class GetAPIDatabaseNew(name: String,
                             users: Option[GetAPIDatabaseNewUSERS] = None)