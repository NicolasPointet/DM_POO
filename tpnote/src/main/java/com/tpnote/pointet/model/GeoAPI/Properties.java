package com.tpnote.pointet.model.GeoAPI;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Properties {
    private String label;
    private Double score;
    private String housenumber;
    private String id;
    private String type;
    private Double x;
    private Double y;
    private Double importance;
    private String name;
    private String postcode;
    private String citycode;
    private String city;
    private String context;
    private String street;

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }

    public Double getScore() {
        return score;
    }
    public void setScore(Double score) {
        this.score = score;
    }

    public String getHousenumber() {
        return housenumber;
    }
    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public Double getX() {
        return x;
    }
    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }
    public void setY(Double y) {
        this.y = y;
    }

    public Double getImportance() {
        return importance;
    }
    public void setImportance(Double importance) {
        this.importance = importance;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPostcode() {
        return postcode;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCitycode() {
        return citycode;
    }
    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getContext() {
        return context;
    }
    public void setContext(String context) {
        this.context = context;
    }

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "GeoAdresse{ " +
                "label=" + label +
                ", score=" + score +
                ", housenumber=" + housenumber +
                ", id=" + id +
                ", type=" + type +
                ", x=" + x +
                ", y=" + y +
                ", importance=" + importance +
                ", name=" + name +
                ", postcode=" + postcode +
                ", citycode=" + citycode +
                ", city=" + city +
                ", context=" + context +
                ", street=" + street +
                "}";
    }
}

