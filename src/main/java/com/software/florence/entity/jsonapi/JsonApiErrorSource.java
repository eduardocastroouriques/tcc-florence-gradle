package com.software.florence.entity.jsonapi;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class JsonApiErrorSource {
    public String parameter;
    public String pointer;
}
