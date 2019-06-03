package com.outr.arango.api

/**
  * KeyGeneratorType
  *
  * @param allowUserKeys if set to *true*, then it is allowed to supply
  *        own key values in the *_key* attribute of a document. If set to
  *        *false*, then the key generator is solely responsible for
  *        generating keys and supplying own key values in the *_key* attribute
  *        of documents is considered an error.
  * @param lastValue *** No description ***
  * @param type specifies the type of the key generator. The currently
  *        available generators are *traditional*, *autoincrement*, *uuid*
  *        and *padded*.
  *
  * WARNING: This code is generated by youi-plugin's generateHttpClient. Do not modify directly.
  */
case class KeyGeneratorType(allowUserKeys: Option[Boolean] = None,
                            lastValue: Option[Int] = None,
                            `type`: Option[String] = None)