package com.outr.arango.api.model

import io.circe.Json

/**
  * PostAPIIndexSkiplist
  *
  * @param type must be equal to *"skiplist"*.
  * @param deduplicate if *false*, the deduplication of array values is turned off.
  * @param fields an array of attribute paths.
  * @param sparse if *true*, then create a sparse index.
  * @param unique if *true*, then create a unique index.
  *
  * WARNING: This code is generated by youi-plugin's generateHttpClient. Do not modify directly.
  */
case class PostAPIIndexSkiplist(`type`: String,
                                deduplicate: Option[Boolean] = None,
                                fields: Option[List[String]] = None,
                                sparse: Option[Boolean] = None,
                                unique: Option[Boolean] = None)