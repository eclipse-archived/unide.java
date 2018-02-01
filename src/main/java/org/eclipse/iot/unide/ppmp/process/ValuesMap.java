/*
 * Copyright (c) 2017 Bosch Software Innovations GmbH. All rights reserved.
 */

package org.eclipse.iot.unide.ppmp.process;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class ValuesMap {

   @JsonIgnore
   private Map<String, Number> values = new HashMap<>();

   @JsonAnyGetter
   public Map<String, Number> getValues() {
      return this.values;
   }

   @JsonAnySetter
   public void setValue(String name, Number value) {
      values.put(name, value);
   }

   public void setValues(Map<String, Number> values) {
      this.values = values;
   }

}