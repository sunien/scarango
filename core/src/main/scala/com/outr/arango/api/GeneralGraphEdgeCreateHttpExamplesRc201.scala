package com.outr.arango.api

/**
  * GeneralGraphEdgeCreateHttpExamplesRc201
  *
  * @param error Flag if there was an error (true) or not (false).
  *        It is false in this response.
  * @param code The response code.
  * @param edge *** No description ***
  * @param new *** No description ***
  *
  * WARNING: This code is generated by youi-plugin's generateHttpClient. Do not modify directly.
  */
case class GeneralGraphEdgeCreateHttpExamplesRc201(error: Boolean,
                                                   code: Option[Int] = None,
                                                   edge: Option[EdgeRepresentation] = None,
                                                   `new`: Option[EdgeRepresentation] = None)