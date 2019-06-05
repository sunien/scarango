package com.outr.arango.api.model

import io.circe.Json

/**
  * PutAPISimpleWithinRectangle
  *
  * @param collection The name of the collection to query.
  * @param geo If given, the identifier of the geo-index to use. (optional)
  * @param latitude1 The latitude of the first rectangle coordinate.
  * @param latitude2 The latitude of the second rectangle coordinate.
  * @param limit The maximal amount of documents to return. The *skip* is
  *        applied before the *limit* restriction. The default is 100. (optional)
  * @param longitude1 The longitude of the first rectangle coordinate.
  * @param longitude2 The longitude of the second rectangle coordinate.
  * @param skip The number of documents to skip in the query. (optional)
  *
  * WARNING: This code is generated by youi-plugin's generateHttpClient. Do not modify directly.
  */
case class PutAPISimpleWithinRectangle(collection: String,
                                       geo: Option[String] = None,
                                       latitude1: Option[String] = None,
                                       latitude2: Option[String] = None,
                                       limit: Option[String] = None,
                                       longitude1: Option[String] = None,
                                       longitude2: Option[String] = None,
                                       skip: Option[String] = None)