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

case class GetTourDetaisResult (
  externalReference: Option[Int] = None,
  timestamp: Option[String] = None,
  userEmail: Option[String] = None,
  userPwd: Option[String] = None,
  reqStatus: Option[Seq[ReqStatus]] = None,
  chdFrom: Option[Int] = None,
  chdTo: Option[Int] = None,
  /* string */
  country: Option[String] = None,
  /* string */
  countryCode: Option[String] = None,
  /* string */
  currency: Option[String] = None,
  /* string */
  description: Option[String] = None,
  /* string */
  destination: Option[String] = None,
  destinationId: Option[Int] = None,
  /* string */
  difficulty: Option[String] = None,
  /* string */
  duration: Option[String] = None,
  /* string */
  endPoint: Option[String] = None,
  /* string */
  included: Option[String] = None,
  infFrom: Option[Int] = None,
  infTo: Option[Int] = None,
  /* string */
  languageCode: Option[String] = None,
  listMonth: Option[Seq[Months]] = None,
  minRate: Option[Int] = None,
  /* string */
  name: Option[String] = None,
  /* string */
  notIncluded: Option[String] = None,
  /* string */
  physicalReq: Option[String] = None,
  picList: Option[Seq[PicLIst]] = None,
  /* string */
  startPoint: Option[String] = None,
  /* string */
  subTypeCode: Option[String] = None,
  /* string */
  subTypeDesc: Option[String] = None,
  /* string */
  summary: Option[String] = None,
  /* string */
  tourType: Option[String] = None,
  /* string */
  typeCode: Option[String] = None,
  /* string */
  typeDesc: Option[String] = None,
  /* string */
  urlHomePic: Option[String] = None,
  /* string */
  urlTour: Option[String] = None,
  /* string */
  whatToBring: Option[String] = None
) extends ApiModel

