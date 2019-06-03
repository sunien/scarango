package com.outr.arango.api

/**
  * UserHandlingReplace
  *
  * @param passwd The user password as a string. Specifying a password is mandatory, but
  *        the empty string is allowed for passwords
  * @param active An optional flag that specifies whether the user is active.  If not
  *        specified, this will default to true
  * @param extra An optional JSON object with arbitrary extra data about the user.
  *
  * WARNING: This code is generated by youi-plugin's generateHttpClient. Do not modify directly.
  */
case class UserHandlingReplace(passwd: String,
                               active: Option[Boolean] = None,
                               extra: Option[io.circe.Json] = None)