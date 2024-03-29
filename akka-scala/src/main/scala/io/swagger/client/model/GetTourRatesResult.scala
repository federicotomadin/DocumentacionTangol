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

case class GetTourRatesResult (
  tourId: Option[Int] = None,
  languageCode: Option[String] = None,
  currency: Option[String] = None,
  validFrom: Option[Date] = None,
  minRate: Option[Int] = None,
  chdFrom: Option[Int] = None,
  chdTo: Option[Int] = None,
  infFrom: Option[Int] = None,
  infTo: Option[Int] = None,
  htmlRates: Option[String] = None,
  listTourOption: Option[Seq[TourOption]] = None,
  listTourRate: Option[Seq[TourRate]] = None,
  listBlackDate: Option[Seq[Months]] = None
) extends ApiModel


