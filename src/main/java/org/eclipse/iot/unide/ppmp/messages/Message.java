/*
 * Copyright (c) 2016 Bosch Software Innovations GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.iot.unide.ppmp.messages;

import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.eclipse.iot.unide.ppmp.commons.MetaData;

public class Message {
	public enum MessageType {
		DEVICE, TECHNICAL_INFO // default DEVICE
	};

	public enum MessageSeverity {
		HIGH, MEDIUM, LOW, UNKNOWN // default UNKNOWN
	};

	@JsonProperty("origin")
	private String origin; // optional

	@JsonProperty("ts")
	private OffsetDateTime timestamp;

	@JsonProperty("type")
	private MessageType type; // optional

	@JsonProperty("severity")
	private MessageSeverity severity; // optional

	@JsonProperty("code")
	private String code;

	@JsonProperty("title")
	private String title; // optional

	@JsonProperty("description")
	private String description; // optional

	@JsonProperty("hint")
	private String hint; // optional

	@JsonProperty("metaData")
	private MetaData metaData; // optional

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getHint() {
		return hint;
	}

	public void setHint(String hint) {
		this.hint = hint;
	}

	public OffsetDateTime getTimestamp() {
		return timestamp;
	}

	@JsonIgnore
	public MessageType getType() {
		return type == null ? MessageType.DEVICE : type;
	}

	@JsonIgnore
	public MessageSeverity getSeverity() {
		return severity == null ? MessageSeverity.UNKNOWN : severity;
	}

	public String getCode() {
		return code;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public void setTimestamp(OffsetDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public void setType(MessageType type) {
		this.type = MessageType.DEVICE.equals(type) ? null : type;
	}

	public void setSeverity(MessageSeverity severity) {
		this.severity = MessageSeverity.UNKNOWN.equals(severity) ? null : severity;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MetaData getMetaData() {
		return metaData;
	}

	public void setMetaData(MetaData metaData) {
		this.metaData = metaData;
	}
}
