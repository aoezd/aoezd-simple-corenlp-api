package com.aoezd.microservice.corenlp.smallnlp;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;

public class SmallNLPConfiguration extends Configuration {

	@JsonProperty
	@NotEmpty
	private String test;

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
}