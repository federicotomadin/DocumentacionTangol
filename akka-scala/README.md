# swagger-client

Tangol API Documentation SOAP
- API version: 1.0.0

This a documentation for web service WSDL from Tangol Tours SRL, Argentina SoapUI - https://www.tangol.com/webservices/tangoltours.svc?wsdl

  For more information, please visit [https://www.linkedin.com/in/federicotomadin](https://www.linkedin.com/in/federicotomadin)

*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle/SBT

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-client:1.0.0"
```

### SBT users

```scala
libraryDependencies += "io.swagger" % "swagger-client" % "1.0.0"
```

## Getting Started

## Documentation for API Endpoints

All URIs are relative to *https://virtserver.swaggerhub.com/tangol/Tangol/1.0.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BookingsApi* | **cancel Booking** | **POST** /CancelBooking | Cancel reservation by BookingConfirmation
*BookingsApi* | **makeBooking** | **POST** /MakeBooking | Make Booking
*BookingsApi* | **search Booking** | **POST** /SearchBooking | Search reservation by BookingConfirmation
*ToursApi* | **getTourCountries** | **POST** /GetTourCountries | Get list countries of tours
*ToursApi* | **getTourDestination** | **POST** /GetTourDestination | Get list of destination
*ToursApi* | **getTourDetails** | **POST** /GetTourDetails/{id} | Obtener detalles de un tour
*ToursApi* | **getTourListByDestination** | **POST** /GetTourListByDestination | Get list tour by destination
*ToursApi* | **getTourListByFilters** | **POST** /GetTourListByFilters | Get list by filters
*ToursApi* | **getTourQuotation** | **POST** /GetTourQuotation | Get list by filters
*ToursApi* | **getTourRates** | **POST** /GetTourRates/{id} | Get list by filters


## Documentation for Models

 - [Booking](Booking.md)
 - [CancelBooking](CancelBooking.md)
 - [CancelBookingListTourBookingRequest](CancelBookingListTourBookingRequest.md)
 - [CancelBookingResult](CancelBookingResult.md)
 - [CancelBookingResultListTourBookingRequest](CancelBookingResultListTourBookingRequest.md)
 - [GetTourCountries](GetTourCountries.md)
 - [GetTourCountriesResult](GetTourCountriesResult.md)
 - [GetTourCountriesResultListCountries](GetTourCountriesResultListCountries.md)
 - [GetTourDestination](GetTourDestination.md)
 - [GetTourDestinationsResult](GetTourDestinationsResult.md)
 - [GetTourDestinationsResultListDestination](GetTourDestinationsResultListDestination.md)
 - [GetTourDetailsResult](GetTourDetailsResult.md)
 - [GetTourListByDestination](GetTourListByDestination.md)
 - [GetTourListByFilters](GetTourListByFilters.md)
 - [GetTourListByFiltersResult](GetTourListByFiltersResult.md)
 - [GetTourListByFiltersResultListTours](GetTourListByFiltersResultListTours.md)
 - [GetTourQuotation](GetTourQuotation.md)
 - [GetTourQuotationResult](GetTourQuotationResult.md)
 - [GetTourRates](GetTourRates.md)
 - [GetTourRatesResult](GetTourRatesResult.md)
 - [InfoCountry](InfoCountry.md)
 - [InfoDestination](InfoDestination.md)
 - [InfoError](InfoError.md)
 - [InfoTour](InfoTour.md)
 - [MakeBooking](MakeBooking.md)
 - [MakeBookingListTraveller](MakeBookingListTraveller.md)
 - [MakeBookingResult](MakeBookingResult.md)
 - [MakeBookingResultListTourBookingResponse](MakeBookingResultListTourBookingResponse.md)
 - [Months](Months.md)
 - [PicLIst](PicLIst.md)
 - [ReqStatus](ReqStatus.md)
 - [SearchBooking](SearchBooking.md)
 - [SearchBookingResult](SearchBookingResult.md)
 - [SearchBookingResultListBookings](SearchBookingResultListBookings.md)
 - [TourBookingRequest](TourBookingRequest.md)
 - [TourBookingResponse](TourBookingResponse.md)
 - [TourOption](TourOption.md)
 - [TourRate](TourRate.md)
 - [Traveller](Traveller.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Author


