package com.skyscanner;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Search implements Serializable {
    @JsonProperty

    private String city;

    public Search(){

    }

    public Search(String city) { this.city = city;}

    public String getCity() {
        return city;
    }
}