package com.outr.arango.api

/**
  * DeleteAPIAqlfunctionRc404
  *
  * @param error boolean flag to indicate whether an error occurred (*true* in this case)
  * @param code the HTTP status code
  * @param errorMessage a descriptive error message
  * @param errorNum the server error number
  *
  * WARNING: This code is generated by youi-plugin's generateHttpClient. Do not modify directly.
  */
case class DeleteAPIAqlfunctionRc404(error: Boolean,
                                     code: Option[Long] = None,
                                     errorMessage: Option[String] = None,
                                     errorNum: Option[Long] = None)