package com.outr.arango.api

/**
  * UserHandlingGrantDatabase
  *
  * @param grant Use "rw" to set the database access level to *Administrate* .
  *        
  *        Use "ro" to set the database access level to *Access*.
  *        
  *        Use "none" to set the database access level to *No access*.
  *
  * WARNING: This code is generated by youi-plugin's generateHttpClient. Do not modify directly.
  */
case class UserHandlingGrantDatabase(grant: String)