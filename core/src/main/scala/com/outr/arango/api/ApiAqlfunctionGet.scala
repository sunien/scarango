package com.outr.arango.api

import io.youi.client.HttpClient
import io.youi.http.HttpMethod
import scala.concurrent.Future
import scribe.Execution.global
          
class ApiAqlfunctionGet(client: HttpClient) {
  /**
  * Returns all registered AQL user functions.
  * 
  * The call will return a JSON array with status codes and all user functions found under *result*.
  * 
  * 
  * **HTTP 200**
  * *A json document with these Properties is returned:*
  * 
  * on success *HTTP 200* is returned.
  * 
  * - **code**: the HTTP status code
  * - **result**: All functions, or the ones matching the *namespace* parameter 
  *   - **isDeterministic**: an optional boolean value to indicate whether the function
  *    results are fully deterministic (function return value solely depends on
  *    the input value and return value is the same for repeated calls with same
  *    input). The *isDeterministic* attribute is currently not used but may be
  *    used later for optimizations.
  *   - **code**: A string representation of the function body
  *   - **name**: The fully qualified name of the user function
  * - **error**: boolean flag to indicate whether an error occurred (*false* in this case)
  * 
  * 
  * **HTTP 400**
  * *A json document with these Properties is returned:*
  * 
  * If the user function name is malformed, the server will respond with *HTTP 400*.
  * 
  * - **errorMessage**: a descriptive error message
  * - **errorNum**: the server error number
  * - **code**: the HTTP status code
  * - **error**: boolean flag to indicate whether an error occurred (*true* in this case)
  * 
  * 
  * 
  * 
  * **Example:**
  *  
  * 
  * <pre><code><span class="hljs-meta">shell&gt;</span><span class="bash"> curl --header <span class="hljs-string">'accept: application/json'</span> --dump - http://localhost:8529/_api/aqlfunction/<span class="hljs-built_in">test</span></span>
  * </code><code>
  * </code><code>HTTP/<span class="hljs-number">1.1</span> OK
  * </code><code>content-type: application/json; charset=utf<span class="hljs-number">-8</span>
  * </code><code>x-content-type-options: nosniff
  * </code><code>
  * </code><code>{ 
  * </code><code>  <span class="hljs-string">"error"</span> : <span class="hljs-literal">false</span>, 
  * </code><code>  <span class="hljs-string">"code"</span> : <span class="hljs-number">200</span>, 
  * </code><code>  <span class="hljs-string">"result"</span> : [ ] 
  * </code><code>}
  * </code></pre>
  */
  def get(namespace: Option[String] = None): Future[GetAPIAqlfunctionRc200] = client
    .method(HttpMethod.Get)
    .param[Option[String]]("namespace", namespace, None)
    .call[GetAPIAqlfunctionRc200]
}