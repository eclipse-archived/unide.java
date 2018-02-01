/*
 * Copyright (c) 2017 Bosch Software Innovations GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.iot.unide.ppmp.process;

import com.fasterxml.jackson.annotation.JsonProperty;


public class SpecialValue {
	
	@JsonProperty("$_time")
	private Number time; // optional

	@JsonProperty("name")
	private String name; // optional

	@JsonProperty("value")
	private ValuesMap value;

	public Number getTime() {
		return time;
	}

	public void setTime(Number time) {
		this.time = time;
	}
	
	public ValuesMap getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	public void setValue(ValuesMap value) {
		this.value = value;
	}


}
