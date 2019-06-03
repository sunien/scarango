package com.outr.arango.api

/**
  * RestLookupByKeys
  *
  * @param collection The name of the collection to look in for the documents
  * @param keys array with the _keys of documents to remove.
  *
  * WARNING: This code is generated by youi-plugin's generateHttpClient. Do not modify directly.
  */
case class RestLookupByKeys(collection: String,
                            keys: Option[List[String]] = None)