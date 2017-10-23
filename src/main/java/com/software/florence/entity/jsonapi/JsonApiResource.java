package com.software.florence.entity.jsonapi;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class JsonApiResource<T> {

    private JsonApiVersion jsonapi;

    @NotNull
    @Valid
    private T data;

    private List<Object> included;

    private Map<String, Object> meta;

    private Map<String, Object> links;

    public JsonApiVersion getJsonapi() {
        return jsonapi;
    }

    public void setJsonapi(JsonApiVersion jsonapi) {
        this.jsonapi = jsonapi;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<Object> getIncluded() {
        return included;
    }

    public void setIncluded(List<Object> included) {
        this.included = included;
    }

    public Map<String, Object> getMeta() {
        return meta;
    }

    public void setMeta(Map<String, Object> meta) {
        this.meta = meta;
    }

    public Map<String, Object> getLinks() {
        return links;
    }

    public void setLinks(Map<String, Object> links) {
        this.links = links;
    }

    @Override
    public String toString() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "{}";
        }
    }
}
