package com.latam.flight.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Flight
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-01T09:49:12.712351300-03:00[America/Santiago]")
public class Flight   {
  @JsonProperty("arrivalTime")
  private String arrivalTime;

  @JsonProperty("departureTime")
  private String departureTime;

  @JsonProperty("date")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate date;

  @JsonProperty("origin")
  private String origin;

  @JsonProperty("destination")
  private String destination;

  @JsonProperty("originIataCode")
  private String originIataCode;

  @JsonProperty("destinationIataCode")
  private String destinationIataCode;

  @JsonProperty("number")
  private BigDecimal number;

  @JsonProperty("type")
  private String type;

  public Flight arrivalTime(String arrivalTime) {
    this.arrivalTime = arrivalTime;
    return this;
  }

  /**
   * Hora de llegada.
   * @return arrivalTime
  */
  @ApiModelProperty(example = "22:10:50", value = "Hora de llegada.")


  public String getArrivalTime() {
    return arrivalTime;
  }

  public void setArrivalTime(String arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  public Flight departureTime(String departureTime) {
    this.departureTime = departureTime;
    return this;
  }

  /**
   * Hora de salida.
   * @return departureTime
  */
  @ApiModelProperty(example = "22:10:50", value = "Hora de salida.")


  public String getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(String departureTime) {
    this.departureTime = departureTime;
  }

  public Flight date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Fecha vuelo.
   * @return date
  */
  @ApiModelProperty(value = "Fecha vuelo.")

  @Valid

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public Flight origin(String origin) {
    this.origin = origin;
    return this;
  }

  /**
   * Codigo pais de origen.
   * @return origin
  */
  @ApiModelProperty(example = "CHL", value = "Codigo pais de origen.")


  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public Flight destination(String destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Codigo pais de destino.
   * @return destination
  */
  @ApiModelProperty(example = "USA", value = "Codigo pais de destino.")


  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public Flight originIataCode(String originIataCode) {
    this.originIataCode = originIataCode;
    return this;
  }

  /**
   * Codigo IATA aeropuerto de origen.
   * @return originIataCode
  */
  @ApiModelProperty(example = "SCL", value = "Codigo IATA aeropuerto de origen.")


  public String getOriginIataCode() {
    return originIataCode;
  }

  public void setOriginIataCode(String originIataCode) {
    this.originIataCode = originIataCode;
  }

  public Flight destinationIataCode(String destinationIataCode) {
    this.destinationIataCode = destinationIataCode;
    return this;
  }

  /**
   * Codigo IATA aeropuerto de destino.
   * @return destinationIataCode
  */
  @ApiModelProperty(example = "JFK", value = "Codigo IATA aeropuerto de destino.")


  public String getDestinationIataCode() {
    return destinationIataCode;
  }

  public void setDestinationIataCode(String destinationIataCode) {
    this.destinationIataCode = destinationIataCode;
  }

  public Flight number(BigDecimal number) {
    this.number = number;
    return this;
  }

  /**
   * Numero de vuelo.
   * @return number
  */
  @ApiModelProperty(example = "560", value = "Numero de vuelo.")

  @Valid

  public BigDecimal getNumber() {
    return number;
  }

  public void setNumber(BigDecimal number) {
    this.number = number;
  }

  public Flight type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Tipo de vuelo.
   * @return type
  */
  @ApiModelProperty(example = "Charter", value = "Tipo de vuelo.")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Flight flight = (Flight) o;
    return Objects.equals(this.arrivalTime, flight.arrivalTime) &&
        Objects.equals(this.departureTime, flight.departureTime) &&
        Objects.equals(this.date, flight.date) &&
        Objects.equals(this.origin, flight.origin) &&
        Objects.equals(this.destination, flight.destination) &&
        Objects.equals(this.originIataCode, flight.originIataCode) &&
        Objects.equals(this.destinationIataCode, flight.destinationIataCode) &&
        Objects.equals(this.number, flight.number) &&
        Objects.equals(this.type, flight.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrivalTime, departureTime, date, origin, destination, originIataCode, destinationIataCode, number, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Flight {\n");
    
    sb.append("    arrivalTime: ").append(toIndentedString(arrivalTime)).append("\n");
    sb.append("    departureTime: ").append(toIndentedString(departureTime)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    originIataCode: ").append(toIndentedString(originIataCode)).append("\n");
    sb.append("    destinationIataCode: ").append(toIndentedString(destinationIataCode)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

