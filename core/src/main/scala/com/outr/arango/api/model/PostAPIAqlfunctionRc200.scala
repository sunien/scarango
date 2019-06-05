package com.outr.arango.api.model

import io.circe.Json

/**
  * PostAPIAqlfunctionRc200
  *
  * @param error boolean flag to indicate whether an error occurred (*false* in this case)
  * @param code the HTTP status code
  * @param isNewlyCreated boolean flag to indicate whether the function was newly created (*false* in this case)
  *
  * WARNING: This code is generated by youi-plugin's generateHttpClient. Do not modify directly.
  */
case class PostAPIAqlfunctionRc200(error: Boolean,
                                   code: Option[Long] = None,
                                   isNewlyCreated: Option[Boolean] = None)