/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class PointLocation (
  `type`: PointLocationEnums.&#x60;Type&#x60;,
  coordinates: Any
) extends ApiModel

object PointLocationEnums {

  type &#x60;Type&#x60; = &#x60;Type&#x60;.Value
  object &#x60;Type&#x60; extends Enumeration {
    val Point = Value("Point")
  }

}

