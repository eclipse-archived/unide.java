/*
 * Copyright (c) 2016 Bosch Software Innovations GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.iot.unide.ppmp.measurements;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Limits {
	@JsonProperty("upperError")
	private Number upperError; // optional

	@JsonProperty("lowerError")
	private Number lowerError; // optional

	@JsonProperty("target")
	private Number target; // optional

	@JsonProperty("upperWarn")
	private Number upperWarn; // optional

	@JsonProperty("lowerWarn")
	private Number lowerWarn; // optional

	public Number getUpperError() {
		return upperError;
	}

	public void setUpperError(Number upperError) {
		this.upperError = upperError;
	}

	public Number getLowerError() {
		return lowerError;
	}

	public void setLowerError(Number lowerError) {
		this.lowerError = lowerError;
	}

	public Number getTarget() {
		return target;
	}

	public void setTarget(Number target) {
		this.target = target;
	}

	public Number getUpperWarn() {
		return upperWarn;
	}

	public void setUpperWarn(Number upperWarn) {
		this.upperWarn = upperWarn;
	}

	public Number getLowerWarn() {
		return lowerWarn;
	}

	public void setLowerWarn(Number lowerWarn) {
		this.lowerWarn = lowerWarn;
	}

}
