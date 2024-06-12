package com.weather.weatherservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Builder
@Data
@AllArgsConstructor
public class CoordinatesGeocodingAPI {

	@JsonProperty("lon")
	private String lon;

	@JsonProperty("lat")
	private String lat;
}