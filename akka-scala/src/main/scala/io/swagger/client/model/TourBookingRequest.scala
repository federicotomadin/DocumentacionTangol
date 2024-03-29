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

case class TourBookingRequest (
  externalReference: Option[Int] = None,
  timestamp: Option[String] = None,
  userEmail: Option[String] = None,
  userPwd: Option[String] = None,
  adu: Option[Int] = None,
  bookingDate: Option[String] = None,
  chd: Option[Int] = None,
  cpl: Option[Int] = None,
  currency: Option[Int] = None,
  dbl: Option[Int] = None,
  discount: Option[Int] = None,
  inf: Option[Int] = None,
  languageCode: Option[String] = None,
  pickupLocation: Option[String] = None,
  pickupTime: Option[String] = None,
  sgl: Option[Int] = None,
  tourId: Option[Int] = None,
  tourLanguageCode: Option[String] = None,
  tourOptionCode: Option[Int] = None,
  tpl: Option[Int] = None
) extends ApiModel


