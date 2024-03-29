/**
 * Tangol API Documentation SOAP
 * This a documentation for web service WSDL from Tangol Tours SRL, Argentina SoapUI - https://www.tangol.com/webservices/tangoltours.svc?wsdl
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

case class TourRate (
  currrency: Option[String] = None,
  paxFrom: Option[Int] = None,
  paxTo: Option[Int] = None,
  paxType: Option[String] = None,
  rackRateAdu: Option[Int] = None,
  rackRateChd: Option[Int] = None,
  rackRateInf: Option[Int] = None,
  rateType: Option[String] = None,
  startTime: Option[Date] = None,
  terms: Option[String] = None,
  tourId: Option[Int] = None,
  tourOption: Option[Int] = None,
  tourOptionDesc: Option[String] = None,
  validFrom: Option[Date] = None,
  validTo: Option[Date] = None
) extends ApiModel


