/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class LamppostStationConnectedSensorMeasuredValue (
  lammpostId: String,
  temperature: Option[Double],
  relativeHumidity: Option[Double],
  timestamp: String,
  rainIntensity: Option[Double],
  airPressure: Option[Double],
  windSpeed: Option[Double],
  windDirection: Option[Double],
  pm25: Option[Double],
  pm10: Option[Double],
  no2: Option[Double],
  so2: Option[Double],
  co: Option[Double],
  ozone: Option[Double],
  interval: Option[LamppostStationConnectedSensorMeasuredValueEnums.Interval]
) extends ApiModel

object LamppostStationConnectedSensorMeasuredValueEnums {

  type Interval = Interval.Value
  object Interval extends Enumeration {
    val Hourly = Value("hourly")
    val Monthly = Value("monthly")
    val Dayly = Value("dayly")
  }

}

