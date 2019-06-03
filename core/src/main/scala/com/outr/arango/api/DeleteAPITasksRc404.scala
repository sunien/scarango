package com.outr.arango.api

/**
  * DeleteAPITasksRc404
  *
  * @param code The status code, 404 in this case.
  * @param error *true* in this case
  * @param errorMessage A plain text message stating what went wrong.
  *
  * WARNING: This code is generated by youi-plugin's generateHttpClient. Do not modify directly.
  */
case class DeleteAPITasksRc404(code: Double,
                               error: Option[Boolean] = None,
                               errorMessage: Option[String] = None)