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

case class GetTourDestinationsResult (
  externalReference: Option[Int] = None,
  timestamp: Option[Date] = None,
  userEmail: Option[String] = None,
  userPwd: Option[String] = None,
  reqStatus: Option[Seq[ReqStatus]] = None,
  listDestination: Option[GetTourDestinationsResultListDestination] = None
) extends ApiModel

