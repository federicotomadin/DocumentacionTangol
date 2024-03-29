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

import io.swagger.client.model.GetTourCountries
import io.swagger.client.model.GetTourCountriesResult
import io.swagger.client.model.GetTourDestination
import io.swagger.client.model.GetTourDestinationsResult
import io.swagger.client.model.GetTourDetailsResult
import io.swagger.client.model.GetTourListByDestination
import io.swagger.client.model.GetTourListByFilters
import io.swagger.client.model.GetTourListByFiltersResult
import io.swagger.client.model.GetTourQuotation
import io.swagger.client.model.GetTourQuotationResult
import io.swagger.client.model.GetTourRatesResult
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object ToursApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : GetTourCountriesResult (succeful operation)
   * 
   * @param body Variables for request
   */
  def getTourCountries(body: GetTourCountries): ApiRequest[GetTourCountriesResult] =
    ApiRequest[GetTourCountriesResult](ApiMethods.POST, "https://virtserver.swaggerhub.com/tangol/Tangol/1.0.0", "/GetTourCountries", "application/xml")
      .withBody(body)
      .withSuccessResponse[GetTourCountriesResult](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : GetTourDestinationsResult (succeful operation)
   * 
   * @param body Variables for request
   */
  def getTourDestination(body: GetTourDestination): ApiRequest[GetTourDestinationsResult] =
    ApiRequest[GetTourDestinationsResult](ApiMethods.POST, "https://virtserver.swaggerhub.com/tangol/Tangol/1.0.0", "/GetTourDestination", "application/xml")
      .withBody(body)
      .withSuccessResponse[GetTourDestinationsResult](200)
        /**
   * Obtiene los detalles de un tour en particular
   * 
   * Expected answers:
   *   code 200 : GetTourDetailsResult (successful operation)
   * 
   * @param id tour id
   * @param authorization Bearer &#39;token&#39;
   */
  def getTourDetails(id: String, authorization: String): ApiRequest[GetTourDetailsResult] =
    ApiRequest[GetTourDetailsResult](ApiMethods.POST, "https://virtserver.swaggerhub.com/tangol/Tangol/1.0.0", "/GetTourDetails/{id}", "application/json")
      .withPathParam("id", id)
      .withHeaderParam("Authorization", authorization)
      .withSuccessResponse[GetTourDetailsResult](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : GetTourDestinationsResult (succeful operation)
   * 
   * @param body Variables para la request
   */
  def getTourListByDestination(body: GetTourListByDestination): ApiRequest[GetTourDestinationsResult] =
    ApiRequest[GetTourDestinationsResult](ApiMethods.POST, "https://virtserver.swaggerhub.com/tangol/Tangol/1.0.0", "/GetTourListByDestination", "application/xml")
      .withBody(body)
      .withSuccessResponse[GetTourDestinationsResult](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : GetTourListByFiltersResult (succeful operation)
   * 
   * @param body Variables for request
   */
  def getTourListByFilters(body: GetTourListByFilters): ApiRequest[GetTourListByFiltersResult] =
    ApiRequest[GetTourListByFiltersResult](ApiMethods.POST, "https://virtserver.swaggerhub.com/tangol/Tangol/1.0.0", "/GetTourListByFilters", "application/xml")
      .withBody(body)
      .withSuccessResponse[GetTourListByFiltersResult](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : GetTourQuotationResult (succeful operation)
   * 
   * @param body Variables for request
   */
  def getTourQuotation(body: GetTourQuotation): ApiRequest[GetTourQuotationResult] =
    ApiRequest[GetTourQuotationResult](ApiMethods.POST, "https://virtserver.swaggerhub.com/tangol/Tangol/1.0.0", "/GetTourQuotation", "application/xml")
      .withBody(body)
      .withSuccessResponse[GetTourQuotationResult](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : GetTourRatesResult (succeful operation)
   * 
   * @param id tour id
   * @param authorization Bearer &#39;token&#39;
   */
  def getTourRates(id: String, authorization: String): ApiRequest[GetTourRatesResult] =
    ApiRequest[GetTourRatesResult](ApiMethods.POST, "https://virtserver.swaggerhub.com/tangol/Tangol/1.0.0", "/GetTourRates/{id}", "application/json")
      .withPathParam("id", id)
      .withHeaderParam("Authorization", authorization)
      .withSuccessResponse[GetTourRatesResult](200)
      

}

