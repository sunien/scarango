package com.outr.arango.api

import com.outr.arango.api.model._
import io.youi.client.HttpClient
import io.youi.http.HttpMethod
import io.youi.net._
import io.circe.Json
import scala.concurrent.Future
import scribe.Execution.global
      
class APIIndexhash(client: HttpClient) {
  /**
  * **A JSON object with these properties is required:**
  * 
  *   - **fields** (string): an array of attribute paths.
  *   - **unique**: if *true*, then create a unique index.
  *   - **type**: must be equal to *"hash"*.
  *   - **sparse**: if *true*, then create a sparse index.
  *   - **deduplicate**: if *false*, the deduplication of array values is turned off.
  * 
  * 
  * 
  * 
  * **NOTE** Swagger examples won't work due to the anchor.
  * 
  * 
  * Creates a hash index for the collection *collection-name* if it
  * does not already exist. The call expects an object containing the index
  * details.
  * 
  * In a sparse index all documents will be excluded from the index that do not 
  * contain at least one of the specified index attributes (i.e. *fields*) or that 
  * have a value of *null* in any of the specified index attributes. Such documents 
  * will not be indexed, and not be taken into account for uniqueness checks if
  * the *unique* flag is set.
  * 
  * In a non-sparse index, these documents will be indexed (for non-present
  * indexed attributes, a value of *null* will be used) and will be taken into
  * account for uniqueness checks if the *unique* flag is set.
  * 
  * **Note**: unique indexes on non-shard keys are not supported in a cluster.
  * 
  * 
  * 
  * 
  * **Example:**
  *  Creating an unique constraint
  * 
  * <pre><code><span class="hljs-meta">shell&gt;</span><span class="bash"> curl -X POST --header <span class="hljs-string">'accept: application/json'</span> --data-binary @- --dump - http://localhost:8529/_api/index?collection=products</span> &lt;&lt;EOF
  * </code><code>{ 
  * </code><code>  <span class="hljs-string">"type"</span> : <span class="hljs-string">"hash"</span>, 
  * </code><code>  <span class="hljs-string">"unique"</span> : <span class="hljs-literal">true</span>, 
  * </code><code>  <span class="hljs-string">"fields"</span> : [ 
  * </code><code>    <span class="hljs-string">"a"</span>, 
  * </code><code>    <span class="hljs-string">"b"</span> 
  * </code><code>  ] 
  * </code><code>}
  * </code><code>EOF
  * </code><code>
  * </code><code>HTTP/<span class="hljs-number">1.1</span> Created
  * </code><code>content-type: application/json; charset=utf<span class="hljs-number">-8</span>
  * </code><code>x-content-type-options: nosniff
  * </code><code>
  * </code><code>{ 
  * </code><code>  <span class="hljs-string">"deduplicate"</span> : <span class="hljs-literal">true</span>, 
  * </code><code>  <span class="hljs-string">"fields"</span> : [ 
  * </code><code>    <span class="hljs-string">"a"</span>, 
  * </code><code>    <span class="hljs-string">"b"</span> 
  * </code><code>  ], 
  * </code><code>  <span class="hljs-string">"id"</span> : <span class="hljs-string">"products/104844"</span>, 
  * </code><code>  <span class="hljs-string">"isNewlyCreated"</span> : <span class="hljs-literal">true</span>, 
  * </code><code>  <span class="hljs-string">"selectivityEstimate"</span> : <span class="hljs-number">1</span>, 
  * </code><code>  <span class="hljs-string">"sparse"</span> : <span class="hljs-literal">false</span>, 
  * </code><code>  <span class="hljs-string">"type"</span> : <span class="hljs-string">"hash"</span>, 
  * </code><code>  <span class="hljs-string">"unique"</span> : <span class="hljs-literal">true</span>, 
  * </code><code>  <span class="hljs-string">"error"</span> : <span class="hljs-literal">false</span>, 
  * </code><code>  <span class="hljs-string">"code"</span> : <span class="hljs-number">201</span> 
  * </code><code>}
  * </code></pre>
  * 
  * 
  * 
  * 
  * **Example:**
  *  Creating a non-unique hash index
  * 
  * <pre><code><span class="hljs-meta">shell&gt;</span><span class="bash"> curl -X POST --header <span class="hljs-string">'accept: application/json'</span> --data-binary @- --dump - http://localhost:8529/_api/index?collection=products</span> &lt;&lt;EOF
  * </code><code>{ 
  * </code><code>  <span class="hljs-string">"type"</span> : <span class="hljs-string">"hash"</span>, 
  * </code><code>  <span class="hljs-string">"unique"</span> : <span class="hljs-literal">false</span>, 
  * </code><code>  <span class="hljs-string">"fields"</span> : [ 
  * </code><code>    <span class="hljs-string">"a"</span>, 
  * </code><code>    <span class="hljs-string">"b"</span> 
  * </code><code>  ] 
  * </code><code>}
  * </code><code>EOF
  * </code><code>
  * </code><code>HTTP/<span class="hljs-number">1.1</span> Created
  * </code><code>content-type: application/json; charset=utf<span class="hljs-number">-8</span>
  * </code><code>x-content-type-options: nosniff
  * </code><code>
  * </code><code>{ 
  * </code><code>  <span class="hljs-string">"deduplicate"</span> : <span class="hljs-literal">true</span>, 
  * </code><code>  <span class="hljs-string">"fields"</span> : [ 
  * </code><code>    <span class="hljs-string">"a"</span>, 
  * </code><code>    <span class="hljs-string">"b"</span> 
  * </code><code>  ], 
  * </code><code>  <span class="hljs-string">"id"</span> : <span class="hljs-string">"products/104788"</span>, 
  * </code><code>  <span class="hljs-string">"isNewlyCreated"</span> : <span class="hljs-literal">true</span>, 
  * </code><code>  <span class="hljs-string">"selectivityEstimate"</span> : <span class="hljs-number">1</span>, 
  * </code><code>  <span class="hljs-string">"sparse"</span> : <span class="hljs-literal">false</span>, 
  * </code><code>  <span class="hljs-string">"type"</span> : <span class="hljs-string">"hash"</span>, 
  * </code><code>  <span class="hljs-string">"unique"</span> : <span class="hljs-literal">false</span>, 
  * </code><code>  <span class="hljs-string">"error"</span> : <span class="hljs-literal">false</span>, 
  * </code><code>  <span class="hljs-string">"code"</span> : <span class="hljs-number">201</span> 
  * </code><code>}
  * </code></pre>
  * 
  * 
  * 
  * 
  * **Example:**
  *  Creating a sparse index
  * 
  * <pre><code><span class="hljs-meta">shell&gt;</span><span class="bash"> curl -X POST --header <span class="hljs-string">'accept: application/json'</span> --data-binary @- --dump - http://localhost:8529/_api/index?collection=products</span> &lt;&lt;EOF
  * </code><code>{ 
  * </code><code>  <span class="hljs-string">"type"</span> : <span class="hljs-string">"hash"</span>, 
  * </code><code>  <span class="hljs-string">"unique"</span> : <span class="hljs-literal">false</span>, 
  * </code><code>  <span class="hljs-string">"sparse"</span> : <span class="hljs-literal">true</span>, 
  * </code><code>  <span class="hljs-string">"fields"</span> : [ 
  * </code><code>    <span class="hljs-string">"a"</span> 
  * </code><code>  ] 
  * </code><code>}
  * </code><code>EOF
  * </code><code>
  * </code><code>HTTP/<span class="hljs-number">1.1</span> Created
  * </code><code>content-type: application/json; charset=utf<span class="hljs-number">-8</span>
  * </code><code>x-content-type-options: nosniff
  * </code><code>
  * </code><code>{ 
  * </code><code>  <span class="hljs-string">"deduplicate"</span> : <span class="hljs-literal">true</span>, 
  * </code><code>  <span class="hljs-string">"fields"</span> : [ 
  * </code><code>    <span class="hljs-string">"a"</span> 
  * </code><code>  ], 
  * </code><code>  <span class="hljs-string">"id"</span> : <span class="hljs-string">"products/104858"</span>, 
  * </code><code>  <span class="hljs-string">"isNewlyCreated"</span> : <span class="hljs-literal">true</span>, 
  * </code><code>  <span class="hljs-string">"selectivityEstimate"</span> : <span class="hljs-number">1</span>, 
  * </code><code>  <span class="hljs-string">"sparse"</span> : <span class="hljs-literal">true</span>, 
  * </code><code>  <span class="hljs-string">"type"</span> : <span class="hljs-string">"hash"</span>, 
  * </code><code>  <span class="hljs-string">"unique"</span> : <span class="hljs-literal">false</span>, 
  * </code><code>  <span class="hljs-string">"error"</span> : <span class="hljs-literal">false</span>, 
  * </code><code>  <span class="hljs-string">"code"</span> : <span class="hljs-number">201</span> 
  * </code><code>}
  * </code></pre>
  */
  def post(collectionName: String, body: PostAPIIndexHash): Future[ArangoResponse] = client
    .method(HttpMethod.Post)
    .path(path"/_db/_system/_api/index#hash".withArguments(Map()))
    .params("collection-name" -> collectionName.toString)
    .restful[PostAPIIndexHash, ArangoResponse](body)
}