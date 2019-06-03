package com.outr.arango.api

/**
  * PostAPIGharialCreateOpts
  *
  * @param numberOfShards The number of shards that is used for every collection within this graph.
  *        Cannot be modified later.
  * @param replicationFactor The replication factor used when initially creating collections for this graph.
  * @param smartGraphAttribute Only has effect in Enterprise Edition and it is required if isSmart is true.
  *        The attribute name that is used to smartly shard the vertices of a graph.
  *        Every vertex in this SmartGraph has to have this attribute.
  *        Cannot be modified later.
  *
  * WARNING: This code is generated by youi-plugin's generateHttpClient. Do not modify directly.
  */
case class PostAPIGharialCreateOpts(numberOfShards: Option[Int] = None,
                                    replicationFactor: Option[Int] = None,
                                    smartGraphAttribute: Option[String] = None)