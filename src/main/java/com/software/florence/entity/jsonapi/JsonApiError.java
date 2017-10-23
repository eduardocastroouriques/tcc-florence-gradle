package com.software.florence.entity.jsonapi;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Map;

@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class JsonApiError {
    public String id;
    public String status;
    public String code;
    public String title;
    public String detail;
    public JsonApiErrorSource source;
    public Map<String, Object> meta;
}
