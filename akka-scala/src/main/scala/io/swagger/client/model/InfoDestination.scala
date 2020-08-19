/**
 * Tangol API Documentation SOAP
 * This a documentation for web service WSDL from Tangol Tours SRL, Argentina
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class InfoDestination (
  /* string */
  countryCode: Option[String] = None,
  /* string */
  description: Option[String] = None,
  /* int32 */
  id: Option[Int] = None,
  /* int32 */
  toursQty: Option[Int] = None
) extends ApiModel


