package com.outr.arango.api

/**
  * GeneralGraphVertexDeleteHttpExamplesRc202
  *
  * @param error Flag if there was an error (true) or not (false).
  *        It is false in this response.
  * @param code The response code.
  * @param old *** No description ***
  * @param removed Is set to true if the remove was successful.
  *
  * WARNING: This code is generated by youi-plugin's generateHttpClient. Do not modify directly.
  */
case class GeneralGraphVertexDeleteHttpExamplesRc202(error: Boolean,
                                                     code: Option[Int] = None,
                                                     old: Option[VertexRepresentation] = None,
                                                     removed: Option[Boolean] = None)