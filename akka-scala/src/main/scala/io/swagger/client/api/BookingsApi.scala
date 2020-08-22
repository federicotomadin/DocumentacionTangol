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
package io.swagger.client.api

import io.swagger.client.model.CancelBooking
import io.swagger.client.model.CancelBookingResult
import io.swagger.client.model.MakeBooking
import io.swagger.client.model.MakeBookingResult
import io.swagger.client.model.SearchBooking
import io.swagger.client.model.SearchBookingResult
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object BookingsApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : CancelBookingResult (succeful operation)
   * 
   * @param body Variables for request
   */
  def cancel Booking(body: CancelBooking): ApiRequest[CancelBookingResult] =
    ApiRequest[CancelBookingResult](ApiMethods.POST, "https://virtserver.swaggerhub.com/tangol/Tangol/1.0.0", "/CancelBooking", "application/xml")
      .withBody(body)
      .withSuccessResponse[CancelBookingResult](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : MakeBookingResult (succeful operation)
   * 
   * @param body Variables for request
   */
  def makeBooking(body: MakeBooking): ApiRequest[MakeBookingResult] =
    ApiRequest[MakeBookingResult](ApiMethods.POST, "https://virtserver.swaggerhub.com/tangol/Tangol/1.0.0", "/MakeBooking", "application/xml")
      .withBody(body)
      .withSuccessResponse[MakeBookingResult](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : SearchBookingResult (succeful operation)
   * 
   * @param body Variables for request
   */
  def search Booking(body: SearchBooking): ApiRequest[SearchBookingResult] =
    ApiRequest[SearchBookingResult](ApiMethods.POST, "https://virtserver.swaggerhub.com/tangol/Tangol/1.0.0", "/SearchBooking", "application/xml")
      .withBody(body)
      .withSuccessResponse[SearchBookingResult](200)
      

}

